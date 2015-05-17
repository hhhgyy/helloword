package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.ab.activity.AbActivity;

public class AnotherC extends AbActivity {
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setAbContentView(R.layout.activity_c);
			Button textView = (Button)findViewById(R.id.button1);
			
//			textView=(TextView)findViewById(R.id.txt);
			textView.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
//					Intent intent = new Intent(AnotherC.this,MainActivity.class);
					finish();
//					startActivity(intent);
//					overridePendingTransition( R.anim.translate2,R.anim.translate);
					
					
				}
			});
			
		}
		
}
