
public class MySingletonPattern {

	private static MySingletonPattern instance = new MySingletonPattern();
	   
    private MySingletonPattern() {}
    
    public static MySingletonPattern getInstance() {
        return instance;
    }
    
    public void displaymessage() {
        System.out.println("This is the only object!");   
    }
}
