import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.math.*;

public class BattePokemonGUI extends JFrame{
	private Pokemon enemy;
	private Pokemon myPokemon;
	private boolean isWin;
	private boolean battleEND;
    public  BattePokemonGUI(ArrayList<Pokemon> bag, Pokemon enemy,String status,Trainer t){
		this.enemy = enemy;
		int numberPokemon = 0;
		ArrayList<String> pokemonname = new ArrayList<String>();
		for(Pokemon p : bag){
			pokemonname.add(p.getName());
			numberPokemon++;
		}
		
		Container c = getContentPane();
		setBounds(100, 100, 400, 300);
		setTitle("Choose your Pokemon ");
		c.setVisible(true);
		getContentPane().setLayout(null);
		
		String[] array = pokemonname.toArray(new String[pokemonname.size()]);
		JComboBox comboBox = new JComboBox(array);
		comboBox.setSelectedIndex((numberPokemon-1));
		comboBox.setBounds(200, 76, 107, 20);
		c.add(comboBox);
		JButton btn = new JButton("Choose");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(Pokemon p: bag){
					if(p.getName().equals(comboBox.getSelectedItem())){
						setMypokemon(p);
					}
					
				}
				isWin = false;
					do{
						myPokemon.attack(enemy);
						if(enemy.getHP()== 0){
							isWin = true;
							break;
						}
						else {
							enemy.attack(myPokemon);
							if(myPokemon.getHP()== 0){
								isWin = false;
								break;
							}
						}
					}while(true);
		
					if(isWin == true){
						if(status.equals("Catch")){
						bag.add(enemy);	
						JOptionPane.showMessageDialog(null,
	    "You get " + enemy.getName(),
	    "status",
		JOptionPane.WARNING_MESSAGE);
						t.setCapacity(t.getCapacity()+1);
						}

						if(status.equals("Batte")){
							JOptionPane.showMessageDialog(null,
	    "You win " ,
	    "status",
		JOptionPane.WARNING_MESSAGE);
							t.setGymWin(t.getGymWin()+1);
							
						}

						myPokemon.expUP((int)(Math.random()*100)+enemy.getMaxHP() );
						
						
					//	System.out.println("You win !!!!");
					}
					else{
						//System.out.println(enemy.getName() +" win");
						JOptionPane.showMessageDialog(null,
						enemy.getName() + " win",
						"status",
						JOptionPane.WARNING_MESSAGE);
					}
					dispose();
					battleEND = true;
			
		}});
		btn.setBounds(200, 123, 81, 23);
		c.add(btn);
		c.add(comboBox);


		
	}
	public void setMypokemon(Pokemon p){
		this.myPokemon = p;
	}
	public Pokemon getMyPokemon(){
		return this.myPokemon;
	}
	public boolean getWin(){
		return this.isWin;
	}
	public boolean getBattleEND(){
		return this.battleEND;
	}
	}
