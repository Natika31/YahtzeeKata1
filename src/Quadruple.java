
public class Quadruple extends Category {

	@Override
	public int compute(int[] roll) {
		return getRepeatedValue(countOccNbForEachValue(roll),4)*4;
	}

	@Override
	public boolean isValid(int[] roll) {
		return containRepeatedValue(countOccNbForEachValue(roll),4);
	}

}
