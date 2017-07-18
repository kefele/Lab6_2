package com.company;

import java.util.Scanner;

public class PigLatin2 {

    public static void main(String[] args) {


        String userWord = "";

        Scanner scan = new Scanner(System.in);



        System.out.println("Please enter a word");
        userWord = scan.nextLine();

        char letter = userWord.charAt(0);

        if ((letter == 'a' || letter == 'e' || letter == 'i'

                || letter == 'o' || letter == 'u')){
            System.out.println(userWord + "way");
        }else {

            for (int i = 0; i < userWord.length(); i++) {
                char conCheck = userWord.charAt(i);


                if ((conCheck == 'a' || conCheck == 'e' || conCheck == 'i'

                        || conCheck == 'o' || conCheck == 'u')) {
                    char con = userWord.charAt(i);

                    String constanant = userWord.substring(i);
                    constanant += userWord.substring(0, i);
                    System.out.println(constanant + "ay");
                    System.out.println("Would you like totranslate another word? (yes/no)");


                     scan.nextLine();
                     return;
                }
            }


            }


        // write your code here
        }
}
