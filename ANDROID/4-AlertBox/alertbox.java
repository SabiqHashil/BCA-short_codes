// Alert Box (Write a program to Display an alert box with OK and Cancel)

package com.andoubleos.alertbox;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

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
                AlertDialog.Builder a1 = new AlertDialog.Builder(MainActivity.this);
                a1.setTitle("yeah");
                a1.setMessage("nah man");
                a1.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        // TODO Auto-generated method stub
                        Toast.makeText(MainActivity.this, "OK", 500).show();
                    }
                });
                
                a1.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        // TODO Auto-generated method stub
                        Toast.makeText(MainActivity.this, "cancel", 500).show();
                    }
                });
                
                a1.show();
            }
        });
    }
}