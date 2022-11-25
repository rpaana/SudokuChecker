import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

//implement tests to test Sudokuverifier with boundary values.  Use templates from Task 1 to derive and document test cases.
	
// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891
String c = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
String i = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
String S1 = "111111111111111111111111111111111111111111111111111111111111111111111111111111111";
String S2 = "999999999999999999999999999999999999999999999999999999999999999999999999999999999";
String S3 = "111111111111111111111111111111111111111111111111111111111111111111111111111111110";
String S4 = "1000000000000000000000000000000000000000000000000000000000000000000000000000000000";
String S5 = "11111111111111111111111111111111111111111111111111111111111111111111111111111111";
String S6 = "1111111111111111111111111111111111111111111111111111111111111111111111111111111111";
String S7 = "4173698256321589479587243168254371<>?:\"{}|_+2346912758289643571573291684164875293";
SudokuVerifier v = new SudokuVerifier();

	@Test
	public void testCorrectString() {
		int a = v.verify(c);
		assertEquals("correct string", 0, a);
	}

	@Test
	public void testIncorrectString() {
		int a = v.verify(i);
		assertEquals("incorrect string", -2, a);
	}

	@Test
	public void testS1String_Output_neg2() {
		int a = v.verify(S1);
		assertEquals("Valid string", -2, a);
	}
	
	@Test
	public void testS2String_Output_neg2() {
		int a = v.verify(S2);
		assertEquals("Valid string", -2, a);
	}
	
	@Test
	public void testS3String_Output_neg1() {
		int a = v.verify(S3);
		assertEquals("Invalid string", -1, a);
	}
	
	@Test
	public void testS4String_Output_neg1() {
		int a = v.verify(S4);
		assertEquals("Invalid string", -1, a);
	}

	@Test
	public void testS5String_Output_neg1() {
		int a = v.verify(S5);
		assertEquals("Invalid string", -1, a);
	}
	
	@Test
	public void testS6String_Output_neg1() {
		int a = v.verify(S6);
		assertEquals("Invalid string", -1, a);
	}
	
	@Test
	public void testS7String_Output_1() {
		int a = v.verify(S7);
		assertEquals("incorrect string", 1, a);
	}
}
