package AbstractFactoryDesignPattern.Sole;

public class ThinSole implements Sole{

    @Override
    public String soleBuild() {
        return "Thin";
    }

    @Override
    public String soleMaterial() {
        return "Plastic";
    }
    
}
