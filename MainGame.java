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
        JButton CatchButton = new JButton("Catch pokemon");
        JButton capacitybag = new JButton("print capacity");
        JButton gym = new JButton("Goiong to gym");
        JLabel Satoshi = new JLabel(new ImageIcon(getClass().getResource("Satoshi.jpg")));
        JLabel gymLabel = new JLabel("If you win 3 GYM ,you get more EXP");

        c.add(trainerNameLabel);
        c.add(Statusbag);
        c.add(CatchButton);
        c.add(capacitybag);
        c.add(gym);
        c.add(Satoshi);
        c.add(gymLabel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setLayout(null);


        setBounds(100, 100, 600, 450);
        int n = 250;
        trainerNameLabel.setBounds(200,10,100, 25);
        Satoshi.setBounds(200,50,200, 200);
        Statusbag.setBounds(200,30+n,  200, 25);
        CatchButton.setBounds(200,55+n,  200, 25);
        capacitybag.setBounds(200, 80+n,  200, 25);
        gym.setBounds(200, 105+n,  200, 25);
        gymLabel.setBounds(200, 130+n,  200, 25);



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
        System.out.println(trainer.getGymWin());
            }

        });
        gym.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent b){
            goGYM(trainer);
            
            }

        });
        

    }
    public void goGYM(Trainer trainer){
        if(trainer.getGymWin()==3){
                   
            JOptionPane.showMessageDialog(null,
            "You win all Gym " ,
            "status",
            JOptionPane.WARNING_MESSAGE);
            win(trainer);
    }
         else if(trainer.getGymWin()<3){
            System.out.print("test Gym ");
            GymGUI ps = new GymGUI(trainer);
            ps.setVisible(true);
    }
        else{
            trainer.setGymWin(0);
        }
    }

    public void win(Trainer trainer) {
        {
            for(Pokemon p : trainer.getBag()){
                p.expUP(100);
            }
        }
        
    }
}
