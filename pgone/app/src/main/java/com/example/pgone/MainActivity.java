package com.example.pgone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }
    public Button bt1;
    public TextView tx1;

    public void addListenerOnButton(){
        bt1=findViewById(R.id.btn1);
        tx1=findViewById(R.id.textView1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext() ,"Hello same world",Toast.LENGTH_LONG).show();

            }
        });
    }
}