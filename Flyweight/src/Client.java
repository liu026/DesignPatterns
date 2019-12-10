import java.util.Random;

public class Client {
    
    private static final String[] names = {"Mark", "Richard", "Andy", "Daniel"};
    private static final String[] gem = {"Ruby", "Dimond", "Sapphire", "Emerold"};
    
    public static void main(String[] args) {
        for(int i = 0; i < 10; ++i) {
            JewelerImpl jewelerImpl = (JewelerImpl) JewelerFactory.getJeweler(getRandomName());
            jewelerImpl.setGem(getRandomGem());
            jewelerImpl.Cutgem();
        }
    }
    
    private static String getRandomName() {
        int randomName = new Random().nextInt(names.length);
        return names[randomName];
    }
    
    private static String getRandomGem() {
    	int randomGem = new Random().nextInt(gem.length);
        return gem[randomGem];
    }
}