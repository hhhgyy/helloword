package com.example.test;

import com.ab.activity.AbActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends  AbActivity{
TextView tx;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tx=(TextView)findViewById(R.id.txt);
		tx.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, AnotherC.class);
				startActivity(intent);
				overridePendingTransition(R.anim.translate, R.anim.translate2);
				
			}
		});
	}
	
}
