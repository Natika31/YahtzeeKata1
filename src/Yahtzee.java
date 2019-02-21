
public class Yahtzee extends Category {

	@Override
	public boolean isValid(int[] roll) {
		return (roll[0]==roll[1] && roll[1]==roll[2] && roll[2]==roll[3] && roll[3]==roll[4]);
	}

	@Override
	public int compute(int[] roll) {
		return 50;
	}

}
