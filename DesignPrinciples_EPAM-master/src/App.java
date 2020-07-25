import java.util.Scanner;

public class App {
    public static void main( String[] args )
    {   Scanner io = new Scanner(System.in);
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n");
        System.out.println("Enter choice:");
        int choice = io.nextInt();
        double n1,n2;
        System.out.print("Enter number 1:");
        n1 = io.nextInt();
        System.out.print("Enter number 2:");
        n2 = io.nextInt();
        switch (choice){
            case 1: Addition a = new Addition(n1,n2);
                    System.out.println("Result: "+a.calculate());
                    break;
            case 2: Subtraction s = new Subtraction(n1,n2);
                System.out.println("Result: "+s.calculate());
                break;
            case 3: Multiplication m = new Multiplication(n1,n2);
                System.out.println("Result: "+m.calculate());
                break;
            case 4: Division d = new Division(n1,n2);
                System.out.println("Result: "+d.calculate());
                break;
        }
    }
}
