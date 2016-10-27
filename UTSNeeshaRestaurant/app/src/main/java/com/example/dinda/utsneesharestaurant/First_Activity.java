package com.example.dinda.utsneesharestaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class First_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.first_, menu);
        return true;
    }

    public void displayMethod(View v) {
        //Toast.makeText(getBaseContext(),"WELCOME", Toast.LENGTH_LONG).show();
        Intent intent = new Intent("com.example.dinda.utsneesharestaurant.Login_Activity");
        startActivity(intent);


    }
}
