package com.example.lab_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private static int q=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Thread s = new Thread() {
            public void run() {
                try {
                    ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
                    progressBar.setVisibility(ProgressBar.VISIBLE);

                    sleep(2000);
                    // After 2 Seconds redirect to another intent
                    if(q==0){
                        Intent i = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(i);
                        q=1;
                    }
                    finish();
                }
                catch (Exception e) {

                }
            }
        };
        s.start();
    }
}
