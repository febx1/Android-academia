package com.example.pgtwo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE)
        {
            Toast toast =Toast.makeText(this,"this is landscape view",Toast.LENGTH_LONG);
            toast.show();
        }
        else if (newConfig.orientation==Configuration.ORIENTATION_PORTRAIT)
        {
            Toast toast = Toast.makeText(this, "this is portrait view", Toast.LENGTH_LONG);
            toast.show();
        }

    }
}