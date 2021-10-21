package com.example.esercitazione1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 Button Reset;
 Button Test;
 Button Play;
 TextView Tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Reset=findViewById(R.id.button);
        Test=findViewById(R.id.button2);
        Play=findViewById(R.id.button3);
        Tv=findViewById(R.id.testo);
    }
    public void Reset(View v){
        Tv.setText("");
    }
    public void test(View v){
        Toast toast=new Toast.makeText(GetapplicationContext(),"messaggio",Toast.LENGTH_LONG);
        toast.show();
    }

}