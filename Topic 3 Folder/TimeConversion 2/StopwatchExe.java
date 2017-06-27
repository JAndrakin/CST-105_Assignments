public class StopwatchExe {


public static void main(String[] args) throws InterruptedException
    {
        StopWatch s = new StopWatch();

        s.startThread();

        while (true)
        {
            int[] curTime = s.getTime();
            System.out.println(curTime[0] + " : " + curTime[1] + " : " + curTime[2] + " : " + curTime[3]);
        }

    }

}