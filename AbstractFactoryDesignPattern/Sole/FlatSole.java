package AbstractFactoryDesignPattern.Sole;

public class FlatSole implements Sole{

    @Override
    public String soleBuild() {
        return "Flat";
    }

    @Override
    public String soleMaterial() {
        return "Leather";
    }
    
}
