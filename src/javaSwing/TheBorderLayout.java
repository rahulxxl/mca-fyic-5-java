package javaSwing;

import javax.swing.*;
import java.awt.*;

public class TheBorderLayout extends JFrame{
    private JButton b1, b2, b3, b4, b5;

    public TheBorderLayout(){
        b1 = new JButton("TOP");
        b2 = new JButton("RIGHT");
        b3 = new JButton("BOTTOM");
        b4 = new JButton("LEFT");
        b5 = new JButton("CENTER");

        BorderLayout bl = new BorderLayout();
        // BorderLayout bl = new BorderLayout(10,20);   // two parameters are horizontalGap, verticalGap
        setLayout(bl);

        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.EAST);
        add(b3, BorderLayout.SOUTH);
        add(b4, BorderLayout.WEST);
        add(b5, BorderLayout.CENTER);

        setSize(400,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
