import java.util.Scanner;

/*
    GRUPO:
    Fábio Augusto Araújo Santos (0039806);
    Rodrigo Cardoso (0039823);
*/

public class passaBolinha {

    public static int N;
    public static int l;
    public static int c;
    public static int count = 0;
    public static int[][] field;
    public static int antx = 0;
    public static int anty = 0;
    public static String[] pos = { "Norte", "Leste", "Sul", "Oeste" };

    public static Boolean verifica(int x, int y) {
        if (x > 0 && y > 0 && x < N - 1 && y < N - 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void passaBall(int x, int y) {
        if (verifica(x, y)) {
            for (int i = 0; i < pos.length; i++) {
                if (pos[i].equals("Norte")) {
                    if (field[x + 1][y] >= field[x][y] && antx != x + 1 && anty != y) {
                        count++;
                        if (verifica((x + 1), y)) {
                            anty = y;
                            antx = x + 1;
                            passaBall((x + 1), y);
                        }
                    }
                }

                if (pos[i].equals("Leste")) {
                    if (field[x][y + 1] >= field[x][y] && antx != x && anty != y + 1) {
                        count++;
                        if (verifica(x, (y + 1))) {
                            anty = y + 1;
                            antx = x;
                            passaBall(x, (y + 1));
                        }
                    }
                }

                if (pos[i].equals("Sul")) {
                    if (field[x - 1][y] >= field[x][y] && antx != x - 1 && anty != y) {
                        count++;
                        if (verifica((x - 1), y)) {
                            anty = y;
                            antx = x - 1;
                            passaBall((x - 1), y);
                        }
                    }
                }

                if (pos[i].equals("Oeste")) {
                    if (field[x][y - 1] >= field[x][y] && antx != x && anty != y - 1) {
                        count++;
                        if (verifica(x, (y - 1))) {
                            anty = y - 1;
                            antx = x;
                            passaBall(x, (y - 1));
                        }
                    }
                }
            }
        }
        return;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        N = teclado.nextInt();
        l = teclado.nextInt() - 1;
        c = teclado.nextInt() - 1;
        field = new int[N][N];

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = teclado.nextInt();
            }
        }

        passaBall(l, c);
        System.out.println(count);
        teclado.close();
    }
}