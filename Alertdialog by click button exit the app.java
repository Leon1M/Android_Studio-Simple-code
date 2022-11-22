package com.mycompany.myapp;

import android.app.*;

import android.os.*;
import android.app.DialogFragment;
import android.widget.*;
import android.view.*;
import android.content.*;
import android.view.View.*;


public class MainActivity extends Activity{

	Button BT;
	AlertDialog bb;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		onBackPressed();

		}

	public void onBackPressed() {

	BT=findViewById(R.id.bt);

	BT.setOnClickListener(new View.OnClickListener() {
	public void onClick(View view) {
	AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);  
	builder.setTitle(R.string.app_name);  
	builder.setMessage("Do you want to exit?")  
	.setCancelable(true)  

	.setPositiveButton("Yes", new DialogInterface.OnClickListener() {  
	public void onClick(DialogInterface dialog, int id) {  
			finish();  
			}}) 

	.setNegativeButton("No", new DialogInterface.OnClickListener() {  
	public void onClick(DialogInterface dialog, int id) {  
	dialog.cancel();  
			} });  

			builder.show();  

 }});

}}
