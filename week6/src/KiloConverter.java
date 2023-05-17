import javax.swing.*;

public class KiloConverter extends JFrame {

    JPanel panel;   // call out a JPanel, which is the panel on the JFrame, my variable name will be "panel".

    JLabel messageLabel;   // Create a variable for my JLabel, named "messageLabel".

    JTextField kiloTextField;

    JButton calcButton;

    // create constants
    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 450;

    // always be aware of the colors that the IntelliJ is using

    // create a constructor which is a special method to initialize our Objects
    public KiloConverter(){

        setTitle("Kilometer Converter");

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // build the panel:
        buildPanel();
        // needs to create a build method panel: jump to line 40 "public void buildPanel()"

        add(panel);

        setVisible(true);


    }

    // create a method for buildPanel. because on this panel we are going to add labels, textfields, buttons...
    public void buildPanel() {
        messageLabel = new JLabel("Enter a distance in Kilometers");
        // add text, button and panel

        kiloTextField = new JTextField(10);

        calcButton = new JButton("Calculate");

        // refer to the panel:
        panel = new JPanel();
        // we now have to add the above three components onto the JPanel

        panel.add(messageLabel);
        panel.add(kiloTextField);
        panel.add(calcButton);


    }

    // we have to add our main method:
    public static void main(String[] args) {
        new KiloConverter();
    }
}
