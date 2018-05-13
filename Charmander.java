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
                this.attackSkillName = "Scratch";
                this.attackSkillDamage = 6;
                this.ultimateSkillName = "Ember";
                this.ultimateSkillDamage = 10;
	}

	public void move(){
		this.run();
	}
        public void level(){
            if(this.level >= 99){
                this.level = 99;
                this.experience = 100;
                if(this.name == "Charizard"){
                    this.godMode = "YES";
                }
            }
            else{
                float random = (float) (0 + Math.random() * 1);
                this.experience += 100*random;
                this.health -= random;
                if(this.experience >= 100){
                    this.level ++;
                    this.experience = (float) 0.0;
                    }
                }
        }
	public void run(){
		this.reducedWeight(1.5);
	}

	public void walk(){
		this.reducedWeight(1);
	}
}
