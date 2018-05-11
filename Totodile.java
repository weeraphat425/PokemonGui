/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PokemonGui;

/**
 *
 * @author Fook
 */
public class Totodile extends Pokemon implements Swimmable{
    private static final int maxGroupHealth = 200;
        
	public Totodile(){
		super("Totodile",
                        100,70.00);
		this.attackSkill = PokemonSkill.getPokemonSkill("Tail Whip");
		this.untimatedSkill = PokemonSkill.getPokemonSkill("Water Pulse");
	}

       @Override
	public void move(){
		this.swim();
	}
        public void level(){
                float random = (float) (0 + Math.random() * 1);
                this.level += random;
                this.health -= random;
        }
        @Override
	public void swim(){
		this.reducedWeight(1.5);
	}
}