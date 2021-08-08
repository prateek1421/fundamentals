package designpatterns.structural.adapter;

public class Nokia implements Phone {
    Phone phone;
    @Override
    public void playGames(GameType gameType) {
    if(gameType == GameType.BASIC) {
        System.out.println("playing :"+gameType);
    } else if (gameType == GameType.GRAPHICAL) {
        phone = new PhoneAdapter();
        phone.playGames(gameType);
    }
    }
}
