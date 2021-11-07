package com.Chychkan.game;

import com.Chychkan.game.Interfaces.Healer;

/**
 * Created by A.I.Chychkan on 25/10/2021
 */
public class Paladin extends Hero implements Healer {

	static final int HEAL_HIMSELF_AMOUNT = 25, HEAL_TEAMMATE_AMOUNT = 10;

	public Paladin() {
		magicDef = 0.2;
		physDef = 0.5;
		physAtt = 15;
	}

	@Override
	public void healHimself() {
		if (health + HEAL_HIMSELF_AMOUNT >= MAX_HEALTH){
			health = MAX_HEALTH;
		}
		else health += HEAL_HIMSELF_AMOUNT;
	}

	@Override
	public void healTeammate(Hero hero) {
		if (hero.health + HEAL_TEAMMATE_AMOUNT>= MAX_HEALTH){
			hero.health = MAX_HEALTH;
		}
		else hero.health += HEAL_TEAMMATE_AMOUNT;
	}

	@Override
	public String toString() {
		return "Paladin: " + "health = " + health;
	}
}
