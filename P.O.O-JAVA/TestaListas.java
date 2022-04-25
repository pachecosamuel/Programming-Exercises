package review.cap.nove;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TestaListas {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Samuel", "111", 24);
		Pessoa p2 = new Pessoa("Marquezine", "222", 27);
		Pessoa p3 = new Pessoa("Caio Castro", "333", 35);
		Pessoa p4 = new Pessoa("Valverde", "444", 32);
		Cliente c1 = new Cliente("Globo");
		
		List lista = new ArrayList();
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		//lista.add(c1);
		
		List<Pessoa> listaPessoas = new ArrayList();
		listaPessoas.add(p1);
		listaPessoas.add(p2);
		listaPessoas.add(p3);
		listaPessoas.add(p4);
		
		for (int i = 0; i < listaPessoas.size(); i++) {
			Pessoa p = listaPessoas.get(i);
			System.out.println(p.toString());
		}
		
		/*for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) instanceof Pessoa) {
				Pessoa p = (Pessoa) lista.get(i);
				System.out.println(p.toString());
			} else {
				Cliente c = (Cliente) lista.get(i);
				System.out.println(c.toString());
			}
		}*/
		
	}

}
