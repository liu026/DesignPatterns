public class Jeweler {
    private Gem ruby;
    private Gem emerald;
    private Gem sapphire;
    
    public Jeweler() {
        ruby = new Ruby();
        emerald = new Emerald();
        sapphire = new Sapphire();
    }
    
    public void cutRuby() {
        ruby.cut();
    }
    
    public void cutEmerald() {
        emerald.cut();
    }
    
    public void cutSapphire() {
        sapphire.cut();
    }
}