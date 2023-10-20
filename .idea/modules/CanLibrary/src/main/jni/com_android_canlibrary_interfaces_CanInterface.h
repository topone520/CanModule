/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_android_canlibrary_interfaces_CanInterface */

#ifndef _Included_com_android_canlibrary_interfaces_CanInterface
#define _Included_com_android_canlibrary_interfaces_CanInterface
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_android_canlibrary_interfaces_CanInterface
 * Method:    openCan1Interface
 * Signature: (Ljava/lang/String;)Z
 */
JNIEXPORT jboolean JNICALL Java_com_android_canlibrary_interfaces_CanInterface_openCan1Interface
  (JNIEnv *, jobject, jstring);

/*
 * Class:     com_android_canlibrary_interfaces_CanInterface
 * Method:    sendCan1Message
 * Signature: (I[B)Z
 */
JNIEXPORT jboolean JNICALL Java_com_android_canlibrary_interfaces_CanInterface_sendCan1Message
  (JNIEnv *, jobject, jint, jbyteArray);

/*
 * Class:     com_android_canlibrary_interfaces_CanInterface
 * Method:    receiveCan1Message
 * Signature: ()[B
 */
JNIEXPORT jbyteArray JNICALL Java_com_android_canlibrary_interfaces_CanInterface_receiveCan1Message
  (JNIEnv *, jobject);

/*
 * Class:     com_android_canlibrary_interfaces_CanInterface
 * Method:    closeCan1Interface
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_android_canlibrary_interfaces_CanInterface_closeCan1Interface
  (JNIEnv *, jobject);

/*
 * Class:     com_android_canlibrary_interfaces_CanInterface
 * Method:    openCan2Interface
 * Signature: (Ljava/lang/String;)Z
 */
JNIEXPORT jboolean JNICALL Java_com_android_canlibrary_interfaces_CanInterface_openCan2Interface
  (JNIEnv *, jobject, jstring);

/*
 * Class:     com_android_canlibrary_interfaces_CanInterface
 * Method:    sendCan2Message
 * Signature: (I[B)Z
 */
JNIEXPORT jboolean JNICALL Java_com_android_canlibrary_interfaces_CanInterface_sendCan2Message
  (JNIEnv *, jobject, jint, jbyteArray);

/*
 * Class:     com_android_canlibrary_interfaces_CanInterface
 * Method:    receiveCan2Message
 * Signature: ()[B
 */
JNIEXPORT jbyteArray JNICALL Java_com_android_canlibrary_interfaces_CanInterface_receiveCan2Message
  (JNIEnv *, jobject);

/*
 * Class:     com_android_canlibrary_interfaces_CanInterface
 * Method:    closeCan2Interface
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_android_canlibrary_interfaces_CanInterface_closeCan2Interface
  (JNIEnv *, jobject);

#ifdef __cplusplus
}
#endif
#endif
