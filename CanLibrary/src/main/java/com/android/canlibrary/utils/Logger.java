package com.android.canlibrary.utils;


import android.os.Environment;
import android.util.Log;

import com.android.canlibrary.BuildConfig;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 输出日志，且定位代码行数，可缓存日志到本地文件；
 * FileName: Logger
 * Author: ccm
 * Date: 2023/10/18
 *
 */
public class Logger {

    private final static String TAG = "Logger";
    private static boolean isDebug = BuildConfig.DEBUG ? true : false;
    private static boolean sCacheable  = true;

    /**
     * 设置一个总开关，决定是否缓存日志,前提条件是{@link this#isDebug}为true；
     * <p>
     * 如果{@link this#sCacheable}为false，即使用户调用了缓存日志的方法，缓存也不生效；
     * <p>
     * 如果{@link this#sCacheable}为true，那么是否缓存日志，取决于是否调用了缓存日志的方法；
     *
     * @param cacheable
     */
    public static void initCacheSwitch( boolean cacheable){
        sCacheable = cacheable;
    }

    /**
     * 输出当前日志，并且定位代码行数；
     *
     * @param content
     */
    public static void d(String content) {
        if (isDebug) {
            log(TAG, content, Log.WARN, false);
        }
    }

    public static void d(String tag, String content) {
        if (isDebug) {
            log(tag, content, Log.WARN, false);
        }
    }

    /**
     * 输出当前日志，定位代码行数，并且将日志缓存至本地；
     *
     * @param content
     */
    public static void wc(String content) {
        if (isDebug) {
            log(TAG, content, Log.WARN, true);
        }
    }

    public static void wc(String tag, String content) {
        if (isDebug) {
            log(tag, content, Log.WARN, true);
        }
    }

    public static void e(String content) {
        if (isDebug) {
            log(TAG, content, Log.ERROR, false);
        }
    }

    public static void e(String tag, String content) {
        if (isDebug) {
            log(tag, content, Log.ERROR, false);
        }
    }

    public static void ec(String tag, String content) {
        if (isDebug) {
            log(tag, content, Log.ERROR, true);
        }
    }

    /**
     * 输出方法调用栈链的日志，并且定位代码行数；
     *
     * @param content
     */
    public static void wl(String tag, String content) {
        if (isDebug) {
            logLinked(tag, content, Log.WARN, false);
        }
    }

    public static void wl(String content) {
        if (isDebug) {
            logLinked(TAG, content, Log.WARN, false);
        }
    }

    public static void el(String tag, String content) {
        if (isDebug) {
            logLinked(tag, content, Log.ERROR, false);
        }
    }

    public static void el(String content) {
        if (isDebug) {
            logLinked(TAG, content, Log.ERROR, false);
        }
    }

    /**
     * 输出方法调用栈链的日志，定位代码行数，并且将日志缓存到本地；
     *
     * @param content
     */
    public static void wlc(String tag, String content) {
        if (isDebug) {
            logLinked(tag, content, Log.WARN, true);
        }
    }

    public static void wlc(String content) {
        if (isDebug) {
            logLinked(TAG, content, Log.WARN, true);
        }
    }

    public static void elc(String tag, String content) {
        if (isDebug) {
            logLinked(tag, content, Log.ERROR, true);
        }
    }

    public static void elc(String content) {
        if (isDebug) {
            logLinked(TAG, content, Log.ERROR, true);
        }
    }

    private static void log(String tag, String content, int level, boolean cacheable) {
        logAndCache(tag, content, level, false, cacheable);
    }

    private static void logLinked(String tag, String content, int level, boolean cacheable) {
        logAndCache(tag, content, level, true, cacheable);
    }

    private static void logAndCache(String tag, String content, int level, boolean isLinked, boolean cacheable) {
//        logTraceInfo(tag, content, level, isLinked);
        String info = logTraceInfo(tag, content, level, isLinked);
        if (sCacheable && cacheable) {
            cacheLogInfo(info);
        }
    }

    /**
     * 获取相关调用栈的信息，并且打印相关日志及代码行数；
     * <p>
     * <p>
     * 相关调用栈的信息，按照:类名,方法名,行号等，这样的格式拼接，可以用来定位代码行，
     * 如：
     * at cn.xx.ui.MainActivity.onCreate(MainActivity.java:23) 定位代码行;
     *
     * @param tag
     * @param content
     * @param level    日志级别；
     * @param isLinked 是否输出所有相关调用栈的信息；
     */
    private static String logTraceInfo(String tag, String content, int level, boolean isLinked) {
        StackTraceElement[] stes = Thread.currentThread().getStackTrace();
        if (stes == null) {
            Log.w(tag, "logTraceLinkInfo#return#stes == null");
            return "";
        }
        StringBuilder result = null;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stes.length; i++) {
            StackTraceElement ste = stes[i];
            if (ignorable(ste)) {
                continue;
            }
            sb.append("[Thread:")
                    .append(" at ").append(ste.getClassName())
                    .append(".").append(ste.getMethodName())
                    .append("(").append(ste.getFileName())
                    .append(":").append(ste.getLineNumber())
                    .append(")]").append(" "+content);
            String info = sb.toString();
            if (isLinked) {
                if (result == null) {
                    result = new StringBuilder();
                }
                result.append(info).append("\n");
                sb.delete(0, info.length());
                logInfo(tag, level, info);
            } else {
                logInfo(tag, level, info);
                return info;
            }
        }
        return result.toString();
    }

    private static boolean ignorable(StackTraceElement ste) {
        if (ste.isNativeMethod() ||
                ste.getClassName().equals(Thread.class.getName()) ||
                ste.getClassName().equals(Logger.class.getName())) {
            return true;
        }
        return false;
    }

    private static void logInfo(String tag, int level, String info) {
        switch (level) {
            case Log.ERROR:
                Log.e(tag, info);
                break;
            case Log.INFO:
                Log.i(tag, info);
                break;
            case Log.VERBOSE:
                Log.v(tag, info);
                break;
            case Log.WARN:
                Log.w(tag, info);
                break;
            case Log.DEBUG:
            default:
                Log.d(tag, info);
                break;
        }
    }

    private static void cacheLogInfo(String info) {
        SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss-SSS");
        String savePath = Environment.getExternalStorageDirectory().toString() + File.separator + "ForLog";
        File saveFile = new File(savePath);
        if (!saveFile.exists()) {
            saveFile.mkdir();
        }
        File file = new File(saveFile, "log.txt");
        info = dataFormat.format(new Date()) + "：" + info + "\n\n";
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file, true);
            byte[] bytes = info.getBytes();
            fos.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

