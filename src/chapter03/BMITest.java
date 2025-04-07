package chapter03;

import java.util.Scanner;

public class BMITest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\n======== BMI(체질량지수) Program ========\n");
        System.out.print("* 체중(kg)입력: ");
        double weight = s.nextDouble();
        System.out.print("* 키(cm)입력: ");
        double height = s.nextDouble();

        double bmi = weight / Math.pow(height/100, 2);

        System.out.printf("당신의 체중은 %.2f kg이고 키는 %.2f cm이므로 bim지수는 %.2f(㎏/㎡)입니다.\n ", weight, height, bmi);

        s.close();
    }
}
