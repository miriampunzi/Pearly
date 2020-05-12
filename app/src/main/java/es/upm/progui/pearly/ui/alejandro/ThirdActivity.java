package com.example.uno;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

public class ThirdActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.print("***************Act3****************");
        super.onCreate(savedInstanceState);
        //SystemClock.sleep(2000);
        setContentView(R.layout.activity_third);

        //SystemClock.sleep(2000);
        Intent openIntent = new Intent(ThirdActivity.this, FourthAct.class);


        //Toast.makeText(ctx.getApplicationContext(), "CONNECTION SUCCESS", Toast.LENGTH_SHORT).show();


        startActivity(openIntent);

    }
}
