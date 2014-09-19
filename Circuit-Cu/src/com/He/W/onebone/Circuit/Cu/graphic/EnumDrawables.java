package com.He.W.onebone.Circuit.Cu.graphic;

import com.He.W.onebone.Circuit.Cu.R;

public enum EnumDrawables {
	background(R.drawable.background, "background.jpg"),
	setting_background(R.drawable.setting_background, "setting_background.jpg"),
	circuit_board(R.drawable.circuit_board, "circuit_board.png"),
	config_focused(R.drawable.config_focused),
	config_pressed(R.drawable.config_pressed),
	config(R.drawable.config),
	electricity_blocker(R.drawable.electricity_blocker),
	geerbutton_focused(R.drawable.geerbutton_focused),
	geerbutton_pressed(R.drawable.geerbutton_pressed),
	geerbutton(R.drawable.geerbutton),
	gold_wire_curve_focused(R.drawable.gold_wire_curve_focused),
	gold_wire_curve(R.drawable.gold_wire_curve),
	gold_wire_focused(R.drawable.gold_wire_focused),
	gold_wire(R.drawable.gold_wire),
	light_bulb_broken(R.drawable.light_bulb_broken),
	light_bulb(R.drawable.light_bulb),
	light_bulb_glowing(R.drawable.light_bulb_glowing),
	resistor_focused(R.drawable.resistor_focused),
	resistor_electricity(R.drawable.resistor_electricity),
	transistor(R.drawable.transistor),
	transistor_focused(R.drawable.transistor_focused),
	transistor_electricity(R.drawable.transistor_electricity),
	wire_curve(R.drawable.wire_curve),
	wire_curve_focused(R.drawable.wire_curve_focused),
	wire_curve_electricity(R.drawable.wire_curve_electricity),
	wire(R.drawable.wire),
	wire_focused(R.drawable.wire_focused),
	wire_electricity(R.drawable.wire_electricity);
	
	private int value;
	private	String fPath;
	
	private EnumDrawables(int i, String s){
		value = i;
	}
	
	public int getDrawableResid(){
		return value;
	}
	
}
