package com.mazaleks.Calculator;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;

public class Calculator extends Activity {
    /**
     * Called when the activity is first created.
     */

    private EditText editExp;

    public static void disableSoftKeyboard(final EditText v) {
        if (Build.VERSION.SDK_INT >= 11) {
            v.setRawInputType(InputType.TYPE_CLASS_TEXT);
            v.setTextIsSelectable(true);
        } else {
            v.setRawInputType(InputType.TYPE_NULL);
            v.setFocusable(true);
        }
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        editExp = (EditText)findViewById(R.id.editExpression);
        disableSoftKeyboard(editExp);
    }

    // additional functions
    public void insert(CharSequence exp){
        int pos = editExp.getSelectionEnd();
        editExp.getText().insert(pos, exp);
        editExp.setSelection(pos + exp.length());
    }
    public void insertFunc(CharSequence exp){
        int pos = editExp.getSelectionEnd();
        editExp.getText().insert(pos, exp);
        editExp.setSelection(pos + exp.length() - 1);
    }
    public void clear(){
        editExp.setText("");
    }

    public void onClickLBracket(View view) {
        insert("(");
    }

    public void onClickClear(View view) {
        clear();
    }

    public void onClickRBracket(View view) {
        insert(")");
    }

    public void onClickDivide(View view) {
        insert("/");
    }

    public void onClickDelete(View view) {

    }

    public void onClickN7(View view) {
        insert("7");
    }

    public void onClickN8(View view) {
        insert("8");
    }

    public void onClickN9(View view) {
        insert("9");
    }

    public void onClickMultiple(View view) {
        insert("*");
    }

    public void onClickSin(View view) {
        insertFunc("SIN()");
    }

    public void onClickN4(View view) {
        insert("4");
    }

    public void onClickN5(View view) {
        insert("5");
    }

    public void onClickN6(View view) {
        insert("6");
    }

    public void onClickMinus(View view) {
        insert("-");
    }

    public void onClickCos(View view) {
        insertFunc("COS()");
    }

    public void onClickN1(View view) {
        insert("1");
    }

    public void onClickN2(View view) {
        insert("2");
    }

    public void onClickN3(View view) {
        insert("3");
    }

    public void onClickPlus(View view) {
        insert("+");
    }

    public void onClickTg(View view) {
        insertFunc("TAN()");
    }

    public void onClickN0(View view) {
        insert("0");
    }

    public void onClickPoint(View view) {
        insert(".");
    }

    public void onClickSqrt(View view) {
        insertFunc("SQRT()");
    }

    public void onClickEqual(View view) {
    }

    public void onClickCtg(View view) {
    }
}
