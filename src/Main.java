import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Напишите пример обработки нескольких исключений в одном блоке catch");
        try {
            int num1 = 5;
            int num2 = 0;
            int num3 = num1 / num2;
        } catch (InputMismatchException e1) {
            System.out.println("Ошибка - введите число");
        } catch (ArithmeticException e2) {
            System.out.println("Ошибка - деление на 0");
        } catch (Exception e3) {
            System.out.println("Ошибка - попробуйте еще раз");
        }


        try {
            int num1 = 5;
            int num2 = 0;
            int num3 = num1 / num2;
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println("Ошибка - попробуйте еще раз");
        }


    }
}