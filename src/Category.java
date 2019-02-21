
public abstract class Category {
	
	protected boolean numberIsRepeated;

	protected int[] sideValues = {1,2,3,4,5,6};

	public abstract boolean isValid(int[] roll);

	public abstract int compute(int [] roll);

	public static Category createCategory(int typeCategorie) {
		switch(typeCategorie) {
		case YahtzeeGame.ONES:
			return new Ones();
		case YahtzeeGame.TWOS:
			return new Twos();
		case YahtzeeGame.THREES:
			return new Threes();
		case YahtzeeGame.FOURS:
			return new Fours();
		case YahtzeeGame.FIVES:
			return new Fives();
		case YahtzeeGame.SIXES:
			return new Sixes();
		case YahtzeeGame.YAHTZEE:
			return new Yahtzee();
		case YahtzeeGame.PAIR:
			return new Pair();
		case YahtzeeGame.TWOPAIRS:
			return new TwoPairs();
		case YahtzeeGame.TRIPLE:
			return new Triple();
		case YahtzeeGame.QUADRUPLE:
			return new Quadruple();
		case YahtzeeGame.SMALLSTRAIGHT:
			return new SmallStraight();
		case YahtzeeGame.LARGESTRAIGHT:
			return new LargeStraight();
		case YahtzeeGame.FULLHOUSE:
			return new FullHouse();
		default:
			return new Chance();
		}
	}

	protected int sumAll(int [] roll) {
		int somme = 0;
		for(int de : roll) {
			somme += de;
		}
		return somme;
	}
	
	public int countOccForOneValue(int [] values, int searchedNb) {
		int occNb = 0;
		for(int dice : values) {
			if(dice == searchedNb)
				occNb++;
		}
		return occNb;
	}

	protected int[] countOccNbForEachValue(int[] roll) {
		int[] rollOccNb = new int[6];
		for(int sideValue : sideValues) 
			rollOccNb[sideValue-1] = countOccForOneValue(roll, sideValue);
		return rollOccNb;
	}

	protected boolean containRepeatedValue(int[] roll, int repetitionNb) {
		if (countOccForOneValue(roll,repetitionNb ) != 0)
			numberIsRepeated = true;
		return numberIsRepeated;
	}
	
	protected int getRepeatedValue(int[] rollOccNb, int repetitionNb) {
		int index = 0;
		while(rollOccNb[index] != repetitionNb && index < rollOccNb.length) {
			index++;
		}
		return index + 1;
	}
	







}
