package day19_array;

import java.util.Arrays;

public class AlphabetLetters_ascending {

    public static void main(String[] args) {

        char[] ascending = new char[26];
        char[] descending = new char[26];

        for (int i = 0, j='A' , k = 'Z'; i < ascending.length; i++, j++, k--) {
            ascending[i] = (char) j;  // A ~ Z
            descending[i] = (char) k;  //Z ~ A
        }

        System.out.println(Arrays.toString(ascending));
        System.out.println(Arrays.toString(descending));


        System.out.println("______________________________");

        // find all char range

        char[] characters = new char[65535];

        for (int i = 0; i < characters.length; i++) {
           characters[i] = (char) i;
        }

        System.out.println(Arrays.toString(characters));


        






    }
}
/*
 1. Creat a char Array and store all the alphabet letters in ascending order
  2.Creat a char Array and store all the alphabet letters in descending order
 */