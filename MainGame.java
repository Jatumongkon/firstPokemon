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
        JButton Statusbag = new JButton("print pokemon in bag");
        JButton CatchButton = new JButton("Chath pokemon");
        JButton capacitybag = new JButton("print capacity");
       
        c.add(trainerNameLabel);
        c.add(Statusbag);
        c.add(CatchButton);
        c.add(capacitybag);
        
        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
        setSize(400, 200);
        setVisible(true);
        
        String pName = "Pokemon: ";

        Statusbag.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                int i = 0;
                for(Pokemon p: trainer.getBag()){
                   PokemonStatus ps = new PokemonStatus(trainer.getBag().get(i),trainer);
                   i++;
                }
               
                }
            });
        CatchButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent b){
            System.out.print("test catch");
            CatchPokemon ps = new CatchPokemon(trainer.getBag(),trainer);
            ps.setVisible(true);
            }

        });
        capacitybag.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent c){
                JOptionPane.showMessageDialog(null,
	    "Bag capacity:"+trainer.getCapacity()+"/10",
	    "Bag capacity",
	    JOptionPane.PLAIN_MESSAGE);
            }

        });
       
        

    }
}