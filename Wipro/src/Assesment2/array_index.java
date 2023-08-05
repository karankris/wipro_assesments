package Assesment2;
public class array_index {
public static void main(String[] args) {
     int sum=0;
     int a[] = {10,20,30,40,50,60,70,80,90,100};
     int flag=0,j;
     for(int i=0; i<a.length; i++){
        for(j=2;j<=i/2;j++){
            if(i%j==0){ 
                flag=1;  
               break;
            }
        }
        if(flag==1 || i==0 || i==1){
            sum +=a[i];
            flag = 0;
        }
    }

    System.out.println(sum);
        
 
}
}