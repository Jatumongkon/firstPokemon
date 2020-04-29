import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChangeNameGUI extends JFrame {
   
    public ChangeNameGUI(Pokemon pokemon){
       
        setBounds(100, 100, 362, 249);
        setTitle("Change name :"+ pokemon.getName());
        System.out.println(pokemon.getName());
        JTextField newName = new JTextField();
        newName.setColumns(10);
        JLabel name = new JLabel(pokemon.getName()); 
        JButton change = new JButton("Change");
        getContentPane().add(newName);
        getContentPane().add(name);
        getContentPane().add(change);

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