package AbstractFactoryDesignPattern;

import AbstractFactoryDesignPattern.ShoeLace.ShoeLace;
import AbstractFactoryDesignPattern.Sole.Sole;

public class Shoe {
    Sole sole;
    ShoeLace shoeLace;

    Shoe(Sole sole, ShoeLace shoeLace)
    {
        this.sole = sole;
        this.shoeLace = shoeLace;
    }

    public void displayBuildShoe()
    {
        System.out.println("Sole Type is: "+ this.sole.soleBuild());
        System.out.println("Sole Material is: "+ this.sole.soleMaterial());
        System.out.println("ShoeLace Type is: "+ this.shoeLace.shoeLaceBuild());
        System.out.println("ShoeLace Material is: "+ this.shoeLace.shoeLaceMaterial());
    }
}
