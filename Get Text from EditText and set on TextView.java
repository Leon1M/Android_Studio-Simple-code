package com.mycompany.Button;


import android.app.*;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View;

public class MainActivity extends Activity {
	
	Button bt; 
	TextView tv;
	EditText et;
	
@Override
protected void onCreate(Bundle savedInstanceState){
		
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
	et = (EditText) findViewById(R.id.et);
	tv = (TextView) findViewById(R.id.tv);
	bt = (Button) findViewById(R.id.bt);


bt.setOnClickListener(new View.OnClickListener(){
	@Override 
	public void onClick(View v) {
	String txt = et.getText().toString();
	tv.setText(txt);


	}}); 
			
	}
}
