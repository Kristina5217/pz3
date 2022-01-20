package com.metanit;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        IsLess();
        Grade();
        DayOfWeek();
        SecondGrade();
        Graf1(0.100);
        Graf1(2.76);
        Graf2(2.98);
        Graf2(0.21);
        Graf2(1.27);
    }

    public static void IsLess()
    {
        System.out.println("Введите число");
        if(scanner.nextInt() < 100)
            System.out.println("Less");
        else
            System.out.println("Not less");
        System.out.println();
    }

    public static void Grade()
    {
        System.out.println("Введите оценку по 5-балльной шкале");
        switch (scanner.nextInt())
        {
            case 2:
                System.out.println("Неудовлетворительно");
                break;
            case 3:
                System.out.println("Удовлетворительно");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 5:
                System.out.println("Отлично");
                break;
            default:
                System.out.println("Такой отметки нет");
                break;
        }
        System.out.println();
    }

    public static void DayOfWeek()
    {
        System.out.println("Введите день недели");
        switch (scanner.next().toLowerCase())
        {
            case "воскресенье":
                System.out.println(0);
                break;
            case "понедельник":
                System.out.println(1);
                break;
            case "вторник":
                System.out.println(2);
                break;
            case "среда":
                System.out.println(3);
                break;
            case "четверг":
                System.out.println(4);
                break;
            case "пятница":
                System.out.println(5);
                break;
            case "суббота":
                System.out.println(6);
                break;
            default:
                System.out.println("День недели не определен");
                break;
        }
        System.out.println();
    }

    public static void SecondGrade()
    {
        System.out.println("Введите оценку по 100-балльной шкале");
        int grade = scanner.nextInt();
        if (grade <= 100 && grade > 90)
            System.out.println("A");
        else if (grade <= 90 && grade > 80)
            System.out.println("B");
        else if (grade <= 80 && grade > 70)
            System.out.println("C");
        else if (grade <= 70 && grade > 60)
            System.out.println("D");
        else if (grade <= 60 && grade > 50)
            System.out.println("E");
        else
            System.out.println("F");
        System.out.println();
    }

    public static void Graf1(double x)
    {
        double a = -8.750, z = 0.765;
        if(x <= 1)
            System.out.println(a + x / (a + Math.pow(x, 3)));
        else
            System.out.println(Math.pow(1 + Math.pow(Math.tan(z/2), 2), Math.sqrt(Math.abs(a) + 6)));
    }

    public static void Graf2(double x)
    {
        double a = 0.55, b = 4.31;
        if (x < 0.5)
            System.out.println(Math.sin(b * x) + 1);
        else if (x >= 0.5 && x <= 2.5)
            System.out.println(1 / Math.tan(x));
        else
            System.out.println(a * Math.pow(x, 3));
    }
}