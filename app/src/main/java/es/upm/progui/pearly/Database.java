package es.upm.progui.pearly;

public class Database {

    public static Game[] GAMES_CREATED = new Game[] {
        new Game("Briscola 2.0", R.drawable.game_briscola),
        new Game("CAH - class version", R.drawable.game_cards_against_humanity)
    };

    public static Game[] GAMES_FAVORITES = new Game[] {
        new Game("Briscola", R.drawable.game_briscola),
        new Game("UNO", R.drawable.game_uno),
        new Game("Cards Against Humanity", R.drawable.game_cards_against_humanity),
        new Game("D&D", R.drawable.game_d_and_d)
    };

    public static Game[] GAMES_TOP_10 = new Game[] {
        new Game("Risiko", R.drawable.game_risiko),
        new Game("Taboo", R.drawable.game_taboo),
        new Game("Zombicide", R.drawable.game_zombicide),
        new Game("Monopoly", R.drawable.game_monopoly),
        new Game("Briscola", R.drawable.game_briscola),
        new Game("UNO", R.drawable.game_uno),
        new Game("Cards Against Humanity", R.drawable.game_cards_against_humanity),
        new Game("D&D", R.drawable.game_d_and_d)
    };
}
