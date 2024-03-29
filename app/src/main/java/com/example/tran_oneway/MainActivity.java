package com.example.tran_oneway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText input1,input2;
    Button button;
    String str1,str2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =(Button)findViewById(R.id.button);
        button.setOnClickListener(this);

        input1 = (EditText)findViewById(R.id.name);
        input2 = (EditText)findViewById(R.id.no);

        input1.setOnClickListener(this);
        input2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        Intent intent1 = new Intent();

        //MainActivity和show连接起来 允许他们之间传递数据
        intent1.setClass(MainActivity.this,show.class);

        str1 = input1.getText().toString();
        str2 = input2.getText().toString();

        switch(v.getId()){
            case R.id.button:
                input1.setText(str1);
                input2.setText(str2);

                //用putExtra把内容传送到另一个Activity,名字是tran1，值是str1
                intent1.putExtra("tran1",str1);
                intent1.putExtra("tran2",str2);

                //启动第二个activity并传递
                startActivity(intent1);

        }

    }
}

