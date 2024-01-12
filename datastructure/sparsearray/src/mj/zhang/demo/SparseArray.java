package mj.zhang.demo;


/**
 * @ClassName SparseArray
 * @Author ZhangMingJun
 * @Description 稀疏数组练习, 将原始二维数组存储成稀疏数组, 并将其还原为原始二维数组
 * @Date 2024/1/12 22:02
 * @Version 1.0
 **/
public class SparseArray {
    public static void main(String[] args) {
        int n = 10;
        int[][] twoDimensionalArray = createTwoDimensionalArray(n);
        int sparseArrayRows = 0;
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray.length; j++) {
                if (twoDimensionalArray[i][j] != 0) {
                    sparseArrayRows++;
                }
            }
        }
        //稀疏数组赋值
        int[][] spraseArray = new int[sparseArrayRows + 1][3];
        spraseArray[0][0] = twoDimensionalArray.length;
        spraseArray[0][1] = twoDimensionalArray.length;
        spraseArray[0][2] = sparseArrayRows;

        int falg = sparseArrayRows;
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray.length; j++) {
                if (twoDimensionalArray[i][j] != 0) {

                    spraseArray[sparseArrayRows - falg + 1][0] = i;
                    spraseArray[sparseArrayRows - falg + 1][1] = j;
                    spraseArray[sparseArrayRows - falg + 1][2] = twoDimensionalArray[i][j];

                    falg--;
                }
            }
        }
        System.out.println("原始二维数组为:");
        printArray(twoDimensionalArray);
        System.out.println("压缩后的稀疏数组为:");
        printArray(spraseArray);

        //稀疏数组还原成原始二维数组
        int[][] twoDimensionalArrayOra = new int[spraseArray[0][0]][spraseArray[0][1]];

        for (int i = 0; i < spraseArray[0][2]; i++) {
            twoDimensionalArrayOra[spraseArray[i + 1][0]][spraseArray[i + 1][1]] = spraseArray[i + 1][2];
        }
        System.out.println("还原后的二维数组为:");
        printArray(twoDimensionalArrayOra);

    }

    /**
     * 创建一个二维数组
     *
     * @param n 二维数组的维度
     * @return int[][]
     * @Author ZhangMingJun
     * @Description 创建一个二维数组
     * @Date 22:05 2024/1/12
     **/
    private static int[][] createTwoDimensionalArray(int n) {
        int[][] twoDimensionalArray = new int[n][n];
        twoDimensionalArray[1][2] = 1;
        twoDimensionalArray[2][3] = 2;
        return twoDimensionalArray;
    }

    /**
     * 打印一个二维数组到控制台
     *
     * @param arr 目标二维数组
     * @Author ZhangMingJun
     * @Description 打印一个二维数组到控制台
     * @Date 22:17 2024/1/12
     **/
    private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
            ;
        }
    }
}
