package com.example.kedarexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.String;

public class MainActivity extends AppCompatActivity {
    private int ch = 0;
    private float size = 30;

    public void changeSize(View view){
//        EditText name = (EditText) findViewById(R.id.userName);
//        String user_name = name.getText().toString();
//        TextView greetSpace = (TextView)findViewById(R.id.textView);
//        greetSpace.setText("Hi "+user_name);
          TextView message = (TextView) findViewById(R.id.textView);
          message.setTextSize(size);
          size += 5;
          if(size == 60) size = 30;
    }

    public void changeColor(View view){
        String[] colors = {"#F44336", "#E91E63", "#2196F3", "#9C27B0"};

        TextView message = (TextView) findViewById(R.id.textView);
        message.setTextColor(Color.parseColor(colors[ch]));
        ch = (ch+1)%4;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
