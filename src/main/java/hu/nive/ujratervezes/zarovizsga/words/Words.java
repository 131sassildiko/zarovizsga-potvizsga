package hu.nive.ujratervezes.zarovizsga.words;

import java.util.ArrayList;
import java.util.List;


public class Words {
    public boolean hasMoreDigits(String s) {
        List<Character> digits = new ArrayList<>();
        List<Character> letters = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.add(c);
            }
            if (Character.isAlphabetic(c)){
                letters.add(c);
            }
        }
            return (digits.size()>letters.size());
    }
}
