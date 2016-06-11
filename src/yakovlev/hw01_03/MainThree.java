package yakovlev.hw01_03;
import java.util.Scanner;

import yakovlev.hw01_03.hello.HelloThree;

public class MainThree {

    public static void main (String[] args) {

    double a=0.0;
    double b=0.0;
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
        a = input.nextDouble();}

    System.out.println("Введите верхнюю границу отрезка для вычисления функции: b = ");
    Scanner inputt = new Scanner(System.in);
    if( inputt.hasNextDouble() )
    {// Считываем с клавиатуры размерность матрицы
        b = inputt.nextDouble();}

    System.out.println("Введите шаг расчета: h = ");
    Scanner inputtt = new Scanner(System.in);
    if( inputtt.hasNextDouble() )
    {// Считываем с клавиатуры размерность матрицы
        h = inputtt.nextDouble();}

    n = ((Math.abs(b-a))/h)+1;

    System.out.println("|  x  |  F(x) |");
        System.out.println("----------------");
    for (int i=0; i<n; i++) {
        x=a+(i*h);
        x= Math.round(x * 100.0) / 100.0; //округление до 2-х знаков после запятой
        f=(Math.tan(2*x))-3;
        f= Math.round(f * 100.0) / 100.0; //округление до 2-х знаков после запятой
        System.out.println("| "+x+" | "+f+" |");
    }


}}
