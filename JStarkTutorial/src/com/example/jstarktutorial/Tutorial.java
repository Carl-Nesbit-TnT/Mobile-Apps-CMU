package com.example.jstarktutorial;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Tutorial extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_tutorial, menu);
        return true;
    }
}
