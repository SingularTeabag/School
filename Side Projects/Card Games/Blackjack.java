import java.util.Scanner;
import java.text.DecimalFormat;
public class Blackjack
{
    static int playerMoney = 100;
    static int playerBet;
    static int cardValue = 0;
    static int cardWorth;
    static int numCardSuit = 0;
    static int playerHandValue = 0;
    static int dealerHandValue = 0;
    static String cardPlayed;
    static String cardSuit;
    static String cardFace;
    static int cardValues = 0;
    static String dealerWin = "false";
    static String isActive = "T";
    static String dealerTurn= "F";
    
    static int cardX;
    static int cardY;
    static String card;
    static String playerAction = "";
    
    static String[][] arrCards = new String[4][13];
    static String[][] arrCardPlayed = new String[100][100];
    
    static Scanner input = new Scanner(System.in);
    static DecimalFormat currency = new DecimalFormat("$,##0.00");
    public static void main(String[] args)
    {
        
        //Hearts, Diamonds, Clubs, Spades
        //-2147483648 to 2147483647
        
        
        System.out.println("----------------Blackjack----------------\n");
        createDeck();
        while(isActive.equals("T")) {
            startGame();
        }
        System.out.println("main");
    }
    
    public static void startGame() {
        System.out.println("\n-----------------------------------------\n\nYou have " + currency.format(playerMoney));
        
        bet();
        
        playerHandValue = 0;
        dealerHandValue = 0;
        playerAction = "";
        
        System.out.println("\nYour hand: ");
        cardDraw(2);
        playerHandValue = cardValues;
        System.out.println("\nYour hand is worth " + playerHandValue);
        checkHand();
        
        System.out.println("\n\nDealers Hand:");
        cardDraw(1);
        dealerHandValue = cardValues;
        System.out.println("\nThe dealers had is worth " + dealerHandValue);
        
        
        while(playerHandValue < 21 && !(playerAction.equals("Stand") || playerAction.equals("stand"))) {
            System.out.print("\nHit or Stand? ");
            playerAction = input.next();
            nextAction();
        }
        dealerAction();
        rules();
    }
    
    
    
    public static void bet() {
        playerBet = 0;
        System.out.print("How much will you bet? ");
        playerBet = input.nextInt();
        
        
        
        if(playerMoney == 0){
            System.out.println("You have no more money but ok.");
        }
        else if (playerMoney < -1000000) {
            System.out.println("You are in severe amounts of debt.");
        }
        else if (playerMoney < playerBet) {
            System.out.println("That's more money than you have, be careful.");
        }
        else if (playerBet < 0) {
            System.out.println("Nice try");
            bet();
        }
    }
    
    public static void dealerAction() {
        dealerWin = "false";
        dealerTurn = "T";
        while(dealerWin.equals("false")) {
            while((dealerHandValue < playerHandValue) ){
                cardDraw(1);
                dealerHandValue = dealerHandValue + cardValues;
            }
            dealerWin = "true";
            System.out.println("\nThe dealers hand is now worth " + dealerHandValue);
        }
    }
    
    public static void createDeck() {
        for (int i=0; i<arrCards.length; i++) {
            //System.out.println();
            cardValue = 0;
            numCardSuit = numCardSuit + 1;
            
            if(numCardSuit == 1) {
                cardSuit = " of Hearts";
            }
            else if(numCardSuit == 2 ) {
                cardSuit = " of Diamonds";
            }
            else if(numCardSuit == 3) {
                cardSuit = " of Clubs";
            }
            else {
                cardSuit = " of Spades";
            }
            for(int j=0; j<arrCards[i].length; j++) {
                cardValue = cardValue + 1;
                
                if(cardValue == 1) {
                    cardFace = "Ace";
                }
                else if (cardValue == 11) {
                    cardFace = "Jack";
                }
                else if (cardValue == 12) {
                    cardFace = "Queen";
                }
                else if (cardValue == 13) {
                    cardFace = "King";
                }
                else {
                    cardFace = "" + (cardValue);
                }
                arrCards[i][j] = "" + cardFace + cardSuit;
                //System.out.print(arrCards[i][j] + ", ");
            }
        }
    }
    
    
    
    public static void cardDraw(int amount) {
        int loop = 0;
        cardValues = 0;
        
        while(!(loop == amount)) 
        {
            cardX = (int)(Math.random() * 13);
            cardY = (int)(Math.random() * 4);
            if(arrCards[cardY][cardX].equals("")){
                cardX = (int)(Math.random() * 13);
                cardY = (int)(Math.random() * 4);
            }
            
            arrCardPlayed[0][0] = arrCards[cardY][cardX];
            
            System.out.print(arrCards[cardY][cardX] + "   ");
            arrCards[cardY][cardX] = "";
            loop = loop + 1;
            
            if(cardX > 9){
                cardWorth = 10;
            }
            else {
                cardWorth = cardX + 1;
            }
            cardValues = cardValues + cardWorth;
            
        }
    }
    
    
    
    public static void nextAction(){
        if(playerAction.contains("Exit") || playerAction.contains("exit")) {
            System.exit(0);
        }
        else if (playerAction.contains("Hit") || playerAction.contains("hit")) {
            cardDraw(1);
            playerHandValue = playerHandValue + cardValues;
            System.out.println("\nYour hand is now worth " + playerHandValue);
            rules();
        }
        else if (playerAction.contains("Stand") || playerAction.contains("stand")) {
            
        }
        else {
            System.out.println("Error");
        }
    }
    
    
    
    public static void rules() {
        if(dealerHandValue > 21) {
            System.out.println("\nDealer Bust!\nYou Win!");
            playerMoney = playerMoney + (playerBet * 2);
            System.out.println("\nYou now have " + currency.format(playerMoney));
            playerContinue();
        }
        else if(playerHandValue > 21) {
            System.out.println("\nPlayer Bust! \nUnfortunatly you just lost " + currency.format(playerBet));
            playerMoney = playerMoney - playerBet;
            System.out.println("\nYou now have " + currency.format(playerMoney));
            playerContinue();
        }
        else if((dealerHandValue > playerHandValue) && dealerTurn.equals("T")) {
            System.out.println("\nDealer Wins! \nUnfortunatly you just lost " + currency.format(playerBet));
            playerMoney = playerMoney - playerBet;
            System.out.println("\nYou now have " + currency.format(playerMoney));
            playerContinue();
        }
        else if(playerHandValue == 21 && !(dealerHandValue == 21)) {
            System.out.println("\nBlackjack! \nCongrats you just won " + (currency.format(playerBet * 2)));
            playerMoney = playerMoney + (playerBet * 2);
            System.out.println("\nYou now have " + currency.format(playerMoney));
            playerContinue();
        }
        else if(playerHandValue == dealerHandValue) {
            System.out.println("\nPushback! \n");
            System.out.println("\nYou still have " + currency.format(playerMoney));
            playerContinue();
        }
    }
    
    
    
    public static void playerContinue() {
        String action;
        
        System.out.print("Would you like to continue? ");
        action = input.next();
        
        if(action.equals("Yes") || action.equals("yes") || action.equals("Y") || action.equals("y")) {
            createDeck();
            startGame();
        }
        else if(action.equals("No") || action.equals("no") || action.equals("N") || action.equals("n")) {
            isActive = "N";
            System.exit(0);
        }
        else {
            System.out.println("Error");
            playerContinue();
        }
    }
    
    public static void checkHand() {
        if(playerHandValue == 21) {
            System.out.println("\nBlackjack! \nCongrats you just won " + (currency.format(playerBet * 2)));
            playerMoney = playerMoney + (playerBet * 2);
            System.out.println("\nYou now have " + currency.format(playerMoney));
            playerContinue();
        }
        else if(dealerHandValue == 21) {
            System.out.println("\nDealer blackjack! \nUnfortunatly you just lost " + currency.format(playerBet));
            playerMoney = playerMoney - playerBet;
            System.out.println("\nYou now have " + currency.format(playerMoney));
            playerContinue();
        }
    }
}