package com.backendassignment;
public class MinimumNumber {

    static int countMinimumMoves(int arr[], int n, int k)
    {
        int i;
        for (i = k - 1; i < n; i++)
            if (arr[i] != arr[k - 1])
                return -1;
        for (i = k - 1; i >= 0; i--)
            if (arr[i] != arr[k - 1])
                return i + 1;
        return 0;
    }

    public static void main (String[] args) {
        int arr[] = {4,7,19,16};
        int K = 3;

        int n = arr.length;

        System.out.print(countMinimumMoves(arr, n, K));
    }
}


