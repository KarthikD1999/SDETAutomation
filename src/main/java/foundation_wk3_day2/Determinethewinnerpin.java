package foundation_wk3_day2;

import org.junit.Test;

public class Determinethewinnerpin {
	
	
	@Test
	public void test() {
		System.out.println(winner(new int[] {9,7,10,7}, new int[] {10,2,4,10}));
	}
		
		@Test
		public void test1() {
			System.out.println(winner(new int[] {3,5,7,6}, new int[] {8,10,10,2}));
		}
		
		@Test
		public void test2() {
			System.out.println(winner(new int[] {2,3}, new int[] {4,1}));
		}
		
		public int winner(int[] p1, int[] p2) {
		     int score1=0,score2=0,temp1=0;
		     int a=0,b=0;
		     for(int i=0;i<p1.length;i++) {
		    	 if(temp1==1 && i<a) {
		    		 score1+=2*p1[i];
		    	 }else {
		    		 score1+=p1[i];
		    	 }
		    	 if(p1[i]==10) {
		    		 temp1=1;
		    		 a=i+3;
		    	 }
		    	 
		    	 if(temp1==1 && i<b) {
		    		 score1+=2*p2[i];
		    	 }else {
		    		 score2+=p2[i];
		    	 }
		    	 if(p2[i]==10) {
		    		 temp1=1;
		    		 b=i+3;
		    	 }
		    	 
		     }
		 
		     if(score1>score2) return 1;
		     if(score1<score2) return 2;
		     return 0;
		    }
	
	
	

}
