package javaSwing;

import javax.swing.*;
import java.awt.*;

public class TheGridLayout {
    private JFrame myFrame;

    public TheGridLayout(){
        JButton b1 = new JButton("B1");
        JButton b2 = new JButton("B2");
        JButton b3 = new JButton("B3");
        JButton b4 = new JButton("B4");
        JButton b5 = new JButton("B5");
        JButton b6 = new JButton("B6");
        JButton b7 = new JButton("B7");
        JButton b8 = new JButton("B8");
        JButton b9 = new JButton("B9");
        JButton b10 = new JButton("B10");

        myFrame = new JFrame();
        // You can change to any Grid Layout. Just uncomment the required one and comment out others.
        // GridLayout gl = new GridLayout(); // Default
        // GridLayout gl = new GridLayout(10,0); // 10 rows, 0 cols
        // GridLayout gl = new GridLayout(0,10); // 0 rows, 10 cols
        // GridLayout gl = new GridLayout(3,3); // 3 rows, 3 cols. Rows will be respected first.
        GridLayout gl = new GridLayout(3,3, 10,10); // 3 rows, 3 cols, 10 horizontalPad, 10 VericalPad

        myFrame.setLayout(gl);


        myFrame.add(b1);
        myFrame.add(b2);
        myFrame.add(b3);
        myFrame.add(b4);
        myFrame.add(b5);
        myFrame.add(b6);
        myFrame.add(b7);
        myFrame.add(b8);
        myFrame.add(b9);
        myFrame.add(b10);

        myFrame.setSize(500,500);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}
