import java.util.Scanner;

public class QuadraticEquation {
    double a,b,c;

    public QuadraticEquation(){
    }

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant(){
        return Math.pow(b,2)-4*a*c;
    }

    public double getRoot1(){
        return ((-b+Math.sqrt(this.getDiscriminant()))/(2*a));
    }

    public double getRoot2(){
        return ((-b-Math.sqrt(this.getDiscriminant()))/(2*a));
    }

    public double getRoot(){
        return -b/(2*a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println("Input a: ");
        a = sc.nextDouble();
        System.out.println("Input b: ");
        b = sc.nextDouble();
        System.out.println("Input c: ");
        c = sc.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        if (equation.getDiscriminant()>0){
            System.out.printf("Equation has 2 roots Root1:%f Root2:%f",equation.getRoot1(),equation.getRoot2());
        }
        else if(equation.getDiscriminant()==0){
            System.out.println("Equation has 1 root: "+equation.getRoot());
        }
        else {
            System.out.println("Equation has no root.");
        }
    }
}
