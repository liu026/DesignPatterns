public class Welder extends Employee {
    
    public Welder(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    @Override
    protected void write(String message) {
        System.out.println("all parts have welded together " + message);
    }
}