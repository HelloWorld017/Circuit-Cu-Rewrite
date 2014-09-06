package com.He.W.onebone.Circuit.Cu.settings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

import android.graphics.Typeface;
import android.os.Environment;

public class Settings {
	
	private static Typeface tf;
	private static HashMap<EnumSettings, Integer> flags = new HashMap<EnumSettings, Integer>();
	private static boolean isSettingChanged = false;
	private static String settingPath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/CircuitCu/Settings.ccs";
	
	public static void initSettings(){
		
	}
	
	public static boolean readAllSettings(){
	try{
		File f = new File(settingPath);
		if(!f.exists()){
			
		}
		
		FileInputStream fis = new FileInputStream(f);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
	}catch(Exception e){
		
	}
	
		return isSettingChanged;
		
	}
}
