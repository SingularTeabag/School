public class Cards {
    private int[][] cards = new int[4][13];
    private int cardX; // = (int)(Math.random() * 13);
    private int cardY; // = (int)(Math.random() * 4);

    public Cards() {
        createDeck();
    }   
    public void createDeck() {
        for (int i = 0; i < 4; i++) {
            for(int j = 0; j < 13; j++) {
                cards[i][j] = j + 1;
            }
        }
    }
    public int cardsLeft() {
        int count = 0;
        for (int i = 0; i < 4; i++) { 
            for (int j = 0; j < 13; j++) {
                if (cards[i][j] > 0) {
                    count++;
                }
            }
        }
        return count;
    }
    public String drawCard() {
        cardX = (int)(Math.random() * 13);
        cardY = (int)(Math.random() * 4);

        while (cards[cardY][cardX] < 0) {
            System.out.println("Failed");
            cardX = (int)(Math.random() * 13);
            cardY = (int)(Math.random() * 4);
        }
        cards[cardY][cardX] = 0;
        //printDeck();
        return  String.valueOf(cardY)+ "_" + String.valueOf(cardX);
    }
    
    public void printDeck() {
        for (int i = 0; i < 4; i++) { 
            for (int j = 0; j < 13; j++) {
                System.out.print(cards[i][j] + " ");
            }
            System.out.println();
        }
    }
}
