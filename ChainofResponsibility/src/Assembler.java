public class Assembler extends Employee {
    
    public Assembler(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    @Override
    protected void write(String message) {
        System.out.println("all parts have been put togeher " + message);
    }
}