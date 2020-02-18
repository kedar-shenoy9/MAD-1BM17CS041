package com.example.secondlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitDetails(View view){
        EditText nameField = (EditText) findViewById(R.id.editText);
        EditText usnField = (EditText) findViewById(R.id.editText2);

        Intent i = new Intent(MainActivity.this, SecondPage.class);

        i.putExtra("username", nameField.getText().toString());
        i.putExtra("usn", usnField.getText().toString());
        startActivity(i);

    }


}
