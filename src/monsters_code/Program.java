package monsters_code;
import java.util.*;

public class Program {
		public static void main(String[] args) {
			Scanner scan=null;
			try {
				scan=new Scanner(System.in);
				//inputs
				System.out.println("Enter No.of Monsters");
				int no_of_monsters=scan.nextInt();
				System.out.println("Initial Player power");
				int player_power=scan.nextInt();
				int[] mpp=new int[no_of_monsters];
				int[] bp=new int[no_of_monsters];
				
				for(int i=0;i<=no_of_monsters-1;i++) {
					System.out.println("Power of Monster " + (i+1));
					mpp[i]=scan.nextInt();
				}
				for(int i=0;i<=no_of_monsters-1;i++) {
					System.out.println("Bonus for Monster " + (i+1));
					bp[i]=scan.nextInt();
				}
				
				//-----//
				Monster[] mons = new Monster[no_of_monsters];
				for(int i=0;i<=no_of_monsters-1;i++) {
					mons[i]=new Monster(mpp[i], bp[i]);
				}
				Arrays.sort(mons,Comparator.comparingInt(m->m.monster_points));
				
				//--//
				int no_of_mons_defeated=0;
				for(int i=0;i<=no_of_monsters-1;i++) {
					if(player_power >= mons[i].monster_points) {
						player_power+=mons[i].monster_bonus;
						no_of_mons_defeated++;
					}
				}
				
				//Result
				System.out.println(no_of_mons_defeated);
				
				
			}
			finally {
				scan.close();
			}
			
		}

}
