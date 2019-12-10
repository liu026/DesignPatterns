public class PartCollector extends Employee {
    
    public PartCollector(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    @Override
    protected void write(String message) {
        System.out.println("all parts have been gathered " + message);
    }
}

