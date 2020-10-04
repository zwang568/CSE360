package cse360assignment02;

public class AddingMachine {
  private int total;//private variable total
  String str;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    str=new String("0");
  }
  
  public int getTotal () {
    return total;//return total value
  }
  
  public void add (int value) {
	  total=total+value;//add value to total
	  str=str+" + "+value;//add + value to str
  }

  public void subtract (int value) {
	  total=total-value;//subtract value from total
	  str=str+" - "+value;//add - value to str
  }

  public String toString () {
    return str.toString();
  }

  public void clear() {
	  str="";
  }
}