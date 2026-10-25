package AbstractFactoryDesignPattern.FactoryCode;

import AbstractFactoryDesignPattern.ShoeLace.ShoeLace;
import AbstractFactoryDesignPattern.ShoeLace.TapeShoeLace;
import AbstractFactoryDesignPattern.Sole.Sole;
import AbstractFactoryDesignPattern.Sole.ThinSole;

public class CasualShoeFactory implements ShoeFactory{

    @Override
    public Sole createShoeSole() {
        return new ThinSole();
    }

    @Override
    public ShoeLace createShoeLace() {
        return new TapeShoeLace();
    }
    
}
