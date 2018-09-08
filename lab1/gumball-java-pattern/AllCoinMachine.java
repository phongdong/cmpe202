
public class AllCoinMachine extends GumballMachine  {
	int insertedCoin = 0;

	public AllCoinMachine(int numberGumballs) {
		super(numberGumballs);
	}
	
	public void insertQuarter() {
		insertedCoin += 25;
		Util.checkState(insertedCoin, state);
	}
	
	public void insertDime() {
		insertedCoin += 10;
		Util.checkState(insertedCoin, state);
	}
	
	public void insertNicel() {
		insertedCoin += 5;
		Util.checkState(insertedCoin, state);
	}
	
}
