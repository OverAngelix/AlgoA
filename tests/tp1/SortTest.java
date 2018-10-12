package tp1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SortTest {
	final int MIN = 8;
	final int MAX = 99;

	final int [] SORTED = {8,11,17,22,25,34,47,52,69,98};
	int [] unSorted = {22,11,8,17,47,98,25,34,69,52};

	@Test
	public void testGenerateRdmIntArray() {

		int [] rdmTab = Sort.generateRdmIntArray(100,MIN,MAX);
		int i = 0;
		boolean well = true;
		while(i<rdmTab.length&&well){
			if(rdmTab[i] < MIN || rdmTab[i] > MAX)
				well = false;
			i++;
		}
		assertTrue(well);
	}

	@Before
    public void setUp() {
      unSorted = new int[]{22,11,8,17,47,98,25,34,69,52};
    }

	@Test
	//TEST METHODE SWAPI
	public void testSwap() {
		int [] before = {8,11,17,22,25,34,47,52,69,98};
		int [] after = {8,69,17,22,25,34,47,52,11,98};
		Sort.swap(before, 1, 8);
		assertArrayEquals(before, after);
	}

	@Test
	//TEST DU BUBBLE
	public void testBubbleSort() {
		Sort.bubbleSort(unSorted);
		assertArrayEquals(unSorted, SORTED);
	}


	@Test
	//TEST DU INSERT
	public void testInsertSort() {
		Sort.insertSort(unSorted);
		assertArrayEquals(unSorted, SORTED);
	}

	@Test
	//TEST DU SELET
	public void testSelectSort() {
		Sort.selectSort(unSorted);
		assertArrayEquals(unSorted, SORTED);
	}

	/*@Test
	public void testfuseTab() {
		int [] tabA = {8,11,47,98};
		int [] tabB = {17,22,25,34,52,69};
		int [] tabOut = new int[tabA.length+tabB.length];
		Sort.fuseTab(tabA, tabB, tabOut);		
		assertArrayEquals(tabOut, SORTED);
	}*/

	

}
