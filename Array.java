import java.util.Scanner;

public class Array {

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Single Dimensional Array:\n");
            // Ask user for number of elements
            System.out.print("Enter number of elements of 1D array: ");
            int n = sc.nextInt();

            // Declare array to store numbers
            int[] numbers = new int[n];

            // Store numerical data in array
            for (int i = 0; i < n; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = sc.nextInt();
            }

            // Display stored numbers
            System.out.println("\nNumbers stored in the array:");
            for (int i = 0; i < n; i++) {
                System.out.print(numbers[i] + " ");
            }

            // Initialize values
            int sum = 0;
            int max = numbers[0];
            int min = numbers[0];

            // Calculate sum, max, min
            for (int i = 0; i < n; i++) {
                sum += numbers[i];

                if (numbers[i] > max)
                    max = numbers[i];

                if (numbers[i] < min)
                    min = numbers[i];
            }

            double average = (double) sum / n;

            // Display results
            System.out.println();
            System.out.println("Sum     : " + sum);
            System.out.println("Average : " + average);
            System.out.println("Maximum : " + max);
            System.out.println("Minimum : " + min);

            //sorting manually
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (numbers[j] > numbers[j + 1]) {
                        int temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                    }
                }
            }

            System.out.println("\nSorted Array:");
            for (int i = 0; i < n; i++) {
                System.out.print(numbers[i] + " ");
            }

            System.out.println("\nTwo Dimensional Array:\n");
            System.out.print("\nEnter number of rows for 2D array: ");
            int rows = sc.nextInt();

            System.out.print("Enter number of columns for 2D array: ");
            int cols = sc.nextInt();

            int[][] matrix = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Enter element [" + i + "][" + j + "]: ");
                    matrix[i][j] = sc.nextInt();
                }
            }

            System.out.println("\n2D Array Elements:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        } catch (ArrayIndexOutOfBoundsException  e) {
            System.out.println("Array Index is out of bounds!");
        }
        finally{
            sc.close();
        } 
    }
}
