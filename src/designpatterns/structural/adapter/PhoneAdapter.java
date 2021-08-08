package designpatterns.structural.adapter;

public class PhoneAdapter implements Phone {
    SmartPhone smartPhone;
    @Override
    public void playGames(GameType gameType) {
        smartPhone = new Oneplus();
        smartPhone.playGames(gameType);
    }
}
