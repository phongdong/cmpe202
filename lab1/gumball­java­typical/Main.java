

public class Main {

	public static void main(String[] args) {
		/*
		GumballMachine gumballMachine = new GumballMachine(5,"Quarters");

		System.out.println(gumballMachine);
		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();
		*/
		
		/*
		GumballMachine gumballMachine = new GumballMachine(5,"TwoQuarters");
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter(25);
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter(25);
		gumballMachine.insertQuarter(25);
		gumballMachine.insertQuarter(25);

		gumballMachine.turnCrank();
		gumballMachine.turnCrank();
		*/
		
		GumballMachine gumballMachine = new GumballMachine(5,"AllCoins");
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter(10);
		gumballMachine.insertQuarter(5);
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter(10);
		gumballMachine.insertQuarter(25);
		gumballMachine.insertQuarter(10);
		
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter(10);
		gumballMachine.insertQuarter(10);
		gumballMachine.insertQuarter(10);
		gumballMachine.insertQuarter(10);
		gumballMachine.turnCrank();

		

		

		
	}
}
