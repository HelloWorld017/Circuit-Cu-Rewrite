package com.He.W.onebone.Circuit.Cu.drawable;

import java.io.File;
import java.util.HashMap;

import com.He.W.onebone.Circuit.Cu.MainActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;

public class Drawables {
	
	public static HashMap<EnumDrawables, Boolean> exists = new HashMap<EnumDrawables, Boolean>();
	public static String skinPath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/CircuitCu/Skin/"; 
	
	public static void initDrawables(){
		EnumDrawables[] draws = EnumDrawables.values();
		for(int a = 0; a < draws.length; a++){
			File f = new File(skinPath + draws[a] + ".png");
			exists.put(draws[a], f.exists());
		}
	}
	public static Bitmap getSkinDrawables(EnumDrawables e){
		if(exists.get(e)){
			return BitmapFactory.decodeFile(skinPath + e.name() + ".png");
		}else{
			return BitmapFactory.decodeResource(MainActivity.getMainActivityContext().getResources(), e.getDrawableResid());
		}
		
			
	}
}
