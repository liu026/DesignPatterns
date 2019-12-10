public class GasMode implements State {

    @Override
    public void doAction(Hybridcar hybridcar) {
        System.out.println("The car is in gas mode ");
        hybridcar.setState(this);
    }
    public String toString() {
        return "Now the car is using gasoline to power the engine!";
    }
}