package tr.edu.medipol.yazilimaraclari.ders9;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaAppTest {

	@Test
	public void testToplama() {
		
		int sayi1 = 101;
		int sayi2 = 499;
		
		int sonuc = HesaplamaApp.toplama(sayi1, sayi2);
		
		assertEquals(600, sonuc);
	}

}
