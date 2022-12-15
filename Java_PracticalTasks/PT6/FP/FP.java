package Java_PracticalTasks.PT6.FP;

import java.util.ArrayList;
import java.util.Scanner;

public class FP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");

        ArrayList<Laptop> laptops = new ArrayList<>();

        Laptop laptop1 = new Laptop("Acer", 15, 16, 512, "Win10", 1.7, 10, 35000);
        laptops.add(laptop1);

        Laptop laptop2 = new Laptop("Honor", 14, 8, 256, "Win10 Pro", 1.4, 7, 45000);
        laptops.add(laptop2);

        Laptop laptop3 = new Laptop("Lenovo", 13, 8, 128, "Chrome", 1.1, 13, 42500);
        laptops.add(laptop3);

        Laptop laptop4 = new Laptop("Acer", 14, 16, 256, "Win11", 1.2, 11, 52000);
        laptops.add(laptop4);

        Laptop laptop5 = new Laptop("Apple", 13, 8, 512, "macOS", 1.3, 11, 80000);
        laptops.add(laptop5);

        Laptop laptop6 = new Laptop("HP", 15, 16, 512, "Win11 Pro", 1.3, 10, 130000);
        laptops.add(laptop6);

        Laptop laptop7 = new Laptop("ASUS", 16, 16, 1000, "Linux", 1.9, 7, 120000);
        laptops.add(laptop7);

        Laptop laptop8 = new Laptop("MSI", 17, 64, 2000, "Win11", 2.5, 7, 115000);
        laptops.add(laptop8);

        Laptop laptop9 = new Laptop("noBrand", 15, 4, 128, "Linux", 2.5, 5, 25000);
        laptops.add(laptop9);

        Laptop laptop10 = new Laptop("noBrand", 16, 64, 2000, "no OS", 4.3, 4, 250000);
        laptops.add(laptop10);

        System.out.println("Список ноутбуков: ");
        System.out.println(laptops);

        Laptop criteria = new Laptop("no", 0, 0, 0, "no", 0, 0, 0);
                      
        while (true) {

            System.out.println(
                    "Введите цифру, соответствующую необходимому критерию:\n0 - модель\n1 - размер дисплея\n2 - объем ОЗУ\n3 - объем ЖД\n4 - ОС\n5 - вес\n6 - время автономной работы\n7 - цена\n8 - выход");

            String str = sc.nextLine();

            if (str.equals("0")) {
                System.out.println("Введите название модели: ");
                String str0 = sc.nextLine();
                criteria.setLaptopmodel(str0);
            }

            if (str.equals("1")) {
                System.out.println("Введите минимальный размер дисплея в дюймах: ");
                String str1 = sc.nextLine();
                int number1 = Integer.valueOf(str1);
                criteria.setDisplaysize(number1);
            }

            if (str.equals("2")) {
                System.out.println("Введите минимальный объем ОЗУ в Гб: ");
                String str2 = sc.nextLine();
                int number2 = Integer.valueOf(str2);
                criteria.setRamsize(number2);
            }

            if (str.equals("3")) {
                System.out.println("Введите минимальный объем жесткого диска в Гб: ");
                String str3 = sc.nextLine();
                int number3 = Integer.valueOf(str3);
                criteria.setHdcapacity(number3);
            }

            if (str.equals("4")) {
                System.out.println("Введите операционную систему: ");
                String str4 = sc.nextLine();
                criteria.setOperatingsystem(str4);
            }

            if (str.equals("5")) {
                System.out.println("Введите максимальный вес в кг: ");
                String str5 = sc.nextLine();
                double number5 = Double.valueOf(str5);
                criteria.setLaptopweight(number5);
            }

            if (str.equals("6")) {
                System.out.println("Введите минимальное время автономной работы в часах: ");
                String str6 = sc.nextLine();
                int number6 = Integer.valueOf(str6);
                criteria.setBatterylife(number6);
            }

            if (str.equals("7")) {
                System.out.println("Введите максимальную цену в руб.: ");
                String str7 = sc.nextLine();
                int number7 = Integer.valueOf(str7);
                criteria.setLaptopprice(number7);
            }

            if (str.equals("8")) {
                break;
            }
        }
        
        System.out.println(criteria);

        ArrayList<Laptop> out = new ArrayList<Laptop>();

        for (Laptop laptop : laptops) {

            if (criteria.getLaptopmodel().equals("no") || criteria.getLaptopmodel().equals(laptop.getLaptopmodel())) {
                if (criteria.getDisplaysize() == 0 || criteria.getDisplaysize() <= laptop.getDisplaysize()) {
                    if (criteria.getRamsize() == 0 || criteria.getRamsize() <= laptop.getRamsize()) {
                        if (criteria.getHdcapacity() == 0 || criteria.getHdcapacity() <= laptop.getHdcapacity()) {
                            if (criteria.getOperatingsystem().equals("no") || criteria.getOperatingsystem().equals(laptop.getOperatingsystem())) {
                                if (criteria.getLaptopweight() == 0 || criteria.getLaptopweight() >= laptop.getLaptopweight()) {
                                    if (criteria.getBatterylife() == 0 || criteria.getBatterylife() <= laptop.getBatterylife()) {
                                        if (criteria.getLaptopprice() == 0 || criteria.getLaptopprice() >= laptop.getLaptopprice()) {
                                            out.add(laptop);
                                        }
                                        else {
                                            continue;
                                        }
                                    }
                                    else {
                                        continue;
                                    }

                                }
                                else {
                                    continue;
                                }
                            }
                            else {
                                continue;
                            }
                        }
                        else {
                            continue;
                        }
                    }
                    else {
                        continue;
                    }
                }
                else {
                    continue;
                }
            }
            else {
                continue;
            }
        }

        if (out.isEmpty())

        {
            System.out.println("Таких ноутбуков нет. Проверьте параметры.");
        } else {
            System.out.println("Вот такие ноутбуки у нас есть: ");
            System.out.println(out);
        }

        sc.close();
    }

}
