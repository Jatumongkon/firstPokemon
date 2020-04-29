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
        c.add(name);
        c.add(hp);
        c.add(level);
        c.add(atk);
        c.add(eatBerry);
        c.add(changeName);
        c.add(free);
        eatBerry.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                pokemon.eatBerry();
                hp.setText("HP: "+ pokemon.getHP() +"/"+pokemon.getMaxHP());
                t.setBerry(t.getBerry()-1);
                eatBerry.setText("Eat berry (+20 hp) :"+t.getBerry());
                
                }
            });
        changeName.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.out.println("test");
                //ChangeNameGUI newframe = new ChangeNameGUI();
             
               // newframe.setVisible(true);
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
                   else//(t.getCapacity()==1)
                    {
                        JOptionPane.showMessageDialog(null,"Can't free last Pokemon");
                        
                    }
            }});
        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));

        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);

    }
}