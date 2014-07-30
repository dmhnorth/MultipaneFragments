package com.dave.multipanefragments;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int screenOrientation = getResources().getConfiguration().orientation;

        if(screenOrientation == Configuration.ORIENTATION_PORTRAIT){
            hideSidePanel();
        }
    }

    private void hideSidePanel() {
        View sidepane = findViewById(R.id.side_panel);
        if(sidepane.getVisibility() == View.VISIBLE){
            sidepane.setVisibility(View.GONE);
        }
    }


}
