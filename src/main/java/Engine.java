public class Engine extends Component{
    private String engineType;

    public Engine(String name, String engineType){
        super(name);
        this.engineType=engineType;
    }

    public String getEngineType() {
        return engineType;
    }
}
