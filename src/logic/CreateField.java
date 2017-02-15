package logic;

import java.util.Scanner;

public class CreateField {
	private static int i = 0;
	private static int j = 0;
	public static int[][] pole = new int[10][10];
	public static Scanner SC = new Scanner(System.in);
	private static boolean isRun = true;
	private static boolean boom = false;

	public void createFieldForForm() {
		makeBombs(pole);
		makeNumbers(pole);
	}

	// private static int[][] createPole() {// створити поле
	// public int[][] pole = new int[10][10];
	// return pole;
	// }

	/*
	 * private static void runPole() { // намалювати існуюче поле
	 * System.out.print("   "); for (int k = 1; k < 11; k++) {
	 * System.out.print(" " + k + "  "); } System.out.println();
	 * 
	 * for (i = 0; i < pole.length; i++) {
	 * System.out.println(" --------------------------------------------");
	 * System.out.print(i + 1); System.out.print(" | ");
	 * 
	 * for (j = 0; j < pole.length; j++) { // if (pole[i][j] == -1) { //
	 * System.out.print("Ж"); // } if (pole[i][j] > 9) {
	 * System.out.print(pole[i][j] - 10); } if ((pole[i][j] < 9) && (pole[i][j]
	 * != -1)) { System.out.print(""); }
	 * 
	 * System.out.print(" | "); } System.out.println(); }
	 * System.out.println(" --------------------------------------------"); }
	 */

	private static int[] random() { // певертає X і Y рандомно
		int[] arr = new int[2];
		int x = (int) (Math.random() * 10);
		int y = (int) (Math.random() * 10);
		arr[0] = x;
		arr[1] = y;
		return arr;
	}

	private static void makeBombs(int[][] pole) {// розставляєм бомби
		for (int i = 0; i < 20; i++) {
			int[] arr = new int[2];

			boolean perevirka = true;

			while (perevirka) {
				arr = random();
				int x = arr[0];
				int y = arr[1];

				if (pole[x][y] == 0) {
					pole[x][y] = -1;
					perevirka = false;
				}
			}
		}
	}

	private static void makeNumbers(int[][] pole) {// розставляєм цифри кругом
													// бомб
		for (int i = 0; i < pole.length; i++) {
			for (int j = 0; j < pole.length; j++) {
				if (pole[i][j] == -1) {

					if ((i - 1 >= 0) && (j - 1 >= 0)) {// 1
						if (pole[i - 1][j - 1] != -1) {
							pole[i - 1][j - 1] += 1;
						}
					}
					if (i - 1 >= 0) {// 2
						if (pole[i - 1][j] != -1) {
							pole[i - 1][j] += 1;
						}
					}
					if ((i - 1 >= 0) && (j + 1 <= 9)) {// 3
						if (pole[i - 1][j + 1] != -1) {
							pole[i - 1][j + 1] += 1;
						}
					}
					if (j + 1 <= 9) {// 4
						if (pole[i][j + 1] != -1) {
							pole[i][j + 1] += 1;
						}
					}
					if ((i + 1 <= 9) && (j + 1 <= 9)) {// 5
						if (pole[i + 1][j + 1] != -1) {
							pole[i + 1][j + 1] += 1;
						}
					}
					if (i + 1 <= 9) {// 6
						if (pole[i + 1][j] != -1) {
							pole[i + 1][j] += 1;
						}
					}
					if ((i + 1 <= 9) && (j - 1 >= 0)) {// 7
						if (pole[i + 1][j - 1] != -1) {
							pole[i + 1][j - 1] += 1;
						}
					}
					if (j - 1 >= 0) {// 8
						if (pole[i][j - 1] != -1) {
							pole[i][j - 1] += 1;
						}
					}
				}
			}
		}
		// for (int i = 0; i < pole.length; i++) {
		// for (int j = 0; j < pole.length; j++) {
		// if(pole[i][j]!=-1){
		// pole[i][j]+=10;
		//
		// }
		// }
		// }

	}

	/*
	 * public static void playerMove(int[][] pole, Scanner sc) { boolean Zanito
	 * = true;
	 * 
	 * while ((Zanito) && (isRun == true)) { System.out.println("enter  X"); int
	 * y = sc.nextInt(); y -= 1;
	 * 
	 * System.out.println("enter  Y"); int x = sc.nextInt(); x -= 1;
	 * 
	 * if (((x >= 0) && (x < 10)) && ((y >= 0) && (y < 10))) {
	 * 
	 * if (pole[x][y] == -1) { System.out.println("BOOM!!!"); isRun = false;
	 * boom = true;
	 * 
	 * } if (pole[x][y] > 9) { System.out.println("Вже тут ходив"); } if
	 * ((pole[x][y] != -1) && (pole[x][y] < 9)) {
	 * 
	 * pole[x][y] += 10;
	 * 
	 * } runPole();
	 * 
	 * Zanito = false;
	 * 
	 * } else { System.out.println("Пoле 10Х10"); } } }
	 */

	public static boolean isRunGame(int[][] pole, boolean boom) {
		isRun = true;
		int count = 0;
		if (boom == true) {
			isRun = false;

		} else {
			for (int i = 0; i < pole.length; i++) {
				for (int j = 0; j < pole.length; j++) {
					if ((pole[i][j] == -1) || (pole[i][j] > 9)) {

						count += 1;
					}
				}
			}
			if (count == 100) {
				isRun = false;

			}
		}
		System.out.println(count);
		return isRun;
	}

	/*
	 * private static void runPoleTest() { // намалювати існуюче поле
	 * System.out.print("   "); for (int k = 1; k < 11; k++) {
	 * System.out.print(" " + k + "  "); } System.out.println();
	 * 
	 * for (i = 0; i < pole.length; i++) {
	 * System.out.println(" --------------------------------------------");
	 * System.out.print(i + 1); System.out.print(" | ");
	 * 
	 * for (j = 0; j < pole.length; j++) { if (pole[i][j] == -1) {
	 * System.out.print("Ж"); }
	 * 
	 * System.out.print(" | "); } System.out.println(); }
	 * System.out.println(" --------------------------------------------"); }
	 */

	/*
	 * private static void theEnd(int[][] pole) { // намалювати існуюче поле
	 * System.out.print("   "); for (int k = 1; k < 11; k++) {
	 * System.out.print(" " + k + "  "); } System.out.println();
	 * 
	 * for (i = 0; i < pole.length; i++) {
	 * System.out.println(" --------------------------------------------");
	 * System.out.print(i + 1); System.out.print(" | ");
	 * 
	 * for (j = 0; j < pole.length; j++) { if (pole[i][j] == -1) {
	 * System.out.print("Ж"); } if (pole[i][j] > 9) {
	 * System.out.print(pole[i][j] - 10); }
	 * 
	 * 
	 * System.out.print(" | "); } System.out.println(); }
	 * System.out.println(" --------------------------------------------"); }
	 */

}
