package yakovlev.hw01_03;
import java.util.Scanner;
import yakovlev.hw01_03.hello.HelloThree;


public class MainThree {

    double minotr=0.0;
    double maxotr=0.0;
    double h=0.0;
    double n=0.0;
    double f=0.0;
    double x=0.0;

    HelloThree hi = new HelloThree();
     hi.hello();

    System.out.println("Введите нижнюю границу отрезка для вычисления функции: a = ");
    Scanner input = new Scanner(System.in);
    if( input.hasNextDouble() )
    {// Считываем с клавиатуры размерность матрицы
        minotr = input.nextInt();}

    System.out.println("Введите верхнюю границу отрезка для вычисления функции: b = ");
    Scanner inputt = new Scanner(System.in);
    if( inputt.hasNextDouble() )
    {// Считываем с клавиатуры размерность матрицы
        maxotr = inputt.nextDouble();}

    System.out.println("Введите шаг расчета: h = ");
    Scanner inputt = new Scanner(System.in);
    if( inputtt.hasNextDouble() )
    {// Считываем с клавиатуры размерность матрицы
        h = inputtt.nextDouble();}

    n = ((Math.abs(maxotr-minotr))/h)+1;

    System.out.println("|  x  |  F(x)  |");
    for (int i=0; i<n; i++) {
        x=minotr+(i*h);
        f=(Math.tan(2*x))-3;
        System.out.println("| "+x+" | "+f+" |");
    }


}
