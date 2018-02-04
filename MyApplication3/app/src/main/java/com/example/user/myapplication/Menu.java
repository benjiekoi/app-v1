package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_menu);
    }
    public void buttonBP(View view)
    {
        Intent intent = new Intent(this,record.class);
        startActivity(intent);
    }
    public void buttonRecord(View view)
    {
        Intent intent = new Intent(this,Resultrecord.class);
        startActivity(intent);
    }
    public void buttonProf(View view)
    {
        Intent i = new Intent(this,Profile.class);
        startActivity(i);
    }
    public void buttonHelp(View view)
    {
        Intent i = new Intent(this,Help.class);
        startActivity(i);
    }
}
