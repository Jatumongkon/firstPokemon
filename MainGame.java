import java.util.*;
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
        
        JButton Statusbag = new JButton("print pokemon in bag");
        JButton CatchButton = new JButton("Chath pokemon");

       
        c.add(trainerNameLabel);
        c.add(pokemonName); 
        c.add(Statusbag);
        c.add(CatchButton);
        
        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
        
        String pName = "Pokemon: ";
        for(Pokemon p: trainer.getBag()){
            pName += p.getName() + ", ";
        }
        pokemonName.setText(pName);

        Statusbag.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                int i = 0;
                for(Pokemon p: trainer.getBag()){
                   PokemonStatus ps = new PokemonStatus(trainer.getBag().get(i));
                   i++;
                }
               
                }
            });
        CatchButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent b){
              //  trainer.catchPokemon(); 
              System.out.print("test catch");
            CatchPokemon ps = new CatchPokemon(trainer.getBag(),trainer);
            }

        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);

    }
}