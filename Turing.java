package turing;

public class Turing {
	private Tape t;
	private int state;
	public Turing() {
		this(1000);
	}
	public Turing(int capacity) {
		t = new Tape(capacity);
		state=1;
	}
	
	public int GetState() {
		return state;
	}
	
	private boolean execute(char action) {
		boolean ret=false;
		switch(action) {
		case 'r' : ret = t.goRight();
		break;
		case 'l' : ret = t.goLeft();
		break;
		case 'w' : ret = t.write();
		break;
		case 'e' : ret = t.erase();
		break;
		case 'v' : ret = t.read();
		break;
		default : ret = true;
		}
		return ret;
	}
	
	public boolean writeTape(String ch) {
		boolean ret = true;
		int l = ch.length();
		if(l <= t.length() ) {
			for(int i=0; i < l ; i++) {
				if(ch.charAt(i)=='0') {
					this.t.erase();
					this.t.goRight();
				}else {
					this.t.write();
					this.t.goRight();
				}
			}
		}else {
			ret=false;
		}
		return ret;
	}
	
	public boolean process(Programm p) {
		this.state = 1;
		t.goStart();
		while(state!=0) {
			Instruction ins = p.getInstruction(state, t.read());
			for(int j=0; j < ins.getAction().length() ; j++) {
				if (execute(ins.getAction().charAt(j))) {
					return true;
				}
			}
			this.state = ins.getEf();
		}
		return false;
	}

	public String toString() {
		return t.toString();
	}
	
	
}
