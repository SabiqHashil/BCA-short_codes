// Menu Program (Write a Program to create menu with three menu items)

package com.andoubleos.menuprgm;

import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.copyItem) {
            Toast.makeText(MainActivity.this, "You Clicked Copy Menu Item", 500).show();
        } else if (id == R.id.cutItem) {
            Toast.makeText(MainActivity.this, "You Clicked Cut Menu Item", Toast.LENGTH_LONG).show();
        } else if (id == R.id.copyItem) {
            Toast.makeText(MainActivity.this, "You Clicked Paste Menu Item", 500).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
