package homework6;

import java.util.Arrays;

/*
    Write a function to split a string and convert it into an array of words.
* */
public class AbbreviateTwoWords {

    public static void main(String[] args) {

        String str = "Hello my young friend";

        String[] names = str.split(" ");

        System.out.println(Arrays.toString(names));

    }


}