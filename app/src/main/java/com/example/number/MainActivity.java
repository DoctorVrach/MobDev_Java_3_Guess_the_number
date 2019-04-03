package com.example.number;

import android.content.Intent;
import android.os.Environment;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.Math;

public class MainActivity extends AppCompatActivity {

    TextView tvInfo;
    EditText etInput;
    Button bControl;
    String val;
    Button submit;
    int rand = 1 + (int) (Math.random() * 100);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvInfo = findViewById(R.id.textView);
        etInput = findViewById(R.id.editText);
        bControl = findViewById(R.id.button);
        submit = findViewById(R.id.button2);


    }

    public void onClick(View view) {

        val = etInput.getText().toString();
        if (val.length()>0){
            int value = Integer.parseInt(etInput.getText().toString());
            if (value > rand && value < 101)
                tvInfo.setText(getResources().getString(R.string.ahead));
            else if (value < rand)
                tvInfo.setText(getResources().getString(R.string.mal));
            else if(value>101)
                tvInfo.setText(getResources().getString(R.string.per));
            else
                tvInfo.setText(getResources().getString(R.string.win));
        }

        else{
        tvInfo.setText(getResources().getString(R.string.er));
        }
    }
    public void onClick1(View view) {
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);

    }

}

