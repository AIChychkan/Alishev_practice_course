package com.Chychkan.game;

import com.Chychkan.game.Interfaces.Healer;
import com.Chychkan.game.Interfaces.MagicAttack;

/**
 * Created by A.I.Chychkan on 25/10/2021
 */
public class Shaman extends Hero implements MagicAttack, Healer {

	int magicAtt = 15;
	static final int HEAL_HIMSELF_AMOUNT = 50, HEAL_TEAMMATE_AMOUNT = 30;

	public Shaman() {
		physAtt = 10;
		physDef = 0.2;
		magicDef = 0.2;
	}

	@Override
	public void magicalAttack(Hero hero) {
		double amountAttack = magicAtt * (1 - hero.magicDef);
		if(hero.health - amountAttack< MIN_HEALTH){
			hero.health = MIN_HEALTH;
		}
		else hero.health -= amountAttack;
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
		return "Shaman{" +
				"health=" + health +
				'}';
	}
}
