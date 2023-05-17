import javax.swing. *;
// manually import java classes from the swing library

public class showWindow {

    public static void main (String[] args) {
        //declare our variables
        // we are going to make them CONSTANTS: final
        //declare dimensions for window:
        final int WINDOW_WIDTH = 350;  //350px
        final int WINDOW_HEIGHT = 250;

        // Create a window:
        // call out JFrame, created a variable named window, then create an object by using the "new" keyword.
        //create an object of window, it is going to be a JFrame
        JFrame window = new JFrame();
        // similar to : Scanner input = new Scanner(System.in);

        // Then referring to the object "window".
        // window has many attributes, an attribute of my window: title
        // set the title:
        window.setTitle("Simple Window");

        // setting the size of our window, by calling out our CONSTANS window:
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        //close the window, will exit from the program
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // display the window - if we do not display the window, it will not display!
        // display the window is a boolean:
        window.setVisible(true);
    }
}
