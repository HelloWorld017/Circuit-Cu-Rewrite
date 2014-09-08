package com.He.W.onebone.Circuit.Cu.settings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

import com.He.W.onebone.Circuit.Cu.MainActivity;
import com.He.W.onebone.Circuit.Cu.parser.CCSGenerator;
import com.He.W.onebone.Circuit.Cu.parser.CCSParser;

import android.graphics.Typeface;
import android.os.Environment;
import android.widget.Toast;

public class Settings {
	
	private static Typeface tf;
	private static HashMap<EnumSettings, Integer> flags = new HashMap<EnumSettings, Integer>();
	private static boolean isSettingChanged = false;
	private static String settingPath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/CircuitCu/Settings.ccs";
	
	public static void initSettings(){
		
	}
	
	public static void regenSettings(File f){
		File renameTarget = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/CircuitCu/Settings.ccs.bak");
		if(renameTarget.exists()){
			renameTarget.delete();
		}
		f.renameTo(renameTarget);
		Toast.makeText(MainActivity.getMainActivityContext(), "Your setting file is backed up.", Toast.LENGTH_LONG).show();
		CCSGenerator.genSettings();
	}
	
	public static boolean readAllSettings(){
	try{
		File f = new File(settingPath);
		if(!f.exists()){
			
		}
		
		FileInputStream fis = new FileInputStream(f);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		String dataType = br.readLine();
		if(!dataType.startsWith("Circuit Cu System File v")){
			Toast.makeText(MainActivity.getMainActivityContext(), "Error on Circuit Cu Setting File", Toast.LENGTH_LONG).show();;
			regenSettings(f);
			System.exit(0);
		}else{
			int version = Integer.parseInt(dataType.replace("Circuit Cu System File v", ""));
			if(!CCSParser.canParse(version)){
				Toast.makeText(MainActivity.getMainActivityContext(), "Setting file is too old to read.", Toast.LENGTH_LONG).show();
				regenSettings(f);
				System.exit(0);
			}
			
			CCSParser.parseCCS(br);
			br.close();
		}
		
	}catch(Exception e){
		
	}
	
		return isSettingChanged;
		
	}
}
