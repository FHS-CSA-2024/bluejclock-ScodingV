package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        ClockDisplay test1 = new ClockDisplay();
        String test1Output = test1.getTime();
        System.out.println("Empty Con. Test - " + test1Output);
        
        ClockDisplay test2 = new ClockDisplay(3, 45);
        String test2Output = test2.getTime();
        System.out.println(" 2 Arg. Con. Test - " + test2Output);
        
        ClockDisplay ticktest1 = new ClockDisplay(3, 32);
        System.out.println("Tick Test 1 PreTick - " + ticktest1.getTime());
        ticktest1.timeTick();
        System.out.println("Tick Test 1 PreTick - " + ticktest1.getTime());
        
        ClockDisplay ticktest2 = new ClockDisplay(3, 9);
        System.out.println("Tick Test 2 PreTick - " + ticktest2.getTime());
        ticktest2.timeTick();
        System.out.println("Tick Test 2 PreTick - " + ticktest2.getTime());
        
        ClockDisplay ticktest3 = new ClockDisplay(1, 59);
        System.out.println("Tick Test 3 PreTick - " + ticktest3.getTime());
        ticktest3.timeTick();
        System.out.println("Tick Test 3 PreTick - " + ticktest3.getTime());
        
        ClockDisplay ticktest4 = new ClockDisplay(9, 59);
        System.out.println("Tick Test 4 PreTick - " + ticktest4.getTime());
        ticktest4.timeTick();
        System.out.println("Tick Test 4 PreTick - " + ticktest4.getTime());
        
        ClockDisplay ticktest5 = new ClockDisplay(23, 59);
        System.out.println("Tick Test 5 PreTick - " + ticktest5.getTime());
        ticktest5.timeTick();
        System.out.println("Tick Test 5 PreTick - " + ticktest5.getTime());
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        
        ClockDisplaySeconds test1s = new ClockDisplaySeconds();
        String stest1Output = test1s.getTime();
        System.out.println("Empty Con. Test - " + stest1Output);
        
        ClockDisplaySeconds test2s = new ClockDisplaySeconds(3, 45, 59);
        String stest2Output = test2s.getTime();
        System.out.println(" 2 Arg. Con. Test - " + stest2Output);
        
        ClockDisplaySeconds ticktest1s = new ClockDisplaySeconds(3, 32, 59);
        System.out.println("Tick Test 1 PreTick - " + ticktest1s.getTime());
        ticktest1s.timeTickSec();
        System.out.println("Tick Test 1 PreTick - " + ticktest1s.getTime());
        
        ClockDisplaySeconds ticktest2s = new ClockDisplaySeconds(1, 00, 59);
        System.out.println("Tick Test 2 PreTick - " + ticktest2s.getTime());
        ticktest2s.timeTickSec();
        System.out.println("Tick Test 2 PreTick - " + ticktest2s.getTime());
        
        ClockDisplaySeconds ticktest3s = new ClockDisplaySeconds(1, 59, 59);
        System.out.println("Tick Test 3 PreTick - " + ticktest3s.getTime());
        ticktest3s.timeTickSec();
        System.out.println("Tick Test 3 PreTick - " + ticktest3s.getTime());
        
        ClockDisplaySeconds ticktest4s = new ClockDisplaySeconds(23, 59, 59);
        System.out.println("Tick Test 4 PreTick - " + ticktest4s.getTime());
        ticktest4s.timeTickSec();
        System.out.println("Tick Test 4 PreTick - " + ticktest4s.getTime());
       
        
        
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
        
        ClockDisplay12Hour test1ap = new ClockDisplay12Hour();
        String test1Outputap = test1ap.getTime();
        System.out.println("Empty Con. Test - " + test1Outputap);
        
        ClockDisplay12Hour test2ap = new ClockDisplay12Hour(15, 45);
        String test2Outputap = test2ap.getTime();
        System.out.println(" 2 Arg. Con. Test - " + test2Outputap);
        
        ClockDisplay12Hour ticktest1ap = new ClockDisplay12Hour(15, 32);
        System.out.println("Tick Test 1 PreTick - " + ticktest1ap.getTime());
        ticktest1ap.timeTick();
        System.out.println("Tick Test 1 PreTick - " + ticktest1ap.getTime());
        
        ClockDisplay12Hour ticktest2ap = new ClockDisplay12Hour(23, 59);
        System.out.println("Tick Test 2 PreTick - " + ticktest2ap.getTime());
        ticktest2ap.timeTick();
        System.out.println("Tick Test 2 PreTick - " + ticktest2ap.getTime());
        
        ClockDisplay12Hour ticktest3ap = new ClockDisplay12Hour(11, 59);
        System.out.println("Tick Test 3 PreTick - " + ticktest3ap.getTime());
        ticktest3ap.timeTick();
        System.out.println("Tick Test 3 PreTick - " + ticktest3ap.getTime());
        
        ClockDisplay12Hour ticktest4ap = new ClockDisplay12Hour(12, 59);
        System.out.println("Tick Test 4 PreTick - " + ticktest4ap.getTime());
        ticktest4ap.timeTick();
        System.out.println("Tick Test 4 PreTick - " + ticktest4ap.getTime());
        
        ClockDisplay12Hour ticktest5ap = new ClockDisplay12Hour(23, 59);
        System.out.println("Tick Test 5 PreTick - " + ticktest5ap.getTime());
        ticktest5ap.timeTick();
        System.out.println("Tick Test 5 PreTick - " + ticktest5ap.getTime());
    }
}
