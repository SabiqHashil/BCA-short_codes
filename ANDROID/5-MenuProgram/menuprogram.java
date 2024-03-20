// Menu Program (Write a Program to create menu with three menu items)

package com.example;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.copy)
            Toast.makeText(MainActivity.this, "Copy", 500).show();

        else if (id == R.id.cut)
            Toast.makeText(MainActivity.this, "Cut", 500).show();

        else if (id == R.id.paste)
            Toast.makeText(MainActivity.this, "Paste", 500).show();

        return super.onOptionsItemSelected(item);
    }

}