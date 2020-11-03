package com.yeker.myled;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private JniLib ledtest = null;
    private Button bt_01_on = null;
    private Button bt_01_off = null;
    private Button bt_02_on = null;
    private Button bt_02_off = null;
    private TextView tv_main = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ledtest = new JniLib();
        //ledtest.led_open();

        bt_01_on = findViewById(R.id.bt_01_on);
        bt_01_off = findViewById(R.id.bt_01_off);
        bt_02_on = findViewById(R.id.bt_02_on);
        bt_02_off = findViewById(R.id.bt_02_off);
        tv_main = findViewById(R.id.tv_main);

        bt_01_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ledtest.ledIoctl(1);//打开gpio1
                tv_main.setText("打开gpio1");
            }
        });

        bt_01_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ledtest.ledIoctl(2);//关闭gpio1
                tv_main.setText("关闭gpio1");
            }
        });

        bt_02_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ledtest.ledIoctl(4);//打开gpio2
                tv_main.setText("打开gpio2");
            }
        });

        bt_02_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ledtest.ledIoctl(4);//关闭gpio2
                tv_main.setText("关闭gpio2");
            }
        });

    }
}
