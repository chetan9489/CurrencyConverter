package com.example.chetanchauhan.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void onClickButton(View view)
    {
        EditText USD=(EditText) findViewById(R.id.dollar);

        Double sum=Double.parseDouble(USD.getText().toString());
        sum*=65;
        Toast.makeText(getApplicationContext(),"INR "+ sum.toString(),Toast.LENGTH_LONG).show();

    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
