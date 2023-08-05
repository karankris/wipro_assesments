package Assesment2;
import java.util.HashSet;
public class FindFirstRepeatElement {

	public static int firstRepeat(int[]a)
	{
		HashSet<Integer> set = new HashSet<>();
		boolean hasnonNegative =false;
		
		for(int num: a)
		{
			if(num>0)
			{
				hasnonNegative = true;
				if(!set.add(num)) {
                   return num;
			  
				}
			}
		}
		return hasnonNegative ? a[0] : 0;
	}	
	public static void main(String[] args) {
         int [] arr = {1,2,1,5,1,3,2,7};
         int result = firstRepeat(arr);
         System.out.println(result);
	}
}
      