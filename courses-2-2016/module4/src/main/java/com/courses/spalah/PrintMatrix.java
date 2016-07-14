package com.courses.spalah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Ievgen Tararaka
 */
public class PrintMatrix {
    /**
     * Написать программу, печатает двумерный массив заданного размера
     * квадратом и 4-мя треугольниками.
     *
     * Входные параметры программы:
     * 1. Размер массива
     * 2. Символ для печати
     *
     * Пример
     * Размер массива - 5
     * Символ для печати - #
     * <p>
     * # # # # #
     * # # # # #
     * # # # # #
     * # # # # #
     * # # # # #
     * <p>
     * #
     * # #
     * # # #
     * # # # #
     * # # # # #
     * <p>
     * # # # # #
     * # # # #
     * # # #
     * # #
     * #
     * <p>
     *         #
     *       # #
     *     # # #
     *   # # # #
     * # # # # #
     * <p>
     * # # # # #
     *   # # # #
     *     # # #
     *       # #
     *         #
     * @param args - размер массива
     */
    public static void main(String[] args) {
        int size = 0;
        String symbol = "";
        while(true) {
            size = Integer.parseInt(readFromConsole());
            if(size == -1)
                System.exit(0);
            else {
                symbol = readFromConsole();
                //Квадрат
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++)
                        System.out.print(symbol);
                    System.out.println("");
                }
                System.out.println("");
                //нижний левый
                for (int i = 0; i <= size; i++) {
                    if(i != 0) {
                        for (int j = 0; j < size; j++)
                            if (j < i)
                                System.out.print(symbol);
                            else
                                System.out.print(" ");
                        System.out.println("");
                    }
                }
                System.out.println("");
                //верхний левый
                for (int i = size; i > 0; i--) {
                    for (int j = 0; j < size; j++)
                        if (j < i)
                            System.out.print(symbol);
                        else
                            System.out.print(" ");
                    System.out.println("");
                }
                System.out.println("");
                //нижний правый
                for (int i = size; i >= 0; i--) {
                    if(i != size) {
                        for (int j = 0; j < size; j++)
                            if (j < i)
                                System.out.print(" ");
                            else
                                System.out.print(symbol);
                        System.out.println("");
                    }
                }
                System.out.println("");
                //верхний правый
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++)
                        if (j < i)
                            System.out.print(" ");
                        else
                            System.out.print(symbol);
                    System.out.println("");
                }
                System.out.println("");
            }
        }
    }
    public static String readFromConsole() {
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String input = bufferRead.readLine();
            return input;
        } catch (IOException e) {
            return "";
        }
    }
}
