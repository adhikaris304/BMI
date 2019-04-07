package com.example.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button calculate;
    TextView txtheight, txtweight;
    EditText etheight, etweight;

    private Button getCalculate;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculate=findViewById(R.id.btncalculate);
        txtheight=findViewById(R.id.txtheight);
        txtweight=findViewById(R.id.etweight);
        etheight=findViewById(R.id.etheight);
        etweight=findViewById(R.id.etweight);

    }

    @Override
    public void onClick(View v) {


    }
}
