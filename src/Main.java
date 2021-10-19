public class Main {
    public static void main(String[] args) {
        int limitBottom = 100;
        int limitTop = 200;
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= limitBottom && i * i <= limitTop) {
                counter++;
                    System.out.println(counter);
                }
            }
        }
    }