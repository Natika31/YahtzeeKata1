import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class YahtzeeGameTest {

	private YahtzeeGame yahtzee;

	@Before
	public void setUp() throws Exception {
		this.yahtzee = new YahtzeeGame();
	}

	@After
	public void tearDown() throws Exception {
		this.yahtzee = null;
	}

	@Test
	public void testChance11336scores14() {
		this.yahtzee.addRoll(1, 1, 3, 3, 6);
		assertEquals(14, this.yahtzee.score(YahtzeeGame.CHANCE));
	}

	
	@Test
	public void testYahtzee11111scores50() {
		this.yahtzee.addRoll(1, 1, 1, 1, 1);
		assertEquals(50, this.yahtzee.score(YahtzeeGame.YAHTZEE));
	}
	
	@Test
	public void testYahtzee11121scores0() {
		this.yahtzee.addRoll(1, 1, 1, 2, 1);
		assertEquals(0, this.yahtzee.score(YahtzeeGame.YAHTZEE));
	}
	
	@Test
	public void testOnes33345scores0() {
		this.yahtzee.addRoll(3,3,3,4,5);
		assertEquals(0, this.yahtzee.score(YahtzeeGame.ONES));
	} 
	
	@Test
	public void testTwos23251scores4() {
		this.yahtzee.addRoll(2,3,2,5,1);
		assertEquals(4, this.yahtzee.score(YahtzeeGame.TWOS));
	}
	
	@Test
	public void testFours11244scores8() {
		this.yahtzee.addRoll(1,1,2,4,4);
		assertEquals(8, this.yahtzee.score(YahtzeeGame.FOURS));
	}
	
	@Test
	public void testPair33344scores8() {
		this.yahtzee.addRoll(3,3,3,4,4);
		assertEquals(8, this.yahtzee.score(YahtzeeGame.PAIR));
	}
	
	@Test
	public void testPair11626scores12() {
		this.yahtzee.addRoll(1,1,6,2,6);
		assertEquals(12, this.yahtzee.score(YahtzeeGame.PAIR));
	}
	
	@Test
	public void testPair33341scores0() {
		this.yahtzee.addRoll(3,3,3,4,1);
		assertEquals(0, this.yahtzee.score(YahtzeeGame.PAIR));
	}
	
	@Test
	public void testPair33331scores0() {
		this.yahtzee.addRoll(3,3,3,3,1);
		assertEquals(0, this.yahtzee.score(YahtzeeGame.PAIR));
	}
	
	@Test
	public void testTriple33345scores9() {
		this.yahtzee.addRoll(3,3,3,4,5);
		assertEquals(9, this.yahtzee.score(YahtzeeGame.TRIPLE));
	}
	
	@Test
	public void testTriple33456scores0() {
		this.yahtzee.addRoll(3,3,4,5,6);
		assertEquals(0, this.yahtzee.score(YahtzeeGame.TRIPLE));
	}
	
	@Test
	public void testTriple33331scores0() {
		this.yahtzee.addRoll(3,3,3,3,1);
		assertEquals(0, this.yahtzee.score(YahtzeeGame.TRIPLE));
	}
	
	@Test
	public void testQuadruple22225scores8() {
		this.yahtzee.addRoll(2,2,2,2,5);
		assertEquals(8, this.yahtzee.score(YahtzeeGame.QUADRUPLE));
	}
	
	@Test
	public void testQuadruple22255scores0() {
		this.yahtzee.addRoll(2,2,2,5,5);
		assertEquals(0, this.yahtzee.score(YahtzeeGame.QUADRUPLE));
	}
	
	@Test
	public void testQuadruple22222scores0() {
		this.yahtzee.addRoll(2,2,2,2,2);
		assertEquals(0, this.yahtzee.score(YahtzeeGame.QUADRUPLE));
	}
	
	@Test
	public void testTwoPair11233scores8() {
		this.yahtzee.addRoll(1,1,2,3,3);
		assertEquals(8, this.yahtzee.score(YahtzeeGame.TWOPAIRS));
	}
	
	@Test
	public void testTwoPair11234scores0() {
		this.yahtzee.addRoll(1,1,2,3,4);
		assertEquals(0, this.yahtzee.score(YahtzeeGame.TWOPAIRS));
	}
	
	@Test
	public void testTwoPair11222scores0() {
		this.yahtzee.addRoll(1,1,2,2,2);
		assertEquals(0, this.yahtzee.score(YahtzeeGame.TWOPAIRS));
	}
	
	@Test
	public void testsmallStraight12345scores15() {
		this.yahtzee.addRoll(1,2,3,4,5);
		assertEquals(15, this.yahtzee.score(YahtzeeGame.SMALLSTRAIGHT));
	}
	
	@Test
	public void testLargestStraight12345scores20() {
		this.yahtzee.addRoll(2,3,4,5,6);
		assertEquals(20, this.yahtzee.score(YahtzeeGame.LARGESTRAIGHT));
	}
	
	@Test
	public void testFullHouse11222scores8() {
		this.yahtzee.addRoll(1,1,2,2,2);
		assertEquals(8, this.yahtzee.score(YahtzeeGame.FULLHOUSE));
	}

	@Test
	public void testFullHouse22334scores0() {
		this.yahtzee.addRoll(2,2,3,3,4);
		assertEquals(0, this.yahtzee.score(YahtzeeGame.FULLHOUSE));
	}
	
	@Test
	public void testFullHouse44444scores0() {
		this.yahtzee.addRoll(4,4,4,4,4);
		assertEquals(0, this.yahtzee.score(YahtzeeGame.FULLHOUSE));
	}

}
