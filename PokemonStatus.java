import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PokemonStatus extends JFrame {
    Pokemon pokemon; 
    public PokemonStatus(Pokemon pokemon){
        super("Pokemon Status "+ pokemon.getName());
        this.pokemon = pokemon;

        Container c = getContentPane();
        JLabel name = new JLabel(pokemon.getName());
        JLabel hp = new JLabel("HP: "+ pokemon.getHP() +"/"+pokemon.getMaxHP());
        JLabel atk = new JLabel("ATK: "+pokemon.getATK());
        JLabel level = new JLabel("Level: " + pokemon.getLevel() + "EXP: "+ pokemon.getEXP()+"/"+pokemon.getMaxHP());
        JButton eatBerry = new JButton("Eat berry (+20 hp)");
        JButton changeName = new JButton("Change name");

        c.add(name);
        c.add(hp);
        c.add(level);
        c.add(atk);
        c.add(eatBerry);
        c.add(changeName);
        eatBerry.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                pokemon.eatBerry();
                hp.setText("HP: "+ pokemon.getHP() +"/"+pokemon.getMaxHP());
              
                }
            });
        changeName.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.out.println("test");
              
                }
            });
        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));

        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);

    }
}