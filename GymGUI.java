import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.math.*;
public class GymGUI extends JFrame {
    private ArrayList<Pokemon> gymPokemon ;
    private int pokemonInGym = 3,i=0;
    public GymGUI(Trainer trainer){
        gymPokemon = new PokemonRandomizer().getPokemon(6);
        Container c = getContentPane();
		setTitle("Pokemon Gym Battle "+trainer.getGymWin()+"/3");
		c.setVisible(true);
        setSize(400, 500);
        gymPokemon.get(i).setName("Gym pokemon");
        gymPokemon.get(i).setLevel(5);
        JLabel name = new JLabel(gymPokemon.get(i).getName());
        JLabel hp = new JLabel("HP: "+ gymPokemon.get(i).getHP() +"/"+gymPokemon.get(i).getMaxHP());
        JButton next = new JButton("Batte");
        JLabel imgLabel = new JLabel();
        imgLabel.setIcon(new ImageIcon(new ImageIcon(gymPokemon.get(i).getImage()).getImage().getScaledInstance(400, 200, Image.SCALE_DEFAULT)));
        c.add(name);
        c.add(imgLabel);
        c.add(hp);
        c.add(next);
        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));

        c.setVisible(true);
       
        next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
               
                    name.setText(gymPokemon.get(i).getName());
                    hp.setText("HP: "+ gymPokemon.get(i).getHP() +"/"+gymPokemon.get(i).getMaxHP());
                    BattePokemonGUI gui = new BattePokemonGUI(trainer.getBag(),gymPokemon.get(i),"Batte",trainer);
                    gui.setVisible(true);
              
                dispose();
                }});
                

        

    }
    
    

}