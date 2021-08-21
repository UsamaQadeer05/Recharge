package com.example.recharge;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {
    Button btnQRcode;
    Button btnBarcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cabletvscreen);
//        getSupportActionBar().hide();
        btnBarcode = findViewById(R.id.btnBarcode);
        btnQRcode = findViewById(R.id.btnQRcode);

//       btnQRcode.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                btnQRcode.setBackgroundColor(Color.parseColor("#32b1da"));
//               btnBarcode.setBackgroundColor(Color.WHITE);
//            }
//        });
//        btnBarcode.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                btnBarcode.setBackgroundColor(Color.parseColor("#32b1da"));
//                btnQRcode.setBackgroundColor(Color.WHITE);
//            }
//        });
        Button btnscanreference = findViewById(R.id.btnscanurreferencenumber);
        btnscanreference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(MainActivity.this, R.style.BottomSheetDialogTheme);
                View bottomSheetView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.layout_bottom_sheet, (LinearLayout) findViewById(R.id.bottomSheetContainer));
                bottomSheetDialog.setContentView(bottomSheetView);
                bottomSheetDialog.show();
            }
        });

    }

}