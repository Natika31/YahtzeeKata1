
public class Threes extends Category {

	@Override
	public int compute(int[] roll) {
		return countOccForOneValue(roll,3)*3;
	}

	@Override
	public boolean isValid(int[] roll) {
		return countOccForOneValue(roll,3) != 0;
	}

}
