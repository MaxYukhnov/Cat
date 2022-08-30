
public class Loader
{
    public static void main(String[] args)
    {
        Cat murka = new Cat();
        System.out.println(murka.getWeight());
        murka.feed(150.0);
        System.out.println(murka.getWeight());
        murka.pee();
        murka.pee();
        murka.pee();
        murka.pee();
        System.out.println(murka.getWeight());
        System.out.println("Мурка съела" + murka.getFood());






       /* Cat fedya = new Cat();
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

        System.out.println(seroga.getStatus()); */

    }
}