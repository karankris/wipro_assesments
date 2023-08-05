package Assesment2;
public class Decrement
{
 //logic decrement--> 11,3,1 -- 12,2 
//output1= 2 pairs of decrement numbers output2 = 3 longest decrement pair count
    public static void main(String[] args) {
        int arr[]={11,3,1,4,7,8,12,2,3,7};
           int i2 = 10;
           int spikec=0,dec=0,longval=0;
           boolean flag = false;
           for(int i=0;i<i2-1;i++){
                   if(arr[i]>arr[i+1]){
                    if(flag==false)
                    {
                        flag=true;
                        spikec++;
                    }           
        
    dec++;
    if(longval<dec)    
      longval=dec;  

     }

      else{
      if(flag==true)
            {
                flag=false;
                dec=0;
            }
    }
}
        if(spikec>0)  
        {
            longval++;
        }
        System.out.println("Number of Decrement pairs: "+spikec+ "\nLongest pair count is: "+longval);
   
  }

    
} 