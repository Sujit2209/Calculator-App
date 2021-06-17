package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String text;
    private double first;
    private double second;
    private double result;
    private String operation;
    private String answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView view1 = (TextView) findViewById(R.id.view1);
        final TextView view2 = (TextView) findViewById(R.id.view2);
        //Clear Button
        final Button clearbutton = findViewById(R.id.clear_button);
        clearbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                view1.setText("");
                view2.setText("");
            }});
        /**Numeric Buttons
         **/
        final Button button0 = findViewById(R.id.zero_button);
        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                text=view2.getText().toString()+button0.getText().toString();
                view2.setText(text);
            }});

        final Button button1 = findViewById(R.id.one_button);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                text=view2.getText().toString()+button1.getText().toString();
                view2.setText(text);
            }});

        final Button button2=findViewById(R.id.two_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=view2.getText().toString()+button2.getText().toString();
                view2.setText(text);
            }});

        final Button button3=findViewById(R.id.three_button);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=view2.getText().toString()+button3.getText().toString();
                view2.setText(text);
            }});

        final Button button4=findViewById(R.id.four_button);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=view2.getText().toString()+button4.getText().toString();
                view2.setText(text);
            }});

        final Button button5=findViewById(R.id.five_button);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=view2.getText().toString()+button5.getText().toString();
                view2.setText(text);
            }});

        final Button button6=findViewById(R.id.six_button);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=view2.getText().toString()+button6.getText().toString();
                view2.setText(text);
            }});

        final Button button7=findViewById(R.id.seven_button);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=view2.getText().toString()+button7.getText().toString();
                view2.setText(text);
            }});

        final Button button8=findViewById(R.id.eight_button);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=view2.getText().toString()+button8.getText().toString();
                view2.setText(text);
            }});

        final Button button9=findViewById(R.id.nine_button);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=view2.getText().toString()+button9.getText().toString();
                view2.setText(text);
            }});
        final Button buttondot=findViewById(R.id.dot_button);
        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=view2.getText().toString()+buttondot.getText().toString();
                view2.setText(text);
            }});
        final Button buttonnegative = findViewById(R.id.negative_button);
        buttonnegative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String negate="-";
                text=negate+view2.getText().toString();
                view2.setText(text);
            }
        });
        //Back Button
        final Button buttonback = findViewById(R.id.back_button);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String backspace=null;
            if(view2.getText().length()>0) {
                StringBuilder stringBuilder = new StringBuilder(view2.getText());
                stringBuilder.deleteCharAt(view2.getText().length() - 1);
                backspace = stringBuilder.toString();
                view2.setText(backspace);
            }
            }});
        /** Operation Buttons **/
        final Button buttonpercent = findViewById(R.id.percent_button);
        buttonpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first=Double.parseDouble((String) view2.getText());
                primary=String.format("%.2f",first);
                view1.setText(primary);
                view2.setText("");
                operation="%";
            }
        });
        final Button buttonsubtract = findViewById(R.id.subtract_button);
        buttonsubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first=Double.parseDouble((String) view2.getText());
                primary=String.format("%.2f",first);
                view1.setText(primary);
                view2.setText("");
                operation="-";
            }
        });
        final Button buttonplus = findViewById(R.id.plus_button);
        buttonplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first=Double.parseDouble((String) view2.getText());
                primary=String.format("%.2f",first);
                view1.setText(primary);
                view2.setText("");
                operation="+";
            }
        });
        final Button buttonmultiply = findViewById(R.id.multiply_button);
        buttonmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first=Double.parseDouble((String) view2.getText());
                primary=String.format("%.2f",first);
                view1.setText(primary);
                view2.setText("");
                operation="x";
            }
        });
        final Button buttondivide = findViewById(R.id.divide_button);
        buttondivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first=Double.parseDouble((String) view2.getText());
                primary=String.format("%.2f",first);
                view1.setText(primary);
                view2.setText("");
                operation="/";
            }
        });
        //Equal Button
        final Button buttonequal = findViewById(R.id.equal_button);
        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second = Double.parseDouble((String) view2.getText());
                if (operation == "+") {
                    result = first + second;
                    answer = String.format("%.2f", result);
                    view2.setText(answer);
                    view1.setText("");
                }
                if (operation == "-") {
                    result = first - second;
                    answer = String.format("%.2f", result);
                    view2.setText(answer);
                    view1.setText("");
                }
                if (operation == "x") {
                    result = first * second;
                    answer = String.format("%.2f", result);
                    view2.setText(answer);
                    view1.setText("");
                }
                if (operation == "/") {
                    result = first / second;
                    answer = String.format("%.2f", result);
                    view2.setText(answer);
                    view1.setText("");
                }
                if (operation == "%") {
                    result = first % second;
                    answer = String.format("%.2f", result);
                    view2.setText(answer);
                    view1.setText("");
                }
            }});
    }
}