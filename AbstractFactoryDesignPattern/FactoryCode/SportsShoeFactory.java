package AbstractFactoryDesignPattern.FactoryCode;

import AbstractFactoryDesignPattern.ShoeLace.RoundShoeLace;
import AbstractFactoryDesignPattern.ShoeLace.ShoeLace;
import AbstractFactoryDesignPattern.Sole.BumpySole;
import AbstractFactoryDesignPattern.Sole.Sole;

public class SportsShoeFactory implements ShoeFactory {

    @Override
    public Sole createShoeSole() {
        return new BumpySole();
    }

    @Override
    public ShoeLace createShoeLace() {
        return new RoundShoeLace();
    }
    
}
