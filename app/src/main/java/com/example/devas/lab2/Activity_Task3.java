package com.example.devas.lab2;

import android.os.Bundle;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class Activity_Task3 extends AppCompatActivity {

    float val1, val2;
    boolean addition, subtraction, multiplication, division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3);
        Toast.makeText(Activity_Task3.this, "In Task3 activity", Toast.LENGTH_SHORT).show();

        final EditText textView = (EditText) findViewById(R.id.editText);
        final Button button1 = (Button) findViewById(R.id.num1);
        final Button button2 = (Button) findViewById(R.id.num2);
        final Button button3 = (Button) findViewById(R.id.num3);
        final Button button4 = (Button) findViewById(R.id.num4);
        final Button button5 = (Button) findViewById(R.id.num5);
        final Button button6 = (Button) findViewById(R.id.num6);
        final Button button7 = (Button) findViewById(R.id.num7);
        final Button button8 = (Button) findViewById(R.id.num8);
        final Button button9 = (Button) findViewById(R.id.num9);
        final Button button0 = (Button) findViewById(R.id.num0);
        final Button buttonAddition = (Button) findViewById(R.id.add);
        final Button buttonSubtraction = (Button) findViewById(R.id.sub);
        final Button buttonDivision = (Button) findViewById(R.id.div);
        final Button buttonMultiplication = (Button) findViewById(R.id.mult);
        final Button buttonEquals = (Button) findViewById(R.id.equals);
        final Button buttonClear = (Button) findViewById(R.id.clear);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "2");
        }

        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "3");

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "4");
            }

        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "5");

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "6");
            }

        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "7");

            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "8");
            }

        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "9");

            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "0");
            }

        });

        buttonAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView == null) {
                    textView.setText("");
                }
                else
                {
                    val1 = Float.parseFloat(textView.getText()+"");
                    addition = true;
                    textView.setText(null);
                }
            }
        });

        buttonSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    val1 = Float.parseFloat(textView.getText()+"");
                    subtraction = true;
                    textView.setText(null);
            }
        });

        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Float.parseFloat(textView.getText()+"");
                multiplication = true;
                textView.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Float.parseFloat(textView.getText()+"");
                division = true;
                textView.setText(null);
            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                val2 = Float.parseFloat(textView.getText()+"");

                if (addition==true)
                {
                    textView.setText(val1+val2+"");
                    addition = false;
                }

                if (subtraction==true)
                {
                    textView.setText(val1-val2+"");
                    subtraction = false;
                }

                if (multiplication==true)
                {
                    textView.setText(val1*val2+"");
                    multiplication = false;
                }

                if (division==true)
                {
                    textView.setText(val1/val2+"");
                    division = false;
                }
            }

        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");

            }
        });

    }
}

