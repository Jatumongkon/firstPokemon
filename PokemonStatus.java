import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.*;

public class PokemonStatus extends JFrame {
    private Pokemon pokemon; 
    public PokemonStatus(Pokemon pokemon,Trainer t){
        super("Pokemon Status "+ pokemon.getName());
        this.pokemon = pokemon;

        Container c = getContentPane();
        JLabel name = new JLabel(pokemon.getName());
        JLabel hp = new JLabel("HP: "+ pokemon.getHP() +"/"+pokemon.getMaxHP());
        JLabel atk = new JLabel("ATK: "+pokemon.getATK());
        JLabel level = new JLabel("Level: " + pokemon.getLevel() + "EXP: "+ pokemon.getEXP()+"/"+pokemon.getMaxEXP());
        JButton eatBerry = new JButton("Eat berry (+20 hp) :"+t.getBerry());
        JButton changeName = new JButton("Change name");
        JButton free = new JButton("free");
        JButton UpdateDisplay = new JButton("Update display");
        c.add(name);
        c.add(hp);
        c.add(level);
        c.add(atk);
        c.add(eatBerry);
        c.add(changeName);
        c.add(free);
        c.add(UpdateDisplay);
        
        eatBerry.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(t.getBerry()>0){
                pokemon.eatBerry();
                hp.setText("HP: "+ pokemon.getHP() +"/"+pokemon.getMaxHP());
                t.setBerry(t.getBerry()-1);
                eatBerry.setText("Eat berry (+20 hp) :"+t.getBerry());
                
                }
                }
            });
        changeName.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.out.println("test");
                EventQueue.invokeLater(new Runnable() {
                public void run() {
                    ChangeNameGUI frame = new ChangeNameGUI(pokemon);
                    frame.setVisible(true);
                } 
            });
                }
            });
            free.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                   if(t.getCapacity() > 1){
                    t.getBag().remove(pokemon);
                    t.setBerry(t.getBerry()+2+(int)(Math.random()*4));
                    dispose();
                    t.setCapacity(t.getCapacity()-1);
                    JOptionPane.showMessageDialog(null,"Get some berry");
                    }
                   else
                    {
                        JOptionPane.showMessageDialog(null,"Can't free last Pokemon");
                        
                    }
            }});
        UpdateDisplay.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                hp.setText("HP: "+ pokemon.getHP() +"/"+pokemon.getMaxHP());
                name.setText(pokemon.getName());
                atk.setText("ATK: "+pokemon.getATK());
                level.setText("Level: " + pokemon.getLevel() + "EXP: "+ pokemon.getEXP()+"/"+pokemon.getMaxEXP());
                eatBerry.setText("Eat berry (+20 hp) :"+t.getBerry());
            }
        });
        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));

        
        setSize(400, 300);
        setVisible(true);

    }
}