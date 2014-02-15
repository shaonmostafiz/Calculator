package com.creative.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	EditText etOp1, etOp2;
	TextView txtResult;
	Button btnPlus, btnMinus, btnMultiply, btnDevide;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		etOp1 = (EditText) findViewById(R.id.etOperad1);
		etOp2 = (EditText) findViewById(R.id.etOperad2);
		txtResult = (TextView) findViewById(R.id.tvOutput);
		btnPlus = (Button) findViewById(R.id.btnPlus);
		btnMinus = (Button) findViewById(R.id.btnMinus);
		btnMultiply = (Button) findViewById(R.id.btnMultiplication);
		btnDevide = (Button) findViewById(R.id.btnDivision);
		
		btnPlus.setOnClickListener(l);
	}

//	public void add(View v) {
//		String op1Str = etOp1.getText().toString();
//		String op2Str = etOp2.getText().toString();
//		if (op1Str.length() > 0 && op2Str.length() > 0) {
//			double operand1 = Double.parseDouble(op1Str);
//			double operand2 = Double.parseDouble(op2Str);
//			double result = operand1 + operand2;
//			txtResult.setText(op1Str + " + " + op2Str + " = " + result);
//		} else {
//			txtResult.setText("Please Input both the operands");
//		}
//	}
//
//	public void subtract(View v) {
//		String op1Str = etOp1.getText().toString();
//		String op2Str = etOp2.getText().toString();
//		if (op1Str.length() > 0 && op2Str.length() > 0) {
//			double operand1 = Double.parseDouble(op1Str);
//			double operand2 = Double.parseDouble(op2Str);
//			double result = operand1 - operand2;
//			txtResult.setText(op1Str + " - " + op2Str + " = " + result);
//		} else {
//			txtResult.setText("Please Input both the operands");
//		}
//	}
//
//	public void multiply(View v) {
//		String op1Str = etOp1.getText().toString();
//		String op2Str = etOp2.getText().toString();
//		if (op1Str.length() > 0 && op2Str.length() > 0) {
//			double operand1 = Double.parseDouble(op1Str);
//			double operand2 = Double.parseDouble(op2Str);
//			double result = operand1 * operand2;
//			txtResult.setText(op1Str + " * " + op2Str + " = " + result);
//		} else {
//			txtResult.setText("Please Input both the operands");
//		}
//	}
//
//	public void devide(View v) {
//		String op1Str = etOp1.getText().toString();
//		String op2Str = etOp2.getText().toString();
//		if (op1Str.length() > 0 && op2Str.length() > 0) {
//			double operand1 = Double.parseDouble(op1Str);
//			double operand2 = Double.parseDouble(op2Str);
//			double result = operand1 / operand2;
//			txtResult.setText(op1Str + " / " + op2Str + " = " + result);
//		} else {
//			txtResult.setText("Please Input both the operands");
//		}
//	}

}
