package es.upm.progui.pearly.database;

import java.util.ArrayList;

import es.upm.progui.pearly.R;
import es.upm.progui.pearly.entities.Card_UNO;
import es.upm.progui.pearly.entities.Game;

public class Database {

    public static ArrayList<Game> GAMES_CREATED = new ArrayList<Game>()  {{
        add(new Game("Briscola 2.0", R.drawable.briscola));
        add(new Game("CAH - class version", R.drawable.cah));
        add(new Game("UNO for color blinds", R.drawable.uno));
    }};

    public static ArrayList<Game> GAMES_FAVORITES = new ArrayList<Game>() {{
        add(new Game("UNO", R.drawable.uno));
        add(new Game("D&D", R.drawable.d_and_d));
        add(new Game("Bisca", R.drawable.bisca));
        add(new Game("Catan", R.drawable.catan));
        add(new Game("Exploding kittens", R.drawable.exploding_kittens));
        add(new Game("Scala 40", R.drawable.scala40));
        add(new Game("Briscola", R.drawable.briscola));
        add(new Game("Cards Against Humanity", R.drawable.cah));
    }};

    public static ArrayList<Game> GAMES_TOP_10 = new ArrayList<Game>() {{
        add(new Game("Risiko", R.drawable.risiko));
        add(new Game("Taboo", R.drawable.taboo));
        add(new Game("Zombicide", R.drawable.zombicide));
        add(new Game("Cluedo", R.drawable.cluedo));
        add(new Game("Trivial Pursuit", R.drawable.trivial_pursuit));
        add(new Game("Monopoly", R.drawable.monopoly));
        add(new Game("Briscola", R.drawable.briscola));
        add(new Game("UNO", R.drawable.uno));
        add(new Game("Cards Against Humanity", R.drawable.cah));
        add(new Game("D&D", R.drawable.d_and_d));
    }};

    public static ArrayList<Game> GAME_CLASSIC = new ArrayList<Game>() {{
        add(new Game("Chess", R.drawable.chess));
        add(new Game("Cluedo", R.drawable.cluedo));
        add(new Game("Monopoly", R.drawable.monopoly));
        add(new Game("Poker", R.drawable.poker));
        add(new Game("Risiko", R.drawable.risiko));
        add(new Game("Othello", R.drawable.othello));
        add(new Game("Solitarie", R.drawable.solitaire));
        add(new Game("UNO", R.drawable.uno));
    }};

    public static ArrayList<Game> GAMES_SOLITARY = new ArrayList<Game>() {{
        add(new Game("Bridge", R.drawable.bridge));
        add(new Game("Canfield", R.drawable.canfield));
        add(new Game("Freecell", R.drawable.freecell));
        add(new Game("Golf", R.drawable.golf));
        add(new Game("Pyramid", R.drawable.pyramid));
        add(new Game("Solitarie", R.drawable.solitaire));
        add(new Game("Spider", R.drawable.spider));
    }};

    public static ArrayList<Card_UNO> UNO_CARDS = new ArrayList<Card_UNO>() {{
        add(new Card_UNO(R.drawable.add_card, null, false, -1, null, null, null));

        add(new Card_UNO(R.drawable.uno_card_wildchange, "Whild Change", false, -1, "DRAW 4", "BLACK", null));
        add(new Card_UNO(R.drawable.uno_card_wilddraw4, "Wild Draw 4", false, -1, "CHANGE", "BLACK", null));

        add(new Card_UNO(R.drawable.uno_card_blue0, "Blue 0", true, 0, null, "BLUE", null));
        add(new Card_UNO(R.drawable.uno_card_blue1, "Blue 1", true, 1, null, "BLUE", null));
        add(new Card_UNO(R.drawable.uno_card_blue2, "Blue 2", true, 2, null, "BLUE", null));
        add(new Card_UNO(R.drawable.uno_card_blue3, "Blue 3", true, 3, null, "BLUE", null));
        add(new Card_UNO(R.drawable.uno_card_blue4, "Blue 4", true, 4, null, "BLUE", null));
        add(new Card_UNO(R.drawable.uno_card_blue5, "Blue 5", true, 5, null, "BLUE", null));
        add(new Card_UNO(R.drawable.uno_card_blue6, "Blue 6", true, 6, null, "BLUE", null));
        add(new Card_UNO(R.drawable.uno_card_blue7, "Blue 7", true, 7, null, "BLUE", null));
        add(new Card_UNO(R.drawable.uno_card_blue8, "Blue 8", true, 8, null, "BLUE", null));
        add(new Card_UNO(R.drawable.uno_card_blue9, "Blue 9", true, 9, null, "BLUE", null));
        add(new Card_UNO(R.drawable.uno_card_bluedraw2, "Blue Draw 2", false, -1, "DRAW 2", "BLUE", null));
        add(new Card_UNO(R.drawable.uno_card_bluereverse, "Blue Reverse", false, -1, "REVERSE", "BLUE", null));
        add(new Card_UNO(R.drawable.uno_card_blueskip, "Blue Skip", false, -1, "SKIP", "BLUE", null));

        add(new Card_UNO(R.drawable.uno_card_red0, "Red 0", true, 0, null, "RED", null));
        add(new Card_UNO(R.drawable.uno_card_red1, "Red 1", true, 1, null, "RED", null));
        add(new Card_UNO(R.drawable.uno_card_red2, "Red 2", true, 2, null, "RED", null));
        add(new Card_UNO(R.drawable.uno_card_red3, "Red 3", true, 3, null, "RED", null));
        add(new Card_UNO(R.drawable.uno_card_red4, "Red 4", true, 4, null, "RED", null));
        add(new Card_UNO(R.drawable.uno_card_red5, "Red 5", true, 5, null, "RED", null));
        add(new Card_UNO(R.drawable.uno_card_red6, "Red 6", true, 6, null, "RED", null));
        add(new Card_UNO(R.drawable.uno_card_red7, "Red 7", true, 7, null, "RED", null));
        add(new Card_UNO(R.drawable.uno_card_red8, "Red 8", true, 8, null, "RED", null));
        add(new Card_UNO(R.drawable.uno_card_red9, "Red 9", true, 9, null, "RED", null));
        add(new Card_UNO(R.drawable.uno_card_reddraw2, "Red Draw 2", false, -1, "DRAW 2", "RED", null));
        add(new Card_UNO(R.drawable.uno_card_redreverse, "Red Reverse", false, -1, "REVERSE", "RED", null));
        add(new Card_UNO(R.drawable.uno_card_redskip, "Red Skip", false, -1, "SKIP", "RED", null));

        add(new Card_UNO(R.drawable.uno_card_yellow0, "Yellow 0", true, 0, null, "YELLOW", null));
        add(new Card_UNO(R.drawable.uno_card_yellow1, "Yellow 1", true, 1, null, "YELLOW", null));
        add(new Card_UNO(R.drawable.uno_card_yellow2, "Yellow 2", true, 2, null, "YELLOW", null));
        add(new Card_UNO(R.drawable.uno_card_yellow3, "Yellow 3", true, 3, null, "YELLOW", null));
        add(new Card_UNO(R.drawable.uno_card_yellow4, "Yellow 4", true, 4, null, "YELLOW", null));
        add(new Card_UNO(R.drawable.uno_card_yellow5, "Yellow 5", true, 5, null, "YELLOW", null));
        add(new Card_UNO(R.drawable.uno_card_yellow6, "Yellow 6", true, 6, null, "YELLOW", null));
        add(new Card_UNO(R.drawable.uno_card_yellow7, "Yellow 7", true, 7, null, "YELLOW", null));
        add(new Card_UNO(R.drawable.uno_card_yellow8, "Yellow 8", true, 8, null, "YELLOW", null));
        add(new Card_UNO(R.drawable.uno_card_yellow9, "Yellow 9", true, 9, null, "YELLOW", null));
        add(new Card_UNO(R.drawable.uno_card_yellowdraw2, "Yellow Draw 2", false, -1, "DRAW 2", "YELLOW", null));
        add(new Card_UNO(R.drawable.uno_card_yellowreverse, "Yellow Reverse", false, -1, "REVERSE", "YELLOW", null));
        add(new Card_UNO(R.drawable.uno_card_yellowskip, "Yellow Skip", false, -1, "SKIP", "YELLOW", null));

        add(new Card_UNO(R.drawable.uno_card_green0, "Green 0", true, 0, null, "GREEN", null));
        add(new Card_UNO(R.drawable.uno_card_green1, "Green 1", true, 1, null, "GREEN", null));
        add(new Card_UNO(R.drawable.uno_card_green2, "Green 2", true, 2, null, "GREEN", null));
        add(new Card_UNO(R.drawable.uno_card_green3, "Green 3", true, 3, null, "GREEN", null));
        add(new Card_UNO(R.drawable.uno_card_green4, "Green 4", true, 4, null, "GREEN", null));
        add(new Card_UNO(R.drawable.uno_card_green5, "Green 5", true, 5, null, "GREEN", null));
        add(new Card_UNO(R.drawable.uno_card_green6, "Green 6", true, 6, null, "GREEN", null));
        add(new Card_UNO(R.drawable.uno_card_green7, "Green 7", true, 7, null, "GREEN", null));
        add(new Card_UNO(R.drawable.uno_card_green8, "Green 8", true, 8, null, "GREEN", null));
        add(new Card_UNO(R.drawable.uno_card_green9, "Green 9", true, 9, null, "GREEN", null));
        add(new Card_UNO(R.drawable.uno_card_greendraw2, "Green Draw 2", false, -1, "DRAW 2", "GREEN", null));
        add(new Card_UNO(R.drawable.uno_card_greenreverse, "Green Reverse", false, -1, "REVERSE", "GREEN", null));
        add(new Card_UNO(R.drawable.uno_card_greenskip, "Green Skip", false, -1, "SKIP", "GREEN", null));
    }};
}
