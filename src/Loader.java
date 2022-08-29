
public class Loader
{
    public static void main(String[] args)
    {
        Cat fedya = new Cat();
        System.out.println("Fedya weight:" + fedya.getWeight());
        fedya.meow();
        System.out.println("Fedya weight:" + fedya.getWeight());

        System.out.println(fedya.getStatus());

        Cat vasya = new Cat();
        System.out.println("Vasya weight:" + vasya.getWeight());
        vasya.feed(200.8);
        System.out.println("Vasya weight:" + vasya.getWeight());
        System.out.println(vasya.getStatus());

        Cat seroga = new Cat();
        System.out.println("Seroga weight:" + seroga.getWeight());
        seroga.drink(456.77);
        System.out.println("Seroga weight:" + seroga.getWeight());
        System.out.println(seroga.getStatus());

    }
}