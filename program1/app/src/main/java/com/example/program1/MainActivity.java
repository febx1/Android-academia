package com.example.program1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig)
    {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE)
        {
            Toast toast=Toast.makeText(this,"This is landscape view ",Toast.LENGTH_LONG);
            toast.show();
        }
        else if(newConfig.orientation==Configuration.ORIENTATION_PORTRAIT){
            Toast toast=Toast.makeText(this,"This is portrait view ",Toast.LENGTH_LONG);
            toast.show();
        }
    }
}