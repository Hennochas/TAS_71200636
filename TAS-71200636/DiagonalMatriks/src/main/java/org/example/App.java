package org.example;
public class App {
    static public void main(String[] args) {
        int[][] inputMatrix = {
                { 1, 8, 13, 12 },
                { 14, 11, 2, 7 },
                { 4, 5, 16, 9 },
                { 15, 10, 3, 6 }
        };
        int ukuranMatrix = 4;
        for (int i = 0; i < ukuranMatrix; i++) {
            for (int j = 0; j < ukuranMatrix; j++)
                System.out.print(inputMatrix[i][j] + " ");
            System.out.print("\n");
        }
        int matriksBujur = 0;
        for (int i = 0; i < ukuranMatrix; i++) {
            for (int j = 0; j < ukuranMatrix; j++) {
                if (i == j)
                    matriksBujur += inputMatrix[i][j];
            }
        }
        System.out.println("Hasil : " + matriksBujur);
    }
}