package leetcode;

import java.util.Scanner;

public  class DBSJX {
    public static void main(String[] args) {

        int n = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入 * 的行数：");
        try {
            n = input.nextInt();
        } catch (Exception e) {
            System.out.println("输入的非正整数，无法构成三解形");
            e.printStackTrace();
            return;
        }
        if (n <= 1) {
            System.out.println("输入的非正整数，无法构成三解形");
            return;
        }

        //遍历N遍--打印行
        for (int r = 0; r < n; r++) {
            //打印空格，从第0个字符开始
            for (int i = r + 1; i < n; i++) {
                System.out.print(" ");
            }
            // 打印*，竖接着空格，但需要考虑中间位
            for (int j = 0; j <= r; j++) {
                System.out.print("* ");
            }
            System.out.println();

//            //等边空心三解形
//            for (int j = 0; j <= r; j++) {
//                if (j == 0 || j == r) {
//                    System.out.print("* ");
//                } else if (r == n - 1) {
//                    for (int k = 0; k < r; k++) {
//                        System.out.print("* ");
//                        ;
//                    }
//                    break;
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
        }
    }

    public static void abc() {
         Integer acbc=1;

    }
}
