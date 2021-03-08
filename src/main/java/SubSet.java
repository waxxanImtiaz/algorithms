
class SubSet
{ 
    // Print all subsets of given set[] 
    static void printSubsets(char set[]) 
    { 
        int n = set.length; 
        int powOfTotal = (int)Math.pow(2,n);
//        System.out.println(powOfTotal);

        // Run a loop for printing all 2^n 
        // subsets one by one 
        for (int i = 0; i < powOfTotal; i++)
        { 
            System.out.print("{ ");
//            System.out.println(
//                    (1<<n));
            // Print current subset 
            for (int j = 0; j < n; j++) {
                // (1<<j) is a number with jth bit 1 
                // so when we 'and' them with the 
                // subset number we get which numbers 
                // are present in the subset and which 
                // are not
                int pow = (int) Math.pow(2, j);
//                System.out.println((i & pow));
                int result = (i & (pow));
                if ((result > 0) )
                    System.out.print(set[j] + " ");
            }
            System.out.println("}");
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        char set[] = {'1', '2','3','4','5'};
        printSubsets(set); 
    } 
} 
