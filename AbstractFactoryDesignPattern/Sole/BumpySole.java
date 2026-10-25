package AbstractFactoryDesignPattern.Sole;

public class BumpySole implements Sole{

    @Override
    public String soleBuild() {
        return "Bumpy";
    }

    @Override
    public String soleMaterial() {
        return "Rubber";
    }
    
}
