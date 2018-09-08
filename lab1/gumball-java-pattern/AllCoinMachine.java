
public class AllCoinMachine extends GumballMachine  {
	int insertedCoin = 0;

	public AllCoinMachine(int numberGumballs) {
		super(numberGumballs);
	}
	
	public void insertQuarter() {
		insertedCoin += 25;
		System.out.println("You inserted a quarter");
		Util.checkState(insertedCoin, state);
	}
	
	public void insertDime() {
		insertedCoin += 10;
		System.out.println("You inserted a dime");
		Util.checkState(insertedCoin, state);
	}
	
	public void insertNickel() {
		insertedCoin += 5;
		System.out.println("You inserted a nickel");
		Util.checkState(insertedCoin, state);
	}
	
}
