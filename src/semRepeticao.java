import java.util.Scanner;

/*
    GRUPO:
    Fábio Augusto Araújo Santos (0039806);
    Rodrigo Cardoso (0039823);
*/

public class semRepeticao {
    public static void main(String[] args) {
        Scanner keymap = new Scanner(System.in);
        int n = keymap.nextInt();
        int m = keymap.nextInt();
        int countEquals = 0;
        int count = 0;
        for (int i = n; i <= m; i++) {
            count++;
            Boolean equalNumber = true;
            String numberText = Integer.toString(i);
            String initiaValue = "";
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
