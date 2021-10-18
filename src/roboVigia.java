import java.util.Scanner;
import static java.lang.Integer.parseInt;

/*
    GRUPO:
    Fábio Augusto Araújo Santos (0039806);
    Rodrigo Cardoso (0039823);
*/

public class roboVigia {

    public static int updateStation(int station, int comand, int N) {
        if (station == 1 && comand == -1)
            return N;
        if (station == N && comand == 1)
            return 1;
        if (comand == 1)
            return (station + 1);
        if (comand == -1)
            return (station - 1);
        return 1;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        String firstLineStr[] = sc.nextLine().split(" ");
        int N = parseInt(firstLineStr[0]);
        int C = parseInt(firstLineStr[1]);
        int E = parseInt(firstLineStr[2]);

        String secondLineStr[] = sc.nextLine().split(" ");
        int secondLineInt[] = new int[C];
        for (int i = 0; i < C; i++) {
            secondLineInt[i] = parseInt(secondLineStr[i]);
        }

        int station = 1;
        int amountStation = 0;
        for (int i = 0; i < C; i++) {
            if (station == E)
                amountStation++;
            station = updateStation(station, secondLineInt[i], N);
        }

        System.out.println(amountStation);
        sc.close();
    }
}
