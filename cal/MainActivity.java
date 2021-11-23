package com.example.makk1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    TextView t1;

    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        e1 = (EditText)findViewById(R.id.v1);
        e2 = (EditText)findViewById(R.id.v2);
        t1 = (TextView) findViewById(R.id.ot);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a,b,c;
                a = Integer.parseInt(e1.getText().toString());
                b = Integer.parseInt(e2.getText().toString());
                c = a+b;
                t1.setText(Integer.toString(c));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a,b,c;
                a = Integer.parseInt(e1.getText().toString());
                b = Integer.parseInt(e2.getText().toString());
                c = a-b;
                t1.setText(Integer.toString(c));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a,b,c;
                a = Integer.parseInt(e1.getText().toString());
                b = Integer.parseInt(e2.getText().toString());
                c = a*b;
                t1.setText(Integer.toString(c));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a,b,c;
                a = Integer.parseInt(e1.getText().toString());
                b = Integer.parseInt(e2.getText().toString());
                c = a/b;
                t1.setText(Integer.toString(c));
            }
        });


    }
}