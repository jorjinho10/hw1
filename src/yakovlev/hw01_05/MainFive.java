package yakovlev.hw01_05;
import yakovlev.hw01_05.hello.HelloFive;
import java.util.Scanner;

public class MainFive {

    public static void main(String[] args) {
        int matrsize=0;

        HelloFive hi = new HelloFive();
        hi.hello(); //Приветствие и постановка задачи
        System.out.println("Введите размерность квадратной матрицы: ");
        Scanner input = new Scanner(System.in);
        if( input.hasNextInt() )
        {// Считываем с клавиатуры размерность матрицы
            matrsize = input.nextInt();}

        int [][] a;
        a = new int [matrsize][matrsize];
        int b = a.length;
        for (int i=0; i<a.length; i++) {
            b--; //встречное считывание для второй косой черты справа сверху налево вниз
            for (int j=0; j<matrsize; j++) {
                if (i==j) {a[i][j]=1;} //проверка на элемент основной диагонали
                else {
                    if (j==b) {a[i][j]=1;} //проверка на элемент второй диагонали
                    else {a[i][j]=0;}
                };
                System.out.print(" "+a[i][j]+" "); //вывод строки
            }
            System.out.print('\n'); //enter
        }
    }

}
