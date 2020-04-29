import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChangeNameGUI extends JFrame {
   
    public ChangeNameGUI(Pokemon pokemon){
        Container c = getContentPane();      
        setTitle("Change name :"+ pokemon.getName());
        System.out.println(pokemon.getName());
        JTextField newName = new JTextField();
        newName.setColumns(10);
        JLabel name = new JLabel(pokemon.getName()); 
        JButton change = new JButton("Change");
        
        
       
        c.add(newName);
        c.add(name);
        c.add(change);
        c.setVisible(true);
        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
        setSize(400, 100);
        change.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                name.setText("New name : "+ newName.getText());
                pokemon.setName(newName.getText());
                setTitle("Change name :"+ pokemon.getName());
			}
        });
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
       
    }
    

}