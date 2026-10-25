package AbstractFactoryDesignPattern.FactoryCode;

import AbstractFactoryDesignPattern.ShoeLace.ShoeLace;
import AbstractFactoryDesignPattern.Sole.Sole;

public interface ShoeFactory {

    public Sole createShoeSole();

    public ShoeLace createShoeLace();
}
