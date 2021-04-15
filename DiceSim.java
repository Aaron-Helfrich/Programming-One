import java.util.*; 


public class DiceSim{


    static Scanner sc = new Scanner(System.in);
  
    public static void main(String args[]){ 

        // create instance of Random class 
        Random rand = new Random(); 

        // Generate random integers in range 1 to 6
        System.out.println("Enter the number of sides for your dice");
        int Type = sc.nextInt();
        int rand_array[];
        System.out.println("How many dice do you want to roll");
	    int TimesToRoll = sc.nextInt();
	        while (true)
	    {
	        System.out.println("Do you want to roll dice? (1 = yes, 0 = no) ");
	        int yn = sc.nextInt();
                if (yn == 1)
            {	
                int total = 0; 
	        rand_array = new int[TimesToRoll];
            for (int i = 0; i < TimesToRoll; i++) 
            {
            rand_array[i] = 1 + rand.nextInt(Type);
	        total += rand_array[i];
            //System.out.println("dice " + (i+1) + " is " + rand_array[i]);
        }
            System.out.println("total of all dice is " + total);
        }
	else
{
	break;
}
	}
        //int rand_int1 = rand.nextInt(6); 
        
        //int out = rand_int1+1;
        // Print random integer 
        //System.out.println("your roll is "+out);
    }
}


	  
	
 
 

       