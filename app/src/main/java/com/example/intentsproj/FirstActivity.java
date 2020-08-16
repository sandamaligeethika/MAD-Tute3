package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    Button btnOkay;
    EditText num1EditText,num2EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnOkay = (Button)findViewById(R.id.buttonOK);
        num1EditText = (EditText)findViewById(R.id.num1EditText);
        num2EditText=(EditText)findViewById(R.id.num2EditText);

        btnOkay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext(); //The context to use. Usually your Application or Activity object
                CharSequence message = "Sending message"; //Display string
                int duration = Toast.LENGTH_SHORT; //How long the toast message will lasts
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();

                Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("Number1",num1EditText.getText().toString());
                intent.putExtra("Number2",num2EditText.getText().toString());
                startActivity(intent);
            }
        });
    }
}