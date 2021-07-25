package com.TMS;

import java.util.ArrayList;

/* Строка содержит текст. После запуска программы в другую строку
должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
предложении присутствует слово-палиндром, то не имеет значения какое кол-во
слов в предложении, оно попадает в новую строку.
Пишем все в ООП стиле. Создаём класс TextFormater
в котором два статических метода:
1. Метод принимает строку и возвращает кол-во слов в строке.
2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
есть возвращает true, если нет false
В main считываем файл.
Разбиваем текст на предложения. Используя методы класса TextFormater
определяем подходит ли нам предложение. Если подходит добавляем его в
новый файл */
public class Main {

    public static void main(String[] args) {
        String text = "Разбиваем текст на предложения. Используя методы класса TextFormater определяем подходит ли нам предложение. Если заказ подходит добавляем его в новый файл.";
        String[] sentences = text.split("\\.");
        ArrayList<String> ar = new ArrayList<String>();
        TextFormater form = new TextFormater();
        for (String sentence : sentences) {
            if (form.AmountOfWords(sentence) >= 3 && form.AmountOfWords(sentence) <= 5) {
                ar.add(sentence);
            } else if (form.palyndrom(sentence) == true) {
                ar.add(sentence);
            }
        }
        String result = String.join( ".", ar);
        System.out.println(result);
    }
}

