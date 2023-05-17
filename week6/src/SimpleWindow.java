// This file extended the JFrame, all the methods are inherited
// I don't have to create an object of window by using "JFrame window = new JFrame()"

import javax.swing.*;
// after added "extends JFrame", the import will automatically give declaration of my swing
public class SimpleWindow extends JFrame {

    //by extending the class, I am not going to have a main method in this file.
    //Going to have a Constructor - special method that displays our attributes.
    // public constructor is SimpleWindow

    public SimpleWindow() {
        // talk about the attributes:
        final int WINDOW_WIDTH = 400;
        final int WINDOW_HEIGHT = 500;

        //other attributes:
        setTitle("My Second Simple Window");

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT); // two arguments inside.

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // don't forget to display it!
        setVisible(true);
    }


}


// This program will not run, because I don't have a main method running here. So it's not referring to the Window