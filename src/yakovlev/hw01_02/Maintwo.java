package yakovlev.hw01_02;

/**
 * Created by Администратор on 07.06.2016.
 */
public class Maintwo {

    public static void main(String[] args) {

        double [] a;
        a = new double [10];
        int epsilon=2;
        for (int i=0; a[i]<epsilon ;i++) {
            a[i]= (double) ((1.0)/((i + 1)*(i + 1)));
            a[i]= Math.round(a[i] * 10000.0) / 10000.0;
            System.out.println(i+"-ый элемент массива а = "+a[i]);
        }
        System.out.println("Наименьший номер элемента последовательности" + a[1]);
    }

}
