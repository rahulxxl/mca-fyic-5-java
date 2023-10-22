package javaSwing;

import javax.swing.*;

public class MyPasswordField {
    private JFrame jf;
    private JLabel l1;

    // The JPasswordField will mask the characters so that input characters are not visible on the screen.
    private JPasswordField pw1;

    public MyPasswordField(){
        jf = new JFrame();
        l1 = new JLabel("Enter your Password");
        pw1 = new JPasswordField();

        l1.setBounds(20,20,100,30);
        pw1.setBounds(150,20,100,30);

        jf.setLayout(null);
        jf.add(l1);
        jf.add(pw1);
        jf.setSize(300,300);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
