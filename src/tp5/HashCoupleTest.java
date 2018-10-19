package tp5;

import static org.junit.Assert.*;

import org.junit.Test;

public class HashCoupleTest {

	@Test
	public void testHashCouple() {
		HashCouple hc = new HashCouple("Cle1",12);
		assertEquals((Integer)12, hc.getValue());
	}
	
	@Test
	public void testModifCouple() {
		HashCouple hc = new HashCouple("Cle1",12);
		hc.setValue(22);
		assertEquals((Integer)22, hc.getValue());
	}
	
	@Test
	public void testChainageSize() {
		Chainage c = new Chainage(10);
		assertEquals(10,c.size());
	}
	
	@Test
	public void testChainageAdd() {
		HashCouple hc = new HashCouple("Cle1",12);
		hc.setValue(22);
		Chainage c = new Chainage(10);
		c.put("choat", 410);
		c.put("hg", 15);
		c.put("chat", 185);
		c.ToString();
		assertEquals((Integer)185,c.put("chat", hc.getValue()));
		
	}
	
	@Test
	public void testChainageAdd2() {
		HashCouple hc = new HashCouple("Cle1",12);
		hc.setValue(22);
		Chainage c = new Chainage(10);
		assertEquals(null,c.put("chat", hc.getValue()));
	}
	
	@Test
	public void testChainageGet() {
		Chainage c = new Chainage(10);
		c.put("chat", 158);
		assertEquals((Integer)158,c.get("chat"));
	}
	
	@Test
	public void testChainageContainsT() {
		Chainage c = new Chainage(10);
		c.put("chat", 158);
		assertTrue(c.contains("chat"));
	}
	
	@Test
	public void testChainageContainsF() {
		Chainage c = new Chainage(10);
		c.put("chat", 158);
		assertFalse(c.contains("cht"));
	}
	
	@Test
	public void testChainageRemoveT() {
		Chainage c = new Chainage(10);
		c.put("chat", 158);
		assertTrue(c.remove("chat"));
		
	}
	
	@Test
	public void testChainageRemoveF() {
		Chainage c = new Chainage(10);
		assertFalse(c.remove("chat"));
	}
	

	@Test
	public void testAdressageSize() {
		Adressage ad = new Adressage(10);
		assertEquals(10,ad.size());
	}
	
	@Test
	public void testAdressageAdd() {
		Adressage ad = new Adressage(10);
		assertEquals(null,ad.put("chat", 3));
		
	}
	
	@Test
	public void testAdressageAdd2() {
		Adressage ad = new Adressage(10);
		ad.put("chat", 3);
		assertEquals((Integer)3,ad.put("chat", 5));
		
	}
	
	@Test
	public void testAdressageGet() {
		Adressage ad = new Adressage(10);
		ad.put("chat", 3);
		assertEquals((Integer)3,ad.get("chat"));
		
	}
	
	@Test
	public void testAdressageRemoveF() {
		Adressage ad = new Adressage(10);
		ad.put("chaot", 3);
		ad.put("hg", 3);
		ad.remove("chaot");
		assertFalse(ad.remove("jih"));
		
	}
	
	@Test
	public void testAdressageRemoveT() {
		Adressage ad = new Adressage(10);
		ad.put("chaot", 3);
		ad.put("hg", 5);
		ad.put("hffg", 454);
		assertTrue(ad.remove("chaot"));
		
	}

}
