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
    JButton newButton,eatButton,exerciseButton,battleButton,evoButton;
    JTextArea printProFile,battleArea;
    Icon dataIcon0,dataIcon1,dataIcon2,dataIcon3,dataIcon4,dataIcon5,dataIcon6,dataIcon7,dataIcon8,dataIconStart;
    JComboBox select;
    int  membershipOfCharmander, 
         membershipOfChikorita,
         membershipOfTotodile;
    //***************************************************************************************
    public static String printPokemons(ArrayList<Pokemon> pokemons,int member){
        String hp = "======== Pokemon List ======== \n"+"Pokemon "+
                pokemons.get(member).getName()+" health: "+pokemons.get(member).getHealth()
                +"/"+pokemons.get(member).maxHealth+"\nPokemonLevel :"+pokemons.get(member).getLevel()+" Exp:"+pokemons.get(member).getExperience()+"/100.00";
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
        pokemonIcon   = new JLabel("");
        pokemonIcon.setIcon(dataIconStart);
         
        txtSelect  = new JLabel("เลือก โปเกม่อนเริ่มต้น : ");
        newButton = new JButton("Add");
        eatButton  = new JButton("Eat");
        battleButton = new JButton("Battle");
        exerciseButton = new JButton("Exercise");
        evoButton = new JButton("Evolution");
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
                        membershipOfCharmander = 0;
                        if(pokemons.get(membershipOfCharmander).getName() == "Charmander"){
                            pokemonIcon.setIcon(dataIcon0);
                        }
                        else if(pokemons.get(membershipOfCharmander).getName() == "Charmelon"){
                            pokemonIcon.setIcon(dataIcon3);
                        }
                        else if(pokemons.get(membershipOfCharmander).getName() == "Charizard"){
                            pokemonIcon.setIcon(dataIcon6);
                        }
                        printProFile.setText(printPokemons(pokemons,membershipOfCharmander));
                        System.out.print("Charmander"+select.getSelectedIndex());
                        break;
                    case 1:    
                        membershipOfChikorita = 1;
                        if(pokemons.get(membershipOfChikorita).getName() == "Chikorita"){
                            pokemonIcon.setIcon(dataIcon1);
                        }
                        else if(pokemons.get(membershipOfChikorita).getName() == "Bayleef"){
                            pokemonIcon.setIcon(dataIcon4);
                        }
                        else if(pokemons.get(membershipOfChikorita).getName() == "Meganium"){
                            pokemonIcon.setIcon(dataIcon7);
                        }
                        printProFile.setText(printPokemons(pokemons,membershipOfChikorita));
                        System.out.print("Chikorita"+select.getSelectedIndex());
                        break;
                    case 2:    
                        membershipOfTotodile = 2;
                        if(pokemons.get(membershipOfTotodile).getName() == "Totodile"){
                            pokemonIcon.setIcon(dataIcon2);
                        }
                        else if(pokemons.get(membershipOfTotodile).getName() == "Croconaw"){
                            pokemonIcon.setIcon(dataIcon5);
                        }
                        else if(pokemons.get(membershipOfTotodile).getName() == "Feraligatr"){
                            pokemonIcon.setIcon(dataIcon8);
                        }
                        printProFile.setText(printPokemons(pokemons,membershipOfTotodile));
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
                        eatBerry(membershipOfCharmander);
                        if(pokemons.get(membershipOfCharmander).getName() == "Charmander"){
                            pokemonIcon.setIcon(dataIcon0);
                        }
                        else if(pokemons.get(membershipOfCharmander).getName() == "Charmelon"){
                            pokemonIcon.setIcon(dataIcon3);
                        }
                        else if(pokemons.get(membershipOfCharmander).getName() == "Charizard"){
                            pokemonIcon.setIcon(dataIcon6);
                        }
                        System.out.print("Charmander eat"+ select.getSelectedIndex());
                        break;
                    case 1:
                        if(pokemons.get(membershipOfChikorita).getName() == "Chikorita"){
                            pokemonIcon.setIcon(dataIcon1);
                        }
                        else if(pokemons.get(membershipOfChikorita).getName() == "Bayleef"){
                            pokemonIcon.setIcon(dataIcon4);
                        }
                        else if(pokemons.get(membershipOfChikorita).getName() == "Meganium"){
                            pokemonIcon.setIcon(dataIcon7);
                        }
                        eatBerry(membershipOfChikorita);
                        System.out.print("Chikorita eat"+ select.getSelectedIndex());
                        break;
                    case 2:
                        if(pokemons.get(membershipOfTotodile).getName() == "Totodile"){
                            pokemonIcon.setIcon(dataIcon2);
                        }
                        else if(pokemons.get(membershipOfTotodile).getName() == "Croconaw"){
                            pokemonIcon.setIcon(dataIcon5);
                        }
                        else if(pokemons.get(membershipOfTotodile).getName() == "Feraligatr"){
                            pokemonIcon.setIcon(dataIcon8);
                        }
                        eatBerry(membershipOfTotodile);
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
                        if(pokemons.get(membershipOfCharmander).getName() == "Charmander"){
                            pokemonIcon.setIcon(dataIcon0);
                        }
                        else if(pokemons.get(membershipOfCharmander).getName() == "Charmelon"){
                            pokemonIcon.setIcon(dataIcon3);
                        }
                        else if(pokemons.get(membershipOfCharmander).getName() == "Charizard"){
                            pokemonIcon.setIcon(dataIcon6);
                        }
                        pokemons.get(membershipOfCharmander).move();
                        printProFile.setText(printPokemons(pokemons,membershipOfCharmander));
                        System.out.print("Exercise"+select.getSelectedIndex());
                        break;
                    case 1:
                        if(pokemons.get(membershipOfChikorita).getName() == "Chikorita"){
                            pokemonIcon.setIcon(dataIcon1);
                        }
                        else if(pokemons.get(membershipOfChikorita).getName() == "Bayleef"){
                            pokemonIcon.setIcon(dataIcon4);
                        }
                        else if(pokemons.get(membershipOfChikorita).getName() == "Meganium"){
                            pokemonIcon.setIcon(dataIcon7);
                        }
                        pokemons.get(membershipOfChikorita).move();
                        printProFile.setText(printPokemons(pokemons,membershipOfChikorita));
                        System.out.print("Exercise"+select.getSelectedIndex());
                        break;
                    case 2:
                        if(pokemons.get(membershipOfTotodile).getName() == "Totodile"){
                            pokemonIcon.setIcon(dataIcon2);
                        }
                        else if(pokemons.get(membershipOfTotodile).getName() == "Croconaw"){
                            pokemonIcon.setIcon(dataIcon5);
                        }
                        else if(pokemons.get(membershipOfTotodile).getName() == "Feraligatr"){
                            pokemonIcon.setIcon(dataIcon8);
                        }
                        pokemons.get(membershipOfTotodile).move();
                        printProFile.setText(printPokemons(pokemons,membershipOfTotodile));
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
                        if(pokemons.get(membershipOfCharmander).getName() == "Charmander"){
                            pokemonIcon.setIcon(dataIcon0);
                        }
                        else if(pokemons.get(membershipOfCharmander).getName() == "Charmelon"){
                            pokemonIcon.setIcon(dataIcon3);
                        }
                        else if(pokemons.get(membershipOfCharmander).getName() == "Charizard"){
                            pokemonIcon.setIcon(dataIcon6);
                        }
                        pokemons.get(membershipOfCharmander).level();
                        printProFile.setText(printPokemons(pokemons,membershipOfCharmander));
                        System.out.print("Fight Monster"+select.getSelectedIndex());
                        break;
                    case 1:
                        if(pokemons.get(membershipOfChikorita).getName() == "Chikorita"){
                            pokemonIcon.setIcon(dataIcon1);
                        }
                        else if(pokemons.get(membershipOfChikorita).getName() == "Bayleef"){
                            pokemonIcon.setIcon(dataIcon4);
                        }
                        else if(pokemons.get(membershipOfChikorita).getName() == "Meganium"){
                            pokemonIcon.setIcon(dataIcon7);
                        }
                        pokemons.get(membershipOfChikorita).level();
                        printProFile.setText(printPokemons(pokemons,membershipOfChikorita));
                        System.out.print("Fight Monster"+select.getSelectedIndex());
                        break;
                    case 2:
                        if(pokemons.get(membershipOfTotodile).getName() == "Totodile"){
                            pokemonIcon.setIcon(dataIcon2);
                        }
                        else if(pokemons.get(membershipOfTotodile).getName() == "Croconaw"){
                            pokemonIcon.setIcon(dataIcon5);
                        }
                        else if(pokemons.get(membershipOfTotodile).getName() == "Feraligatr"){
                            pokemonIcon.setIcon(dataIcon8);
                        }
                        pokemons.get(membershipOfTotodile).level();
                        printProFile.setText(printPokemons(pokemons,membershipOfTotodile));
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
                        if(pokemons.get(membershipOfCharmander).level >= 50 && pokemons.get(membershipOfCharmander).getName() == "Charmelon"){
                            pokemonIcon.setIcon(dataIcon6);
                            pokemons.get(membershipOfCharmander).changeName("Charizard");
                            pokemons.get(membershipOfCharmander).changeSkill("Fire Spin",14,"Over Heat",70);
                            pokemons.get(membershipOfCharmander).setHealth(250);
                            printProFile.setText(printPokemons(pokemons,membershipOfCharmander));
                            System.out.print("Charmelon Evolution"+select.getSelectedIndex());
                            break;
                        }
                        else if(pokemons.get(membershipOfCharmander).level >= 30 && pokemons.get(membershipOfCharmander).getName() == "Charmander"){
                            pokemonIcon.setIcon(dataIcon3);
                            pokemons.get(membershipOfCharmander).changeName("Charmelon");
                            pokemons.get(membershipOfCharmander).changeSkill("Fire Fang",10,"Flame Burst",20);
                            pokemons.get(membershipOfCharmander).setHealth(150);
                            printProFile.setText(printPokemons(pokemons,membershipOfCharmander));
                            System.out.print("Charmander Evolution"+select.getSelectedIndex());
                            break;
                        }
                        else{
                            break;
                        }
                    case 1:
                        if(pokemons.get(membershipOfChikorita).level >= 50 && pokemons.get(membershipOfChikorita).getName() == "Bayleef"){
                            pokemonIcon.setIcon(dataIcon7);
                            pokemons.get(membershipOfChikorita).changeName("Meganium");
                            pokemons.get(membershipOfChikorita).changeSkill("Razor Leaf",12,"Solar Beam",60);
                            pokemons.get(membershipOfChikorita).setHealth(300);
                            printProFile.setText(printPokemons(pokemons,membershipOfChikorita));
                            System.out.print("Bayleef Evolution"+select.getSelectedIndex());
                            break;
                        }
                        else if(pokemons.get(membershipOfChikorita).level >= 30 && pokemons.get(membershipOfChikorita).getName() == "Chikorita"){
                            pokemonIcon.setIcon(dataIcon4);
                            pokemons.get(membershipOfChikorita).changeName("Bayleef");
                            pokemons.get(membershipOfChikorita).changeSkill("Razor Leaf",12,"Energy Ball",30);
                            pokemons.get(membershipOfChikorita).setHealth(180);
                            printProFile.setText(printPokemons(pokemons,membershipOfCharmander));
                            System.out.print("Chikorita Evolution"+select.getSelectedIndex());
                            break;
                        }
                        else{
                            break;
                        }
                    case 2:
                        if(pokemons.get(membershipOfTotodile).level >= 50 && pokemons.get(membershipOfTotodile).getName() == "Croconaw"){
                            pokemonIcon.setIcon(dataIcon8);
                            pokemons.get(membershipOfTotodile).changeName("Feraligatr");
                            pokemons.get(membershipOfTotodile).changeSkill("Water Gun",10,"Hydro Pump",55);
                            pokemons.get(membershipOfTotodile).setHealth(270);
                            printProFile.setText(printPokemons(pokemons,membershipOfTotodile));
                            System.out.print("Croconaw Evolution"+select.getSelectedIndex());
                            break;
                        }
                        else if(pokemons.get(membershipOfTotodile).level >= 30 && pokemons.get(membershipOfTotodile).getName() == "Totodile"){
                            pokemonIcon.setIcon(dataIcon5);
                            pokemons.get(membershipOfTotodile).changeName("Croconaw");
                            pokemons.get(membershipOfTotodile).changeSkill("Water Gun",10,"Water Pulse",25);
                            pokemons.get(membershipOfTotodile).setHealth(160);
                            printProFile.setText(printPokemons(pokemons,membershipOfTotodile));
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
         //set layout
        p1.add(txtSelect);
        p1.add(select);
        p1.add(newButton);
        p1.add(eatButton);
        p1.add(battleButton );
        p1.add(exerciseButton);
        p1.add(evoButton);
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
