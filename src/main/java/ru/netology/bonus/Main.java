package ru.netology.bonus;
public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        System.out.println(service.calculate(10_000,true));

    }
}
