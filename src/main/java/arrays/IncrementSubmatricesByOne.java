package arrays;

import java.util.Arrays;

public class IncrementSubmatricesByOne {

    public static void main(String[] args) {

    }

    public int[][] rangeAddQueries(int n, int[][] queries) {

        int[][] m = new int[n][n];
        for (int i = 0; i < queries.length; i++) {
            int[] a = queries[i];
            int k = a[0];
            int l = a[a.length - 1];
            for (int j = k; j <= l; j++) {
                m[j][k] += 1;
                m[j][l] += 1;

            }
        }
        return m;
    }
}
