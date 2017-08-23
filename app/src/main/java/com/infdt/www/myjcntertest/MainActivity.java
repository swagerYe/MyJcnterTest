package com.infdt.www.myjcntertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.infdt.www.testlirary.Test;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String res= Test.testLibrary();
        Log.i("ycz","依赖里的数据 === "+res);
    }
}
