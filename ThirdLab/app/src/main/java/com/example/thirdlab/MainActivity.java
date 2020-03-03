package com.example.thirdlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView res;
    int n1, n2, n3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void handleClick(View view){
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        res = (TextView) findViewById(R.id.result);
        try {
            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());
        }
        catch(Exception e){
            res.setText("Invalid input");
            return;
        }
        System.out.println(n1);
        System.out.println(n2);
        switch (view.getId()){
            case R.id.add:
                n3 = n1+n2;
                res.setText(Integer.toString(n3));
                break;
            case R.id.sub:
                n3 = n1-n2;
                res.setText(Integer.toString(n3));
                break;
            case R.id.mul:
                n3 = n1*n2;
                res.setText(Integer.toString(n3));
                break;
            case R.id.div:
                n3 = n1/n2;
                res.setText(Integer.toString(n3));
                break;
        }
    }
}
