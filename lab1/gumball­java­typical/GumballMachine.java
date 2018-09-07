

public class GumballMachine
{

    private int num_gumballs;
    private boolean has_quarter;
    private static int inserted_coin = 0;
    private static final int   QUARTER = 25;
    private String machine_type;
    //Quarters    
    //TwoQuarters 
    //AllCoins

    public GumballMachine( int size, String machine_type)
    {
        // initialize instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
        this.machine_type = machine_type;
    }

    public void insertQuarter(int coin)
    {
    		System.out.println("Inserting coin...");
    		inserted_coin += coin;
    		switch (machine_type) {
			case "Quarters":
				
				this.has_quarter = coin == QUARTER ? true : false;
				break;
			case "TwoQuarters":
				this.has_quarter = inserted_coin >= 2*QUARTER ? true : false;
				break;
			case "AllCoins":
				this.has_quarter = inserted_coin >= 2*QUARTER ? true : false;
				break;
			default:
				break;
		}
       
    }
    
    public void turnCrank()
    {
	    	if ( this.has_quarter )
	    	{
	    		switch (machine_type) {
				case "Quarters":
					if ( this.num_gumballs > 0 )
			    		{
			    			this.num_gumballs-- ;
			    			this.has_quarter = false ;
			    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
			    		}
			    		else
			    		{
			    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
			    		}
					break;
				case "TwoQuarters":
				case "AllCoins":
					if (this.num_gumballs > 0) {
						this.num_gumballs--;
						inserted_coin -= 2*QUARTER;
						this.has_quarter = inserted_coin >= 2*QUARTER ? true : false;
						System.out.println( "Thanks for your quarters.  Gumball Ejected!" ) ;
					} else {
						System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
					}
				break;

				default:
					break;
				}
	    		
	    	}
	    	else 
	    	{
	    		System.out.println( "Please insert more coin!" ) ;
	    	}        
    }
    public String toString() {
    		return "### This is " + this.machine_type + " Gumball Machine.\n";
    }
}
