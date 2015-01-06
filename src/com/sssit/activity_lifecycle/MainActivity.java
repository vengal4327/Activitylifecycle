package com.sssit.activity_lifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
	    Thread t =  new Thread() {
	    	public void run(){
	    	 try {
				sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	 finally {
	    		 Intent p = new Intent(getApplicationContext(), Splash.class);
	    		 startActivity(p);
	    	 }
	    	 }
	    };
	    t.start();
	}
	
@Override
protected void onStart() {
	// TODO Auto-generated method stub
	super.onStart();
	Log.i("onStart method", "In onStart method");
}
@Override
protected void onResume() {
	// TODO Auto-generated method stub
	super.onResume();
	Log.i("onResume method", "In onResume method");
}	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i("onPause method", "In onPause method");
		finish();
	}
	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.i("onRestart method", "In onRestart method");
	}
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i("onStop method", "In onStop method");
	}
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i("onDestroy method", "In onDestroy method");
	}
}
