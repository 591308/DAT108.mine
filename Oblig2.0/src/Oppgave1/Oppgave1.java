package Oppgave1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class Oppgave1 {

	public static void main(String[] args) {
		// Oppg1a
				System.out.println("Oppgave 1a");
				List<String> listen = Arrays.asList("10", "1", "20", "110", "21", "12");
				System.out.println("Listen for sortering " + listen);
				listen.sort(Comparator.comparing(Integer::parseInt));
				System.out.println("Listen etter sortering " + listen + "\n");

				// Oppg1b
				System.out.println("Oppgave 1b");

				BiFunction<Integer, Integer, Integer> sumfunction = (a, b) -> a + b;// angir hva funksjonen skal gjore
				int sum = beregn(12, 13, sumfunction);
				System.out.println("Beregne sum av 12 og 13: [" + sum + "]");

				BiFunction<Integer, Integer, Integer> storstefunksjon = (a, b) -> Math.max(a, b);// angir hva funksjonen skal
																									// gjore
				int storste = beregn(-5, 3, storstefunksjon);
				System.out.println("Beregn storste tall av -5 og 3: [" + storste + "]");

				BiFunction<Integer, Integer, Integer> avstandfunksjon = (a, b) -> Math.abs(a - b);// angir hva funksjonen skal
																									// gjore
				int avstanden = beregn(54, 45, avstandfunksjon);
				System.out.println("Beregn avstand mellom tall 54 og 45: [" + avstanden + "]");
			}

			public static int beregn(int a, int b, BiFunction<Integer, Integer, Integer> funksjon) {
				return funksjon.apply(a, b); // funksjon skal implementeres pa variablene vi sendt
			}

}
