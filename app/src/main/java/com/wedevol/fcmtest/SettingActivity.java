package com.wedevol.fcmtest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        final EditText ipAddressEditText = (EditText) findViewById(R.id.ipaddress);

        ipAddressEditText.setText(new PreferenceStore().getIpaddress(SettingActivity.this));

        findViewById(R.id.save_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new PreferenceStore().setIpaddress(SettingActivity.this, ipAddressEditText.getText().toString());
            }
        });


    }

}
