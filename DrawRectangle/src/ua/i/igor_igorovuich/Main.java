package ua.i.igor_igorovuich;

public class Main {

	public static void main(String[] args) {
		int hight = 3;
		int width = 7;
		drawRectangle(hight, width);
	}

	public static void drawRectangle(int h, int w) {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (i == 0 || i == h - 1 || j == 0 || j == w - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}

	}
}
