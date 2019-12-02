package com.example.andriod.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText dollar = findViewById(R.id.dollar);
        Double dollardouble = Double.parseDouble(dollar.getText().toString());
        Double rupees = dollardouble * 71.72;
        Toast.makeText(this,"₹"+ rupees.toString(), Toast.LENGTH_SHORT).show();
        Log.i("amount",dollar.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
