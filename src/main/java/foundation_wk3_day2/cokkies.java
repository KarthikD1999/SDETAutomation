package foundation_wk3_day2;

import org.junit.Assert;
import org.junit.Test;

public class cokkies {
	
	@Test
	public void soluction() {
		// TODO Auto-generated method stub

		int[] children = new int[] {1,2,3};	int[] cookies = new int[] {1,2,5}; 
		
		
		Assert.assertEquals(3,distribute(cookies,children));
	}
	
	public int distribute(int[] child,int[] cok) {
		// TODO Auto-generated method stub
		int count=0;
		int start=0;
		int end=0;
		
		while ((start<cok.length)&& (end<child.length)) {
			if(child[end]<=cok[start]) {
				count++;
				start++;
				end++;
			}
			else {
				start++;
			}
		}
		return count;
	}
}

/*chile=[1,2], cokkies = [1,1,2,3]   s=0, e=0 -->count=1 s++ , e++
		       s=1,e=1 -->e<=s -->count=2 s++,e++
s=0,e=0;
while (s<cookies.length && e<chilrenarr)
if(chil<=cokkies) {
count++
s++,e++
}
else{
s++,
}
return count;

[1,1,2,3] [1,2]
[0,1,2,3] [0,1]*/

