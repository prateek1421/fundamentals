package designpatterns.structural.decorator;

public class DecoratorDemo {

    public static void main(String[] args) {
        ChristmasTree tree = new ChristmasTreeImpl();
        System.out.println(tree.decorate());

        ChristmasTree treeGarland = new Garland(new ChristmasTreeImpl());
        System.out.println(treeGarland.decorate());

    }
}
