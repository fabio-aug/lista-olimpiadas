import java.util.ArrayList;
import java.util.Scanner;

/*
    GRUPO:
    Fábio Augusto Araújo Santos (0039806);
    Rodrigo Cardoso (0039823);
*/

public class sorteNoSorteio {
    public static void main(String[] args) {
        Scanner keymap = new Scanner(System.in);
        ArrayList<Integer> competitors = new ArrayList<>();
        boolean loop = true;
        int phase = 0;

        String[] input = keymap.nextLine().split(" ");
        for (String s : input) {
            competitors.add(Integer.parseInt(s));
        }

        for (int i = 0; i < 4; i++) {
            if (competitors.size() >= 4) {
                for (int j = 0; j < competitors.size() - 1; j++) {
                    if (competitors.get(j) == 1 && competitors.get(j + 1) == 9
                            || competitors.get(j) == 9 && competitors.get(j + 1) == 1) {
                        loop = false;
                    } else if (competitors.get(j) == 1 || competitors.get(j) == 9) {
                        competitors.remove(j + 1);
                    } else if (competitors.get(j + 1) == 1 || competitors.get(j + 1) == 9) {
                        competitors.remove(j);
                    }
                    j++;
                }
            } else if (competitors.get(0) == 1 && competitors.get(1) == 9
                    || competitors.get(0) == 9 && competitors.get(1) == 1) {
                break;
            }
            if (loop) {
                phase = i;
            }
        }

        if (phase == 0) {
            System.out.println("oitavas");
        } else if (phase == 1) {
            System.out.println("quartas");
        } else if (phase == 2) {
            System.out.println("semifinal");
        } else {
            System.out.println("final");
        }

        keymap.close();
    }
}
