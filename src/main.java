import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Stopwatch watch = new Stopwatch();
//        Scanner sc = new Scanner(System.in);
//        int click=0;
//        do {
//            System.out.println("Input 1 to start, 2 to calculate");
//            click = sc.nextInt();
//            switch (click){
//                case 1:
//                    watch.start();
//                    break;
//                case 2:
//                    watch.stop();
//                    System.out.println(watch.getElapsed());
//            }
//        }while (click==1);

        watch.calculate();

    }
}
