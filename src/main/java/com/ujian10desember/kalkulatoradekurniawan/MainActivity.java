package com.ujian10desember.kalkulatoradekurniawan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonPlus, buttonMinus, buttonDivide,
            buttonMultiply, buttonClear, buttonEquals;
    TextView mainNumber;
    int input1, input2;
    boolean plus, minus, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonClear = findViewById(R.id.buttonClear);
        buttonEquals = findViewById((R.id.buttonEquals));
        mainNumber = findViewById((R.id.mainNumber));

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mainNumber.getText().equals("0")) {
                    mainNumber.setText("1");
                } else {
                    mainNumber.setText(String.valueOf(Integer.parseInt(mainNumber.getText().toString()) + "1"));
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mainNumber.getText().equals("0")) {
                    mainNumber.setText("2");
                } else {
                    mainNumber.setText(String.valueOf(Integer.parseInt(mainNumber.getText().toString()) + "2"));
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mainNumber.getText().equals("0")) {
                    mainNumber.setText("3");
                } else {
                    mainNumber.setText(String.valueOf(Integer.parseInt(mainNumber.getText().toString()) + "3"));
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mainNumber.getText().equals("0")) {
                    mainNumber.setText("4");
                } else {
                    mainNumber.setText(String.valueOf(Integer.parseInt(mainNumber.getText().toString()) + "4"));
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mainNumber.getText().equals("0")) {
                    mainNumber.setText("5");
                } else {
                    mainNumber.setText(String.valueOf(Integer.parseInt(mainNumber.getText().toString()) + "5"));
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mainNumber.getText().equals("0")) {
                    mainNumber.setText("6");
                } else {
                    mainNumber.setText(String.valueOf(Integer.parseInt(mainNumber.getText().toString()) + "6"));
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mainNumber.getText().equals("0")) {
                    mainNumber.setText("7");
                } else {
                    mainNumber.setText(String.valueOf(Integer.parseInt(mainNumber.getText().toString()) + "7"));
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mainNumber.getText().equals("0")) {
                    mainNumber.setText("8");
                } else {
                    mainNumber.setText(String.valueOf(Integer.parseInt(mainNumber.getText().toString()) + "8"));
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mainNumber.getText().equals("0")) {
                    mainNumber.setText("9");
                } else {
                    mainNumber.setText(String.valueOf(Integer.parseInt(mainNumber.getText().toString()) + "9"));
                }
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mainNumber.getText().equals("0")) {
                    mainNumber.setText("0");
                } else {
                    mainNumber.setText(String.valueOf(Integer.parseInt(mainNumber.getText().toString()) + "0"));
                }
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainNumber.setText("0");
                input1 = 0;
                input2 = 0;
                plus = false;
                minus = false;
                multiply = false;
                divide = false;
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 = input1 + Integer.parseInt(mainNumber.getText() + "");
                plus = true;
                minus = false;
                multiply = false;
                divide = false;
                mainNumber.setText("0");
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 = Integer.parseInt(mainNumber.getText() + "");
                plus = false;
                minus = true;
                multiply = false;
                divide = false;
                mainNumber.setText("0");
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 = Integer.parseInt(mainNumber.getText() + "");
                plus = false;
                minus = false;
                multiply = true;
                divide = false;
                mainNumber.setText("0");
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 = Integer.parseInt(mainNumber.getText() + "");
                plus = false;
                minus = false;
                multiply = false;
                divide = true;
                mainNumber.setText("0");
            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int calc = 0;
                String output = "";
                input2 = Integer.parseInt(mainNumber.getText() + "");
                if (plus == true) {
                    calc = input1 + input2;
                    plus = false;
                } else if (minus == true) {
                    calc = input1 - input2;
                    minus = false;
                } else if (multiply == true) {
                    calc = input1 * input2;
                    multiply = false;
                } else if (divide == true) {
                    calc = input1 / input2;
                    divide = false;
                }
                input1 = 0;
                input2 = 0;
                output = String.valueOf(calc);
                mainNumber.setText(output);

            }
        });
    }
}