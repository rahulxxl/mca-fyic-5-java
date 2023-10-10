package javaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    private JTextField t1, t2, t3;
    private JLabel l1, l2, l3, l4;
    private JButton b1, b2;
    public MyFrame(){
        t1 = new JTextField("");
        t2 = new JTextField("");
        t3 = new JTextField("");

        l1 = new JLabel("Enter First Number");
        l2 = new JLabel("Enter Second Number");
        l3 = new JLabel("Result");
        l4 = new JLabel("Select the operation.");

        b1 = new JButton("+");
        b2 = new JButton("-");

        l1.setBounds(50,50,150,50);
        t1.setBounds(220,50,100,50);

        l2.setBounds(50,150,150,50);
        t2.setBounds(220,150, 100, 50);

        l3.setBounds(50,250,100,50);
        t3.setBounds(220,250, 100, 50);
        t3.setEditable(false);

        l4.setBounds(50,350, 200, 50);
        b1.setBounds(100,450,50,50);
        b2.setBounds(200,450,50,50);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setLayout(null);

        add(t1);    add(t2);    add(t3);
        add(l1);    add(l2);    add(l3);    add(l4);
        add(b1);    add(b2);

        setSize(400, 550);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        int a=0;
        int b=0;

        try{
            a = Integer.parseInt(t1.getText());
            b = Integer.parseInt(t2.getText());
        }
        catch(NumberFormatException ex){
            System.out.println("Invalid Input");
            return;
        }

        if(ev.getSource() == b1){
            t3.setText(String.valueOf(a+b));
        }
        if(ev.getSource() == b2){
            t3.setText(String.valueOf(a-b));
        }
    }
}
