package com.example.renukaa.appa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Renukaa on 5/6/2018.
 */

public class MainActivity extends AppCompatActivity {



    Thread splashTread;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView)findViewById(R.id.simpleImageView);
        Thread myT =new Thread(){
            @Override
            public void run()
            {
                try {
                    sleep(3000);
                    Intent t= new Intent(getApplicationContext(),MainActivity2.class);
                    startActivity(t);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myT.start();
    }


}

