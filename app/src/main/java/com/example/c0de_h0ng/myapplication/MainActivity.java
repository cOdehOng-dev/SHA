package com.example.c0de_h0ng.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText plainText;
    Button sha1Btn;
    Button sha2Btn;
    TextView tv;
    TextView tv2;
    String plain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plainText = (EditText)findViewById(R.id.plainText);
        sha1Btn = (Button)findViewById(R.id.sha1Btn);
        sha2Btn = (Button)findViewById(R.id.sha2Btn);
        tv = (TextView)findViewById(R.id.eSHA1);
        tv2 = (TextView)findViewById(R.id.eSHA2);

        sha1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plain = plainText.getText().toString();
                String EncrySHA1 = SHA1.sha1(plain);
                tv.setText(EncrySHA1);
            }
        });

        sha2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plain = plainText.getText().toString();
                String EncrySHA256 = SHA256.sha256(plain);
                tv2.setText(EncrySHA256);
            }
        });


    }
}
