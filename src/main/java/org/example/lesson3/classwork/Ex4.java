package org.example.lesson3.classwork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        Cube cube1 = new Cube(3, "красный", "деревянный");
        Cube cube2 = new Cube(4, "желтый", "металический");
        Cube cube3 = new Cube(4, "желтый", "металический");
        Cube cube4 = new Cube(4, "желтый", "металический");

        List<Cube> cubeList = new ArrayList<>();
        cubeList.add(cube1);
        cubeList.add(cube2);
        cubeList.add(cube3);
        cubeList.add(cube4);
        System.out.println("cubeList = " + cubeList);
        // Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах),
        // его цвет (красный, желтый, зеленый тд) и материал (деревянный, металлический, картонный и тд.). Найти:
        //- количество кубиков желтого цвета и их суммарный объем;
        //           - количество деревянных кубиков с ребром 3 см
        Integer k = 0;
        Integer sumVolume = 0;
        Integer kMood = 0;
        for (Cube cube : cubeList) {
            if (cube.getColor().equals("желтый")) {
                k++;
                Integer volCube = cube.getSize() * cube.getSize() * cube.getSize();
                sumVolume += volCube;
                //                 sumVolume += cube.volumeCube();

            }
            if (cube.getMaterial().equals("деревянный") && cube.getSize() == 3) {
                kMood++;
            }
        }
        System.out.println("k = " + k);
        System.out.println("sumVolume = " + sumVolume);
        System.out.println("kMood = " + kMood);
    //   Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
        System.out.println("uniCllection(cubeList) = " + uniCllection(cubeList));


    }

    private static Collection uniCllection(List<Cube> cubeList) {
        return new HashSet(cubeList);
    }
}



