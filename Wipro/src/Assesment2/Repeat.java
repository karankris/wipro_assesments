package Assesment2;
public class Repeat {
    public static void main(String[] args) {
     //int arr[] ={1,1,-2,-1,2,2};
      //int arr[]= {0,0,0} ; 
      int arr[]={-1,2,3};
        int flag=0,c=0, k=0;   
          
        for( int i=0; i<arr.length; i++) {
              int v = arr[i];
              if(v<=0 ||c==1)
              continue;
              
               for(int j=i+1;j<arr.length; j++) 
               {   
                    if(v==arr[j])   
                    {         
                        // System.out.println("the first repeated value "+arr[i]);
                        c=c+1;
                        k=arr[i];
                        System.out.println(k);
                         flag=1;
                    }   
                }                      
            }   
               for(int i=0; i<arr.length;i++)
               {
                         if(arr[i]>0){
                         flag=1;
                         break;
               }}
                    
                
                         if(c==0 && flag==1){
                            
                              System.out.println("There is no reapeat numbers "+arr[0]);
                        }
                           else if(flag==0)
                        {
                             System.out.println("return 0 it is negative or zero");     
                        }
                           
        } 
 }
    