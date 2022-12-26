package com.mycompany.chboxIntend;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.content.*;
import android.view.*;

public class MainActivity extends Activity 
{
	CheckBox ch;
	Button bt;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		ch = findViewById(R.id.checkbox1);
		bt=findViewById(R.id.button);
		
		bt.setOnClickListener(new View.OnClickListener(){
				@Override 
				public void onClick(View v) {
				
					if(ch.isChecked()){ 
						
						// Do something 
						Intent in = new Intent(MainActivity.this,sen.class);
						startActivity(in);
						Toast.makeText(getApplicationContext(),"Accepted", Toast.LENGTH_SHORT).show();
					} 
					else{
						Toast.makeText(getApplicationContext(),"Try",Toast.LENGTH_SHORT);
						
						
					}
					

					

						// change color_secondary to make the check box red. 

					
					
					
					
					}});
					
	
		
		
		
		
    }
}
