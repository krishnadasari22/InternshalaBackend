package com.backendassignment;
import java.util.*;

public class HighestOccurence {

    public static void getHighestDupsOccurrancesInString(char[] arr) {
        int count = -1;
        int max = 0;
        Character result = ' ';
        // Key is the alphabet and value is count
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (hmap.containsKey(arr[i])) {
                hmap.put(arr[i], hmap.get(arr[i]) + 1);
            } else {
                hmap.put(arr[i], 1);
            }
        }
        for (Map.Entry<Character, Integer> itr : hmap.entrySet()) {
            // System.out.println(itr.getKey() + " " + itr.getValue());
            if (Integer.parseInt(itr.getValue().toString()) > max) {
                max = Integer.parseInt(itr.getValue().toString());
                if (hmap.containsValue(max)) {
                    result = itr.getKey();
                }
            }
        }
        System.out.print("Maximum Occured Character is '" + result + "'");
        System.out.print(" with count :" + max);

    }

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = scan.nextLine();
        if (s.trim().isEmpty()) {
            System.out.println("String is empty");
        } else {
            char[] arr = s.toCharArray();
            getHighestDupsOccurrancesInString(arr);
        }

    }

}