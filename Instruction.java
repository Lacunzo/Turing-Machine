package turing;

public class Instruction {
	private int ec;
	private int ef;
	private boolean lu;
	private String action;
	
	public Instruction(int eco , int efin , boolean v , String ac) {
		ec=eco;
		ef=efin;
		lu=v;
		action=ac;
	}
	public String toString() {
		String res = "< " + ec + " , " + ef + " , '" + lu + "' , " + action + " >";
		return res;
	}
	public int getEc() {
		return ec;
	}
	public int getEf() {
		return ef;
	}
	public boolean getLu() {
		return lu;
	}
	public String getAction() {
		return action;
	}
	
}
