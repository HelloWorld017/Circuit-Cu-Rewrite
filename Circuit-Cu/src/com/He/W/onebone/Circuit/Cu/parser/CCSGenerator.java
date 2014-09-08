package com.He.W.onebone.Circuit.Cu.parser;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import com.He.W.onebone.Circuit.Cu.settings.EnumSettings;

import android.os.Environment;

public class CCSGenerator {
	private static String settingPath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/CircuitCu/Settings.ccs";
	private static String ccfolderPath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/CircuitCu/";
	
	public static void testCCFolder(){
		File ccf = new File(ccfolderPath);
		if(!ccf.exists()){
			ccf.mkdir();
			genSettings();
		}
	}
	
	public static void genSettings(){
		try {
			File f = new File(settingPath);

			if(!f.exists()){
				f.createNewFile();
			}
			FileOutputStream fos = new FileOutputStream(f);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("Circuit Cu System File v1");
			EnumSettings[] Settings = EnumSettings.values();
			for(int a = 0; a < Settings.length; a++){
				bw.newLine();
				bw.append(Settings[a].getName() + "," + Settings[a].getOriginalValue());
			}
			bw.close();
			osw.close();
			fos.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
