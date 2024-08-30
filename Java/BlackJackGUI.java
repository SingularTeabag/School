import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class BlackJackGUI {
    public static void createFrame() {
        JFrame frame = new JFrame("Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel textLabel = new JLabel("I'm a label in the window",SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300, 100));
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {

    }
 }