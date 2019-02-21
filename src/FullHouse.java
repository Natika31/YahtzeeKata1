
public class FullHouse extends Category {

	@Override
	public int compute(int[] roll) {
		return sumAll(roll);
	}

	@Override
	public boolean isValid(int[] roll) {
		return containRepeatedValue(countOccNbForEachValue(roll),3) && containRepeatedValue(countOccNbForEachValue(roll),2);
	}

}
