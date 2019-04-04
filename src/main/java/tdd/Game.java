package tdd;

import java.util.Scanner;

public class Game {
    public String generateCode() {
        StringBuilder builder = new StringBuilder();
        while (builder.toString().length() < 4) {
            int random = (int) (Math.random() * 10);
            if (builder.toString().contains(random + ""))
                continue;

            builder.append(random);
        }
        return builder.toString();
    }

    public String guess(){
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        return line;
    }

    public String match(String code, String guess) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < code.length(); i++) {
            String item = guess.substring(i, i + 1);
            if (code.indexOf(item) == i) {
                a++;
            } else if (code.contains(item)) {
                b++;
            }
        }
        return a + "A" + b + "B";
    }

    public void start(){
        String code = generateCode();
        while (true) {
            String guess = guess();
            String match = match(code, guess);
            System.out.printf("your score is %s \n", match);
            if (match.equals("4A0B"))
                break;
        }
    }

    public static void main(String[] args) {
        new Game().start();
    }
}
