
public class Loader
{
    public static void main(String[] args)
    {
        Cat fedya = new Cat();
        while (fedya.getStatus() != "Dead")
        {
            fedya.meow();
            System.out.println("Fedya weight:" + fedya.getWeight());
        }
        System.out.println(fedya.getStatus());

        Cat vasya = new Cat();
        while(vasya.getStatus() != "Exploded")
        {
            vasya.feed(500.0);
            System.out.println("Vasya weight:" + vasya.getWeight());
        }

        System.out.println(vasya.getStatus());

        Cat seroga = new Cat();
        while(seroga.getStatus() != "Exploded")
        {
        seroga.drink(456.77);
        System.out.println("Seroga weight:" + seroga.getWeight());
        }

        System.out.println(seroga.getStatus());

    }
}