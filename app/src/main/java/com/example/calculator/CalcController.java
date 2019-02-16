package com.example.calculator;

import android.widget.TextView;

public class CalcController {
    Double A;
    Double B;
    Operacia oper;
    NumberController nc;


    public void setNc(NumberController nc) {
        this.nc = nc;
    }


    public void slojit(){
        if (oper != null) {
            vychislit();
        }
        if (!nc.getError()) {
            A = nc.getValue();
            oper = Operacia.SLOGENIE;
            nc.clear();
        }
    }

    public void vychest(){
        if (oper != null) {
            vychislit();
        }
        if (!nc.getError()) {
            A = nc.getValue();
            oper = Operacia.VYCHYTANYE;
            nc.clear();
        }
    }
    public void umnojyt(){
        if (oper != null) {
            vychislit();
        }
        if (!nc.getError()) {
            A = nc.getValue();
            oper = Operacia.UMNOGENYE;
            nc.clear();
        }
    }

    public void delit(){
        if (oper != null) {
            vychislit();
        }
        if (!nc.getError()) {
            A = nc.getValue();
            oper = Operacia.DELENIE;
            nc.clear();
        }
    }




    public void vychislit(){
        B = nc.getValue();
        nc.clear();
        if (oper == Operacia.SLOGENIE){
            oper = null;
            Double R = A + B;
            nc.setResult(R);
        }
        if (oper == Operacia.VYCHYTANYE){
            oper = null;
            Double R = A - B;
            nc.setResult(R);
        }
        if (oper == Operacia.UMNOGENYE){
            oper = null;
            Double R = A * B;
            nc.setResult(R);
        }

        if (oper == Operacia.DELENIE){
            oper = null;
            try {
                Double R = A / B;
                nc.setResult(R);
            }catch (Exception e){
                nc.setError();
            }

        }
    }
}
