package org.example.lesson6.homeWork;

import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("HP", 8, 512, "Windows", "Silver"));
        laptops.add(new Laptop("Dell", 16, 1024, "Windows", "Black"));
        laptops.add(new Laptop("Apple", 8, 256, "MacOS", "Silver"));
        laptops.add(new Laptop("Lenovo", 16, 512, "Windows", "Gray"));

        Map<String, Object> filters = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите цифру, соответствующую необходимому критерию фильтрации:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        int criteria = scanner.nextInt();

        switch (criteria) {
            case 1:
                System.out.println("Введите минимальное значение ОЗУ:");
                int minRam = scanner.nextInt();
                filters.put("ram", minRam);
                break;
            case 2:
                System.out.println("Введите минимальный объем ЖД:");
                int minStorage = scanner.nextInt();
                filters.put("storage", minStorage);
                break;
            case 3:
                System.out.println("Введите операционную систему:");
                String os = scanner.next();
                filters.put("os", os);
                break;
            case 4:
                System.out.println("Введите цвет:");
                String color = scanner.next();
                filters.put("color", color);
                break;
            default:
                System.out.println("Неверный критерий фильтрации!");
                return;
        }

        Set<Laptop> filteredLaptops = filterLaptops(laptops, filters);
        System.out.println("Результаты фильтрации:");
        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop);
        }
    }

    /**
     * @apiNote
     * @param laptops
     * @param filters
     * @return
     */

    public static Set<Laptop> filterLaptops(Set<Laptop> laptops, Map<String, Object> filters) {
        Set<Laptop> filteredLaptops = new HashSet<>();

        for (Laptop laptop : laptops) {
            boolean passFilter = true;
            for (Map.Entry<String, Object> entry : filters.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();

                if (key.equals("ram")) {
                    int minRam = (int) value;
                    if (laptop.getRam() < minRam) {
                        passFilter = false;
                        break;
                    }
                } else if (key.equals("storage")) {
                    int minStorage = (int) value;
                    if (laptop.getStorage() < minStorage) {
                        passFilter = false;
                        break;
                    }
                } else if (key.equals("os")) {
                    String os = (String) value;
                    if (!laptop.getOs().equals(os)) {
                        passFilter = false;
                        break;
                    }
                } else if (key.equals("color")) {
                    String color = (String) value;
                    if (!laptop.getColor().equals(color)) {
                        passFilter = false;
                        break;
                    }
                }
            }

            if (passFilter) {
                filteredLaptops.add(laptop);
            }
        }

        return filteredLaptops;
    }
}

