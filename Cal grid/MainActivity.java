package com.example.qwerty;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,eq,pl,mu,di,mi,ac;
    TextView t1;
    int s1,s4;
    String s2,s3,s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = (Button) findViewById(R.id.b0);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        eq = (Button) findViewById(R.id.eq);
        pl = (Button) findViewById(R.id.pl);
        mu = (Button) findViewById(R.id.mu);
        mi = (Button) findViewById(R.id.mi);
        di = (Button) findViewById(R.id.di);
        t1=(TextView) findViewById(R.id.t1);
        ac=(Button) findViewById(R.id.ac);


        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                t1.setText(t1.getText().toString()+"0");

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                t1.setText(t1.getText().toString()+"1");

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString()+"4");

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString()+"5");

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString()+"6");

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString()+"7");

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString()+"8");

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString()+"9");

            }


        });
        //s2 = t1.getText().toString();
        //s1 = Integer.parseInt(s2);

        pl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s2 = t1.getText().toString();
                s1 = Integer.parseInt(s2);

                t1.setText("");

                
                //t1.setText(t1.getText());
                s = "+";
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
            }

        });
        mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s2 = t1.getText().toString();
                s1 = Integer.parseInt(s2);
                t1.setText("");

                //t1.setText(t1.getText());
                s= "-";

            }

        });
        mu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s2 = t1.getText().toString();
                s1 = Integer.parseInt(s2);
                t1.setText("");


                //t1.setText(t1.getText());
                s ="*";

            }

        });
        di.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s2 = t1.getText().toString();
                s1 = Integer.parseInt(s2);
                t1.setText("");


                //t1.setText(t1.getText());

                s = "/";

            }

        });



        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                t1.setText(t1.getText().toString()+"0");

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                t1.setText(t1.getText().toString()+"1");

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString()+"4");

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString()+"5");

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString()+"6");

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString()+"7");

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString()+"8");

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString()+"9");

            }


        });



        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s3 = t1.getText().toString();
                s3=s3.trim();
                s4 = Integer.parseInt(s3);



                    switch(s)
                    {
                        case "+":
                            int sum=s1+s4;
                            String s5=String.valueOf(sum).toString();

                            t1.setText(s5);
                            break;
                        case "-":
                            int m=s1-s4;
                            String s6=String.valueOf(m).toString();

                            t1.setText(s6);
                            break;
                        case "*":
                            int mu=s1*s4;
                            String s7=String.valueOf(mu).toString();

                            t1.setText(s7);
                            break;

                        case "/":
                            int d=s1/s4;
                            String s8=String.valueOf(d).toString();

                            t1.setText(s8);
                            break;


                    }


            }


        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("" );
            }
        });






    }
}