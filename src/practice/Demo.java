package practice;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {2,5,3,10,7,13};
		int totalSum =20;
		int n = arr.length;
		int start =0;
		int end =0;
		int sum =0;
		
		//2,5,3,10==20 -2 ==18
		///5,3,10,7= 18+7=25 -5=20
		//3,10,7,13 == 20 ///
		//10,7,13 == 20-3=17+13
		//7+13
	
		//2+5+3+10== 20
		
		while(end < n) {
			int res= 0;
			System.out.println(start);
			if(sum<20) {
				sum = sum + arr[end];
				end++;	
			}
			if(sum ==20) {
				System.out.println(start);
				System.out.println(end);
				start++;
				res=sum-arr[start];//18
				
			}
			
				
			
		}
		
		
		
		
		
		
		
		
		

		
		
		
	

		
		

	}

	
}

