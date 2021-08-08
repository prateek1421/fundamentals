package designpatterns.structural.adapter;

public class AdapterClient {

    public static void main(String args[]) {
        Phone phone = new Nokia();
        phone.playGames(GameType.GRAPHICAL);
        phone.playGames(GameType.BASIC);
    }
}
