package com.He.W.onebone.Circuit.Cu.activity;

import com.He.W.onebone.Circuit.Cu.R;
import com.He.W.onebone.Circuit.Cu.R.layout;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

public class MainActivity extends Activity {
	public static Context ctxt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ctxt = this;
	}
	
	public static String getStringbyResid(int resid){
		return ctxt.getString(resid);
	}
	
	public static String[] getStringArraybyResid(int resid){
		return ctxt.getResources().getStringArray(resid);
	}
	
	public static Context getMainActivityContext(){
		return ctxt;
	}
	
}
