package com.mazaleks.Calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.math.BigDecimal;

public class Calculator extends Activity {
    /**
     * Called when the activity is first created.
     */

    private EditText editExp;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        editExp = (EditText)findViewById(R.id.editExpression);
    }

    public void onClickExpr(View view) {

    }
}
