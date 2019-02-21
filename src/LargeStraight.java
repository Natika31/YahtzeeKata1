
public class LargeStraight extends Category {

	@Override
	public int compute(int[] roll) {
		return sumAll(roll);
	}

	@Override
	public boolean isValid(int[] roll) {
		int [] rollOccNb = countOccNbForEachValue(roll);
		return sumAll(rollOccNb) == 5 && rollOccNb[0] == 0;
	}

}
