package foundation_wk3_day2;

import org.junit.Test;

import junit.framework.Assert;

public class Chess {

	
	@Test
	public void soluction() {

		Assert.assertEquals(false, chessnum("c7"));

	}

	private boolean chessnum(String find) {

		char char1 = find.charAt(0);
		char char2 = (char) (find.charAt(1)-'0');

		if(char1=='a' ||char1=='c' ||char1=='e' ||char1=='g') {

			if(char2%2!=0) {

				return false;

			}

		}

		if(char1=='b' ||char1=='d' ||char1=='f' ||char1=='h') {
			if(char2%2==0) {

				return false;
			}

		}

		return true;
	}

}
