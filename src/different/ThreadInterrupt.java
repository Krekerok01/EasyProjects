package differentPackeges.Different;

public class ThreadInterrupt {
    public static volatile int numSeconds = 3;

    public static void main(String[] args)  {
        RacingClock clock = new RacingClock();

        try {
            Thread.sleep(3500);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clock.interrupt();
        System.out.println("Прервано!");
    }

    public static class RacingClock extends Thread{
        public RacingClock(){
            start();
        }

        public void run(){
            while (!isInterrupted() && numSeconds >= 0){
                if (numSeconds == 0){
                    System.out.println("Марш!");
                }
                System.out.print(numSeconds + " ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                numSeconds--;

            }

        }
    }
}
