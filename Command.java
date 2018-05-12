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
    JButton newButton,eatButton,exerciseButton,battleButton;
    JTextArea printProFile,battleArea;
    Icon dataIcon0,dataIcon1,dataIcon2,dataIconStart;
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
        return hp+weight;
        
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
        pokemonIcon   = new JLabel("");
        pokemonIcon.setIcon(dataIconStart);
         
        txtSelect  = new JLabel("เลือก โปเกม่อนเริ่มต้น : ");
        newButton = new JButton("Add");
        eatButton  = new JButton("Eat");
        battleButton = new JButton("Battle");
        exerciseButton = new JButton("Exercise");
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
                        pokemonIcon.setIcon(dataIcon0);
                        membershipOfCharmander = 0;
                        printProFile.setText(printPokemons(pokemons,membershipOfCharmander));
                        System.out.print("Charmander"+select.getSelectedIndex());
                        break;
                    case 1:
                        pokemonIcon.setIcon(dataIcon1);
                        membershipOfChikorita = 1;
                        printProFile.setText(printPokemons(pokemons,membershipOfChikorita));
                        System.out.print("Chikorita"+select.getSelectedIndex());
                        break;
                    case 2:
                        pokemonIcon.setIcon(dataIcon2);
                        membershipOfTotodile = 2;
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
                        pokemonIcon.setIcon(dataIcon0);
                        System.out.print("Charmander eat"+ select.getSelectedIndex());
                        break;
                    case 1:
                        pokemonIcon.setIcon(dataIcon1);
                        eatBerry(membershipOfChikorita);
                        System.out.print("Chikorita eat"+ select.getSelectedIndex());
                        break;
                    case 2:
                        pokemonIcon.setIcon(dataIcon2);
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
                        pokemonIcon.setIcon(dataIcon0);
                        pokemons.get(membershipOfCharmander).move();
                        printProFile.setText(printPokemons(pokemons,membershipOfCharmander));
                        System.out.print("Charmander Exercise"+select.getSelectedIndex());
                        break;
                    case 1:
                        pokemonIcon.setIcon(dataIcon1);
                        pokemons.get(membershipOfChikorita).move();
                        printProFile.setText(printPokemons(pokemons,membershipOfChikorita));
                        System.out.print("Chikorita Exercise"+select.getSelectedIndex());
                        break;
                    case 2:
                        pokemonIcon.setIcon(dataIcon2);
                        pokemons.get(membershipOfTotodile).move();
                        printProFile.setText(printPokemons(pokemons,membershipOfTotodile));
                        System.out.print("Totodile Exercise "+select.getSelectedIndex());
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
                        pokemonIcon.setIcon(dataIcon0);
                        pokemons.get(membershipOfCharmander).level();
                        printProFile.setText(printPokemons(pokemons,membershipOfCharmander));
                        System.out.print("Charmander Fight Monster"+select.getSelectedIndex());
                        break;
                    case 1:
                        pokemonIcon.setIcon(dataIcon1);
                        pokemons.get(membershipOfChikorita).level();
                        printProFile.setText(printPokemons(pokemons,membershipOfChikorita));
                        System.out.print("Chikorita Fight Monster"+select.getSelectedIndex());
                        break;
                    case 2:
                        pokemonIcon.setIcon(dataIcon2);
                        pokemons.get(membershipOfTotodile).level();
                        printProFile.setText(printPokemons(pokemons,membershipOfTotodile));
                        System.out.print("Totodile Fight Monster"+select.getSelectedIndex());
                        break;
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
