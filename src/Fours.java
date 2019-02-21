public class Fours extends Category {

	@Override
	public int compute(int[] roll) {
		return countOccForOneValue(roll,4)*4;
	}

	@Override
	public boolean isValid(int[] roll) {
		return countOccForOneValue(roll,4) != 0;
	}	
	
}
