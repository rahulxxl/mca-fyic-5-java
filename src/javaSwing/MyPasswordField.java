
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPasswordField extends JFrame{
    private JFrame jf;
    private JLabel l1, l2;

    private JTextField text;

    // The JPasswordField will mask the characters so that input characters are not visible on the screen.
    private JPasswordField pw1;

    private JButton enter, exit;

    public MyPasswordField(){

        jf = new JFrame();

        jf.setTitle("ENTER DETAILS");

        l1 = new JLabel("Enter your Password: ");
        l2 = new JLabel("Enter your Name: ");

        text = new JTextField();
        pw1 = new JPasswordField();

        enter = new JButton("Enter");
        exit = new JButton("Exit");

        l2.setBounds(20,30,150,30);
        l1.setBounds(20,100,150,30);
        text.setBounds(170,30,200,30);
        pw1.setBounds(170,100,200,30);
        enter.setBounds(80,200,50,20);
        exit.setBounds(200,200,50,20);

        jf.setLayout(null);
        jf.getContentPane().setBackground(Color.WHITE);

        enter.setBackground(Color.WHITE);
        exit.setBackground(Color.WHITE);

        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.setVisible(false);

                JOptionPane.showMessageDialog(null,"Data Stored");
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.setVisible(false);
            }
        });

        jf.add(l2);
        jf.add(l1);
        jf.add(text);
        jf.add(pw1);
        jf.add(enter);
        jf.add(exit);

        jf.setSize(400,300);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
