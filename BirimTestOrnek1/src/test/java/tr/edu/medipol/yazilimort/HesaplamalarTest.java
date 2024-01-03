package tr.edu.medipol.yazilimort;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamalarTest {

	@Test
	public void testFaktoriyelRec() {
	int sonuc =	Hesaplamalar.faktoriyelRec(5);
	assertEquals(120, sonuc);
	}

	@Test
	public void testFaktoriyelLoop() {
		int sonuc = Hesaplamalar.faktoriyelLoop(5);
		assertEquals(120,sonuc);
	}
	
	@Test
	public void testFaktoriyel() {
		for (int i=1;i<1000;i++) {
			
	
		int sonuc1 = Hesaplamalar.faktoriyelLoop(i);
		int sonuc2 = Hesaplamalar.faktoriyelRec(i);
		assertEquals(sonuc1,sonuc2);
		}
	}
@Test
public void testTopla() {
	 Hesaplamalar hesap = new Hesaplamalar();
	    int sayi1 = 5;
	    int sayi2 = 7;
	    int toplam = hesap.topla(sayi1, sayi2);
	    assertEquals(12, toplam);
}
@Test
public void testCikar() {
	 Hesaplamalar hesap = new Hesaplamalar();
	    int sayi1 = 10;
	    int sayi2 = 2;
	    int cikarma = hesap.cikar(sayi1, sayi2);
	    assertEquals(8, cikarma);
}
@Test
public void testCarp() {
	 Hesaplamalar hesap = new Hesaplamalar();
	    int sayi1 = 2;
	    int sayi2 = 9;
	    int carpma = hesap.carp(sayi1, sayi2);
	    assertEquals(18, carpma);
}
}
