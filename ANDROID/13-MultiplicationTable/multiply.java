// Write a program to display multiplication table of a given number

package com.andoubleos.multiplicationtable;

import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity {
    EditText txt;
    Button btn;
    TextView txtv;
    int ans = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (EditText) findViewById(R.id.editText1);
        btn = (Button) findViewById(R.id.button1);
        txtv = (TextView) findViewById(R.id.textView1);
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                for (int i = 1; i <= 14; i++) {
                    ans = (i * n);
                    temp.append(i + " X " + n + " = " + ans + "\n");
                    txtv.setText(temp);
                }
            }
        });
    }
}
