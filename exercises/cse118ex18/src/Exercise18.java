package cse118ex18.src;

import java.util.Random;

public class Exercise18 {
    public static void main(String[] args) {
        int[] numbers = { 1, 3, 5, 6, 9, 3, 6, 9, 2, 10, 9, 4, 11, 34, 97, 4, 5, 97, 2 };
        int maxIdx = numbers[0];
        int maxCount = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[maxIdx]) {
                maxCount++;
            } else if (numbers[i] > numbers[maxIdx]) {
                maxIdx = numbers[i];
                maxIdx = i;
                maxCount = 1;
            }
        }
        System.out.println("[1] first highest max in array is at index: " + maxIdx);
        System.out.println("[1] there were " + maxCount + " occurances of the max");

        // ===============================================================================

        // shift the numbers in the numbers array by 1 to the left
        int temp = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        numbers[numbers.length - 1] = temp;

        // ===============================================================================

        // random shuffle of 52 cards
        System.out.print("[2] 52 random cards:");
        shuffleCards(52);
    }

    public static void shuffleCards(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = i;
        }

        Random rand = new Random();
        for (int i = 0; i < size - 1; i++) {
            int idx = rand.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            if (i % 13 == 0) {
                System.out.println();
            }

            String card = "";
            int suit = arr[i] / 13;
            switch (suit) {
                case 0:
                    card += 'S';
                    break;
                case 1:
                    card += 'H';
                    break;
                case 2:
                    card += 'D';
                    break;
                case 3:
                    card += 'C';
                    break;
            }

            int num = arr[i] % 13;
            if (num == 0) {
                card += 'A';
            } else if (num == 10) {
                card += 'J';
            } else if (num == 11) {
                card += 'Q';
            } else if (num == 12) {
                card += 'K';
            } else {
                card += num + 1;
            }

            System.out.printf("%s\t", card);
        }
    }

    /**
     * psuedorandomly shuffle an array of a given size
     * 
     * @param size the size of the array
     */
    public static void shuffleArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        Random rand = new Random();
        for (int i = 0; i < size - 1; i++) {
            int idx = rand.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
