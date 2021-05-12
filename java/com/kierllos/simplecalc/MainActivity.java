package com.kierllos.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String operation1 = "";
    String operator = "";
    String currOperation ="";
    Integer ans = 0;
    Button zero,one,two,three,four,five,six,seven,eight,nine,equals,dot
            ,plus,minus,times,divide,cancel,del,sign,modulo;
    //numbers text view
    TextView numbersTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numbersTextView = findViewById(R.id.textView);

        //Numbers Buttons
        zero = findViewById(R.id.zero);
        zero.setOnClickListener(v -> {
            currOperation += 0;
            ans = Integer.valueOf(currOperation);
            numbersTextView.setText(currOperation);
        });
        one = findViewById(R.id.one);
        one.setOnClickListener(v -> {
            currOperation += 1;
            ans = Integer.valueOf(currOperation);
            numbersTextView.setText(currOperation);
        });
        two = findViewById(R.id.two);
        two.setOnClickListener(v -> {
            currOperation += 2;
            ans = Integer.valueOf(currOperation);
            numbersTextView.setText(currOperation);
        });
        three = findViewById(R.id.three);
        three.setOnClickListener(v -> {
            currOperation += 3;
            ans = Integer.valueOf(currOperation);
            numbersTextView.setText(currOperation);
        });
        four = findViewById(R.id.four);
        four.setOnClickListener(v -> {
            currOperation += 4;
            ans = Integer.valueOf(currOperation);
            numbersTextView.setText(currOperation);
        });
        five = findViewById(R.id.five);
        five.setOnClickListener(v -> {
            currOperation += 5;
            ans = Integer.valueOf(currOperation);
            numbersTextView.setText(currOperation);
        });
        six = findViewById(R.id.six);
        six.setOnClickListener(v -> {
            currOperation += 6;
            ans = Integer.valueOf(currOperation);
            numbersTextView.setText(currOperation);
        });
        seven = findViewById(R.id.seven);
        seven.setOnClickListener(v -> {
            currOperation += 7;
            ans = Integer.valueOf(currOperation);
            numbersTextView.setText(currOperation);
        });
        eight = findViewById(R.id.eight);
        eight.setOnClickListener(v -> {
            currOperation += 8;
            ans = Integer.valueOf(currOperation);
            numbersTextView.setText(currOperation);
        });
        nine = findViewById(R.id.nine);
        nine.setOnClickListener(v -> {
            currOperation += 9;
            ans = Integer.valueOf(currOperation);
            numbersTextView.setText(currOperation);
        });

        //currOperations Buttons
        dot = findViewById(R.id.dot);
        dot.setOnClickListener(v -> {
            if(!currOperation.contains(".")) {
                currOperation += ".";
            }
            numbersTextView.setText(currOperation);
        });

        equals = findViewById(R.id.equals);
        equals.setOnClickListener(v -> {
            try {
                switch (operator){
                    case "+":
                        ans = Integer.valueOf(operation1) + Integer.parseInt(currOperation);
                        break;
                    case "-":
                        ans = Integer.valueOf(operation1) - Integer.parseInt(currOperation);
                        break;
                    case "*":
                        ans = Integer.valueOf(operation1) * Integer.parseInt(currOperation);
                        break;
                    case "/":
                        ans = Integer.valueOf(operation1) / Integer.parseInt(currOperation);
                        break;
                    case "%":
                        ans = Integer.valueOf(operation1) % Integer.parseInt(currOperation);
                        break;
                }
            }
            catch (Exception e){
                Toast.makeText(this,"Enter Another Number",Toast.LENGTH_SHORT);
            }

            numbersTextView.setText(String.valueOf(ans));
            currOperation = String.valueOf(ans);
            operation1="";
        });

        cancel = findViewById(R.id.cancel);
        cancel.setOnClickListener(v -> {
            ans = 0;
            currOperation = "";
            operation1 = "";
            numbersTextView.setText(currOperation);
        });

        del = findViewById(R.id.delete);
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currOperation = currOperation.substring(0,currOperation.length()-1);
                numbersTextView.setText(currOperation);
            }
        });

        sign = findViewById(R.id.Sign);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

        plus = findViewById(R.id.plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "+";
                if (operation1 == "") {
                    operation1 = currOperation;
                    currOperation = "";
                }
                if (currOperation != "") {
                    ans = Integer.valueOf(operation1) + Integer.parseInt(currOperation);
                    operation1 = String.valueOf(ans);
                    currOperation = "";
                    numbersTextView.setText(String.valueOf(ans));
                }
            }
        });
        minus = findViewById(R.id.minus);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "-";
                if (operation1 == "") {
                    operation1 = currOperation;
                    currOperation = "";
                }
                if (currOperation != "") {
                    ans = Integer.valueOf(operation1) - Integer.parseInt(currOperation);
                    operation1 = String.valueOf(ans);
                    currOperation = "";
                    numbersTextView.setText(String.valueOf(ans));
                }
            }
        });
        times = findViewById(R.id.times);
        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "*";
                if (operation1 == "") {
                    operation1 = currOperation;
                    currOperation = "";
                }
                if (currOperation != "") {
                    ans = Integer.valueOf(operation1) * Integer.parseInt(currOperation);
                    operation1 = String.valueOf(ans);
                    currOperation = "";
                    numbersTextView.setText(String.valueOf(ans));
                }
            }
        });
        divide = findViewById(R.id.divide);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "/";
                if (operation1 == "") {
                    operation1 = currOperation;
                    currOperation = "";
                }
                if (currOperation != "") {
                    ans = Integer.valueOf(operation1) / Integer.parseInt(currOperation);
                    operation1 = String.valueOf(ans);
                    currOperation = "";
                    numbersTextView.setText(String.valueOf(ans));
                }
            }
        });
        modulo = findViewById(R.id.module);
        modulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "%";
                if (operation1 == "") {
                    operation1 = currOperation;
                    currOperation = "";
                }
                if (currOperation != "") {
                    ans = Integer.valueOf(operation1) % Integer.parseInt(currOperation);
                    operation1 = String.valueOf(ans);
                    currOperation = "";
                    numbersTextView.setText(String.valueOf(ans));
                }
            }
        });

    }
    public void displayCurrState(){
        numbersTextView.setText(currOperation);
        Toast.makeText(MainActivity.this,"done",Toast.LENGTH_SHORT).show();
    }
}
