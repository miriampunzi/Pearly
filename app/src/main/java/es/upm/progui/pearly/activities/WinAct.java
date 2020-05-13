package es.upm.progui.pearly.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import es.upm.progui.pearly.MainActivity;
import es.upm.progui.pearly.R;

public class WinAct extends AppCompatActivity {

    Button exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.win_act);

        exit = findViewById(R.id.button3);

        exit.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                startActivity(new Intent(WinAct.this, MainActivity.class));
            }
        });
    }
}
