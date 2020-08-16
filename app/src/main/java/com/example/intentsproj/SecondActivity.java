package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button add,subtract,multiply,division;
    TextView number1,number2,answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        add=(Button)findViewById(R.id.btnAdd);
        subtract=(Button)findViewById(R.id.btnSub);
        multiply=(Button)findViewById(R.id.btnMultiply);
        division=(Button)findViewById(R.id.btnDivision);

        number1=(TextView)findViewById(R.id.textView1);
        String n1= getIntent().getExtras().getString("Number1","");
        number1.setText(n1);

        number2=(TextView)findViewById(R.id.textView2);
        String n2= getIntent().getExtras().getString("Number2","");
        number2.setText(n2);

        answer=(TextView)findViewById(R.id.answerTextView);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                number1.getText().toString();
                number2.getText().toString();

                double value1=Double.valueOf(number1.getText().toString());
                double value2=Double.valueOf(number2.getText().toString());
                double resultValue=value1+value2;
                answer.setText(value1 + " + " +value2+" = "+ String.valueOf(resultValue));
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1.getText().toString();
                number2.getText().toString();
                double value1=Double.valueOf(number1.getText().toString());
                double value2=Double.valueOf(number2.getText().toString());
                double resultValue=value1-value2;
                answer.setText(value1 + " - " +value2+" = "+ String.valueOf(resultValue));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1.getText().toString();
                number2.getText().toString();
                double value1=Double.valueOf(number1.getText().toString());
                double value2=Double.valueOf(number2.getText().toString());
                double resultValue=value1*value2;
                answer.setText(value1 + " * " +value2+" = "+ String.valueOf(resultValue));
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1.getText().toString();
                number2.getText().toString();
                double value1=Double.valueOf(number1.getText().toString());
                double value2=Double.valueOf(number2.getText().toString());
                double resultValue=value1/value2;
                answer.setText(value1 + " / " +value2+" = "+ String.valueOf(resultValue));
            }
        });
    }
}