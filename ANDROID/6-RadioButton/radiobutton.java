// Radio Button (Write a Program to Select gender using radio button)

package com.example.radio;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button btn;
    RadioButton rb;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btn = (Button) findViewById(R.id.button1);
        rg = (RadioGroup) findViewById(R.id.radioGroup1);
        
        btn.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View arg0) {
                int id = rg.getCheckedRadioButtonId();
                rb = (RadioButton) findViewById(id); 
                Toast.makeText(MainActivity.this, rb.getText(), 500).show();
            }
        });
    }    
}