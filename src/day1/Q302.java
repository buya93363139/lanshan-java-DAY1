package day1;

public class Q302 {
    public static void main(String[] args) {
        int[][] arr;

        arr = new int[3][4];

        arr = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(arr.length*arr[0].length);




    }
}