package com.Chychkan.game;

/**
 * Created by A.I.Chychkan on 25/10/2021
 */
public class Warrior extends Hero{
	public Warrior() {
		physDef = 0.8;
		physAtt = 30;
	}

	@Override
	public String toString() {
		return "Warrior{" +
				"health=" + health +
				'}';
	}
}
