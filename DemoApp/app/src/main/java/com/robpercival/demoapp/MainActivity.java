package com.robpercival.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void loginClicked(View view) {
        //get content of input
        EditText usernameTextField = (EditText) findViewById(R.id.usernameEditText); //get all id in res find one id=myTextField

        EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);

        //convert view to editText
        Log.i("Username", usernameTextField.getText().toString());
        Log.i("password", passwordEditText.getText().toString());  //must use double quote!
//        Log.i("Info", "button is pressed");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
