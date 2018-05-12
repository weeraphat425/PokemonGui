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
public class PokemonSkill{
	private String name;
	private float damage;

	public PokemonSkill(String name, float damage){
		this.name = name;
		this.damage = damage;
	}

	public String getName(){
		return this.name;
	}

	public float getDamage(){
		return this.damage;
	}

	public static PokemonSkill getPokemonSkill(String name){
		PokemonSkill skill = null;
		switch(name.toLowerCase()){
			case "Ember":
				skill = new PokemonSkill("Ember", 20);
				break;
			case "Flame Burst":
				skill = new PokemonSkill("Flame Burst", 35);
				break;
			case "Tackle":
				skill = new PokemonSkill("Tackle", 10);
				break;
			case "Power Whip":
				skill = new PokemonSkill("Power Whip", 30);
				break;
                        case "Tail Whip":
				skill = new PokemonSkill("Tail Whip", 15);
				break;
                        case "Water Pulse":
				skill = new PokemonSkill("Water Pulse", 35);
				break;
                                                
		}
		return skill;
	}
}