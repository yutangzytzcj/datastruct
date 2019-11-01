package cn.yutang;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        System.out.println(args);
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();
        System.out.println(s);
        System.out.println("s = [" + s + "]");

    }
}
