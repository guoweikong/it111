// this is the file MQ played.

import javax.swing.*;
import java.awt.*;


public class ShowWindow2 {

    public static void main (String[] args) {
        //declare our variables:
        JLabel myLabel1, myLabel2;

        JTextField windowTextField1, windowTextField2;


        final int WINDOW_WIDTH = 450;
        final int WINDOW_HEIGHT = 600;

        // Create a window:
        JFrame window = new JFrame();


        // set the window centered:
       window.setLocationRelativeTo(null);

       //set the background color:
        window.getContentPane().setBackground(Color.red);

        // set the title:
        window.setTitle("Simple Window");


        myLabel1 = new JLabel("My First Big Label!!!");
        myLabel2 = new JLabel("My Second Big Label!");




        // setting the size of our window, by calling out our CONSTANS window:
//        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setBounds(0,0, WINDOW_WIDTH, WINDOW_HEIGHT);

        windowTextField1  = new JTextField(1);


        System.out.println(myLabel1.getBounds().x + myLabel1.getBounds().y);

        window.add(myLabel1);
//        myLabel.setBounds(10,100,10,30);
        System.out.println(myLabel1.getBounds().x + myLabel1.getBounds().y);
//        window.add(myLabel2, 1);
        window.add(windowTextField1);
        windowTextField1.setBounds(0,0,1,1);

        //close the window, will exit from the program
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // display the window - if we do not display the window, it will not display!
        // display the window is a boolean:
        window.setVisible(true);

    }



}

