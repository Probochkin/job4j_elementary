package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
      short[] ages = new short[10];
      String[] surnames = new String[100500];
      float[] price = new float[40];
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + price.length);
        String[] names = new String[4];
        names[0] = "Semion";
        names[1] = "Arina";
        names[2] = "Ivan";
        names[3] = "Petr";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }

}
