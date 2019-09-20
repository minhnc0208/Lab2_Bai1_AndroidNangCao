package com.example.mob201_lab2_bai1_ps08611;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText edtNhap;

    private EditText edtKM;
    private Button btnCheck;

    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNhap = (EditText) findViewById(R.id.edtNhap);


        edtKM = (EditText) findViewById(R.id.edtKM);
        btnCheck = (Button) findViewById(R.id.btnCheck);


        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this,MyBroadcastReceiver.class);
                String maKM = edtKM.getText().toString();
                intent.putExtra("km",maKM);
                intent.putExtra("name",edtNhap.getText().toString());
                intent.setAction("minh.android.CUSTOM_INTENT");
                sendBroadcast(intent);
            }
        });
    }
}