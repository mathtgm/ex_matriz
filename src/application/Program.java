package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, find, posA = 0, posB = 0;

		System.out.print("Digite a quantidade de linhas: ");
		x = sc.nextInt();
		System.out.print("Digite a quantidade de colunas: ");
		y = sc.nextInt();

		int[][] matriz = new int[x][y];

		for (int i = 0; i < x; i++)
			for (int h = 0; h < y; h++)
				matriz[i][h] = sc.nextInt();
		
		System.out.print("Digite que deseja as informações: ");
		find = sc.nextInt();

		for (int i = 0; i < x; i++)
			for (int h = 0; h < y; h++)
				if (matriz[i][h] == find) {
					posA = i;
					posB = h;
					System.out.println("Position: " + posA + ", " + posB);
					System.out.println("Left: " + ((posB == 0) ? "Nothing" : matriz[posA][posB - 1]));
					System.out.println("Right: " + ((posB == (y-1)) ? "Nothing" : matriz[posA][posB + 1]));
					System.out.println("Up: " + ((posA == 0) ? "Nothing" : matriz[posA-1][posB]));
					System.out.println("Down: " + ((posA == (x-1)) ? "Nothing" : matriz[posA+1][posB]));
					System.out.println();
					break;
				}

		sc.close();
	}

}
