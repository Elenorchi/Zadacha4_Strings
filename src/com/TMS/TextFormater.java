package com.TMS;


public class TextFormater {
    private int a = 0;
    private String sentence;
    boolean b;

    // Метод принимает строку и возвращает кол-во слов в строке.
    public int AmountOfWords(String sentence) {
        this.sentence = sentence;
        String[] words = sentence.split(" ");
        return words.length;
    }

    //Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если есть возвращает true, нет - false
    public boolean palyndrom(String sentence) {
        this.sentence = sentence;
        String[] words = (sentence.split(" "));
        for (String word : words) {
            this.b=false;
            if (word.length() > 2) {
                for (int i = 0; i < (word.length() / 2); i++) {
                    if (word.charAt(i) == word.charAt(word.length() - i - 1)) {
                        a++;
                    }
                }
                if (a == (word.length() / 2)) {
                    this.b = true;
                    a=0;
                    break;
                }
                a = 0;
            }
        }return b;
    }
}



