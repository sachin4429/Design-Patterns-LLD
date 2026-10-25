package AbstractFactoryDesignPattern.FactoryCode;

import AbstractFactoryDesignPattern.ShoeLace.RoundShoeLace;
import AbstractFactoryDesignPattern.ShoeLace.ShoeLace;
import AbstractFactoryDesignPattern.Sole.FlatSole;
import AbstractFactoryDesignPattern.Sole.Sole;

public class FormalShoeFactory implements ShoeFactory {

    @Override
    public Sole createShoeSole() {
        return new FlatSole();
     }

    @Override
    public ShoeLace createShoeLace() {
        return new RoundShoeLace();
    }
    
}