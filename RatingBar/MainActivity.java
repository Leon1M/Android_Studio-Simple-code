package com.mycompany.Rating;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.media.*;
import android.widget.RatingBar.*;
import android.view.*;

public class MainActivity extends Activity 
{
	TextView tv;
	TextView tv2;
	Button button;
RatingBar RAm;
RatingBar rat;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
	
		RAm=findViewById(R.id.rating);
		rat=findViewById(R.id.rb2);
		tv=findViewById(R.id.tv1);
		tv2=findViewById(R.id.tv2);
		button=findViewById(R.id.button);
		
		RAm.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {

				public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

					tv.setText("Current Rating  : "+String.valueOf(rating));

				}
			});
			
			
		rat.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {

				public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
					
					button.setOnClickListener(new OnClickListener() {

							@Override
							public void onClick(View v) {

								tv2.setText("Current Rating  : "+String.valueOf(rat.getRating()));
								
								
								Toast.makeText(MainActivity.this, String.valueOf(rat.getRating()), Toast.LENGTH_LONG).show();
							}

						});

					
				}
			});
        

        
			
}}
