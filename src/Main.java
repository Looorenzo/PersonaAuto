
public class Main {

	public static void main(String[] args) {
		Auto a1 = new Auto("Ford Fiesta", "cccc123");
		Auto a2 = new Auto("Toyota", "bbbb123");
		Auto a3 = new Auto("Merceds", "bb232342343");

		Persona p1 = new Persona("Pippo", "Baudo", "Via rjfjj", "11/09/2001", 10);
		System.out.println(p1);

		if (p1.aggiungiAuto(a1))
			System.out.println("Aggiunta auto");
		else
			System.out.println("Non e' possibile aggiungere auto");

		if (p1.aggiungiAuto(a2))
			System.out.println("Aggiunta auto");
		else
			System.out.println("Non e' possibile aggiungere auto");

		if (p1.aggiungiAuto(a3))
			System.out.println("Aggiunta auto");
		else
			System.out.println("Non e' possibile aggiungere auto");

		System.out.println(p1);

		Auto[] v = p1.cercaTarga("bb");
		for (int i = 0; i < v.length; i++)
			if (v[i] != null)
				System.out.println(v[i]);
			else
				break;
	}

}
