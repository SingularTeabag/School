import java.awt.*;
import javax.swing.*;
import java.text.DecimalFormat;
import java.awt.event.*;

public class BlackJackGUI2 extends JFrame {

    static JFrame frame;
    static int moneyRaw = 100;
    static String moneyFormat;
    static int[][] deck = new int[4][13];
    static DecimalFormat currency = new DecimalFormat("$,##0");
    static Image img;
    static JLabel moneyTxt = new JLabel();
    static JPanel monPanel = new JPanel();
    static JButton hitButton = new JButton("Hit");
    static JButton standButton = new JButton("Stand");
    static JPanel hitPan = new JPanel();
    static JPanel standPan = new JPanel();
    static JLabel cardImage = new JLabel();
   

    public static void main(String[] args) {
        createFrame();
        createDeck();
        money(0);
        /*
        showCard(drawCard(), 50, 30);
        showCard("Back", 180, 30);
        showCard(drawCard(), 50, 350);
        showCard(drawCard(), 180, 350);
        */

        //to call a non static method (button acitons) in a static method (main)
        BlackJackGUI2 bt = new BlackJackGUI2();
        bt.hitButtonAction();
        bt.standButtonAction();
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
        //setting hit panel size, location, and background color
        hitPan.add(hitButton);
        hitPan.setLocation(80,560);
        hitPan.setSize(70,35);
        hitPan.setBackground(new java.awt.Color(35, 31, 32));
        //setting stand panel size, location, and background color
        standPan.add(standButton);
        standPan.setLocation(210,560);
        standPan.setSize(70,35);
        standPan.setBackground(new java.awt.Color(35, 31, 32));
        //adding the panels to the frame
        frame.add(hitPan);
        frame.add(standPan);
    }

    public void hitButtonAction() {
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.print("Player Hit, Card: ");
                String temp = drawCard();
                showCard(temp, 50, 350);
                System.out.println(temp);
            }
        };
        hitButton.addActionListener(buttonListener);
    } 

    public void standButtonAction() {
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Player Stood");
                //action tbd
            }
        };
        standButton.addActionListener(buttonListener);
    }

    public static void pictureArr(String card, int location, int x, int y){
        card += ".png";
        card = "cards/" + card;
        
        JLabel[] pictures=new JLabel[10];
        
        Container c = frame.getContentPane();
        pictures[location].setIcon(new ImageIcon(card));
        Dimension size = pictures[location].getPreferredSize();
        pictures[location].setBounds(x, y, size.width, size.height);
        c.add(pictures[location]);
        SwingUtilities.updateComponentTreeUI(frame);
    }

    public static void showCard(String card, int x, int y) {
        //formats the card so that it can be found with resources 
        card += ".png";
        card = "cards/" + card;

        //adding the image to the frame
        Container c = frame.getContentPane();
        cardImage.setIcon(new ImageIcon(card));
        Dimension size = cardImage.getPreferredSize();
        cardImage.setBounds(x, y, size.width, size.height);
        c.add(cardImage);
        SwingUtilities.updateComponentTreeUI(frame); //Refresh the frame
    }

    public static void createDeck() {   
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
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
        int ranFace = (int)(Math.random() * 13);

        //makes sure that the card has not already been drawn
        while((deck[ranSuit][ranFace] >= 100)) {
            ranSuit = (int)(Math.random() * 4);
            ranFace = (int)(Math.random() * 13);
        }
        
        //shows that the card has been played
        deck[ranSuit][ranFace] = 100;
        //makes the card name so that it can be displayed with the card images
        cardDrawn = ranSuit + "_" + ranFace;

        //debug
        /*
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print(deck[i][j] + " ");
            }
            System.out.println();
        } */

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