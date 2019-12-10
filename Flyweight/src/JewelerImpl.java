
public class JewelerImpl implements Jeweler {
    private String name;
    private String gem;

    public JewelerImpl(String name) {
        this.name = name;
    }
    
    public void setGem(String gem) {
        this.gem = gem;
    }
    
    @Override
    public void Cutgem() {
        System.out.println(name + " is cutting " + gem + " !");
    }
}