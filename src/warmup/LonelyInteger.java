package warmup;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Problem Statement

There are N integers in an array A. All but one integer occur in pairs. Your task is to find the number that occurs only once.

Input Format

The first line of the input contains an integer N, indicating the number of integers. The next line contains N space-separated integers that form the array A.

Constraints

1≤N<100 
N % 2=1 (N is an odd number) 
0≤A[i]≤100,∀i∈[1,N]
Output Format

Output S, the number that occurs only once.

Sample Input:1

1
1
Sample Output:1

1
Sample Input:2

3
1 1 2
Sample Output:2

2
Sample Input:3

5
0 0 1 2 1
Sample Output:3

2
Explanation

In the first input, we see only one element (1) and that element is the answer. 
In the second input, we see three elements; 1 occurs at two places and 2 only once. Thus, the answer is 2. 
In the third input, we see five elements. 1 and 0 occur twice. The element that occurs only once is 2.

Copyright (c) 2015 HackerRank.
 */
public class LonelyInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int numOfInteger=in.nextInt();
	    ArrayList <Integer> items=new ArrayList();
	    for(int i=0;i<numOfInteger;i++){
	    	int item=in.nextInt();
	    	items.add(item);
	    	}
	   // System.out.println(items);
		for(int i=0;i<items.size();i++){
			int elem=items.get(i);
			//System.out.println("item["+i+"]="+elem);
			int count=countOfInt(elem,items);
			if(count==1){
				System.out.println(elem);
				
			}
			
			
		}

	}

	private static int countOfInt(Integer i, ArrayList<Integer> items) {
		// TODO Auto-generated method stub
		int count=0;
		for(int j=0;j<items.size();j++){
			if(items.get(j)==i){
				count+=1;
				
			}
			
			
		}
		
		return count;
		
		
	}

}
