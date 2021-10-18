import java.util.Scanner;
import static java.lang.Integer.parseInt;

/*
    GRUPO:
    Fábio Augusto Araújo Santos (0039806);
    Rodrigo Cardoso (0039823);
*/

public class jogandoNaPandemia {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int mat[][] = new int[N][N];

        for (int i = 0; i < N; i++) {
            String line[] = sc.nextLine().split(" ");
            for (int j = 0; j < N; j++) {
                mat[i][j] = parseInt(line[j]);
            }
        }

        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N; j++) {
                int amountWhite = 0;
                int amountBlack = 0;
                if (mat[i][j - 1] == 0) {
                    amountWhite++;
                } else {
                    amountBlack++;
                }

                if (mat[i - 1][j - 1] == 0) {
                    amountWhite++;
                } else {
                    amountBlack++;
                }

                if (mat[i - 1][j] == 0) {
                    amountWhite++;
                } else {
                    amountBlack++;
                }

                if (amountWhite > amountBlack) {
                    mat[i][j] = 1;
                } else {
                    mat[i][j] = 0;
                }
            }
        }

        System.out.println(mat[N - 1][N - 1]);
        sc.close();
    }
}
