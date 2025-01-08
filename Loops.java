
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=3456; int sum=0;
		while(num>0) {
			int rem=num%10;
			sum+=rem;
			num/=10;
			
			
		}
		System.out.println(sum);

		//perfect number
		int perfect=6; int s=0;
		
		
		for(int i=1;i<=perfect/2;i++) {
			if(perfect%i==0) {
				s+=i;
			}
		}
		System.out.println(s+ " "+perfect);
		if(s==perfect) {
			System.out.println(perfect+ " is perefect number");
			
		}
		
		//Armstrong number
		
		int armstrong=153, su=0;
		int p=armstrong;
		do {
			int r=armstrong%10;
			su+=r*r*r;
			armstrong/=10;
		}while(armstrong>0);
		
		if(p==su) {
			System.out.println(p +" is armstrong number");
		}
	}

}
