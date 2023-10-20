package com.android.canmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.android.canlibrary.Constant;
import com.android.canlibrary.bean.Can1DataBean;
import com.android.canlibrary.bean.Can2DataBean;
import com.android.canlibrary.interfaces.CanInterface;
import com.android.canlibrary.observer.Can1ChangeObserver;
import com.android.canlibrary.observer.Can2ChangeObserver;
import com.android.canlibrary.utils.Logger;


public class MainActivity extends AppCompatActivity {

    private Can1DataBean can1DataBean;
    private Can2DataBean can2DataBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CanInterface canInterface = new CanInterface();
        canInterface.openCan1Interface(Constant.DEVICES_CAN1);
        canInterface.openCan2Interface(Constant.DEVICES_CAN2);

        can1DataBean = new Can1DataBean();
        can2DataBean = new Can2DataBean();

        Can1ChangeObserver can1ChangeObserver = new Can1ChangeObserver();
        can1ChangeObserver.setCanChangeListener(new Can1ChangeObserver.CanChangeListener() {
            @Override
            public void onCan1Changed(Can1DataBean can1DataBean) {
                Logger.d("can1DataBean: "+can1DataBean.getSpeedOfVehicle());

            }
        });


        Can2ChangeObserver can2ChangeObserver = new Can2ChangeObserver();
        can2ChangeObserver.setCanChangeListener(new Can2ChangeObserver.CanChangeListener() {
            @Override
            public void onCan2Changed(Can2DataBean can2DataBean) {

                Logger.d("can2DataBean: "+can2DataBean.getTurnLeftLightSignal());
            }
        });

    }
}