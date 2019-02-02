package mob_programming_workshop.sorteador_nomes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	//nomes originais alterados por privacidade
	public static String[] nomes = {
		"Nome1",
		"Nome2",
		"Nome3",
		"Nome4",
		"Nome5",
		"Nome6",
		"Nome7",
		"Nome8",
		"Nome9",
		"Nome10",
		"Nome11",
		"Nome12"
	};
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(Arrays.asList(nomes));
		Collections.shuffle(list);
		System.out.println(list.get(0));
	}
	
	
}
