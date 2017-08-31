package com.example.kishore.activitynavigator;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton btn;
    private WifiManager wifiManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (ToggleButton) findViewById(R.id.tbWIFI);

        btn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
                if (checked) {

                    WifiManager wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);
                    wifi.setWifiEnabled(true);
                } else {

                    WifiManager wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);
                    wifi.setWifiEnabled(false);
                }
            }
        });
    }

    public void switchToGreet(View view){


        Intent myIntent = new Intent(getBaseContext(),GreetUserActivity.class);
        startActivity(myIntent);
    }

    public void switchToAlgoBenchmark(View view){
        Intent myIntent = new Intent(getBaseContext(),Algo_Benchmark.class);
        startActivity(myIntent);
    }

    public void switchToSimpleCalci(View view){
        Intent myIntent = new Intent(getBaseContext(),SimpleCalci.class);
        startActivity(myIntent);
    }

    public void switchToSMS(View view){
        Intent myIntent = new Intent(getBaseContext(),SMS_App.class);
        startActivity(myIntent);
    }

    public void switchToToast(View view){
        Intent myIntent = new Intent(this,ToastPlay.class);
        startActivity(myIntent);
    }
}
