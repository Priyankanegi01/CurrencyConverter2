package com.priyanka.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void Convert(View view) {
        EditText editText=(EditText)findViewById(R.id.editText);
        Double dollar=Double.parseDouble(editText.getText().toString());
        Double inr=dollar*71.59;
        Toast.makeText(MainActivity.this,"Rs"+ inr.toString(),Toast.LENGTH_LONG).show();
        Log.i("amount",editText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
