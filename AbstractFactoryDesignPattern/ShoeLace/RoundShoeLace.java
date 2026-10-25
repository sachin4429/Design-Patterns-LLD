package AbstractFactoryDesignPattern.ShoeLace;

public class RoundShoeLace implements ShoeLace{

    @Override
    public String shoeLaceBuild() {
        return "Round";
    }

    @Override
    public String shoeLaceMaterial() {
       return "Cotton";
    }
    
}
