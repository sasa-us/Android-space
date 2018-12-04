package com.robpercival.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        //get content of input
        EditText myTextField = (EditText) findViewById(R.id.myTextField); //get all id in res find one id=myTextField
        //convert view to editText
        Log.i("Info", myTextField.getText().toString());
//        Log.i("Info", "button is pressed");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
