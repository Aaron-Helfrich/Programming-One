import java.util.*; 


public class DiceSim{


    static Scanner sc = new Scanner(System.in);
  
    public static void main(String args[]){ 

        // create instance of Random class 
        Random rand = new Random(); 

         // Generate random integers in range 1 to 6
        int type = sc.nextInt();
	  int rand_array[];
	  int TimesToRoll = sc.nextInt(); 
	  rand_array = new int[TimesToRoll];
      for (int i = 0; i <= type; i++) 
        
      {
            rand_array[i] = rand.nextInt(TimesToRoll);
                System.out.println("dice " + (i+1) + " is " + rand_array[i]);
        }
        
         
            //int rand_int1 = rand.nextInt(6); 
        
        //int out = rand_int1+1;
        // Print random integer 
        //System.out.println("your roll is "+out);
    }
}


	  
	
 
 

       