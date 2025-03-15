import java.util.ArrayList;

public class Principale13 {

	public static void main(String[] args) {

		ArrayList<Employe> tbSalaries = new ArrayList<Employe>();

		Employe p01 = new Employe("Jean D", 1543.);
		tbSalaries.add(p01);
		Employe p02 = new Employe("Janina R", 1231.);
		tbSalaries.add(p02);

		Cadre p03 = new Cadre("Serge P", 2100., 235.);
		tbSalaries.add(p03);

		for (int i = 0; i < tbSalaries.size(); i++) {
			System.out.print(tbSalaries.get(i).toString() + "\n");
		}
	}
}
