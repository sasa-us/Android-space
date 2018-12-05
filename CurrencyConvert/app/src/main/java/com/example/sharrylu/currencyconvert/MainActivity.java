package com.example.sharrylu.currencyconvert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {
        EditText dollarAmountEditText = (EditText) findViewById(R.id.dollarAmountEditText);


        // convert string to double
        Double dollarAmountDouble = Double.parseDouble(dollarAmountEditText.getText().toString());

        //two decimal places
        //convert to RMB
        Double RMBAmount = dollarAmountDouble * 6.75;
        Toast.makeText(MainActivity.this, "RMB = " + String.format("%.2f", RMBAmount), Toast.LENGTH_LONG).show();
        Log.i("amount is ", dollarAmountEditText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
