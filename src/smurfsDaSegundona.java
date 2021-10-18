import java.util.Locale;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

/*
    GRUPO:
    Fábio Augusto Araújo Santos (0039806);
    Rodrigo Cardoso (0039823);
*/

public class smurfsDaSegundona {

    static class Boots {
        int number;
        String side;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Boots vet[] = new Boots[N];
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            vet[i] = new Boots();
            String vet2[] = sc.nextLine().split(" ");
            vet[i].number = parseInt(vet2[0]);
            vet[i].side = vet2[1].toUpperCase(Locale.ROOT);
        }

        int amount = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (vet[i].side.equals("D")) {
                    if (vet[i].number == vet[j].number && vet[j].side.equals("E")) {
                        amount++;
                        vet[i].side = "";
                        vet[i].number = 0;
                        vet[j].side = "";
                        vet[j].number = 0;
                    }
                } else {
                    if (vet[i].number == vet[j].number && vet[j].side.equals("D")) {
                        amount++;
                        vet[i].side = "";
                        vet[i].number = 0;
                        vet[j].side = "";
                        vet[j].number = 0;
                    }
                }
            }
        }

        System.out.println(amount);
        sc.close();
    }
}
