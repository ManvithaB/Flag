public class Flag {
	public static void main(String[] args) {
		System.out.println();
		System.out.println("                                                  ~HAPPY REPUBLIC DAY~");
		for (int i = 0; i < 35; i++) {
			for (int j = 0; j < 100; j++) {
				if ((j > 25 && j < 85 && j % 2 == 0 && (i == 2 || i == 7 || i == 12 || i == 17))
						|| (j == 26 && ((i >= 3 && i <= 6) || (i >= 8 && i <= 11) || (i >= 13 && i <= 16)))
						|| (j == 84 && ((i >= 3 && i <= 6) || (i >= 8 && i <= 11) || (i >= 13 && i <= 16)))
						|| (j == 26 && i > 1) || ((i == 10) && (j == 51 || j == 58))
						|| ((i == 11 || i == 8) && (j == 53 || j == 56)) || ((i == 9) && (j == 51 || j == 58))) {
					System.out.print("*");
				} else {
					if ((i == 9 && j == 54) || (i == 10 && j == 55)) {
						System.out.print("\\");
					} else if ((i == 9 && j == 55) || (i == 10 && j == 54)) {
						System.out.print("/");
					} else if ((i == 9 && j == 53) || (i == 9 && j == 56)) {
						System.out.print("_");
					} else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
