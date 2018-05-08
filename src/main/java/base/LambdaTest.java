package base;

import java.util.Arrays;

/**
 * 测试Lambda表达式
 *
 * @author zhangjiayu zhangjiayu
 * @create 2018/5/8
 */
public class LambdaTest {

    public static void main(String[] args) {

        String[] Weekend = new String[]{"Monday", "ThirdDay", "OnePiece", "football", "SatDay"};

        System.out.println(Arrays.toString(Weekend));
        Arrays.sort(Weekend);
        System.out.println(Arrays.toString(Weekend));

//        Arrays.sort(Weekend,(firset, sencond)-> firset.length()-sencond.length());
        System.out.println(Weekend);

    }

}
