package com.wimonsiri.changenumberapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText desText;
    private Button btnCal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        desText = (EditText) findViewById(R.id.desText);
        btnCal = (Button) findViewById(R.id.btnCal);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int des;
                des = Integer.parseInt(desText.getText().toString());
                String binText = "";
                binText = desToBin(des);
                Toast.makeText(MainActivity.this , binText , Toast.LENGTH_LONG).show();

            }
        });

    }

    private String desToBin(int des){
        String binary = Integer.toBinaryString(des);
        return ("Binary Number : " + binary);

    }
}