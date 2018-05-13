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
                this.attackSkillName = "Scratch";
                this.attackSkillDamage = 6;
                this.ultimateSkillName = "Aqua Jet";
                this.ultimateSkillDamage = 12;
	}

       @Override
	public void move(){
		this.swim();
	}
        public void level(){
            if(this.level >= 99){
                this.level = 99;
                this.experience = 100;
                if(this.name == "Feraligatr"){
                    this.godMode = "YES";
                }
            }
            else{
                float random = (float) (0 + Math.random() * 1);
                this.experience += 100*random;
                this.health -= random;
                if(this.experience >= 100){
                    this.level += 10;
                    this.experience = (float) 0.0;
                    }
                }
        }
        @Override
	public void swim(){
		this.reducedWeight(1.5);
	}
}