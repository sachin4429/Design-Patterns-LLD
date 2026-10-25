package AbstractFactoryDesignPattern;

import AbstractFactoryDesignPattern.FactoryCode.CasualShoeFactory;
import AbstractFactoryDesignPattern.FactoryCode.FormalShoeFactory;
import AbstractFactoryDesignPattern.FactoryCode.ShoeFactory;
import AbstractFactoryDesignPattern.FactoryCode.SportsShoeFactory;

public class ShoeFactoryMaker {
    
    static ShoeFactory shoeFactory;

    public static Shoe produceShoe(String shoeType)
    {
        if(shoeType.equals("Formal"))
        {
            shoeFactory = new FormalShoeFactory();
        }
        if(shoeType.equals("Sports"))
        {
            shoeFactory = new SportsShoeFactory();
        }
        if(shoeType.equals("Casual"))
        {
            shoeFactory = new CasualShoeFactory();
        }
        return new Shoe(shoeFactory.createShoeSole(), shoeFactory.createShoeLace());

    }

    public static void main(String[] args) {
        Shoe formalShoe = produceShoe("Formal");
        Shoe sportsShoe = produceShoe("Sports");
        Shoe casualShoe = produceShoe("Casual");

        System.out.println("Formal");
        formalShoe.displayBuildShoe();
        System.out.println("Sports");
        sportsShoe.displayBuildShoe();
        System.out.println("Casual");
        casualShoe.displayBuildShoe();
    }

}
