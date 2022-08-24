package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        if(!number1ET.getText().toString().equals("") && !number2ET.getText().toString().equals("")){
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double sum = num1 + num2;
            if(sum >= Integer.MAX_VALUE){
                numberSumTV.setText("Unable to calculate. Basically infinite.");
            }else{
                numberSumTV.setText("" + sum);
            }


        }else{
            numberSumTV.setText("Please type a number in each box");
        }

    }

    public void findDifference(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        if(!number1ET.getText().toString().equals("") && !number2ET.getText().toString().equals("")){
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double sum = num1 - num2;

            if(sum >= Integer.MAX_VALUE){
                numberSumTV.setText("Unable to calculate. Basically infinite.");
            }else{
                numberSumTV.setText("" + sum);
            }
        }else{
            numberSumTV.setText("Please type a number in each box");
        }
    }

    public void findProduct(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        if(!number1ET.getText().toString().equals("") && !number2ET.getText().toString().equals("")){
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double sum = num1 * num2;

            if(sum >= Integer.MAX_VALUE){
                numberSumTV.setText("Unable to calculate. Basically infinite.");
            }else{
                numberSumTV.setText("" + sum);
            }
        }else{
            numberSumTV.setText("Please type a number in each box");
        }
    }

    public void findQuotient(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        if(!number1ET.getText().toString().equals("") && !number2ET.getText().toString().equals("")){
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double sum = num1 / num2;

            if(sum >= Integer.MAX_VALUE){
                numberSumTV.setText("Unable to calculate. Basically infinite.");
            }else{
                numberSumTV.setText("" + sum);
            }
        }else{
            numberSumTV.setText("Please type a number in each box");
        }
    }

    public void findPow(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        if(!number1ET.getText().toString().equals("") && !number2ET.getText().toString().equals("")){
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double sum = Math.pow(num1, num2);

            if(sum >= Integer.MAX_VALUE){
                numberSumTV.setText("Unable to calculate. Basically infinite.");
            }else{
                numberSumTV.setText("" + sum);
            }
        }else{
            numberSumTV.setText("Please type a number in each box");
        }
    }

    public void findLog(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        if(!number1ET.getText().toString().equals("") && number2ET.getText().toString().equals("")){
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double sum = Math.log(num1);

            if(sum >= Integer.MAX_VALUE){
                numberSumTV.setText("Unable to calculate. Basically infinite.");
            }else{
                numberSumTV.setText("" + sum);
            }
        }else if(!number1ET.getText().toString().equals("") && !number2ET.getText().toString().equals("")){
            numberSumTV.setText("Please leave the bottom box empty.");
        }else{
            numberSumTV.setText("Please type a number in the top box");
        }
    }

    public void findSine(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        if(!number1ET.getText().toString().equals("") && number2ET.getText().toString().equals("")){
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double sum = Math.sin(num1 * Math.PI / 180);

            if(sum >= Integer.MAX_VALUE){
                numberSumTV.setText("Unable to calculate. Basically infinite.");
            }else{
                numberSumTV.setText("" + sum);
            }
        }else if(!number1ET.getText().toString().equals("") && !number2ET.getText().toString().equals("")){
            numberSumTV.setText("Please leave the bottom box empty.");
        }else{
            numberSumTV.setText("Please type a number in the top box");
        }
    }

    public void findCosine(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        if(!number1ET.getText().toString().equals("") && number2ET.getText().toString().equals("")){
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double sum = Math.cos(num1 * Math.PI / 180);

            if(sum >= Integer.MAX_VALUE){
                numberSumTV.setText("Unable to calculate. Basically infinite.");
            }else{
                numberSumTV.setText("" + sum);
            }
        }else if(!number1ET.getText().toString().equals("") && !number2ET.getText().toString().equals("")){
            numberSumTV.setText("Please leave the bottom box empty.");
        }else{
            numberSumTV.setText("Please type a number in the top box");
        }
    }

    public void clear(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);

        number1ET.setText("");
        number2ET.setText("");
    }

}