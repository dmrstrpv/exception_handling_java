package seminar_2hw;
/*
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

import java.io.*;


public class task4_hw {



    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст: ");
        String line = reader.readLine();
        if (line.equals("")) {
            throw new RuntimeException("Пустая строка!");
        }
        else {System.out.println("Вы ввели " + line);}

    }


}   