package Assesment2;
public class Identify_PossibleStrings {

		public static void main(String[] args) {
			//input1 = “Fi_er”
	//input2 = “Fever:filer:Filter:Fixer:fiber:fibre:tailor:offer”
			String input1="Fi_er";
			String input2="Fever:filer:Filter:Fixer:fiber:fibre:tailor:offer";
			String st[]=input2.split(":");
			//[Fever,filer,Filter,Fixer,fiber,fibre,tailor,offer]
	        String str="";
	        for(int i=0;i<st.length;i++)
	        {
	            if(st[i].length()!=input1.length())
	                continue;
	            String test=input1;
	            int x=test.indexOf("_");   //2
	            char ch=st[i].charAt(x);   //v
	            test=test.replace('_', ch); //fiver
	            test=test.toUpperCase();    
	            st[i]=st[i].toUpperCase();
	            if(st[i].equals(test))
	            {
	                if(str=="")
	                {
	                    str=str+test;
	                }
	                else
	                {
	                    str=str+":"+test;
	                }
	            }
	        }
	        if(str=="")
	            str="ERROR-009";
	       
	        System.out.println(" "+str);



		}

	}



