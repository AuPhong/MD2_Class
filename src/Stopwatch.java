import java.util.Scanner;

public class Stopwatch {

    private long startTime = 0;
    private long stopTime = 0;

    public Stopwatch() {
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getStopTime() {
        return stopTime;
    }

    public void setStopTime(long stopTime) {
        this.stopTime = stopTime;
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
            System.out.println("Input 1 to start, 2 to calculate");
            click = sc.nextInt();
            switch (click){
                case 1:
                    this.start();
                    break;
                case 2:
                    this.stop();
                    System.out.println(this.getElapsed());
            }
        }while (click==1);
    }
}


