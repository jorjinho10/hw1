package yakovlev.t_hw01_01;
import yakovlev.hw01_01.logic.Logic;

/**
 * Created by Администратор on 05.06.2016.
 */
public class Test01_hw01_01 {

    static public void main(String... arguments) {
        Logic logic = new Logic();
        System.out.println(logic.method().equals("I am string in Logic"));
    }
}
