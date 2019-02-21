
public class Triple extends Category {

	@Override
	public int compute(int[] roll) {
		return getRepeatedValue(countOccNbForEachValue(roll),3)*3;
	}

	@Override
	public boolean isValid(int[] roll) {
		return containRepeatedValue(countOccNbForEachValue(roll),3);
	}
}
