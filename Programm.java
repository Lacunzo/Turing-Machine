package turing;

public class Programm {
	private Instruction[] code;
	private String name;
	private int capacity;
	private int size;

	public Programm(String n, int lines_NB) {
		name = n;
		code = new Instruction[lines_NB];
		capacity = lines_NB;
		size = 0;
	}

	public Instruction[] getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getSize() {
		return size;
	}

	public Instruction getInstruction(int ec, boolean v) {
		for (int i = 0; i < size; i++) {
			if(code[i].getEc()==ec && code[i].getLu()==v) {
				return code[i];
			}
		}
		return code[0];
	}

	public boolean add(Instruction i) {
		if (size < capacity) {
			code[size] = i;
			size++;
			return false;
		}
		return true;
	}

	public boolean add(int eco, int efin, boolean v, String ac) {
		Instruction ins = new Instruction(eco, efin, v, ac);
		return (add(ins));
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < size; i++) {
			str = str + code[i].toString() + "\n";
		}
		return str;
	}
}