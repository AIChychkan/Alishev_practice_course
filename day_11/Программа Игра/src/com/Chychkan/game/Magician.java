package com.Chychkan.game;

import com.Chychkan.game.Interfaces.MagicAttack;

/**
 * Created by A.I.Chychkan on 25/10/2021
 */
public class Magician extends Hero implements MagicAttack {

	int magicAtt = 20;

	public Magician() {
		physAtt = 5;
		physDef = 0;
		magicDef = 0.8;
	}

	@Override
	public void magicalAttack(Hero hero) {
		double amountAttack = magicAtt * (1 - hero.magicDef);
		if(hero.health - amountAttack < MIN_HEALTH){
			hero.health = MIN_HEALTH;
		}
		else hero.health -= amountAttack;
	}

	@Override
	public String toString() {
		return "Magician{" +
				"health=" + health +
				'}';
	}
}

