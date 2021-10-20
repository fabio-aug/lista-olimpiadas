import java.util.Scanner;

/*
    GRUPO:
    Fábio Augusto Araújo Santos (0039806);
    Rodrigo Cardoso (0039823);
*/

public class semRepeticao {
    public static void main(String[] args) {
        Scanner keymap = new Scanner(System.in);

        String[] input = keymap.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int countEquals = 0;
        int count = 0;
        for (int i = n; i <= m; i++) {
            count++;
            boolean equalNumber = true;
            String numberText = Integer.toString(i);
            String initiaValue;
            for (int j = 0; j < numberText.length(); j++) {
                if (!equalNumber) {
                    break;
                }
                initiaValue = Integer.toString(numberText.charAt(j));
                for (int k = 0; k < numberText.length(); k++) {
                    if (initiaValue.equals(Integer.toString(numberText.charAt(k))) && k != j) {
                        countEquals++;
                        equalNumber = false;
                        break;
                    }
                }
            }
        }

        System.out.println(count - countEquals);
        keymap.close();
    }
}
