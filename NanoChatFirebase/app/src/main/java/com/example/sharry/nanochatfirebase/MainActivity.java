package com.example.sharry.nanochatfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sendBtn = (Button) findViewById(R.id.sendBgn);
        EditText messageTxt = (EditText) findViewById(R.id.messageTxt);
        RecyclerView messageList = findViewById(R.id.messageList);


    }
}
