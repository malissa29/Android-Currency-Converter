package com.example.malissafiger.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void amtConvert(View view){
        EditText editTextvalue= (EditText) findViewById(R.id.editTextvalue);
        Toast.makeText(MainActivity.this, Double.parseDouble(editTextvalue.getText().toString()) * 68.08 + "INR", Toast.LENGTH_SHORT).show();

    }

    public void convPounds(View view){
        EditText editTextvalue= (EditText) findViewById(R.id.editTextvalue);
        Toast.makeText(MainActivity.this,  Double.parseDouble(editTextvalue.getText().toString()) * 0.74 + "GBP", Toast.LENGTH_SHORT).show();

    }

    public void convEuro(View view){
        EditText editTextvalue= (EditText) findViewById(R.id.editTextvalue);
        Toast.makeText(MainActivity.this,  Double.parseDouble(editTextvalue.getText().toString()) * 0.85 + "EURO", Toast.LENGTH_SHORT).show();

    }

    public void convMxn(View view){
        EditText editTextvalue= (EditText) findViewById(R.id.editTextvalue);
        Toast.makeText(MainActivity.this,  Double.parseDouble(editTextvalue.getText().toString()) * 19.68 + "MXN", Toast.LENGTH_SHORT).show();

    }

    public void convChf(View view){
        EditText editTextvalue= (EditText) findViewById(R.id.editTextvalue);
        Toast.makeText(MainActivity.this,  Double.parseDouble(editTextvalue.getText().toString()) * 1.0 + "CHF", Toast.LENGTH_SHORT).show();

    }

    public void convBaht(View view){
        EditText editTextvalue= (EditText) findViewById(R.id.editTextvalue);
        Toast.makeText(MainActivity.this,  Double.parseDouble(editTextvalue.getText().toString()) * 32.10 + "THB", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






    }


}
