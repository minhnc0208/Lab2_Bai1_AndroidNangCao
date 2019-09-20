package com.example.mob201_lab2_bai1_ps08611;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
//        Bundle bundle = intent.getExtras();
//        if (bundle != null) {
//            String state = bundle.getString(TelephonyManager.EXTRA_STATE);
//            if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
//                String phoneNumber = bundle.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
//                Toast.makeText(context, phoneNumber, Toast.LENGTH_SHORT).show();
//            }
//        }
        String duLieu = intent.getStringExtra("name");
        Toast.makeText(context, "Send Broadcast complete " + duLieu, Toast.LENGTH_SHORT).show();

        String maKM = intent.getExtras().getString("km");


        if (maKM.equals("MEM123456")) {
            Toast.makeText(context, "Khuyến mãi 10%", Toast.LENGTH_SHORT).show();
        } else if (maKM.equals("MEM251099")) {
            Toast.makeText(context, "Khuyến mãi 20%", Toast.LENGTH_SHORT).show();
        } else if (maKM.equals("VIP123456")) {
            Toast.makeText(context, "Khuyến mãi 30%", Toast.LENGTH_SHORT).show();
        } else if (maKM.equals("VIP251099")) {
            Toast.makeText(context, "Khuyến mãi 50%", Toast.LENGTH_SHORT).show();
        } else if (maKM.length() < 9) {
            Toast.makeText(context, "Mã khuyến mại phải đủ 9 ký tự", Toast.LENGTH_SHORT).show();
        } else if (maKM.startsWith("MEM")) {
            Toast.makeText(context, "Bạn được hưởng khuyến mại member", Toast.LENGTH_SHORT).show();
        } else if (maKM.startsWith("VIP")) {
            Toast.makeText(context, "Bạn được hưởng khuyến mại vip", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Không được khuyến mãi", Toast.LENGTH_SHORT).show();
        }
    }
}