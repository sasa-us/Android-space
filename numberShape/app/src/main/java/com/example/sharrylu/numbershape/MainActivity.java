package com.example.sharrylu.numbershape;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    class Number {
        int number;
        public boolean isSquare() {
            double squareRoot = Math.sqrt(number);
            if(squareRoot == Math.floor(squareRoot)) {
                return true;
            } else {
                return false;
            }
        }
        public boolean isTriangular() {
            int x = 1;
            int triangularNumber = 1;
            while(triangularNumber < number) {
                x++;
                triangularNumber = triangularNumber + x;
            }

            if(triangularNumber == number){
                return true;
            } else {
                return false;
            }
        }
    }//end class Number

    public void testNumber(View view) {
        String message = "";
        //get input number
        // view = findViewById(R.id.usersNumber);
        //convert to text
        EditText usersNumber = (EditText) findViewById(R.id.usersNumber);
        //test input string is empty
        if(usersNumber.getText().toString().isEmpty()) {
            message = "Please enter a number";
        } else {

            Log.i("usersNumber is ", usersNumber.getText().toString());

            Number myNumber = new Number();
            myNumber.number = Integer.parseInt(usersNumber.getText().toString());


            if (myNumber.isSquare()) {
                if (myNumber.isTriangular()) {
                    message = myNumber.number + "is both triangular and square!";
                } else {
                    message = myNumber.number + "is sqaure, but not triangular.";
                }
            } else {
                if (myNumber.isTriangular()) {
                    message = myNumber.number + "is  triangular and not square!";
                } else {
                    message = myNumber.number + "is not sqaure & not triangular.";
                }
            }
        }
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();

    }//end testNumber()

    //min

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
