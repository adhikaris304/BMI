package com.example.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    private EditText etheight, etweight;
    private TextView tvbmi;
    private Button btncalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etheight = findViewById(R.id.etheight);
        etweight = findViewById(R.id.etweight);
        tvbmi = findViewById(R.id.tvbmi);
        btncalculate = findViewById(R.id.btncalculate);

        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isEmpty()){
                    float height = Float.parseFloat(etheight.getText().toString());
                    float weight = Float.parseFloat(etweight.getText().toString());
                    Calculation bmi = new Calculation(height, weight);
                    float arithmetic = bmi.arithmetic();
                    tvbmi.setText(Float.toString(arithmetic));
                    float value = Float.parseFloat(tvbmi.getText().toString());
                    if (value < 18.5) {
                        Toast.makeText(MainActivity.this, "Under Weight", Toast.LENGTH_LONG).show();
                    } else if (value > 18.5 && value < 24.9) {
                        Toast.makeText(MainActivity.this, "Normal Weight", Toast.LENGTH_LONG).show();
                    } else if (value > 24.9 && value < 29.9) {
                        Toast.makeText(MainActivity.this, "Over Weight", Toast.LENGTH_LONG).show();

                    } else {
                        Toast.makeText(MainActivity.this, "Obesity", Toast.LENGTH_LONG).show();

                    }
                }}


        });
    }

    public boolean isEmpty(){
        if (TextUtils.isEmpty((etheight.getText().toString()))){
            etheight.setError(("Please enter height"));
            etheight.requestFocus();
            return true;
        } else if (TextUtils.isEmpty((etweight.getText().toString()))) {
            etweight.setError("Please enter weight");
            etweight.requestFocus();
            return true;
        }else return false;
        }
    }
