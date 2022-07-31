package com.prac;
import java.util.*;
//import org.apache.commons.lang.RandomStringUtils;

public class randomString {

    public static void main(String[] args) {
        System.out.println("Random string using genStr: " + generateString());
        System.out.println("Random string using math: " + usingMath());
        /*String randomString = RandomStringUtils.randomAlphanumeric(10);
        System.out.println("Random string of 10 alphanumeric characters: " + randomString);
        RandomStringGenerator randomStringGenerator =
                new RandomStringGenerator.Builder()
                        .withinRange('0', 'z')
                        .filteredBy(CharacterPredicates.LETTERS, CharacterPredicates.DIGITS)
                        .build();
        randomStringGenerator.generate(12);*/
        Random r = new java.util.Random ();
        String s = Long.toString (r.nextLong () & Long.MAX_VALUE, 36);
        System.out.println("Random using simple: " + s);
    }

    public static String generateString() {
        String uuid = UUID.randomUUID().toString();
        return uuid.toString().replaceAll("-", "").substring(0,15);
    }
    public static String usingMath() {
        String alphabetsInUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetsInLowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String allCharacters = alphabetsInLowerCase + alphabetsInUpperCase + numbers;
        StringBuffer randomString = new StringBuffer();
        for (int i = 0; i < 15; i++) {
            int randomIndex = (int)(Math.random() * allCharacters.length());
            randomString.append(allCharacters.charAt(randomIndex));
        }
        return randomString.toString();
    }

}
