
public class Pair extends Category {

	@Override
	public boolean isValid(int[] roll) {	
		return containRepeatedValue(countOccNbForEachValue(roll),2);
	}

	@Override
	public int compute(int[] roll) {
		int[] rollOccNb = super.countOccNbForEachValue(roll);
		return this.greatestPairValue(rollOccNb)*2;
	}

	private int greatestPairValue(int[] roll) {
		int index = roll.length - 1 ;
		while(index != 0 && roll[index] != 2) 
			index --;
		return index + 1;	
	}
}
