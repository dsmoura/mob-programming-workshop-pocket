package mob_programming_workshop.sorteador_nomes;
import static org.junit.Assert.*;

import org.junit.Test;
 

public class ClassTest {
	@Test
	public void test() {
	  assertEquals(true, Main.nomes.length > 1);
	  
	}

	@Test
	public void test2() {
		for (int i = 0; i < Main.nomes.length; i++) {
			for (int j = 0; j < Main.nomes.length; j++) {
				if (i!=j) {
					if(Main.nomes[i].equals(Main.nomes[j])) {
						fail("nomes repetidos");
					}
				}
			}
		}
	}
}
