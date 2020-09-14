package no.hvl.dat108.f09;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Eksempel3 {
	
	public static void main(String[] args) throws Exception {
		
		List<Utvikler> utviklere = Arrays.asList(
				new Utvikler("Arne", new HashSet<>(Arrays.asList("Java", "C"))),
				new Utvikler("Pere", new HashSet<>(Arrays.asList("Javascript", "C++"))),
				new Utvikler("Knut", new HashSet<>(Arrays.asList("Java"))),
				new Utvikler("Anne", new HashSet<>(Arrays.asList("Haskell", "C#", "Python"))),
				new Utvikler("Emma", new HashSet<>(Arrays.asList("Clojure", "Ruby", "C"))),
				new Utvikler("Lise", new HashSet<>(Arrays.asList("Java", "C"))));

		System.out.println("\nEn oversikt over hvilke utviklere som kan Java:");
		List<Utvikler> deSomKanJava = null;
		deSomKanJava.forEach(System.out::println);
		
		System.out.println("\nNavnet på en utvikler som kan C#, eller \"INGEN\" om ingen kan C#:");
		String navnPaaEnSomKanCSharp = null;
		System.out.println(navnPaaEnSomKanCSharp);

		System.out.println("\nEn sortert liste over alle programmeringsspråkene utviklerne kan:");
		List<String> progSpraak = null;
		System.out.println(progSpraak);

		System.out.println("\nHvilket språk flest utviklere kan (finner ett av dem):");
		String favorittspraak = null;
		System.out.println(favorittspraak);
		
		System.out.println("\nHvilke(t) språk flest utviklere kan hvis det er flere:");
		Map<String, Long> frekvensMap = null;
		List<String> popSpraakListe = null;
		System.out.println(popSpraakListe);
	}
}




