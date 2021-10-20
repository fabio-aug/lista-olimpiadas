import java.util.ArrayList;
import java.util.Objects;
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

        String[] input1 = keymap.nextLine().split(" ");
        int numHome = Integer.parseInt(input1[0]);
        int numOrder = Integer.parseInt(input1[1]);

        String[] input2 = keymap.nextLine().split(" ");
        for (int i = 0; i < numHome; i++) {
            home.add(Integer.parseInt(input2[i]));
        }

        String[] input3 = keymap.nextLine().split(" ");
        for (int i = 0; i < numOrder; i++) {
            order.add(Integer.parseInt(input3[i]));
        }

        int count = 0, time = 0, position = 0;
        while (count < numOrder) {
            if (Objects.equals(home.get(position), order.get(count))) {
                count++;
                time--;
            } else if (home.get(position) < order.get(count)) {
                position++;
            } else if (home.get(position) > order.get(count)) {
                position--;
            }
            time++;
        }

        System.out.print(time);
        keymap.close();
    }
}
