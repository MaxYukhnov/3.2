import java.net.SocketOption;

public class Loader
{
    public static void main(String[] args) {
        Cat cat11 = new Cat(100, "Red");
        Cat cat22= new Cat();
        cat22.setColorType(cat11.getColorType());
        cat22.setWeight(cat11.getWeight());
        System.out.println(cat11.getColorType());
        System.out.println(cat22.getColorType());


        /*Cat cat1 = new Cat();
        cat1.setColorType("Red");

        Cat cat2 = new Cat(cat1.getWeight());
        cat2.setName(cat1.getName());
        cat2.setColorType(cat1.getColorType());
        System.out.println(cat1.getWeight());
        System.out.println(cat1.getColorType());
        System.out.println(cat1.getName());
        System.out.println(cat2.getWeight());
        System.out.println(cat2.getColorType());
        System.out.println(cat2.getName());*/



        Cat fedya = new Cat();
        System.out.println("Fedya weight:" + fedya.getWeight());
        while (fedya.getStatus() != "Dead")
        {
            fedya.meow();
            System.out.println("Fedya weight:" + fedya.getWeight());

                    }
                    System.out.println(fedya.getStatus());



        Cat sasha = new Cat();
        System.out.println("Sasha weight:" + sasha.getWeight());
        while (sasha.getStatus() != "Dead")
        {
            sasha.meow();
            System.out.println("Weight " + sasha.getWeight());
        }
        System.out.println(sasha.getStatus());

       /* while (sasha.getStatus() != "Exploded"){
        sasha.feed(100000000.0);
        System.out.println("Weight " + sasha.getWeight());
        }
        System.out.println(sasha.getStatus());*/

        Cat vasya = new Cat();
        System.out.println(vasya.getWeight());
        vasya.feed(130.05);
        System.out.println(vasya.getWeight());
        vasya.pee();
        vasya.pee();
        vasya.pee();
        System.out.println(vasya.getWeight());
        System.out.println(vasya.getFood());
        System.out.println(vasya.getStatus());

        Cat bobik = new Cat();
        Cat sharik = new Cat();
        Cat tusik = new Cat();
        tusik.setColorType(ColorType.BLUE);

        System.out.println(Cat.getCount());




          }








}