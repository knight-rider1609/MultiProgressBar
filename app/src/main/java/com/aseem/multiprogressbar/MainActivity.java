package com.aseem.multiprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.aseem.versatileprogressbar.ProgBar;

public class MainActivity extends AppCompatActivity {

    private ProgBar progBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progBar = findViewById(R.id.myProgBar);
    }
}
