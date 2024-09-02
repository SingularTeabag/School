import java.awt.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class BlackJackGUI {

    static JFrame frame;
    static int moneyRaw = 100;
    static String moneyFormat;
    static int[][] deck = new int[4][13];
    static DecimalFormat currency = new DecimalFormat("$,##0");
    static Image img;
    static JLabel moneyTxt = new JLabel();
    static JPanel monPanel = new JPanel();

    public static void main(String[] args) {
        createFrame();
        createDeck();
        showCard(drawCard(), 50, 30);
        showCard("Back", 180, 30);
        showCard(drawCard(), 50, 350);
        showCard(drawCard(), 180, 350);
        money(0);
        
    }

    public static void createFrame() {
        //creating the window itself
        frame = new JFrame();
        frame.setTitle("Blackjack"); //title
        frame.setLayout(null); //no layout, using the x y plane
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes sure that the window will close when x is pressed
        frame.setBounds(0, 0, 440, 700);  //set the size of the window
        frame.setLocationRelativeTo(null); // idk
        frame.getContentPane().setBackground(new java.awt.Color(35, 31, 32)); //set background color
        frame.setVisible(true); //makes window visible 

        //background color rgb(35,31,32) or 231F20

        /*    creating hit and stand buttons    */
        //creating objects
        JButton hit = new JButton("Hit");
        JButton stand = new JButton("Stand");
        JPanel hitPan = new JPanel();
        JPanel standPan = new JPanel();
        //setting hit panel size, location, and background color
        hitPan.add(hit);
        hitPan.setLocation(80,560);
        hitPan.setSize(70,35);
        hitPan.setBackground(new java.awt.Color(35, 31, 32));
        //setting stand panel size, location, and background color
        standPan.add(stand);
        standPan.setLocation(210,560);
        standPan.setSize(70,35);
        standPan.setBackground(new java.awt.Color(35, 31, 32));
        //adding the panels to the frame
        frame.add(hitPan);
        frame.add(standPan);

    }

    public static void showCard(String card, int x, int y) {
        //formats the card so that it can be found with resources 
        card += ".png";
        card = "cards/" + card;

        //adding the image to the frame
        Container c = frame.getContentPane(); //idk, frame.getContentPlane wont work without a container so here
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

        //first randomly drawn card
        int ranSuit = (int)(Math.random() * 4);
        int ranFace = (int)(Math.random()* 13);

        //makes sure that the card has not already been drawn
        while((deck[ranSuit][ranFace] > 100)) {
            ranSuit = (int)(Math.random() * 4);
            ranFace = (int)(Math.random()* 13);
        }
        
        //shows that the card has been played
        deck[ranSuit][ranFace] = 100;
        //makes the card name so that it can be displayed with the card images
        cardDrawn = ranSuit + "_" + ranFace;

        return cardDrawn;
    }

    public static void gameLogic(int[][] Cards) {
        Cards = new int[2][23]; //played cards
    }

    public static void money(int change) {
        moneyRaw += change; //cahnges the money
        moneyFormat = currency.format(moneyRaw); //formats the money
        
        moneyTxt.setText(moneyFormat); 
        
        monPanel.add(moneyTxt);
        frame.add(monPanel);
        monPanel.setLocation(0,0);
        monPanel.setSize(440,50);
        monPanel.setBackground(new java.awt.Color(35, 31, 32)); // panel color
        moneyTxt.setForeground(new java.awt.Color(255,255,255)); //text color 
        SwingUtilities.updateComponentTreeUI(frame); //Refresh the frame
        //System.out.println(moneyFormat);
    }
 }