package mathOperations;

public class Factorial {
    public static void main(String[] args) {
        //4! = 4 * 3 * 2 * 1
        //1! = 1
        //15! = 15 * 14 * 13 * 12 *... * 1
        //0! = 1
        System.out.println(fac(5));

    }

   private static int fac(int n){
        if (n == 1){
            return 1;
        }

        return n * fac(n - 1);
   }
}
