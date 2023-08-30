import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        float input = getFloatInput();
        System.out.println("Введенное число: " + input);


    }

    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число:");
        while (true) {
            try {
                float input = Float.parseFloat(scanner.nextLine());
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат числа, попробуйте ещё раз");
            }
        }
    }
}
