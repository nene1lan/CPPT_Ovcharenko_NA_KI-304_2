package Lab1OvcharenkoKI_304;

import java.io.*;
import java.util.*;

/**
 * This class prints a square matrix that contains another, smaller filled square
 * centered inside it. The matrix size and fill symbol are specified by the user.
 *
 * <p>The program also writes the generated pattern to a text file.</p>
 *
 * @author Ovcharenko Nikita
 * @version 1.2
 */
public class Lab1OvcharenkoKI_304 {

    /**
     * The entry point of the program. Prompts the user for matrix size and fill symbol,
     * creates the matrix, and prints it both to the console and to a file.
     *
     * @param args command-line arguments (not used)
     * @throws FileNotFoundException if the output file cannot be created or opened
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        System.out.print("Enter the size of the square matrix: ");
        int n = in.nextInt();
        in.nextLine();

        System.out.print("Enter the fill character: ");
        String filler = in.nextLine();

        if (filler.length() != 1) {
            System.out.println("You must enter exactly one character.");
            return;
        }

        char symbol = filler.charAt(0);

        // Create the matrix
        char[][] matrix = createMatrix(n, symbol);

        // Print the matrix to console and file
        paintMatrix(matrix, fout);

        fout.flush();
        fout.close();
    }

    /**
     * Creates a square character matrix of size {@code n × n} that contains a smaller
     * filled square centered inside it. The inner square occupies approximately
     * half of the matrix size.
     *
     * @param n      the size of the square matrix
     * @param filler the fill character for the inner square
     * @return a 2D character array representing the square matrix
     */
    public static char[][] createMatrix(int n, char filler) {
        char[][] arr = new char[n][n];
        char space = ' ';

        int innerStart = n / 4;
        int innerEnd = n - innerStart - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= innerStart && i <= innerEnd && j >= innerStart && j <= innerEnd)
                    arr[i][j] = filler;
                else
                    arr[i][j] = space;
            }
        }
        return arr;
    }

    /**
     * Prints the given matrix to both the console and the provided {@link PrintWriter}.
     *
     * @param matrix the 2D character array to print
     * @param fout   the {@code PrintWriter} used to write the output to a file
     */
    public static void paintMatrix(char[][] matrix, PrintWriter fout) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                fout.print(matrix[i][j]);
            }
            System.out.println();
            fout.println();
        }
    }
}
