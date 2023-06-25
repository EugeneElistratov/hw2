package org.example.HomeWork.hw6;


import java.util.*;

public class task {
    public static void main(String[] args) {
        laptop lap1 = new laptop("RedmiBook 14", 55816, "Xiaomi");
        lap1.setRAM(8);
        lap1.setHDD(700);
        lap1.setOS("Windows");
        lap1.setColor("black");

        laptop lap2 = new laptop("ThinkPad", 62467, "Lenovo");
        lap2.setRAM(8);
        lap2.setHDD(1000);
        lap2.setOS("Windows");
        lap2.setColor("white");

        laptop lap3 = new laptop("MagicBook 15", 67201, "HONOR");
        lap3.setRAM(16);
        lap3.setHDD(900);
        lap3.setOS("Windows");
        lap3.setColor("rose");

        laptop lap4 = new laptop("Zenbook 14", 45275, "ASUS");
        lap4.setRAM(8);
        lap4.setHDD(700);
        lap4.setOS("Linux");
        lap4.setColor("black");

        laptop lap5 = new laptop(" MacBook Air", 8438483, "Apple");
        lap5.setRAM(8);
        lap5.setHDD(500);
        lap5.setOS("macOS");
        lap5.setColor("silver");

        HashSet<laptop> laptops = new HashSet<>(Arrays.asList(lap1, lap2, lap3, lap4, lap5));
        HashSet<laptop> res = new HashSet<>();

        System.out.println("Здравствуйте");
        System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while (n != 5) {
            if (n == 1) {
                System.out.println("Введите минимальную оперативную память");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("RAM", temp);
            }
            if (n == 2) {
                System.out.println("Введите минимальный объем ЖД");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("HDD", temp);
            }
            if (n == 3) {
                System.out.println("Введите ОС");
                String temp = sc.nextLine();
                filters.put("OS", temp);
            }
            if (n == 4) {
                System.out.println("Введите цвет");
                String temp = sc.nextLine();
                filters.put("color", temp);
            }
            System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
            n = sc.nextInt();
            sc.nextLine();
        }
        for (Map.Entry<String, Object> entry : filters.entrySet()) {
            if (entry.getKey().equals("RAM")) {
                Iterator it = laptops.iterator();
                while (it.hasNext()) {
                    laptop lap = (laptop) it.next();
                    if (lap.getRAM() >= (Integer) entry.getValue()) {
                        res.add(lap);
                    }
                }
            }
            if (entry.getKey().equals("HDD")) {
                Iterator it = laptops.iterator();
                while (it.hasNext()) {
                    laptop lap = (laptop) it.next();
                    if (lap.getHDD() >= (Integer) entry.getValue()) {
                        res.add(lap);
                    }
                }
            }
            if (entry.getKey().equals("OS")) {
                Iterator it = laptops.iterator();
                while (it.hasNext()) {
                    laptop lap = (laptop) it.next();
                    if (lap.getOS().equals(entry.getValue())) {
                        res.add(lap);
                    }
                }
            }
            if (entry.getKey().equals("color")) {
                Iterator it = laptops.iterator();
                while (it.hasNext()) {
                    laptop lap = (laptop) it.next();
                    if (lap.getColor().equals(entry.getValue())) {
                        res.add(lap);
                    }
                }
            }
        }

        Iterator it = res.iterator();
        while (it.hasNext()) {
            laptop lap = (laptop) it.next();
            System.out.println(lap.toString());
            System.out.println();
        }

    }
}
/**
 * Ноутбук марки 'Xiaomi' Модель RedmiBook 14 С id 55816
 * Ноутбук марки 'Lenovo' Модель ThinkPad С id 62467
 * Ноутбук марки 'HONOR' Модель MagicBook 15 С id 67201
 * Ноутбук марки 'ASUS' Модель Zenbook 14 С id 45275
 * Ноутбук марки 'Apple' Модель  MacBook Air С id 8438483
 * Здравствуйте
 * Введите цифру, соответствующую необходимому критерию:
 *  1 - ОЗУ
 *  2 - Объем ЖД
 *  3 - Операционная система
 *  4 - цвет
 *  или 5, чтобы осуществить поиск
 *                 3
 * Введите ОС
 *                 macOS
 * Введите цифру, соответствующую необходимому критерию:
 *  1 - ОЗУ
 *  2 - Объем ЖД
 *  3 - Операционная система
 *  4 - цвет
 *  или 5, чтобы осуществить поиск
 *                5
 * Ноутбук 8438483
 * silver Apple  MacBook Air
 * OS macOS
 * HDD 500
 * RAM 8
 * Не зарезервирован
 */