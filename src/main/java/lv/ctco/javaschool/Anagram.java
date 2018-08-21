package lv.ctco.javaschool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Anagram {

    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Anagram anagramClass = new Anagram();
        System.out.println("Enter anagram: ");
        String userInput = anagramClass.scan.next();
        int wordLength = userInput.length();
        char[] inputToChar = userInput.toCharArray();
        List<String> strList = new ArrayList<String>();

        for(int i = 0; i < userInput.length(); i++){

            for(int j = 0; j < inputToChar.length; j++){
                char sign = inputToChar[j];
                inputToChar[j] = inputToChar[i];
                inputToChar[i] = sign;
                String str = new String(inputToChar);
                if(strList.contains(str)){
                    continue;
                } else {
                    strList.add(str);
                }
            }
        }


        System.out.print("Number of anagrams:");
        for(int i = 0; i < strList.size(); i++){
            System.out.print(" " + strList.get(i));
        }
    }
}
