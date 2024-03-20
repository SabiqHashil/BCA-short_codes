// Program to display date and time using dialog box

package com.example;

import java.util.Calendar;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                AlertDialog.Builder aa = new AlertDialog.Builder(MainActivity.this);
                aa.setTitle("fuck you");
                Calendar c = Calendar.getInstance();
                String sysdate = c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1) + ":" + c.get(Calendar.DAY_OF_MONTH);
                String systime = c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND);
                
                aa.setMessage("Date: " + sysdate + "\nTime: " + systime);
                
                aa.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        // TODO Auto-generated method stub
                        
                    }
                });
                
                aa.show();
            }
            
        });
    }

}