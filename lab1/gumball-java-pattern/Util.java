
public class Util {
	public static void checkState(int insertedCoin, State state) {
		if (insertedCoin == 50)
			state.insertQuarter();
	}
}
