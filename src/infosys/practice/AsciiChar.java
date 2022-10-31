package infosys.practice;

public class AsciiChar {
	char[][] ad=new char[3][3];
	AsciiChar(){
		ad[0][1]='0';
		ad[1][0]='/';
		ad[1][1]='|';
		ad[1][2]='\\';
		ad[2][0]='/';
		ad[2][2]='\\';
		ad[0][0]=' ';
		ad[0][2]=' ';
		ad[2][1]=' ';
	}
	public void setRightHand(char c) {
		if(c=='(')
		{
			ad[0][0]=c;
			ad[1][0]=' ';
		}else
			ad[1][0]=c;
	}
	public void setLeftHand(char c) {
		if(c==')')
		{
			ad[0][2]=c;
			ad[1][2]=' ';
		}else
			ad[1][2]=c;
	}
	public void setRightLeg(char c) {
		ad[2][0]=c;
	}
	public void setLeftLeg(char c) {
		ad[2][2]=c;
	}

	public void printAscii() {
		for(int i=0;i<=2;i++) {
		for(int j=0;j<=2;j++) {
			System.out.print(ad[i][j]);
		}
		System.out.println("");
	}
	}


}
