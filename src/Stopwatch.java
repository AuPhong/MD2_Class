
public class Stopwatch {

    private long startTime = 0;
    private long stopTime = 0;
    private boolean running = false;


    public long start() {
        this.startTime = System.currentTimeMillis();
        this.running = true;
        return startTime;
    }


    public long stop() {
        this.stopTime = System.currentTimeMillis();
        this.running = false;
        return this.stopTime;
    }


    public long getElapsed() {
        long elapsed;
        if (running) {
            elapsed = (System.currentTimeMillis() - startTime);
        } else {
            elapsed = (stopTime - startTime);
        }
        return elapsed;
    }
}


