package infosys.practice;

import java.io.*;
import java.util.*;


public class GFG {
	public static void main(String[] args) throws IOException {
		Scanner scan=new Scanner(System.in);
		System.out.println("Teste cases:");
		int T=scan.nextInt();
		System.out.println("No of commands");
		int d=scan.nextInt();
		AsciiChar[] AC=new AsciiChar[T*d];
		InputStreamReader r=new InputStreamReader(System.in);    
		BufferedReader br=new BufferedReader(r);     
		CommandClass[] cc=new CommandClass[T*d];
		for(int i=0;i<=T*d-1;i++) {
			
		
				System.out.println("Enter command");
				cc[i]=new CommandClass(br.readLine());	
			
		}
		for(int i=0;i<=cc.length-1;i++) {
			AC[i]=new AsciiChar();
			if(i>0)
				AC[i]=AC[i-1];
			if(cc[i].command.contains("say")) {
				System.out.println(cc[i].command.replaceFirst("say",""));
				}
			else if(cc[i].command.equalsIgnoreCase("left hand to head")) {
				
				AC[i].setLeftHand(')');


			}
			else if(cc[i].command.equalsIgnoreCase("left hand to hip")) {
				
				AC[i].setLeftHand('>');

			}
			else if(cc[i].command.equalsIgnoreCase("left hand to start")) {
				
				AC[i].setLeftHand('\\');

			}
			else if(cc[i].command.equalsIgnoreCase("right leg in")) {
				
				AC[i].setRightLeg('<');

			}
			else if(cc[i].command.equalsIgnoreCase("right leg out")) {
				
				AC[i].setRightLeg('/');
		
			}
			else if(cc[i].command.equalsIgnoreCase("left leg in")) {
				
				AC[i].setLeftLeg('>');
			}
			else if(cc[i].command.equalsIgnoreCase("left leg out")) {
				;
				AC[i].setLeftLeg('\\');
		
			}
			else if(cc[i].command.equalsIgnoreCase("right hand to hip")) {
				
				AC[i].setRightHand('<');
			}

			else if(cc[i].command.equalsIgnoreCase("right hand to head")) {
				AC[i].setRightHand('(');
			}
			
		}

		
		for(int i=0;i<=AC.length-1;i++) {
			AC[i].printAscii();
		}
		
		scan.close();
	}	
}
