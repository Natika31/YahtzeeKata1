
public class Fives extends Category {

	@Override
	public int compute(int[] roll) {
		return countOccForOneValue(roll,5)*5;
	}

	@Override
	public boolean isValid(int[] roll) {
		return countOccForOneValue(roll,5) != 0;
	}

}
