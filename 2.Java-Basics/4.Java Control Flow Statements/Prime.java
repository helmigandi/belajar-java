    public class Prime {
        public static void main(String[] args) {
            int num = 1;
            boolean flag = false;

            if(num == 0 || num == 1){
                flag = true;
            }

            for(int i = 2; i <= num/2; ++i)
            {
                // condition for nonprime number
                if(num % i == 0)
                {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }
    // When certainty is one, 
        // it will check number for prime or composite 
        // result = a.isProbablePrime(1); 
        // System.out.println(a.toString() 
        //                    + " with certainty 1 "
        //                    + result); 


    }