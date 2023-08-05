package Assesment2;
public class Pin_generation{
    public static void main(String[] args) {
        
        int i1=3521,i2=2452,i3=1352,i4=38,r=0, first_min=9, second_max=0,third_max=0;
    
   while(i1>0)
         {
           
            r=i1%10;    
            if(r<first_min)           
            first_min=r;
            i1/=10;
  
         }     
          System.out.println(first_min); 
         while(i2>0)
         {
           
            r=i2%10;
            if(r>second_max)           
            second_max=r;
            i2/=10;
  
         }     
          System.out.println(second_max);       
          while(i3>0)
         {
           
            r=i3%10;
            if(r>third_max)           
            third_max=r;
            i3/=10;
  
         }     
          System.out.println(third_max); 

          System.out.println((first_min*second_max*third_max)+i4);
    }
}
