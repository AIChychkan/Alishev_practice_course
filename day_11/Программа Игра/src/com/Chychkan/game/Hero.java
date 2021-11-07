package com.Chychkan.game;

import com.Chychkan.game.Interfaces.PhysAttack;

/**
 * Created by A.I.Chychkan on 25/10/2021
 */
public abstract class Hero implements PhysAttack {

	int health;
	static final int MIN_HEALTH = 0, MAX_HEALTH = 100;
	double physDef, magicDef, physAtt;

	public Hero(){
		health = 100;
	}

	@Override
	public void physicalAttack(Hero hero) {
		double amountAttack = physAtt * (1 - hero.physDef);//с учётом физ. защиты
		if(hero.health - amountAttack < MIN_HEALTH){
			hero.health = MIN_HEALTH;
		}
		else hero.health -= amountAttack;
	}
}
