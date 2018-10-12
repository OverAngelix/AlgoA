package tp4;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.junit.Test;

public class ExoSetTest {
	Set<Integer> ens3 = new HashSet<>();
	Set<Integer> ens4 = new HashSet<>();
	Set<Integer> ens = new HashSet<>();
	Set<Integer> soluce = new HashSet<>();
	@Test
	public void testInter() {
		ExoSet es = new ExoSet();
		ens3.add(1);ens3.add(2);
		ens4.add(1);ens3.add(2);ens4.add(4);
		ens.add(1);ens.add(2);
		assertEquals(es.inter(ens3,ens4),ens);
		}

	@Test
	public void testUnion() {
		ExoSet es = new ExoSet();
		ens3.add(1);ens3.add(2);
		ens4.add(1);ens3.add(2);ens4.add(4);
		ens.add(1);ens.add(2);ens.add(4);
		assertEquals(es.union(ens3,ens4),ens);
	}

	@Test
	public void testIsIn() {
		ExoSet es = new ExoSet();
		ens3.add(1);ens3.add(2);
		ens4.add(1);ens3.add(2);ens4.add(4);
		assertEquals(true,es.isIn(ens4,ens3));
	}

}
