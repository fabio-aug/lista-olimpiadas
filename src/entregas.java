import java.util.ArrayList;
import java.util.Scanner;

/*
    GRUPO:
    Fábio Augusto Araújo Santos (0039806);
    Rodrigo Cardoso (0039823);
*/

public class entregas {
    public static void main(String[] args) {
        Scanner keymap = new Scanner(System.in);
        ArrayList<Integer> home = new ArrayList<>();
        ArrayList<Integer> order = new ArrayList<>();

        String input1[] = keymap.nextLine().split(" ");
        int numHome = Integer.parseInt(input1[0]);
        int numOrder = Integer.parseInt(input1[1]);

        String input2[] = keymap.nextLine().split(" ");
        for (int j = 0; j < numHome; j++) {
            home.add(Integer.parseInt(input2[j]));
        }

        String input3[] = keymap.nextLine().split(" ");
        for (int j = 0; j < numOrder; j++) {
            order.add(Integer.parseInt(input3[j]));
        }

        int i = 0, time = 0, position = 0;
        while (i < numOrder) {
            if (home.get(position) == order.get(i)) {
                i++;
                time--;
            } else if (home.get(position) < order.get(i)) {
                position++;
            } else if (home.get(position) > order.get(i)) {
                position--;
            }
            time++;
        }

        System.out.print(time);
        keymap.close();
    }
}
