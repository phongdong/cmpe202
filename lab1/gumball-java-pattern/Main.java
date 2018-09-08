

public class Main {

	public static void main(String[] args) {
		/*
		GumballMachine gumballMachine = new GumballMachine(5);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
		*/
		
		/*
		GumballMachine twoQuarterMachine = new TwoQuatersMachine(5);
		System.out.println(twoQuarterMachine);
		
		
		twoQuarterMachine.insertQuarter();
		//twoQuarterMachine.insertQuarter();
		twoQuarterMachine.turnCrank();
		
		twoQuarterMachine.insertQuarter();
		twoQuarterMachine.turnCrank();
		*/
		
		
		
		//twoQuarterMachine.insertQuarter();
		AllCoinMachine allGB = new AllCoinMachine(5);
		System.out.println(allGB);
		
		allGB.insertDime();
		allGB.turnCrank();
		allGB.insertDime();
		allGB.insertDime();
		allGB.insertDime();
		allGB.insertDime();
		allGB.insertDime();
		
		allGB.insertQuarter();
		allGB.insertQuarter();
		
		allGB.turnCrank();
		
		
		
		
	}
}
