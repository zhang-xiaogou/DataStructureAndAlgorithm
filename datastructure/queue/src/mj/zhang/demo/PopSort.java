package mj.zhang.demo;

/**
 * @ClassName PopSort
 * @Author ZhangMingJun
 * @Description
 * @Date 2024/7/24 9:01
 * @Version 1.0
 **/
public class PopSort {

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int temp = 0;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[]{8,12,4,2,9,5,11,55,3,1};

        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("排序后：");

        sort(arr);

        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
