package com.example.pgfour;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item1:
               Toast.makeText(this, "item1 selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item2:
                Toast.makeText(this, "item2 selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item3:
                Toast.makeText(this, "item3 selected", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}