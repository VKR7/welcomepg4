package com.example.vkr_7.welcomepg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
String s1;
TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String s1=getIntent().getStringExtra("key");
        t1=(TextView)findViewById(R.id.h1);
        t1.setText(s1);
        open();

    }
    public void open(){
        Intent obj=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(obj);
    }
}
