package Assesment2;
public class Sub_string {
    public static void main(String[] args) {
        
    int n=0;
  
    String s[]={"john","johny","janardhan"};
        String first="",middle="",last="";
         n=0;
        for(int i=0;i<3;i++)
        {
        n=0;     
               if(s[i].length()%3==0||s[i].length()%3==1)
               {
                   n= s[i].length()/3;
                   first=first+s[i].substring(0, n);
                   middle=middle+s[i].substring(n,s[i].length()-n);  
                   last=last+s[i].substring(s[i].length()-n,s[i].length());
               }   
       if(s[i].length()%3==2)
       {
           n= s[i].length()/3;
           first+=s[i].substring(0,n+1);
           middle=middle+s[i].substring(n+1,s[i].length()-n-1);
           last=last+s[i].substring(s[i].length()-n-1,s[i].length());
       }

        }
          String t="";
        for(int i=0;i<last.length();i++)
        {
            if(Character.isUpperCase(last.charAt(i)))
            {
                t+=Character.toLowerCase(last.charAt(i));
            }
            else{
                 t+=Character.toUpperCase(last.charAt(i));
            }
        }
        System.out.println(first);
         System.out.println(middle);
          System.out.println(t);
    }
}
