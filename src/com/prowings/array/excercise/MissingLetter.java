package com.prowings.array.excercise;
public class MissingLetter {
    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'c', 'e', 'f', 'g'};
        char missing = findMissingLetter(letters);
        System.out.println("The missing letter is " + missing);
    }

    public static char findMissingLetter(char[] letters) {
        char missing = 'w';
        for (int i = 0; i < letters.length - 1; i++) {
            if (letters[i + 1] - letters[i] != 1) {
                missing = (char) (letters[i] + 1);
                break;
            }
        }
        return missing;
    }
}
