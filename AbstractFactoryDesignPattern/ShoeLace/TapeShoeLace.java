package AbstractFactoryDesignPattern.ShoeLace;

public class TapeShoeLace implements ShoeLace{

    @Override
    public String shoeLaceBuild() {
        return "Tape";
    }

    @Override
    public String shoeLaceMaterial() {
       return "Polyester";
    }
    
}