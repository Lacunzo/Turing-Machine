package turing;

public class Tape {
    private boolean []strip;
    private int index;
	
    public Tape (int taille) {
    	this.strip = new boolean [taille];
    	this.index = 0;
    }

    public Tape () {
    	this(1000);
    }
	
    public int length() {
    	return strip.length;
    }
	
    public boolean write() { //remplit la case courante (par la valeur true) ; 
    	if (this.index<0 || this.index > length()) {
    		return false;
    	}
    	strip[index] = true;
		return true;
    }
    
    public boolean erase()	{
    	if (this.index<0 || this.index > length()) {
    		return false;
    	}
    	strip[index] = false;
		return true;
    }
    
    public boolean read() {
    	return strip[index];
    }
    
    public boolean goRight() {
    	boolean valret  = false;
    	if (index < (strip.length - 1))	{
    		index++;
    		valret = true;
    	}
    	return valret;
    }
    
    public boolean goLeft() {
    	boolean valret  = false;
    	if (index > 0) {
    		index--;
    		valret = true;
    	}
    	return valret;
    }
    
    public String toString(){
    	String str = "";
    	int i;
    	for (i=0; i < strip.length; i++)
    		if (i == index)
    			str += "[" + (strip[i] == true ? "1":"_") +"]";
    		else
    			str += strip[i] == true ? "1":"_";
    	return str;
    }
    
    public void goStart() {
    	while(goLeft()) {
    	}
    }
}
