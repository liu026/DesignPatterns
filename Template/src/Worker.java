
abstract class Worker {
	public void getUp()
	{
		System.out.println("Worker gets up from bed.");
	}
	public void goToWork()
	{
		System.out.println("Worker goes to work.");
	}
	public abstract void Work();
	
	public void ReturnHome()
	{
		System.out.println("Worker goes back home.");
	}
	
	public final void DailyRoutine(){
		getUp();
		goToWork();
		Work();
		ReturnHome();
	}	
}
