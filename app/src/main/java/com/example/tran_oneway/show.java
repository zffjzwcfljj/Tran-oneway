package com.example.tran_oneway;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class show extends AppCompatActivity{
    private TextView name2,no2;
    public String str1,str2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show);

        name2 = (TextView)findViewById(R.id.name2);
        no2 = (TextView)findViewById(R.id.no2);

        //因为show是通过intend来启动的，所以通过getIntend来获取与这个Activity相关的数据
        Intent intent1 = getIntent();
        Intent intent2 = getIntent();
        //MainActivity里通过putExtra传递时名字是tran1，值是str
        str1 = intent1.getStringExtra("tran1");
        str2 = intent2.getStringExtra("tran2");

        name2.setText(str1);
        no2.setText(str2);
    }


}

