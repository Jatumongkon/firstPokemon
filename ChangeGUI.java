import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ChangeGUI extends JFrame {
    Pokemon pokemon;
    public void ChangeGUI(Trainer t){
        Container c = getContentPane();
        
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setSize(400, 200);
        //setBounds(100, 100, 362, 249);
		setTitle("Change name");
      //  c.setLayout(null);
        JTextField txt = new JTextField();
		//txt.setBounds(103, 41, 144, 20);
		c.add(txt);
        txt.setColumns(10);
        JLabel lbl = new JLabel("Result");
		//lbl.setBounds(103, 120, 144, 14);
		c.add(lbl);
        JButton btn1 = new JButton("Button 1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl.setText("Hello : "+ txt.getText());
			}
		});
		//btn1.setBounds(128, 72, 99, 23);
        c.add(btn1);
        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
        setVisible(true);

    }
    

}