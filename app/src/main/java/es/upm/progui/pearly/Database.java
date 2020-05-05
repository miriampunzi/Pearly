package es.upm.progui.pearly;

public class Database {

    public static Game[] GAMES_CREATED = new Game[] {
        new Game("Briscola 2.0", R.drawable.briscola),
        new Game("CAH - class version", R.drawable.cah),
        new Game("UNO for color blinds", R.drawable.uno),
    };

    public static Game[] GAMES_FAVORITES = new Game[] {
        new Game("UNO", R.drawable.uno),
        new Game("Cards Against Humanity", R.drawable.cah),
        new Game("D&D", R.drawable.d_and_d),
        new Game("Bisca", R.drawable.bisca),
        new Game("Catan", R.drawable.catan),
        new Game("Exploding kittens", R.drawable.exploding_kittens),
        new Game("Scala 40", R.drawable.scala40),
        new Game("Briscola", R.drawable.briscola),
    };

    public static Game[] GAMES_TOP_10 = new Game[] {
        new Game("Risiko", R.drawable.risiko),
        new Game("Taboo", R.drawable.taboo),
        new Game("Zombicide", R.drawable.zombicide),
        new Game("Monopoly", R.drawable.monopoly),
        new Game("Cluedo", R.drawable.cluedo),
        new Game("Briscola", R.drawable.briscola),
        new Game("UNO", R.drawable.uno),
        new Game("Cards Against Humanity", R.drawable.cah),
        new Game("D&D", R.drawable.d_and_d),
        new Game("Trivial Pursuit", R.drawable.trivial_pursuit)
    };

    public static Game[] GAME_CLASSIC = new Game[] {
        new Game("Chess", R.drawable.chess),
        new Game("Cluedo", R.drawable.cluedo),
        new Game("Monopoly", R.drawable.monopoly),
        new Game("Poker", R.drawable.poker),
        new Game("Risiko", R.drawable.risiko),
        new Game("Solitarie", R.drawable.solitaire),
        new Game("UNO", R.drawable.uno),
        new Game("Othello", R.drawable.othello),
    };

    public static Game[] GAMES_SOLITARY = new Game[] {
        new Game("Bridge", R.drawable.bridge),
        new Game("Canfield", R.drawable.canfield),
        new Game("Freecell", R.drawable.freecell),
        new Game("Golf", R.drawable.golf),
        new Game("Pyramid", R.drawable.pyramid),
        new Game("Solitarie", R.drawable.solitaire),
        new Game("Spider", R.drawable.spider)
    };
}
