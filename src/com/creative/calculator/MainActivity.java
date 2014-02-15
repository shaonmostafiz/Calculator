package com.creative.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText etOp1, etOp2;
	TextView txtResult;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		etOp1 = (EditText) findViewById(R.id.etOperad1);
		etOp2 = (EditText) findViewById(R.id.etOperad2);
		txtResult = (TextView) findViewById(R.id.tvOutput);

	}

	public void add(View v) {
		String op1Str = etOp1.getText().toString();
		String op2Str = etOp2.getText().toString();
		if (op1Str.length() > 0 && op2Str.length() > 0) {
			double operand1 = Double.parseDouble(op1Str);
			double operand2 = Double.parseDouble(op2Str);
			double result = operand1 + operand2;
			txtResult.setText(op1Str + " + " + op2Str + " = " + result);
		} else {
			txtResult.setText("Please Input both the operands");
		}
	}

	public void subtract(View v) {
		String op1Str = etOp1.getText().toString();
		String op2Str = etOp2.getText().toString();
		if (op1Str.length() > 0 && op2Str.length() > 0) {
			double operand1 = Double.parseDouble(op1Str);
			double operand2 = Double.parseDouble(op2Str);
			double result = operand1 - operand2;
			txtResult.setText(op1Str + " - " + op2Str + " = " + result);
		} else {
			txtResult.setText("Please Input both the operands");
		}
	}

	public void multiply(View v) {
		String op1Str = etOp1.getText().toString();
		String op2Str = etOp2.getText().toString();
		if (op1Str.length() > 0 && op2Str.length() > 0) {
			double operand1 = Double.parseDouble(op1Str);
			double operand2 = Double.parseDouble(op2Str);
			double result = operand1 * operand2;
			txtResult.setText(op1Str + " * " + op2Str + " = " + result);
		} else {
			txtResult.setText("Please Input both the operands");
		}
	}

	public void devide(View v) {
		String op1Str = etOp1.getText().toString();
		String op2Str = etOp2.getText().toString();
		if (op1Str.length() > 0 && op2Str.length() > 0) {
			double operand1 = Double.parseDouble(op1Str);
			double operand2 = Double.parseDouble(op2Str);
			double result = operand1 / operand2;
			txtResult.setText(op1Str + " / " + op2Str + " = " + result);
		} else {
			txtResult.setText("Please Input both the operands");
		}
	}

}
