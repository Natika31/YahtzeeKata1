
public class Sixes extends Category {

	@Override
	public int compute(int[] roll) {
		return countOccForOneValue(roll,6)*6;
	}

	@Override
	public boolean isValid(int[] roll) {
		return countOccForOneValue(roll,6) != 0;
	}

}
