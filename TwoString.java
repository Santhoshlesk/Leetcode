public class TwoString {
	public static void main(String[] args) {
		String[] word1 = {"ac", "c"};
		String [] word2 = {"a", "bc"};
		 String out1="",out2="";
	        int i;
	        for(i=0;i<word1.length;i++){
	            out1+=word1[i];
	        }
	        for(i=0;i<word2.length;i++){
	            out2+=word2[i];
	        }
	        System.out.println(out1.equals(out2));
	}

}