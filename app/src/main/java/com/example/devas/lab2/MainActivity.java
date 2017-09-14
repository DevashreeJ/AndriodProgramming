package com.example.devas.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menufile, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        Intent intent;
        switch (id)
        {
            case R.id.task2 :
               intent = new Intent(this,Activity_Task2.class);
                startActivity(intent);
                return  true;

            case R.id.task3 :
                intent = new Intent(this,Activity_Task3.class);
                startActivity(intent);
                return  true;

            case R.id.task5 :
                intent = new Intent(this,Activity_Task5.class);
                startActivity(intent);
                return  true;
        }
        return true;
    }
}
