package Assesment2;
public class Rev {
    public static void main(String[] args) {
        int num= 124,r=0,sum=0,rev=0;
          while(num>0)
          {
            r=num%10;
            rev=rev*10+r; 
            num=num/10; 
          }
          while(rev>0){
          int temp=rev;
         while(temp>0)
         {
              sum=sum+temp%10;
              temp/=10;
         }
                rev/=10;    
         }
         System.out.println("the sum is " + sum);
    }
}
