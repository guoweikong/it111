//this is the JFrame assignment without the panel.

import javax.swing. *;
import java.awt. *;


public class ShowWindowAssignment  {

    public static void main (String[] args) {
//        declare our variables
        JLabel myLabel1, myLabel2;

        JTextField windowTextField1, windowTextField2;


        final int WINDOW_WIDTH = 450;
        final int WINDOW_HEIGHT = 600;

        // Create a window:
        JFrame window = new JFrame();


        // set the title:
        window.setTitle("Simple Window");

        // setting the size of our window, by calling out our CONSTANS window:
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // set the window centered:
        window.setLocationRelativeTo(null);

        //set the background color for window:
        window.getContentPane(). setBackground(Color.red);


        //close the window, will exit from the program
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);








           myLabel1 = new JLabel("My First Big Label!!!");
           myLabel1.setBounds(20,50,360,80);
           myLabel1.setFont(new Font("Cairo", Font.PLAIN, 22));


            windowTextField1 = new JTextField(15);
            windowTextField1.setBounds(20,110,300,50);


          myLabel2 = new JLabel("My Second Big Label!");
            myLabel2.setBounds(20,180,330,30);
            myLabel2.setFont(new Font("Cairo", Font.BOLD, 20));


           windowTextField2 = new JTextField(15);
            windowTextField2.setBounds(20,220,300,50);


        window.add(myLabel1);
        window.add(windowTextField1);
        window.add(myLabel2);
        window.add(windowTextField2);



        window.setLayout(null);
        // display the window
        window.setVisible(true);



    }
}
