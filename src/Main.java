import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Знайти розв'язки квадратного рівняння");
            System.out.println("2. Визначити квадрант для точки");
            System.out.println("3. Перевірити парне двозначне число");
            System.out.println("4. Вивести меню");
            System.out.println("5. Вивести тему за номером уроку");
            System.out.println("6. Визначити чверть години за номером хвилини");
            System.out.println("7. Вивести меню калькулятора");
            System.out.println("8. Вийти");

            System.out.print("Введіть номер завдання: ");
            int taskNumber = scanner.nextInt();

            switch (taskNumber) {
                case 1:
                    solveQuadraticEquation(scanner);
                    break;
                case 2:
                    findQuadrant(scanner);
                    break;
                case 3:
                    isTwoDigitEven(scanner);
                    break;
                case 4:
                    displayMenu();
                    break;
                case 5:
                    displaySubject(scanner);
                    break;
                case 6:
                    determineQuarter(scanner);
                    break;
                case 7:
                    calculatorMenu(scanner);
                    break;
                case 8:
                    running = false;
                    System.out.println("Програма завершила роботу.");
                    break;
                default:
                    System.out.println("Недійсний номер завдання.");
            }
        }

        scanner.close();
    }

    public static void findQuadrant(Scanner scanner) {
        System.out.print("Введіть координати точки (x, y): ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Точка в 1-му квадранті.");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка в 2-му квадранті.");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка в 3-му квадранті.");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка в 4-му квадранті.");
        } else {
            System.out.println("Точка знаходиться на координатній вісі.");
        }
    }

    public static void solveQuadraticEquation(Scanner scanner) {
        System.out.print("Введіть коефіцієнти (a, b, c) квадратного рівняння: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Розв'язки квадратного рівняння:");
            System.out.println("x1 = " + root1);
            System.out.println("x2 = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Квадратне рівняння має один корінь:");
            System.out.println("x = " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Квадратне рівняння має комплексні корені:");
            System.out.println("x1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("x2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }

    public static void isTwoDigitEven(Scanner scanner) {
        System.out.print("Введіть число, щоб перевірити, чи це парне двозначне число: ");
        int number = scanner.nextInt();
        if (number >= 10 && number <= 99 && number % 2 == 0) {
            System.out.println("Число є парним двозначним числом.");
        } else {
            System.out.println("Число не є парним двозначним числом.");
        }
    }

    public static void displayMenu() {
        System.out.println("1. Відображення вітального повідомлення");
        System.out.println("2. Відображення запрошення до роботи за комп’ютером");
        System.out.println("3. Вихід");
    }

    public static void displaySubject(Scanner scanner) {
        System.out.print("Введіть номер уроку (1-4): ");
        int lessonNumber = scanner.nextInt();
        switch (lessonNumber) {
            case 1:
                System.out.println("Математика");
                break;
            case 2:
                System.out.println("Англійська");
                break;
            case 3:
                System.out.println("Історія");
                break;
            case 4:
                System.out.println("Фізика");
                break;
            default:
                System.out.println("Невірний номер уроку.");
        }
    }

    public static void determineQuarter(Scanner scanner) {
        System.out.print("Введіть номер хвилини (0-59): ");
        int minuteNumber = scanner.nextInt();
        switch (minuteNumber / 15) {
            case 0:
                System.out.println("Перша чверть");
                break;
            case 1:
                System.out.println("Друга чверть");
                break;
            case 2:
                System.out.println("Третя чверть");
                break;
            case 3:
                System.out.println("Четверта чверть");
                break;
            default:
                System.out.println("Недійсне число хвилин.");
        }
    }

    public static void calculatorMenu(Scanner scanner) {
        System.out.println("1. Помножте два числа");
        System.out.println("2. Додайте два числа");
        System.out.println("3. Відняти два числа");

        System.out.print("Введіть номер операції: ");
        int operationNumber = scanner.nextInt();

        System.out.print("Введіть перше число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введіть друге число: ");
        double num2 = scanner.nextDouble();

        switch (operationNumber) {
            case 1:
                System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, num1 * num2);
                break;
            case 2:
                System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, num1 + num2);
                break;
            case 3:
                System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, num1 - num2);
                break;
            default:
                System.out.println("Недійсний номер операції.");
        }
    }
}