package yakovlev.hw01_04;
import java.util.Scanner;
import yakovlev.hw01_04.hello.HelloFour;
import yakovlev.hw01_04.hello.MassivBuilder;
import yakovlev.hw01_04.hello.MassivOfSum;
import yakovlev.hw01_04.hello.MaxShow;

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

        MassivBuilder a = new MassivBuilder();

        MassivOfSum m = new MassivOfSum();
        System.out.println("--------------------");

        MaxShow max = new MaxShow();
        max.maxshow(m.maxfinder(n,a.massiv(n)));

        }
    }

