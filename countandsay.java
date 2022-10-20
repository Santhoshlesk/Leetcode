import java.util.*;
public class Countandsay {
	
	public static void main(String []args) {
		Scanner in=new Scanner(System.in);
		 int i,j,count=1;
		 System.out.print("Enter the n value:");
		 int  n=in.nextInt();
	     String curr="1";
	     String temp="";
	     for(i=1;i<=n-1;i++){
	    	 int len=curr.length();
	    	 temp="";
	    	 for(j=0;j<=len-1;j++){
	    		 if(j!=len-1){
	    			 if(curr.charAt(j)==curr.charAt(j+1)){
		    			 count++;
		    		 }
		    		 else{
		    			 temp=temp+count+curr.charAt(j);
		    			 count=1;
		    		 }
	    		 }
	    		 else {
	    			 temp=temp+count+curr.charAt(j);
	    			 count=1;
	    		 }
	         }
	    	 curr=temp;
	    	 
	     }System.out.println("Current="+curr);
	}

}