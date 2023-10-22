package javaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyTextField {
    // Using the Composition instead of Inheritance. Its completely your choice.
    private JFrame jf;
    private JTextField t1;
    private JTextField t2;
    private JLabel l1;
    private JLabel l2;

    public MyTextField(){
        t1 = new JTextField();
        t2 = new JTextField();
        l1 = new JLabel("Source Text");
        l2 = new JLabel("Destination Text");
        jf = new JFrame("JTextField Demo");

        // In-Place Interface implementation. This will create an Anonymous class that implements
        // the ActionListener interface. The actionPerformed method will be fired when you press Enter key
        // while the focus is on the t1 JTextField.
        t1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t2.setText(t1.getText());
            }
        });

        l1.setBounds(20,20,100,50);
        t1.setBounds(150,20,100,50);
        l2.setBounds(20,100,100,50);
        t2.setBounds(150,100,100,50);

        jf.setLayout(null);
        jf.add(l1);
        jf.add(t1);
        jf.add(l2);
        jf.add(t2);

        jf.setSize(300,300);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
