package com.example.calculator;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;

import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15;
	TextView tv;
	private String opt="+";
	private double n1=0,n2=0;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=(Button)findViewById(R.id.button1);
        bt2=(Button)findViewById(R.id.button2);
        bt3=(Button)findViewById(R.id.button3);
        bt4=(Button)findViewById(R.id.button4);
        bt5=(Button)findViewById(R.id.button5);
        bt6=(Button)findViewById(R.id.button6);
        bt7=(Button)findViewById(R.id.button7);
        bt8=(Button)findViewById(R.id.button8);
        bt9=(Button)findViewById(R.id.button9);
        bt10=(Button)findViewById(R.id.button10);
        bt11=(Button)findViewById(R.id.button11);
        bt12=(Button)findViewById(R.id.button12);
        bt13=(Button)findViewById(R.id.button13);
        bt14=(Button)findViewById(R.id.button14);
        bt15=(Button)findViewById(R.id.button15);
        tv=(TextView)findViewById(R.id.textView1);
        BtClickListener b1=new BtClickListener();
        bt1.setOnClickListener(b1);
        bt2.setOnClickListener(b1);
        bt3.setOnClickListener(b1);
        bt4.setOnClickListener(b1);
        bt5.setOnClickListener(b1);
        bt6.setOnClickListener(b1);
        bt7.setOnClickListener(b1);
        bt8.setOnClickListener(b1);
        bt9.setOnClickListener(b1);
        bt10.setOnClickListener(b1);
        bt11.setOnClickListener(b1);
        bt12.setOnClickListener(b1);
        bt13.setOnClickListener(b1);
        bt14.setOnClickListener(b1);
        bt15.setOnClickListener(b1);
    }
    
    class BtClickListener implements OnClickListener{
    	public void onClick(View v){
    		TextView tv=(TextView)findViewById(R.id.textView1);
    		String s = tv.getText().toString();
    		Button btn = (Button) v;
    		switch (btn.getId()) {
			
			case R.id.button1:
			{
				tv.setText(tv.getText().toString() + 1);
				String str = tv.getText().toString();
				tv.setText(str);
				break;
			}
			case R.id.button2:
			{
				tv.setText(tv.getText().toString() + 2);
				String str = tv.getText().toString();
				tv.setText(str);
				break;
			}
			case R.id.button3:
			{
				tv.setText(tv.getText().toString() + 3);
				String str = tv.getText().toString();
				tv.setText(str);
				break;
			}
			case R.id.button4:
			{
				tv.setText(tv.getText().toString() + 4);
				String str = tv.getText().toString();
				tv.setText(str);
				break;
			}
			case R.id.button5:
			{
				tv.setText(tv.getText().toString() + 5);
				String str = tv.getText().toString();
				tv.setText(str);
				break;
			}
			case R.id.button6:
			{
				tv.setText(tv.getText().toString() + 6);
				String str = tv.getText().toString();
				tv.setText(str);
				break;
			}
			case R.id.button7:
			{
				tv.setText(tv.getText().toString() + 7);
				String str = tv.getText().toString();
				tv.setText(str);
				break;
			}
			case R.id.button8:
			{
				tv.setText(tv.getText().toString() + 8);
				String str = tv.getText().toString();
				tv.setText(str);
				break;
			}
			case R.id.button9:
			{
				tv.setText(tv.getText().toString() + 9);
				String str = tv.getText().toString();
				tv.setText(str);
				break;
			}
			case R.id.button10:
			{
				tv.setText(n1 + opt + 0);
				tv.setText(tv.getText().toString() + 0);
				String str = tv.getText().toString();
				tv.setText(str);
				break;
			}
			case R.id.button11:
			{
				String str = tv.getText().toString();
				n1 = Double.parseDouble(str);
				opt = "*";
				tv.setText("");
				tv.setText(n1 + opt);
				break;
			}
			case R.id.button12:
			{
				String str = tv.getText().toString();
				n1 = Double.parseDouble(str);
				opt = "/";
				tv.setText("");
				tv.setText(n1 + opt);
				break;
			}
			case R.id.button15:
			{
				if (opt == "+") {
					String str = tv.getText().toString();
					n2 = Double.parseDouble(str);
					tv.setText(n1 + opt + n2 + "=");
					tv.setText((n1 + n2) + "");
				} else if (opt == "-") {
					String str = tv.getText().toString();
					n2 = Double.parseDouble(str);
					tv.setText(n1 + opt + n2 + "=");
					tv.setText((n1 - n2) + "");
				} else if (opt == "*") {
					String str = tv.getText().toString();
					n2 = Double.parseDouble(str);
					tv.setText(n1 + opt + n2 + "=");
					tv.setText((n1 * n2) + "");
				} else if (opt == "/") {
					String str = tv.getText().toString();
					n2 = Double.parseDouble(str);
					if (n2 == 0) {
						tv.setText("");
						tv.setText("除数不能为0");
						break;
					} else {
						tv.setText(n1 + opt + n2 + "=");
						tv.setText((n1 / n2) + "");
					}
				}

				break;
			}
			case R.id.button14:
			{
				String str = tv.getText().toString();
				n1 = Double.parseDouble(str);
				opt = "-";
				tv.setText("");
				tv.setText(n1 + opt);
				break;
			}
			case R.id.button13:
			{
				String str = tv.getText().toString();
				n1 = Double.parseDouble(str);
				opt = "+";
				tv.setText(n1 + opt);
				tv.setText("");
				break;
			}
    	}
    	}
    }
}
