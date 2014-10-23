package rainbowrevenge.cards;

import java.io.IOException;

interface CardList {
    Card getCard(int serial);
    String getCategory(int n);
    void loadCardData() throws IOException;
}
