public class Main {


    public static void main(String[] args) {

        long start;
        long end ;
        long sum = 0;
        long experiment = 999999999;

        for(long x =1 ; x<experiment;x++){
            start= System.nanoTime();
            //int operation =  2 * 3;
            end = System.nanoTime();

            sum = sum +(end- start);
            if(x % 99999999 == 0 ){
                System.out.println("point = " + x);
                System.out.println("total = " + sum);
                System.out.println("average = " + sum/x);
            }
        }
        System.out.println("total = " + sum);
        System.out.println("average = " + sum/experiment);


    }
}