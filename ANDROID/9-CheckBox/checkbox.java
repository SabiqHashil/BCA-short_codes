// Check box (Write a Program to check the items listed)

package com.andoubleos.mycheckbox;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends Activity {
    CheckBox chk1, chk2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chk1 = (CheckBox) findViewById(R.id.checkBox1);
        chk2 = (CheckBox) findViewById(R.id.checkBox2);

        btn = (Button) findViewById(R.id.button1);

        btn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                StringBuffer s = new StringBuffer();
                s.append("SBQ: ").append(chk1.isChecked());
                s.append("\nMahir: ").append(chk2.isChecked());

                Toast.makeText(MainActivity.this, s.toString(), 500).show();
            }
        });
    }
}