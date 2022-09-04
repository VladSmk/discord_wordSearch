package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        System.out.println("vertically ");
        int a = in.nextInt();
        System.out.println("horizontally(number >> space >> letter )");
        int b = in.nextInt();

        String[][] s = new String[a][b];

        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                s[i][j] = in.nextLine();
            }
        }

        /*for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.print(s[i][j] + " ");
            }
            System.out.println(" ");
            System.out.print(" ");
        }*/

        for (int numb=4; numb<=14; numb++) {
            File file = new File("file_ds_" + numb + ".txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String word = scanner.nextLine();
                char[] w = word.toCharArray();

                for(int ia=0; ia<a; ia++){
                    for(int jb=0; jb<b; jb++) {
                        char[] c = s[ia][jb].toCharArray();
                        int k=jb;
                        for (int f=0; w[f] == c[0]; f++) {
                            k++;
                            c = s[ia][k].toCharArray();
                            if(f==numb){
                                for (int wd = 0; wd < numb; wd++) {
                                    System.out.print(w[wd]);
                                }
                                System.out.print(" ");

                            }


                        }
                    }
                }
                scanner.close();
            }
        }
    }
}


