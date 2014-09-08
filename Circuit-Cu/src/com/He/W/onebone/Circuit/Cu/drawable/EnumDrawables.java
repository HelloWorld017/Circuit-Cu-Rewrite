package com.He.W.onebone.Circuit.Cu.drawable;

import com.He.W.onebone.Circuit.Cu.R;

public enum EnumDrawables {
	background(R.drawable.background),
	setting_background(R.drawable.setting_background),
	circuit_board(R.drawable.circuit_board),
	config_focused(R.drawable.config_focused),
	config_pressed(R.drawable.config_pressed),
	config(R.drawable.config),
	electricity_blocker(R.drawable.electricity_blocker),
	geerbutton_focused(R.drawable.geerbutton_focused),
	geerbutton_pressed(R.drawable.geerbutton_pressed),
	geerbutton(R.drawable.geerbutton),
	glowing_light_bulb(R.drawable.glowing_light_bulb),
	gold_wire_curve_focused(R.drawable.gold_wire_curve_focused),
	gold_wire_curve(R.drawable.gold_wire_curve),
	gold_wire_focused(R.drawable.gold_wire_focused),
	gold_wire(R.drawable.gold_wire),
	light_bulb_broken(R.drawable.light_bulb_broken),
	light_bulb(R.drawable.light_bulb),
	resistor_focused(R.drawable.resistor_focused),
	resistor_released(R.drawable.resistor_released),
	transistor(R.drawable.transistor),
	wire_curve_focused(R.drawable.wire_curve_focused),
	wire_curve_released(R.drawable.wire_curve_released),
	wire_focused(R.drawable.wire_focused),
	wire_released(R.drawable.wire_released),
	wire(R.drawable.wire);
	
	private int value;
	
	private EnumDrawables(int i){
		value = i;
	}
	
	public int getDrawableResid(){
		return value;
	}
}
