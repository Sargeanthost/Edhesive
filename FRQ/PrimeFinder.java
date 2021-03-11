package FRQ;

//Part A and B
public class PrimeFinder
{

  /** Returns the number of prime numbers between lower and upper inclusive
   *  Precondition: 0 < lower <= upper
   */
  public static int primesBetween(int lower, int upper){
    int count=0;
    while(lower<=upper){
        if(isPrime(lower)){
            //check if each number up to upper is prime. add to count if true
            count++;
        }
        lower++;
    }
    return count;
  }

  /** Returns true if the integer n is a prime number
   *  Precondition: n is positive
   */
  private static boolean isPrime(int n)
  {
    /* COMPLETE WORKING METHOD PROVIDED */
    /* DO NOT MODIFY THE IMPLEMENTATION OF THIS METHOD*/
    if(n <= 1) return false;
    if(n==2) return true;
    for(int i = 2; i < Math.sqrt(n)+1; i++) if(n%i == 0) return false;
    return true;
  }

    /** Returns the difference between num and the closest prime number which
   *  is greater than or equal to num
   *  Precondition: num is positive
   */
  public static int gapToNextPrime(int num)
  {
    int count = 0;
    while(!isPrime(num)){
      count++;
      num++;
    }
    return count;
    
    /* Implement your answer to part (b) here */
  }

  /* Methods for subsequent parts of this question are not shown */

}
