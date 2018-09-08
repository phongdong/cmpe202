
public class TwoQuatersMachine extends GumballMachine {
	int insertedQuarters = 0;

	public TwoQuatersMachine(int numberGumballs) {
		super(numberGumballs);
	}
	
	public void insertQuarter() {
		insertedQuarters += 25;
		Util.checkState(insertedQuarters, state);
	}
	
}
