package com.phone.info;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //declar
    private Button getInfo;
    private TextView deviceInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize
        deviceInfo = findViewById(R.id.device_all_info);
        getInfo = findViewById(R.id.get_info);

        getInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String info = getAllInfo();
                deviceInfo.setText(info);
            }
        });


    }

    private String getAllInfo() {
        return "Serial: " + Build.SERIAL + "\n" +
                "Model: " + Build.MODEL + "\n" +
                "Manufacturer: " + Build.MANUFACTURER + "\n" +
                "BRAND : " + Build.BOARD + "\n" +
                "TYPE : " + Build.TYPE + "\n" +
                "USER : " + Build.USER + "\n" +
                "BASE : " + Build.VERSION_CODES.BASE + "\n" +
                "INCREAMENTAL : " + Build.VERSION.INCREMENTAL + "\n" +
                "BOARD : " + Build.BOARD + "\n" +
                "SDK : " + Build.VERSION.SDK + "\n" +
                "HOST : " + Build.HOST + "\n" +
                "FINGERPRINT : " + Build.FINGERPRINT + "\n" +
                "VERSION CODE : " + Build.VERSION.RELEASE;
    }
}