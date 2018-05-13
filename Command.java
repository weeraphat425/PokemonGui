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
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Command extends JFrame{
    
    ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
    JPanel p1,showData;
    JLabel txtSelect,pokemonIcon;
    JTextField jTextField; //
    JButton newButton,eatButton,exerciseButton,battleButton,evoButton,godButton;
    JTextArea printProFile,battleArea;
    Icon dataIcon0,dataIcon1,dataIcon2,dataIcon3,dataIcon4,dataIcon5,dataIcon6,dataIcon7,dataIcon8,dataIconStart,dataIconGod1,dataIconGod2,dataIconGod3;
    JComboBox select;
    int  memberTypeFire, 
         memberTypePlant,
         memberTypeWater;
    //***************************************************************************************
    public static String printPokemons(ArrayList<Pokemon> pokemons,int member){
        String hp = "======== Pokemon List ======== \n"+"Pokemon "+
                pokemons.get(member).getName()+" health: "+pokemons.get(member).getHealth()
                +"/"+pokemons.get(member).maxHealth+"\nPokemonLevel :"+pokemons.get(member).getLevel()+" Exp:"+pokemons.get(member).getExperience()+"/100.00"+"\nCan Change to GOD:"+pokemons.get(member).getGodMode();
        String weight = "\n======== Pokemon Weight ======== \n"+" Weight: "+
                pokemons.get(member).getWeight();
        String skill = "\n======== Pokemon Skill ======== \n"+" Attack Skill Name: "+
                pokemons.get(member).getAttackSkillName()+"\n Attack Skill Damage: "+
                pokemons.get(member).getAttackSkillDamage()+"\n Ultimate Skill Name: "+
                pokemons.get(member).getUltimateSkillName()+"\n Ultimate Skill Damage: "+
                pokemons.get(member).getUltimateSkillDamage();
        return hp+weight+skill;
        
    }
    //***************************************************************************************
    public void eatBerry(int mumber){
            Berry berry = new Berry(0);
            pokemons.get(mumber).eat(berry);
            printProFile.setText(printPokemons(pokemons,mumber));
    }
    //***************************************************************************************
    public Command(){
        super("PokemonGame!!!");
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        
        String pokemonName[] = {
            "Charmander",    
            "Chikorita", 
            "Totodile"     
        };
        //*********************************   
        select = new JComboBox(pokemonName);
        select.setPreferredSize(new Dimension(150,20));
        //********************************* 
        p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        showData = new JPanel();
        showData.setLayout(new FlowLayout());
        //********************************* 
        printProFile  = new JTextArea("",20,30);
        dataIconStart = new ImageIcon(getClass().getResource("while.png"));
        dataIcon0     = new ImageIcon(getClass().getResource("Charmander.png"));
        dataIcon1     = new ImageIcon(getClass().getResource("Chikorita.png"));
        dataIcon2     = new ImageIcon(getClass().getResource("Totodile.png"));
        dataIcon3     = new ImageIcon(getClass().getResource("Charmelon.png"));
        dataIcon4     = new ImageIcon(getClass().getResource("Bayleef.png"));
        dataIcon5     = new ImageIcon(getClass().getResource("Croconaw.png"));
        dataIcon6     = new ImageIcon(getClass().getResource("Charizard.png"));
        dataIcon7     = new ImageIcon(getClass().getResource("Meganium.jpg"));
        dataIcon8     = new ImageIcon(getClass().getResource("Feraligatr.png"));
        dataIconGod1     = new ImageIcon(getClass().getResource("Ho-Oh.png"));
        dataIconGod2     = new ImageIcon(getClass().getResource("Celebi.png"));
        dataIconGod3     = new ImageIcon(getClass().getResource("Lugia.png"));
        pokemonIcon   = new JLabel("");
        pokemonIcon.setIcon(dataIconStart);
         
        txtSelect  = new JLabel("เลือก โปเกม่อนเริ่มต้น : ");
        newButton = new JButton("Add");
        eatButton  = new JButton("Eat");
        battleButton = new JButton("Battle");
        exerciseButton = new JButton("Exercise");
        evoButton = new JButton("Evolution");
        godButton = new JButton("GOD");
        pokemons.add(new Charmander());
        pokemons.add(new Chikorita());
        pokemons.add(new Totodile());
        //********************************* 
                
        //Add
        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (select.getSelectedIndex()) {
                    case 0:               
                        memberTypeFire = 0;
                        if(pokemons.get(memberTypeFire).getName() == "Charmander"){
                            pokemonIcon.setIcon(dataIcon0);
                        }
                        else if(pokemons.get(memberTypeFire).getName() == "Charmelon"){
                            pokemonIcon.setIcon(dataIcon3);
                        }
                        else if(pokemons.get(memberTypeFire).getName() == "Charizard"){
                            pokemonIcon.setIcon(dataIcon6);
                        }
                        printProFile.setText(printPokemons(pokemons,memberTypeFire));
                        System.out.print("Charmander"+select.getSelectedIndex());
                        break;
                    case 1:    
                        memberTypePlant = 1;
                        if(pokemons.get(memberTypePlant).getName() == "Chikorita"){
                            pokemonIcon.setIcon(dataIcon1);
                        }
                        else if(pokemons.get(memberTypePlant).getName() == "Bayleef"){
                            pokemonIcon.setIcon(dataIcon4);
                        }
                        else if(pokemons.get(memberTypePlant).getName() == "Meganium"){
                            pokemonIcon.setIcon(dataIcon7);
                        }
                        printProFile.setText(printPokemons(pokemons,memberTypePlant));
                        System.out.print("Chikorita"+select.getSelectedIndex());
                        break;
                    case 2:    
                        memberTypeWater = 2;
                        if(pokemons.get(memberTypeWater).getName() == "Totodile"){
                            pokemonIcon.setIcon(dataIcon2);
                        }
                        else if(pokemons.get(memberTypeWater).getName() == "Croconaw"){
                            pokemonIcon.setIcon(dataIcon5);
                        }
                        else if(pokemons.get(memberTypeWater).getName() == "Feraligatr"){
                            pokemonIcon.setIcon(dataIcon8);
                        }
                        printProFile.setText(printPokemons(pokemons,memberTypeWater));
                        System.out.print("Totodile"+select.getSelectedIndex());
                        break;
                    default:
                        break;
                }
            }
        });
        //end 
        
        //Eat
        eatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (select.getSelectedIndex()) {
                    case 0:
                        eatBerry(memberTypeFire);
                        if(pokemons.get(memberTypeFire).getName() == "Charmander"){
                            pokemonIcon.setIcon(dataIcon0);
                        }
                        else if(pokemons.get(memberTypeFire).getName() == "Charmelon"){
                            pokemonIcon.setIcon(dataIcon3);
                        }
                        else if(pokemons.get(memberTypeFire).getName() == "Charizard"){
                            pokemonIcon.setIcon(dataIcon6);
                        }
                        System.out.print("Charmander eat"+ select.getSelectedIndex());
                        break;
                    case 1:
                        if(pokemons.get(memberTypePlant).getName() == "Chikorita"){
                            pokemonIcon.setIcon(dataIcon1);
                        }
                        else if(pokemons.get(memberTypePlant).getName() == "Bayleef"){
                            pokemonIcon.setIcon(dataIcon4);
                        }
                        else if(pokemons.get(memberTypePlant).getName() == "Meganium"){
                            pokemonIcon.setIcon(dataIcon7);
                        }
                        eatBerry(memberTypePlant);
                        System.out.print("Chikorita eat"+ select.getSelectedIndex());
                        break;
                    case 2:
                        if(pokemons.get(memberTypeWater).getName() == "Totodile"){
                            pokemonIcon.setIcon(dataIcon2);
                        }
                        else if(pokemons.get(memberTypeWater).getName() == "Croconaw"){
                            pokemonIcon.setIcon(dataIcon5);
                        }
                        else if(pokemons.get(memberTypeWater).getName() == "Feraligatr"){
                            pokemonIcon.setIcon(dataIcon8);
                        }
                        eatBerry(memberTypeWater);
                        System.out.print("Totodile eat"+ select.getSelectedIndex());
                        break;
                    default:
                        break;
                }
            }
        });
        //End
        
        //Exercise
        exerciseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 switch (select.getSelectedIndex()) {
                    case 0:
                        if(pokemons.get(memberTypeFire).getName() == "Charmander"){
                            pokemonIcon.setIcon(dataIcon0);
                        }
                        else if(pokemons.get(memberTypeFire).getName() == "Charmelon"){
                            pokemonIcon.setIcon(dataIcon3);
                        }
                        else if(pokemons.get(memberTypeFire).getName() == "Charizard"){
                            pokemonIcon.setIcon(dataIcon6);
                        }
                        pokemons.get(memberTypeFire).move();
                        printProFile.setText(printPokemons(pokemons,memberTypeFire));
                        System.out.print("Exercise"+select.getSelectedIndex());
                        break;
                    case 1:
                        if(pokemons.get(memberTypePlant).getName() == "Chikorita"){
                            pokemonIcon.setIcon(dataIcon1);
                        }
                        else if(pokemons.get(memberTypePlant).getName() == "Bayleef"){
                            pokemonIcon.setIcon(dataIcon4);
                        }
                        else if(pokemons.get(memberTypePlant).getName() == "Meganium"){
                            pokemonIcon.setIcon(dataIcon7);
                        }
                        pokemons.get(memberTypePlant).move();
                        printProFile.setText(printPokemons(pokemons,memberTypePlant));
                        System.out.print("Exercise"+select.getSelectedIndex());
                        break;
                    case 2:
                        if(pokemons.get(memberTypeWater).getName() == "Totodile"){
                            pokemonIcon.setIcon(dataIcon2);
                        }
                        else if(pokemons.get(memberTypeWater).getName() == "Croconaw"){
                            pokemonIcon.setIcon(dataIcon5);
                        }
                        else if(pokemons.get(memberTypeWater).getName() == "Feraligatr"){
                            pokemonIcon.setIcon(dataIcon8);
                        }
                        pokemons.get(memberTypeWater).move();
                        printProFile.setText(printPokemons(pokemons,memberTypeWater));
                        System.out.print("Exercise "+select.getSelectedIndex());
                        break;
                    default:
                        break;
                }
            }
        });

        //event AttackMonster
       battleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 switch (select.getSelectedIndex()) {
                    case 0:
                        if(pokemons.get(memberTypeFire).getName() == "Charmander"){
                            pokemonIcon.setIcon(dataIcon0);
                        }
                        else if(pokemons.get(memberTypeFire).getName() == "Charmelon"){
                            pokemonIcon.setIcon(dataIcon3);
                        }
                        else if(pokemons.get(memberTypeFire).getName() == "Charizard"){
                            pokemonIcon.setIcon(dataIcon6);
                        }
                        pokemons.get(memberTypeFire).level();
                        printProFile.setText(printPokemons(pokemons,memberTypeFire));
                        System.out.print("Fight Monster"+select.getSelectedIndex());
                        break;
                    case 1:
                        if(pokemons.get(memberTypePlant).getName() == "Chikorita"){
                            pokemonIcon.setIcon(dataIcon1);
                        }
                        else if(pokemons.get(memberTypePlant).getName() == "Bayleef"){
                            pokemonIcon.setIcon(dataIcon4);
                        }
                        else if(pokemons.get(memberTypePlant).getName() == "Meganium"){
                            pokemonIcon.setIcon(dataIcon7);
                        }
                        pokemons.get(memberTypePlant).level();
                        printProFile.setText(printPokemons(pokemons,memberTypePlant));
                        System.out.print("Fight Monster"+select.getSelectedIndex());
                        break;
                    case 2:
                        if(pokemons.get(memberTypeWater).getName() == "Totodile"){
                            pokemonIcon.setIcon(dataIcon2);
                        }
                        else if(pokemons.get(memberTypeWater).getName() == "Croconaw"){
                            pokemonIcon.setIcon(dataIcon5);
                        }
                        else if(pokemons.get(memberTypeWater).getName() == "Feraligatr"){
                            pokemonIcon.setIcon(dataIcon8);
                        }
                        pokemons.get(memberTypeWater).level();
                        printProFile.setText(printPokemons(pokemons,memberTypeWater));
                        System.out.print("Fight Monster"+select.getSelectedIndex());
                        break;
                    default:
                        break;
                }
            }
        });
        evoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 switch (select.getSelectedIndex()) {
                    case 0:
                        if(pokemons.get(memberTypeFire).level >= 50 && pokemons.get(memberTypeFire).getName() == "Charmelon"){
                            pokemonIcon.setIcon(dataIcon6);
                            pokemons.get(memberTypeFire).changeName("Charizard");
                            pokemons.get(memberTypeFire).changeSkill("Fire Spin",14,"Over Heat",70);
                            pokemons.get(memberTypeFire).setHealth(250);
                            pokemons.get(memberTypeFire).setWeight(150);
                            printProFile.setText(printPokemons(pokemons,memberTypeFire));
                            System.out.print("Charmelon Evolution"+select.getSelectedIndex());
                            break;
                        }
                        else if(pokemons.get(memberTypeFire).level >= 30 && pokemons.get(memberTypeFire).getName() == "Charmander"){
                            pokemonIcon.setIcon(dataIcon3);
                            pokemons.get(memberTypeFire).changeName("Charmelon");
                            pokemons.get(memberTypeFire).changeSkill("Fire Fang",10,"Flame Burst",20);
                            pokemons.get(memberTypeFire).setHealth(150);
                            pokemons.get(memberTypeFire).setWeight(100);
                            printProFile.setText(printPokemons(pokemons,memberTypeFire));
                            System.out.print("Charmander Evolution"+select.getSelectedIndex());
                            break;
                        }
                        else{
                            break;
                        }
                    case 1:
                        if(pokemons.get(memberTypePlant).level >= 50 && pokemons.get(memberTypePlant).getName() == "Bayleef"){
                            pokemonIcon.setIcon(dataIcon7);
                            pokemons.get(memberTypePlant).changeName("Meganium");
                            pokemons.get(memberTypePlant).changeSkill("Razor Leaf",12,"Solar Beam",60);
                            pokemons.get(memberTypePlant).setHealth(300);
                            pokemons.get(memberTypePlant).setWeight(300);
                            printProFile.setText(printPokemons(pokemons,memberTypePlant));
                            System.out.print("Bayleef Evolution"+select.getSelectedIndex());
                            break;
                        }
                        else if(pokemons.get(memberTypePlant).level >= 30 && pokemons.get(memberTypePlant).getName() == "Chikorita"){
                            pokemonIcon.setIcon(dataIcon4);
                            pokemons.get(memberTypePlant).changeName("Bayleef");
                            pokemons.get(memberTypePlant).changeSkill("Razor Leaf",12,"Energy Ball",30);
                            pokemons.get(memberTypePlant).setHealth(180);
                            pokemons.get(memberTypePlant).setWeight(150);
                            printProFile.setText(printPokemons(pokemons,memberTypeFire));
                            System.out.print("Chikorita Evolution"+select.getSelectedIndex());
                            break;
                        }
                        else{
                            break;
                        }
                    case 2:
                        if(pokemons.get(memberTypeWater).level >= 50 && pokemons.get(memberTypeWater).getName() == "Croconaw"){
                            pokemonIcon.setIcon(dataIcon8);
                            pokemons.get(memberTypeWater).changeName("Feraligatr");
                            pokemons.get(memberTypeWater).changeSkill("Water Gun",10,"Hydro Pump",55);
                            pokemons.get(memberTypeWater).setHealth(270);
                            pokemons.get(memberTypeWater).setWeight(250);
                            printProFile.setText(printPokemons(pokemons,memberTypeWater));
                            System.out.print("Croconaw Evolution"+select.getSelectedIndex());
                            break;
                        }
                        else if(pokemons.get(memberTypeWater).level >= 30 && pokemons.get(memberTypeWater).getName() == "Totodile"){
                            pokemonIcon.setIcon(dataIcon5);
                            pokemons.get(memberTypeWater).changeName("Croconaw");
                            pokemons.get(memberTypeWater).changeSkill("Water Gun",10,"Water Pulse",25);
                            pokemons.get(memberTypeWater).setHealth(160);
                            pokemons.get(memberTypeWater).setWeight(100);
                            printProFile.setText(printPokemons(pokemons,memberTypeWater));
                            System.out.print("Totodile Evolution"+select.getSelectedIndex());
                            break;
                        }
                        else{
                            break;
                        }
                    default:
                        break;
                }
            }
        });
        godButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 switch (select.getSelectedIndex()) {
                    case 0:
                        if(pokemons.get(memberTypeFire).getGodMode() == "YES" && pokemons.get(memberTypeFire).getName() == "Charizard"){
                            pokemonIcon.setIcon(dataIconGod1);
                            pokemons.get(memberTypeFire).changeName("Ho-OH");
                            pokemons.get(memberTypeFire).changeSkill("Fire Blast(GOD)",70,"Solar Beam(GOD)",100);
                            pokemons.get(memberTypeFire).setHealth(999);
                            pokemons.get(memberTypeFire).setWeight(200);
                            printProFile.setText(printPokemons(pokemons,memberTypeFire));
                            System.out.print("Trade Success"+select.getSelectedIndex());
                            break;
                        }
                        else{
                            break;
                        }
                    case 1:
                        if(pokemons.get(memberTypePlant).getGodMode() == "YES" && pokemons.get(memberTypePlant).getName() == "Meganium"){
                            pokemonIcon.setIcon(dataIconGod2);
                            pokemons.get(memberTypePlant).changeName("Celebi");
                            pokemons.get(memberTypePlant).changeSkill("Physic(GOD)",40,"Hyper Beam(GOD)",90);
                            pokemons.get(memberTypePlant).setHealth(999);
                            pokemons.get(memberTypePlant).setWeight(40);
                            printProFile.setText(printPokemons(pokemons,memberTypePlant));
                            System.out.print("Trade Success"+select.getSelectedIndex());
                            break;
                        }
                        else{
                            break;
                        }
                    case 2:
                        if(pokemons.get(memberTypeWater).getGodMode() == "YES" && pokemons.get(memberTypeWater).getName() == "Feraligatr"){
                            pokemonIcon.setIcon(dataIconGod3);
                            pokemons.get(memberTypeWater).changeName("Lugia");
                            pokemons.get(memberTypeWater).changeSkill("Sky Attack(GOD)",50,"Hydro Pump(GOD)",90);
                            pokemons.get(memberTypeWater).setHealth(999);
                            pokemons.get(memberTypeWater).setWeight(500);
                            printProFile.setText(printPokemons(pokemons,memberTypeWater));
                            System.out.print("Trade Success"+select.getSelectedIndex());
                            break;
                        }
                        else{
                            break;
                        }
                    default:
                        break;
                }
            }
        });
         //set layout
        p1.add(txtSelect);
        p1.add(select);
        p1.add(newButton);
        p1.add(eatButton);
        p1.add(battleButton );
        p1.add(exerciseButton);
        p1.add(evoButton);
        p1.add(godButton);
        showData.add(pokemonIcon);
        showData.add(printProFile);
        c.add(showData, BorderLayout.PAGE_START);
        c.add(p1, BorderLayout.CENTER);

        //set others
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setSize(700,800);
        pack();
        setVisible(true);
        //**********************
    }
    
}
