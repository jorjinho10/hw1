package yakovlev.hw01_04;
import java.util.Scanner;
import yakovlev.hw01_04.hello.HelloFour;

public class MainFour {

    public static void main(String[] args) {
        int n=0;

        HelloFour hi = new HelloFour();
        hi.hello();

        System.out.println("Элементы массива будут сгенерированы автоматически");
        System.out.println("Введите четное число элементов массива, n = ");
        Scanner input = new Scanner(System.in);
        if( input.hasNextInt() )
        {// Считываем с клавиатуры нижнюю границу отрезка
            n = input.nextInt();}

        double [] a;
        a = new double[n];
        for (int i=0; i<n; i++) {
        a[i]=Math.random()*10;
            a[i]=Math.round(a[i] * 100.0) / 100.0)
            System.out.println(a[i]);
        }
    }
}
