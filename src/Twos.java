
public class Twos extends Category {

	@Override
	public int compute(int[] roll) {
		return countOccForOneValue(roll,2)*2;
	}

	@Override
	public boolean isValid(int[] roll) {
		return countOccForOneValue(roll,2) != 0;
	}

}
