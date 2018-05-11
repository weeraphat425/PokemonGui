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
public class Charmander extends Pokemon implements Runnable {
    private static final int maxGroupHealth = 200;
	public Charmander(){
		super("Charmander",
		       100,80.);
		this.attackSkill = PokemonSkill.getPokemonSkill("Crash");
		this.untimatedSkill = PokemonSkill.getPokemonSkill("Fired");
	}

	public void move(){
		this.run();
	}
        public void level(){
                float random = (float) (0 + Math.random() * 1);
                this.level += random;
                this.health -= random;
        }
	public void run(){
		this.reducedWeight(1.5);
	}

	public void walk(){
		this.reducedWeight(1);
	}
}
