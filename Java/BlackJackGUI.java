import java.awt.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class BlackJackGUI extends JFrame {

    static JFrame frame;
    static int moneyRaw = 100;
    static String moneyFormat;
    static int[][] deck = new int[4][13];
    static DecimalFormat currency = new DecimalFormat("$,##0");
    static Image img;

    public static void main(String[] args) {
        createFrame();
        createDeck();
        showCard(drawCard(), 50, 30);
        showCard("Back", 180, 30);
        showCard(drawCard(), 50, 350);
        showCard(drawCard(), 180, 350);
        money(100);
        money(1000000);

        //System.out.println(drawCard());
    }

    public static void createFrame() {
        frame = new JFrame();
        frame.setTitle("Blackjack");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 440, 700); 
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new java.awt.Color(35, 31, 32));
        frame.setVisible(true);
        //background color rgb(35,31,32) or 231F20
    }

    public static void showCard(String card, int x, int y) {
        card += ".png";
        card = "cards/" + card;

        Container c = frame.getContentPane();
        JLabel cardImage = new JLabel();
        cardImage.setIcon(new ImageIcon(card));
        Dimension size = cardImage.getPreferredSize();
        cardImage.setBounds(x, y, size.width, size.height);
        c.add(cardImage);
        SwingUtilities.updateComponentTreeUI(frame); //Refresh the frame
    }

    public static void createDeck() {   
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 12; j++) {
                deck[i][j] = j; 
                //System.out.print(j + " "); //This is for debug
            }
            //System.out.println(); //This is for debug
        }
    }

    public static String drawCard() {
        String cardDrawn;

        int ranSuit = (int)(Math.random() * 4);
        int ranFace = (int)(Math.random()* 13);


        while((deck[ranSuit][ranFace] > 100)) {
            ranSuit = (int)(Math.random() * 4);
            ranFace = (int)(Math.random()* 13);
        }
        
        deck[ranSuit][ranFace] = 100;
        cardDrawn = ranSuit + "_" + ranFace;

        return cardDrawn;
    }

    public static void gameLogic(int[][] Cards) {
        Cards = new int[2][23];

    }

    public static void money(int change) {
        moneyRaw += change;
        moneyFormat = currency.format(moneyRaw);

        JLabel money = new JLabel(moneyFormat);
        JPanel panel = new JPanel();
        panel.add(money);
        frame.add(panel);
        panel.setLocation(0,0);
        panel.setSize(440,50);
        panel.setBackground(new java.awt.Color(35, 31, 32));
        panel.setForeground(new java.awt.Color(255,255,255));
        SwingUtilities.updateComponentTreeUI(frame); //Refresh the frame
        //System.out.println(moneyFormat);
    }
 }