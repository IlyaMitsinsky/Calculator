package com.example.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    NumberController nc;
    CalcController cc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nc = new NumberController();
        nc.setDisplay((TextView) findViewById(R.id.EditText3));
        cc = new CalcController();
        cc.setNc(nc);
    }

    public void onDigitClick(View button){
        Button b = (Button) button;
        nc.addDidit(Integer.parseInt(b.getText().toString()));
    }
    public void onCClear(View button){
        Button b = (Button) button;
        nc.clear();
    }
    public void onPlusClick(View b){
        cc.slojit();
    }
    public void onCalcClick(View b){
        cc.vychislit();
    }
    public void onMinusClick(View b){
        cc.vychest();
    }
    public void onUmnojClick(View b){
        cc.umnojyt();
    }
    public void onDelenClick(View b){
        cc.delit();
    }
    public void onInfoClick(View b){
        Intent i = new Intent(this,InfoActivity.class);
        startActivity(i);
    }
    public void onTochkaClick(View b){
        nc.addDot();
    }
}
