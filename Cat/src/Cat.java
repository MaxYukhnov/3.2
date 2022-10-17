
public class Cat
{
    public static final int EYES_NUMBER = 2;
    public static final int MIN_WEIGHT = 1000;
    public static final int MAX_WEIGHT = 100000;



    public static int count = 0;


    private double originWeight;
    private double weight;

    private String name;

    private double food;

    private double minWeight;
    private double maxWeight;

    private String colorType;

        public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
         while(getStatus() == "Dead")
        {
            System.out.println("Cat is Dead");
            break;
        }
        if (getStatus() != "Dead" || getStatus() != "Exploded") {
            count++;}
        else {
            count --;}

    }

    public Cat(double weight, String colorType){
            this();
            this.weight = weight;
            this.colorType = colorType;

            }

    public void setColorType(String colorType) {
            this.colorType = colorType;
    }
    public String getColorType() {
        return colorType;
    }
    public void setName(String name){
            this.name = name;
    }
    public String getName() {
            return name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public void meow()
                            {

        weight = weight - 1;
        System.out.println("Meow");
    }

    public void setColorType(ColorType type){
            this.colorType = colorType;
    }

    public static int getCount()
    {
        return count;
            }

    public void pee()
                {
        weight = weight -2;
        System.out.println("Pee");
    }

        public void feed(Double amount)
                {
        food = amount;
        weight = weight + food;
    }


    public void drink(Double amount)
                {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public Double getFood() {return food;}

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if (weight > minWeight){
            return "Alive";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }

    }


}