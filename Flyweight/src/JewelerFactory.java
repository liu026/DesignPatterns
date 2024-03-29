import java.util.HashMap;

public class JewelerFactory {
    private static final HashMap jewelers = new HashMap();
    
    public static Jeweler getJeweler(String name) {
        JewelerImpl jewelerImpl = (JewelerImpl)jewelers.get(name);
            if(jewelerImpl == null) {
                jewelerImpl = new JewelerImpl(name);
                jewelers.put(name, jewelerImpl);
                System.out.println("A new jewler " + name + " comes to work!");
            }
         return jewelerImpl;
    }
}