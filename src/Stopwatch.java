import java.util.Scanner;

public class Stopwatch {

    private long startTime = 0;
    private long stopTime = 0;

    public Stopwatch() {
    }

    public long start() {
        this.startTime = System.currentTimeMillis();
        return startTime;
    }


    public long stop() {
        this.stopTime = System.currentTimeMillis();
        return this.stopTime;
    }

    public long getElapsed() {
        long elapsed;
        elapsed = this.stopTime - this.startTime;
        return elapsed;
    }

    public void calculate(){
        Scanner sc = new Scanner(System.in);
        int click=0;
        do {
            System.out.println("Input 1 to start, 2 to calculate, 3 to Exit");
            click = sc.nextInt();
            switch (click){
                case 1:
                    this.start();
                    break;
                case 2:
                    this.stop();
                    System.out.println(this.getElapsed());
                    break;
                case 3:
                    System.exit(0);
            }
        }while (1>0);
    }
}


