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
		 System.out.print("On effectue l'addition");
		 System.out.print(tm);
		 Programm prog2 = new Programm("suppr",4);
		 prog2.add(1,1,false,"r");
		 prog2.add(1,2,true,"er");
		 prog2.add(2,2,true,"er");
		 prog2.add(2,0,false,"");
		 Programm prog3 = new Programm("paire",4);
		 prog3.add(1,1,false,"r");
		 prog3.add(1,2,true,"r");
		 prog3.add(2,1,true,"r");
		 prog3.add(2,0,false,"w");
		 
	}
}
