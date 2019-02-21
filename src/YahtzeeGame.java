
public class YahtzeeGame {
	public static final int ONES = 1;
	public static final int TWOS = 2;
	public static final int THREES = 3;
	public static final int FOURS = 4;
	public static final int FIVES = 5;
	public static final int SIXES = 6;
	
	public static final int CHANCE = 7;
	public static final int YAHTZEE = 8;
	public static final int PAIR = 9;
	public static final int TWOPAIRS = 10;
	public static final int TRIPLE = 11;
	public static final int QUADRUPLE = 12;
	public static final int SMALLSTRAIGHT = 13;
	public static final int LARGESTRAIGHT = 14;
	public static final int FULLHOUSE = 15;

	private int[] roll;
	
	private Category category;

	public void addRoll(int dice1, int dice2, int dice3, int dice4, int dice5) {
		this.roll =new int []{dice1, dice2, dice3,dice4,dice5}; 		
	}

	public int score(int categoryInt) {
		this.setCategory(categoryInt);
		if(this.getCategory().isValid(roll)) {
			return this.getCategory().compute(this.roll);
		}
		return 0;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(int categoryInt) {
		this.category = Category.createCategory(categoryInt);
	}

}
