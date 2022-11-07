public class Maximum_69_number{
	public static void main(String []args){
		int num=9966,j;
		int num1=num,a=1,num2=num,res=num,num3=num;
		while(num1>0) {
			num2=num3;
			j=num1%10;
			num1/=10;
			if(j==6){num2=num2+(a*3);}
			else{num2=num2-(a*3);}
			if(res<num2) {
				res=num2;
			}
			a*=10;
		}
		System.out.println(res);
	}
}