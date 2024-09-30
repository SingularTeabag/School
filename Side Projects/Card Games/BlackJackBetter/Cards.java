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
                cards[i][j] = j;
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
    public String drawCard(String loctaion) {
        cardX = (int)(Math.random() * 13);
        cardY = (int)(Math.random() * 4);
        while (cards[cardX][cardY] > 0) {
            cardX = (int)(Math.random() * 13);
            cardY = (int)(Math.random() * 4);
        }
        cards[cardX][cardY] = 0;
        return 
    }
}
