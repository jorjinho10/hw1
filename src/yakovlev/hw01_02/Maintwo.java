package yakovlev.hw01_02;
import java.util.Scanner;
import yakovlev.hw01_02.hello.Hellotwo;

public class Maintwo {

    public static void main(String[] args) {
        int massize=0;
        double epsilon=0.0;
        int minind=-1000;

        Hellotwo hi = new Hellotwo();
        hi.hello(); //Приветствие и постановка задачи
        System.out.println("Введите число элементов последовательности: ");
        Scanner input = new Scanner(System.in);
        if( input.hasNextInt() )
           {// Считываем с клавиатуры целое число
                massize = input.nextInt();}

        System.out.println("Введите положительный эпсилон (разделитель ','): ");
        Scanner inputt = new Scanner(System.in);
        if( inputt.hasNextDouble() )
        {// Считываем с клавиатуры эпсилон (double)
            epsilon = inputt.nextDouble();}

        double [] a;
        a = new double [massize];
        int n=0;

        for (int i=0; i<a.length ;i++) {
            n=i+1;
            a[i]= ((1.0)/((n + 1)*(n + 1)));
            a[i]= Math.round(a[i] * 10000.0) / 10000.0; //округление до 4-х знаков после запятой
            System.out.println(n+"-ый элемент массива а = "+a[i]);
            //System.out.println("Введенное epsilon: "+ epsilon);
            if (a[i]<epsilon) { // проверка на условие задачи
                minind=n; //запоминаем индекс первого жлемента, удовлетворяющего условию
                epsilon=-100; // для выполнения 1 раз
            }
        }
        System.out.println("Наименьший номер элемента ("+a[minind-1]+") удовлетворяющего условию: № "+ minind);
    }

}
