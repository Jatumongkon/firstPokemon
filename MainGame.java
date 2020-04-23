import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainGame extends JFrame{
    private Trainer trainer;

    public MainGame(Trainer trainer){
        super("Pokemon Game");
        this.trainer = trainer;
        
        Container c = getContentPane();
        JLabel trainerNameLabel = new JLabel(this.trainer.getNamePlayer());
        JLabel pokemonName = new JLabel();
        
        JButton firstPokemon = new JButton(trainer.getBag().get(0)+"Status");

       
        c.add(trainerNameLabel);
        c.add(pokemonName); 
        c.add(firstPokemon);
        
        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));

        String pName = "Pokemon: ";
        for(Pokemon p: trainer.getBag()){
            pName += p.getName() + ", ";
        }
        pokemonName.setText(pName);

        firstPokemon.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                PokemonStatus ps = new PokemonStatus(trainer.getBag().get(0));
                }
            });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);

    }
}