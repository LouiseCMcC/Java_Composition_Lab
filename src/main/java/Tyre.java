public class Tyre extends Component{
    private String size;
    public Tyre(String name, String size){
        super(name);
        this.size=size;
    }

    public String getSize() {
        return size;
    }
}
