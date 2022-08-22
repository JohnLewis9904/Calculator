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
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int sum = num1 + num2;

            numberSumTV.setText("" + sum);
        }else{
            numberSumTV.setText("Please type a number in each box");
        }

    }

    public void findDifference(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        if(!number1ET.getText().toString().equals("") && !number2ET.getText().toString().equals("")){
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int sum = num1 - num2;

            numberSumTV.setText("" + sum);
        }else{
            numberSumTV.setText("Please type a number in each box");
        }
    }

    public void findProduct(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        if(!number1ET.getText().toString().equals("") && !number2ET.getText().toString().equals("")){
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int sum = num1 * num2;

            numberSumTV.setText("" + sum);
        }else{
            numberSumTV.setText("Please type a number in each box");
        }
    }

    public void findQuotient(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        if(!number1ET.getText().toString().equals("") && !number2ET.getText().toString().equals("")){
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double sum = num1 / num2;

            numberSumTV.setText("" + sum);
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

            numberSumTV.setText("" + sum);
        }else{
            numberSumTV.setText("Please type a number in each box");
        }
    }

    public void findLog(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        if(!number1ET.getText().toString().equals("") && !number2ET.getText().toString().equals("")){
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double sum = num1 / num2;

            numberSumTV.setText("" + sum);
        }else{
            numberSumTV.setText("Please type a number in each box");
        }
    }

    public void clear(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);

        number1ET.setText("");
        number2ET.setText("");
    }

}