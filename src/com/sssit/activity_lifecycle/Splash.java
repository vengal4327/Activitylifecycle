package com.sssit.activity_lifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Splash extends Activity {
	Button btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn = (Button)findViewById(R.id.button1);
	}
	public void Press(View v)
	{
		Intent i = new Intent(getApplicationContext(), LoginActivity.class);
		startActivity(i);
		
	}
	

	
}
