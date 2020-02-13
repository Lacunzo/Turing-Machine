package turing;

public class Tp1 {
	public static void main(String arg[]) {
		 Turing tm = new Turing(14);
		 tm.writeTape("00111011111000");
		 System.out.println(tm);
		 Programm prog = new Programm("addition",6);
		 prog.add(1,1,false,"r");
		 prog.add(1,2,true,"r");
		 prog.add(2,2,true,"r");
		 prog.add(2,3,false,"wr");
		 prog.add(3,3,true,"r");
		 prog.add(3,0,false,"le");
		 tm.process(prog);
		 System.out.println("On effectue l'addition");
		 System.out.println(tm);
		 
		 
		 Turing tm2 = new Turing(14);
		 tm2.writeTape("00111011111000");
		 System.out.println("\n On utilise ce ruban");
		 System.out.println(tm2);
		 Programm prog2 = new Programm("suppr",4);
		 prog2.add(1,1,false,"r");
		 prog2.add(1,2,true,"er");
		 prog2.add(2,2,true,"er");
		 prog2.add(2,0,false,"");
		 tm2.process(prog2);
		 System.out.println("On effectue la suppression");
		 System.out.println(tm2);
		 
		 Turing tm3 = new Turing(14);
		 tm3.writeTape("00111110000000");
		 System.out.println("\n On utilise ce ruban");
		 System.out.println(tm3);
		 Programm prog3 = new Programm("paire",6);
		 prog3.add(1,1,false,"r");
		 prog3.add(1,3,true,"r");
		 prog3.add(2,3,true,"r");
		 prog3.add(2,0,false,"");
		 prog3.add(3,2,true,"r");
		 prog3.add(3,0,false,"w");
		 tm3.process(prog3);
		 System.out.println("On effectue la paire");
		 System.out.println(tm3);
	}
}