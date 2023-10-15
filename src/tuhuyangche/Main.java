package tuhuyangche;


import hengsheng.IntersectionOfArrays;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个长度小于等于200的字符串：");
            String input = scanner.nextLine();
            if (input.length() <= 200) {
                char[] chars = input.toCharArray();
                Arrays.sort(chars);
                String sorted = new String(chars);
                System.out.println("排序后的字符串为：" + sorted);
            } else {
                System.out.println("输入的字符串长度超过200，请重新输入！");
            }
            scanner.close();
        }


}