
public class TwoPairs extends Category {

	@Override
	public boolean isValid(int[] roll) {
		return countOccForOneValue(countOccNbForEachValue(roll), 2) == 2;
	}

	@Override
	public int compute(int[] roll) {
		return sumPairsValue(countOccNbForEachValue(roll))*2;
	}

	private int sumPairsValue(int[] rollOccNb) {
		int pairIndex = 0;
		int index = 1;
		for(int occNb : rollOccNb) {
			if(occNb == 2) 
				pairIndex += index;
			index++;
		}
		return pairIndex;
	}


}
