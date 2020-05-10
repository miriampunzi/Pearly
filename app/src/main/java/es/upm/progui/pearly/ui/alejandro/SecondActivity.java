
package com.example.uno;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends Activity {
    private static int TIME_OUT = 0; //Time to launch the another activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //TextView turn = (TextView) findViewById(R.id.textView2);
        setContentView(R.layout.activity_second);

       //turn.setText("YOUR TURN");
       Intent openIntent = new Intent(SecondActivity.this, FourthAct.class);
       startActivity(openIntent);




    }
}