package com.example.uno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.ImageView;

public class FifthAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);


        ImageView im = (ImageView) findViewById(R.id.imageView7);
        SystemClock.sleep(1500);
        im.setImageResource(R.drawable.uno_card_red5);
        Intent inte = new Intent(getApplicationContext(), SixthAct.class);
        Intent openIntent = new Intent(getApplicationContext(), SixthAct.class);


        //Toast.makeText(ctx.getApplicationContext(), "CONNECTION SUCCESS", Toast.LENGTH_SHORT).show();


        startActivity(openIntent);
    }
}
