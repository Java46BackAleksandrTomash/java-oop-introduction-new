package telran.brackets.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.brackets.Brackets;

class BraketsTests {

	
		void hasaValidBracketsTest() {
			assertTrue(Brackets.hasValidBrackets("aaaaaa (sdfsdfdsf[dfd(f)f] zcvzxcv {{[ghjk]}} asd )"));
			assertFalse(Brackets.hasValidBrackets(")dfgswfgsf("));
			assertFalse(Brackets.hasValidBrackets("[werwert(wertwrtw] wertrt)"));
			assertFalse(Brackets.hasValidBrackets("aaaaaa (sdfsdfdsf[dfd(f)f] zcvzxcv {{[ghjk]}} asd ){"));
		}
	}