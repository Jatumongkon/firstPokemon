import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class CatchPokemon extends JFrame{
    ArrayList<Pokemon> pokemons;
    private Pokemon  wPokemon ;
    public CatchPokemon(ArrayList<Pokemon> bag, Trainer t){
        Container c = getContentPane();
        ArrayList<Pokemon> Wildpokemons = PokemonRandomizer.getPokemon(5);
        wPokemon = Wildpokemons.get(0);
       
        JLabel name = new JLabel(wPokemon.getName());
        JLabel hp = new JLabel("HP: "+ wPokemon.getHP() +"/"+wPokemon.getMaxHP());
        JButton rePokemon = new JButton("scan new pokemon");
        JButton Catch = new JButton("Catch");
        JLabel imgLabel = new JLabel();
        imgLabel.setIcon(new ImageIcon(new ImageIcon(wPokemon.getImage()).getImage().getScaledInstance(400, 200, Image.SCALE_DEFAULT)));
        
        rePokemon.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                wPokemon= PokemonRandomizer.getPokemon(5).get(0);
                name.setText(wPokemon.getName());
                hp.setText("HP: "+ wPokemon.getHP() +"/"+wPokemon.getMaxHP());
                imgLabel.setIcon(new ImageIcon(new ImageIcon(wPokemon.getImage()).getImage().getScaledInstance(400, 200, Image.SCALE_DEFAULT)));
                }
            });
        Catch.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(t.getCapacity()>=10){
                    JOptionPane.showMessageDialog(null,"Bag full");
                }
               else{

                BattePokemonGUI ps = new BattePokemonGUI(t.getBag(),wPokemon,"Catch",t);
                ps.setVisible(true);
                dispose();
              
               
               }
             
              
                }
            });

        c.add(name);
        c.add(imgLabel);
        c.add(hp);
        c.add(rePokemon);
        c.add(Catch);


        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
        setSize(400, 400);
        setVisible(true);



    }


}