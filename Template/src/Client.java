
public class Client {

	public static void main(String[] args) {
		Worker mark = new FireFighter();
		mark.DailyRoutine();
		System.out.println();
		Worker richard = new Postman();
		richard.DailyRoutine();		

	}

}
