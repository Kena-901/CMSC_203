import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CryptoManagerTestStudent {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("COMPUTERS"));
		assertTrue(CryptoManager.isStringInBounds("\"PROGRAMMING IS FUN\""));
		assertFalse(CryptoManager.isStringInBounds("coding"));
		assertFalse(CryptoManager.isStringInBounds("{CODE"));
		assertFalse(CryptoManager.isStringInBounds("{ A FAILING TEST"));
	}

	@Test
	public void testEncryptCaesar() {
		assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("lowerCase", 6));
		assertEquals("EFG", CryptoManager.caesarEncryption("DEF", 1));
		assertEquals("(&9", CryptoManager.caesarEncryption("CAT", 101));
		assertEquals("RI^I", CryptoManager.caesarEncryption("JAVA", 200));
		assertEquals("SURMHFW#6", CryptoManager.caesarEncryption("PROJECT 3", 3));
		assertEquals("G<MB@[F@T", CryptoManager.caesarEncryption("LARGE KEY", 891));
	}

	@Test
	public void testDecryptCaesar() {
		assertEquals("CAT", CryptoManager.caesarDecryption("(&9",101));
		assertEquals("JAVA", CryptoManager.caesarDecryption("RI^I", 200));
		assertEquals("PROJECT 3", CryptoManager.caesarDecryption("SURMHFW#6", 3));
		assertEquals("LARGE KEY", CryptoManager.caesarDecryption("G<MB@[F@T", 891));
	}

	@Test
	public void testEncryptBellaso() {
		assertEquals("RW[VFV#@8", CryptoManager.bellasoEncryption("PROJECT 3","BELLASO ENCRYPTION TEST"));
		assertEquals("F\\ S5F5E#]%R'D1@PV!J@GC<QT3M!H1", CryptoManager.bellasoEncryption("COMPUTER PROGRAMMING USING JAVA","CMSC 203"));
		assertEquals("QN'LQ9PS\\]^)_N(Y%-PX-", CryptoManager.bellasoEncryption("FINAL ENCRYPTION TEST","KEY"));

	}

	@Test
	public void testDecryptBellaso() {
		assertEquals("PROJECT 3", CryptoManager.bellasoDecryption("RW[VFV#@8", "BELLASO ENCRYPTION TEST"));
		assertEquals("COMPUTER PROGRAMMING USING JAVA", CryptoManager.bellasoDecryption("F\\ S5F5E#]%R'D1@PV!J@GC<QT3M!H1", "CMSC 203"));
		assertEquals("FINAL ENCRYPTION TEST", CryptoManager.bellasoDecryption("QN'LQ9PS\\]^)_N(Y%-PX-", "KEY"));

	}


}
