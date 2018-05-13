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
	protected double maxHealth;
	protected double health,weight;
	protected String name;
        protected int level;
        protected float experience;
        protected String attackSkillName,ultimateSkillName;
        protected int attackSkillDamage,ultimateSkillDamage;
        protected String godMode;

	public Pokemon(String name, double maxHealth,double weight){
		this.name      = name;
		this.health    = maxHealth;
		this.maxHealth = maxHealth;
                this.weight    = weight;
                this.level = 1;
                this.experience = (float) 0.0;
                this.godMode ="NO";
	}
        public void setWeight(double weight){
                this.weight = weight;
        }
        public String getAttackSkillName(){
                return this.attackSkillName;     
        }
        public int getAttackSkillDamage(){
                return this.attackSkillDamage;     
        }
        public String getUltimateSkillName(){
                return this.ultimateSkillName;
        }
        public int getUltimateSkillDamage(){
                return this.ultimateSkillDamage;     
        }
        public void changeName(String name){
                this.name = name;
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
        public String getGodMode(){
                return this.godMode;
        }
        public void setHealth(double maxHealth){
                this.maxHealth = maxHealth;
                this.health = maxHealth;
        }
	public String getName(){
		return this.name;
	}
        public float getExperience(){
                return this.experience;
        }
	public void changeSkill(String attackSkillName,int attackSkillDamage,String ultimateSkillName,int ultimateSkillDamage){
            this.attackSkillName = attackSkillName;
            this.attackSkillDamage = attackSkillDamage;
            this.ultimateSkillName = ultimateSkillName;
            this.ultimateSkillDamage = ultimateSkillDamage;
        }
	public void eat(Berry berry){
		this.health += berry.getRestoreValue();
		if(this.health > this.maxHealth){
			this.health = this.maxHealth;
                        this.weight ++;
                }
                else if(this.health <= 0)
                        this.health = 0;
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
