
public class Client {
    public static void main(String[] args) {
        Hybridcar hybridcar = new Hybridcar();
        
        ElectricMode electric = new ElectricMode();
        electric.doAction(hybridcar);
        
        System.out.println(hybridcar.getState());
        
        GasMode gas = new GasMode();
        gas.doAction(hybridcar);
        
        System.out.println(hybridcar.getState());
    }
}