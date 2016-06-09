package yakovlev.hw01_05;
import yakovlev.hw01_05.hello.HelloFive;
import java.util.Scanner;

public class MainFive {

    public static void main(String[] args) {
        int matrsize=0;

        HelloFive hi = new HelloFive();
        hi.hello(); //Приветствие и постановка задачи
        System.out.println("Введите размерность матрицы: ");
        Scanner input = new Scanner(System.in);
        if( input.hasNextInt() )
        {// Считываем с клавиатуры целое число
            matrsize = input.nextInt();}

        int [][] a;
        a = new int [matrsize][matrsize];
        int b = a.length;
        for (int i=0; i<a.length; i++) {
            b--;
            for (int j=0; j<matrsize; j++) {
                if (i==j) {a[i][j]=1;}
                else {
                    if (j==b) {a[i][j]=1;}
                    else {a[i][j]=0;}
                };
                System.out.print(" "+a[i][j]+" ");
            }
            System.out.print('\n');
        }
    }

}
