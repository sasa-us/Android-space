package com.example.sharry.paypalsdk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class paymentDetails extends AppCompatActivity {

    TextView txtId, txtAmount, txtStatus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_details);

        txtId = (TextView)findViewById(R.id.txtId);
        txtAmount = (TextView)findViewById(R.id.edtAmount);
        txtStatus = (TextView)findViewById(R.id.txtStatus);
    }
}
