package Assesment2;
public class Cycle_sum {
    public static void main(String[] args) {
        
    int input1=582109;
    String str = Integer.toString(input1);      
                  int sum=0;
        for(int i=0; i<str.length();i++)
        {
            for(int j=i;j<str.length();j++)
            {
                int num = Character.getNumericValue(str.charAt(j));
                 sum+=num;
             
            }
        }
        System.out.println(sum);

	}
}

