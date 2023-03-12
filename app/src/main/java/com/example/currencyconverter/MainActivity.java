package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
//Create objects for all the widgets
    TextView tv_to,tv_from,tv_result;
    EditText edt_amount;
    Button btnusd,btneuro;
    String amount;
    int mad,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        Clicklisteners();
    }
    //Initialize all the widgets and do view binding
    public void init(){
        tv_to=findViewById(R.id.tv_to);
        tv_from=findViewById(R.id.tv_from);
        tv_result=findViewById(R.id.tvresult);
        edt_amount=findViewById(R.id.edt_amount);
        btnusd=findViewById(R.id.btnusd);


        btneuro=findViewById(R.id.btneur);

    }

    //Now We will create click listeners for each button
    public void Clicklisteners(){
        btnusd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //here we get user input into this variable
                amount=edt_amount.getText().toString();
                mad=10;
                //integer.parse used to convert string value into integer for calculcatin purpose
                result=Integer.parseInt(amount)*(mad);
                //again converted integer value into string because android system works with strings
                tv_result.setText(String.valueOf(result));
                tv_to.setText("USD");
                tv_from.setText("US$ = 10MAD");
            }
        });

        btneuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=edt_amount.getText().toString();
                mad=10;
                result=Integer.parseInt(amount)*(mad);
                tv_result.setText(String.valueOf(result));
                tv_to.setText("EURO");
                tv_from.setText("EURO = 10mad");
            }
        });

    }


}