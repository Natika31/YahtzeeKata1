
public class Chance extends Category {

	@Override
	public boolean isValid(int[] roll) {
		return true;
	}

	@Override
	public int compute(int [] roll) {
		return sumAll(roll);
	}


}
