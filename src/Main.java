import java.awt.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> arg = new ArrayList<>();
        arg.add(sc.nextDouble());
        arg.add(sc.nextDouble());
        System.out.println("Select action");
        String action = sc.next();

        switch (action)
        {
            case "+":
                addition plus = new addition();
                plus.getArgs(arg);
                System.out.println(plus.run());
                break;
            case "-":
                substraction minus = new substraction();
                minus.getArgs(arg);
                System.out.println(minus.run());
                break;
            case "*":
                multiplication mult = new multiplication();
                mult.getArgs(arg);
                System.out.println(mult.run());
                break;
            case "/":
                division divide = new division();
                divide.getArgs(arg);
                System.out.println(divide.run());
                break;
            default:
                System.out.println("Unrecognized action selected!");
                break;
        }

        addition plus = new addition();
        plus.getArgs(arg);
    }
}


