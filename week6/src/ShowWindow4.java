// this is the JFrame assignment by using the panel.


import javax.swing.*;
import java.awt.*;

public class ShowWindow4 extends JFrame {

    JPanel panel;

    JLabel label1, label2;

    JTextField windowTextField1, windowTextField2;

    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 450;

    public ShowWindow4() {

        setTitle("Simple Window");

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // set the window centered:
        setLocationRelativeTo(null);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildPanel();

        add(panel);

        setVisible(true);

    }

    public void buildPanel() {
        JLabel label1 = new JLabel("My First Big Label!!!");
//        label1.setBounds(0,0,30,40);
        label1.setFont(new Font("Serif", Font.PLAIN, 24 ));
        windowTextField1 = new JTextField(20);
//        windowTextField1.setBounds(20,30,20,30);

        JLabel label2 = new JLabel("My Second Big Label!");
        label2.setFont(new Font("Serif", Font.BOLD, 20 ));
        windowTextField2 = new JTextField(20);



        panel = new JPanel();

        panel.add(label1);
        panel.add(windowTextField1);
        panel.add(label2);
        panel.add(windowTextField2);


        //set the background color for panel:
        panel.setBackground(Color.red);

//        label1.setBounds(0,0,30,40);
//        windowTextField1.setBounds(20,30,20,30);

    }

    public static void main (String[] args) {
        new ShowWindow4();
    }
}
