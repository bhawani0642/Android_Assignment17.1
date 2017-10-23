package com.acadgild.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Declaration
    Button start_btn,stop_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setting up UI component
        start_btn = (Button) findViewById(R.id.strt_btn);
        stop_btn = (Button) findViewById(R.id.stop_btn);
        start_btn.setOnClickListener(this);//setting btn
        stop_btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        //applying condition for start and stop the music
        switch (view.getId()){
            case R.id.strt_btn:// Play audio
                startService(new Intent(this, MyService.class));
                Toast.makeText(this, "Start Music", Toast.LENGTH_LONG).show();
                break;
            case R.id.stop_btn:// Pause audio
                stopService(new Intent(this, MyService.class));
                Toast.makeText(this, "Stop Music", Toast.LENGTH_LONG).show();
                break;

        }
    }
}
