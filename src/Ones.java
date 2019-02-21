
public class Ones extends Category {

	@Override
	public int compute(int[] roll) {
		return countOccForOneValue(roll,1);
	}

	@Override
	public boolean isValid(int[] roll) {
		return countOccForOneValue(roll,1) != 0;
	}	

}
