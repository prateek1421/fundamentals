package designpatterns.structural.adapter;

public class Oneplus implements SmartPhone {

   @Override
    public void playGames(GameType gameType) {
        System.out.println("playing :"+gameType);
    }
}
