package com.He.W.onebone.Circuit.Cu.graphic;

import java.io.File;
import java.util.HashMap;

import com.He.W.onebone.Circuit.Cu.activity.MainActivity;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
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
	
	public static Drawable getSkinDrawable(EnumDrawables e){
		Resources r = MainActivity.getMainActivityContext().getResources();
		if(exists.get(e)){
			return new BitmapDrawable(r, BitmapFactory.decodeFile(skinPath + e.name() + ".png"));
		}else{
			return r.getDrawable(e.getDrawableResid());
		}
		
			
	}
	
	public static Bitmap getSkinBitmap(EnumDrawables e){
		if(exists.get(e)){
			return BitmapFactory.decodeFile(skinPath + e.name() + ".png");
		}
		Resource r = MainActivity.getMainActivityContext().getResources();
	}
	
	public static StateListDrawable getSelectorSet(EnumSelectorSet ess){
		StateListDrawable selectorSet = new StateListDrawable();
		switch(ess){
			case config: selectorSet.addState(new int[] {android.R.attr.state_enabled}, getSkinDrawable(EnumDrawables.config));
						 selectorSet.addState(new int[] {android.R.attr.state_pressed}, getSkinDrawable(EnumDrawables.config_pressed));
						 selectorSet.addState(new int[] {android.R.attr.state_focused}, getSkinDrawable(EnumDrawables.config_focused));
			case geer_button: selectorSet.addState(new int[] {android.R.attr.state_enabled}, getSkinDrawable(EnumDrawables.geerbutton));
							  selectorSet.addState(new int[] {android.R.attr.state_pressed}, getSkinDrawable(EnumDrawables.geerbutton_pressed));
							  selectorSet.addState(new int[] {android.R.attr.state_focused}, getSkinDrawable(EnumDrawables.geerbutton_focused));
		}
		return selectorSet;
	}
}
