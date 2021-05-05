package com.hjl.designpatterns.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author ：hjl
 * @date ：2021/5/5 20:12
 * @description：测试类
 * @modified By：
 */
public class Demo {

    public static void main(String[] args) throws Exception {
        // 创建浓缩咖啡
        BaseBeverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + "\t cost=" + espresso.cost());
        // 使用摩卡装饰咖啡
        espresso = new Mocha(espresso);
        System.out.println(espresso.getDescription() + "\t cost=" + espresso.cost());
        // 再用奶泡装饰咖啡
        espresso = new Whip(espresso);
        System.out.println(espresso.getDescription() + "\t cost=" + espresso.cost());

        // 自定义输入流测试
        int c;
        InputStream in = new LowerCaseFileInputStream(new BufferedInputStream(new FileInputStream("D:\\study\\test.txt")));
        while ((c = in.read()) > 0) {
            System.out.print((char) c);
        }
        in.close();
    }
}
