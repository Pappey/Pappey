import java.util.Scanner;
 //"Scanner - считывает данные из источника который ты для него укажешь"
      //  "new - это ссылка на калсс. Не совсем понял что это и как работает НЕ ЗАБЫТЬ СПРОСИТЬ!"
// "equals - сравнение объектов между собой"
public class Col {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1");
        double a = scanner.nextDouble() ;
        System.out.println("Введите число 2");
        double b = scanner.nextDouble();
        String action = args [0];

        if (args[0].equals("+")) // сложение
        {
            System.out.println("Ответ " + (a + b));
        }
        if (args[0].equals("-")) // вычетание
        {
            System.out.println("Ответ " + (a - b));
        }
        if (args[0].equals("*")) // умножение
        {
            System.out.println("Ответ " + (a * b));
        }
        if (args[0].equals("/")) // деление
        {
            System.out.println("Ответ " + (a / b));
        }
        if (args[0].equals("%")) // получение остатка от деления
        {
            System.out.println("Ответ " + (a % b));
        }
        if (args[0].equals(",")) // возведение в степень
        {
            System.out.println("Ответ" +  Math.pow(a, b));
        }
    }}