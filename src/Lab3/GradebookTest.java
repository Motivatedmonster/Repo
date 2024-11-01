package Lab3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTest {
	 private Gradebook gb1;
	   private Gradebook gb2;
	@BeforeEach
	void setUp() throws Exception {
		gb1 = new Gradebook(5);
	       gb2 = new Gradebook(5);
	       gb1.addScore(90.2);
	       gb1.addScore(80.5);
	       gb2.addScore(70.8);
	       gb2.addScore(60.5);
	}

	@AfterEach
	void tearDown() throws Exception {
		 gb1 = null;
	        gb2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(gb1.toString().equals("90.2 80.5"));
        assertTrue(gb2.toString().equals("70.8 60.5"));
       
	}

	@Test
	void testSum() {
		assertEquals(170.7, gb1.sum(), 0.001);
	      assertEquals(131.3, gb2.sum(), 0.001);
	}

	@Test
	void testMinimum() {
		assertEquals(80.5, gb1.minimum(), 0.001);
        assertEquals(60.5, gb2.minimum(), 0.001);	}

	@Test
	void testFinalScore() {
		assertEquals(90.2, gb1.finalScore(), 0.001);
        assertEquals(70.8, gb2.finalScore(), 0.001);
	}

	@Test
	void testGetScoreSize() {
		assertEquals(2, gb1.getScoreSize());
	       assertEquals(2, gb2.getScoreSize());
	}

	@Test
	void testToString() {
		  assertEquals("90.2 80.5", gb1.toString());
	      assertEquals("70.8 60.5", gb2.toString());
	}

}
