package com.sssit.activity_lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
	    
	}
@Override
protected void onStart() {
	// TODO Auto-generated method stub
	super.onStart();
	Log.i("onStart method", "Login--onStart method");
}
@Override
protected void onResume() {
	// TODO Auto-generated method stub
	super.onResume();
	Log.i("onResume method", "Login--onResume method");
}	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i("onPause method", "In Login--onPause method");
	}
	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.i("onRestart method", "Login--onRestart method");
	}
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i("onStop method", "Login--onStop method");
	}
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i("onDestroy method", "Login--onDestroy method");
	}
}
