// Addition of two Numbers (Write a program to add two numbers)Xml File

package com.example;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    Button btn;
    EditText txt1, txt2;
    TextView tv;

    Float a, b, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (EditText) findViewById(R.id.editText1);
        txt2 = (EditText) findViewById(R.id.editText2);
        tv = (TextView) findViewById(R.id.textView3);

        btn = (Button) findViewById(R.id.button1);

        btn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                a = Float.parseFloat(txt1.getText().toString());
                b = Float.parseFloat(txt2.getText().toString());
                c = a + b;

                tv.setText(c.toString());
            }
        });
    }
}