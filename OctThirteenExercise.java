package Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class OctThirteenExercise {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        String[] colors2 = {"Red","Orange","Yellow", "Green", "Blue", "Violet", "Purple", "White", "Black", "Grey", "Brown", "Magenta"};
        for(int i = 0; i < colors2.length; i++){
            colors.add(colors2[i]);
        } //hey look what i came up with
        System.out.println(colors);
        System.out.println("Input five numbers on the same line ");
        Scanner numberScanner = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<>();
        String numbers3 = numberScanner.nextLine();
        String[] numbers4 = numbers3.split(", ");
        //for(int i = 0; i < numbers2.length; i++) {
          //  numbers.add(numbers2[i]);
        //}
        List<String> splitArrayList = new ArrayList<>(); //idk why this needs to be a list but okay
        splitArrayList.add(numberScanner.nextLine());
        splitArrayList = Arrays.asList();
        Collections.sort(splitArrayList);
        System.out.println(splitArrayList.toString());
    }
}
