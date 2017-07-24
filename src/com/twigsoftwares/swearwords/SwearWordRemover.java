/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.twigsoftwares.swearwords;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DELL2
 */
public class SwearWordRemover {

    public SwearWordRemover() {

    }

    public String swearWordRemoverFactory(String words, int language) {
        String replacedWord = this.handleText(words, language);
        return replacedWord;

    }

    public String handleText(String swearWords, int language) {
        String[] array = swearWords.split(" ");
        String replacedWords = "";
        if (language == 0) {

            String temp="";
            for (String swearWord : array) {
                temp = temp + " " + Marathifilter(swearWord);
            }
            array = temp.split(" ");
            temp = "";
            for (String swearWord : array) {
                temp = temp + " " + Hindifilter(swearWord);
            }
            array = temp.split(" ");
            temp = "";
            for (String swearWord : array) {
                temp = temp + " " + Englishfilter(swearWord);
            }
            replacedWords = temp;
        }

        if (language == 1) {
            for (String swearWord : array) {
                replacedWords = replacedWords + " " + Marathifilter(swearWord);
            }
        }
        if (language == 2) {
            for (String swearWord : array) {
                replacedWords = replacedWords + " " + Hindifilter(swearWord);
            }
        }
        if (language == 3) {
            for (String swearWord : array) {
                replacedWords = replacedWords + " " + Englishfilter(swearWord);
            }
        }

        return replacedWords;//To change body of generated methods, choose Tools | Templates.
    }

    public static String Marathifilter(String in) {

        for (String swearWord : MarathiSwearWords.swearWordsMarathi) {
            String stars;
            //System.out.println(swearWord);
            Pattern pat = Pattern.compile(swearWord, Pattern.CASE_INSENSITIVE);
            Matcher mat = pat.matcher(in);
            while (mat.find()) {
                char[] haha = new char[mat.end() - mat.start()];
                for (int i = 0; i < mat.end() - mat.start(); i++) {
                    haha[i] = '*';
                }
                stars = new String(haha);
                in = mat.replaceFirst(stars);
            }
        }
        return in;
    }

    public static String Hindifilter(String in) {
        for (String swearWord : HindiSwearWords.swearWordsHindi) {
            String stars;
            //System.out.println(swearWord);
            Pattern pat = Pattern.compile(swearWord, Pattern.CASE_INSENSITIVE);
            Matcher mat = pat.matcher(in);
            while (mat.find()) {
                char[] haha = new char[mat.end() - mat.start()];
                for (int i = 0; i < mat.end() - mat.start(); i++) {
                    haha[i] = '*';
                }
                stars = new String(haha);
                in = mat.replaceFirst(stars);

            }
        }
        return in;
    }

    public static String Englishfilter(String in) {

        for (String swearWord : EnglishSwearWords.swearWordsEnglish) {
            String stars;
            //System.out.println(swearWord);
            Pattern pat = Pattern.compile(swearWord, Pattern.CASE_INSENSITIVE);
            Matcher mat = pat.matcher(in);
            while (mat.find()) {
                char[] haha = new char[mat.end() - mat.start()];
                for (int i = 0; i < mat.end() - mat.start(); i++) {
                    haha[i] = '*';
                }
                stars = new String(haha);
                in = mat.replaceFirst(stars);

            }
        }
        return in;
    }

}
