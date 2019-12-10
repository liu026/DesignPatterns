public class ElectricMode implements State {

    @Override
    public void doAction(Hybridcar hybridcar) {
        System.out.println("The car is in electric mode ");
        hybridcar.setState(this);
    }
    public String toString() {
        return "Now the car is using electic to power the engine!";
    }
}