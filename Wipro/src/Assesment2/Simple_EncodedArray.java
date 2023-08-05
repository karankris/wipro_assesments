package Assesment2;
class Simple_EncodedArray
{
    public static void main(String[] args) {
       int i1[] ={7,6,8,16,12,3};
       //output Array :{2,5,1,7,9,3}  output: index[0]=2 sum = 27
       int i2= 6;
       int out[]=new int[i2]; //6 variables space create an empty array
       out[out.length-1]=i1[i1.length-1];
      for (int i=i1.length-1; i>0; i--)
      {
        out[i-1]=i1[i-1]-out[i];  //5-1 -->4
      }
      int sum=0;
      for(int elements : out)
     {
      sum+=elements;
     }
     System.out.println("The first index and the sum is " + out[0]+" "+sum);
    
    }
  }
