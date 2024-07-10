package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Array_list {
    public static void main(String[] args) {

        List<ArrayList<Integer>> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < d; j++) {
                list.add(sc.nextInt());
            }
            array.add((ArrayList<Integer>) list);
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
                System.out.println(array.get(x - 1).get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }

        }

    }

}
