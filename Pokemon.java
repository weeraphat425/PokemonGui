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
abstract class Pokemon{
	public final double maxHealth;
	protected double health,weight;
	protected String name;
	protected PokemonSkill attackSkill;
	protected PokemonSkill untimatedSkill;
        protected int level;
        protected float experience;

	public Pokemon(String name, double maxHealth,double weight){
		this.name      = name;
		this.health    = maxHealth;
		this.maxHealth = maxHealth;
                this.weight    = weight;
                this.level = 1;
                this.experience = (float) 0.0;
	}
        
        public double getWeight(){
                return this.weight;
        }
	public double getHealth(){
		return this.health;
	}
        public int getLevel(){
                return this.level;
        }
	public String getName(){
		return this.name;
	}
        public float getExperience(){
                return this.experience;
        }
	
	public void eat(Berry berry){
		this.health += berry.getRestoreValue();
		if(this.health > this.maxHealth)
			this.health = this.maxHealth;
                        this.weight ++;
                if(this.health <= 0)
                        this.health = 0;
	}

	public void attack(Pokemon rival){
		rival.injure(this.attackSkill);
	}

	public void untimate(Pokemon rival){
		rival.injure(this.untimatedSkill);
	}

	public void injure(PokemonSkill skill){
		this.reducedHealth(skill.getDamage());
	}

	public void reducedHealth(double value){
		this.health -= value;
		if(this.health <= 0)
			this.health = 0;
	}
        
        public void reducedWeight(double value){
		this.weight -= value;
		if(this.weight < 30)
			this.weight = 40;
	}

	abstract public void move();

        abstract public void level();


}
