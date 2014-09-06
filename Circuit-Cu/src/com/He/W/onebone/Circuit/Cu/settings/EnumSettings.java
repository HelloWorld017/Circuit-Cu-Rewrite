package com.He.W.onebone.Circuit.Cu.settings;

import com.He.W.onebone.Circuit.Cu.MainActivity;
import com.He.W.onebone.Circuit.Cu.R;

public enum EnumSettings {
	
	fonttype(EnumSettingParents.LooknFeel, R.string.setting_fonttype, 0, true, true, R.string.setting_fonttype_tip, R.array.fonttype),
	playBGM(EnumSettingParents.Sound, R.string.setting_play_bgm, 1, true, true, R.string.setting_play_bgm_tip, R.array.default_true_false);
	
	
	private EnumSettingParents parent;
	private int name;
	private int id;
	private boolean needsRestart;
	private boolean visibility;
	private int tip;
	private int values;
	
	private EnumSettings(EnumSettingParents parent, int name_resid, int id,  boolean needsRestart, boolean visibility, int tip_resid, int values_resid){
		this.parent = parent;
		this.name = name_resid;
		this.id = id;
		this.needsRestart = needsRestart;
		this.visibility = visibility;
		this.tip = tip_resid;
		this.values = values_resid;
	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return MainActivity.getStringbyResid(name);
	}
	
	public String getTip(){
		return MainActivity.getStringbyResid(tip);
	}
	
	public String[] getValues(){
		return MainActivity.getStringArraybyResid(values);
	}
	
	public boolean needsRestart(){
		return needsRestart;
	}
	
	public boolean isVisible(){
		return visibility;
	}
	
	public EnumSettingParents getParent(){
		return parent;
	}
}
