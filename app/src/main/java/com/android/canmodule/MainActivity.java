package com.android.canmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.android.canlibrary.interfaces.CanInterface;
import com.android.canlibrary.observer.Can1ChangeObserver;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CanInterface canInterface = new CanInterface();
        canInterface.openCan1Interface("dev/vircan");

        Can1ChangeObserver can1ChangeObserver = new Can1ChangeObserver();
        can1ChangeObserver.setCanChangeListener(new Can1ChangeObserver.CanChangeListener() {
            @Override
            public void onCan1Changed(String part1, String part2) {

            }
        });
    }
}