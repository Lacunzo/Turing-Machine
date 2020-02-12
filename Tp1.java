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
		 System.out.print(tm);
		 /*exercices supplémentaire suppr et paire*/
	}
}
