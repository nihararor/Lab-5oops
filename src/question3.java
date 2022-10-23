
public class question3 {
	public class Class1 {
	    private InnerClass1 ic;   // a private reference of class InnerClass1 is made 
	    public Class1(){   // constructor of the class Class 1 which will be called automatically when the object will be created.
	        ic = new InnerClass1();  // object of the class InnerClass1 is assigned
	    }
	    public void displayStrings()  //public method of the class 
	    {
	        System.out.println(ic.getString() + ".");  // getString method of InnerClass1 is called 
	        System.out.println(ic.getAnotherString() + ".");  // getAnotherString method of InnerClass1 is called 
	    }
	    public static void main(String[] args) { 
	        Class1 c1 = new Class1();  // object of Class1 is made
	        c1.displayStrings();  // method of Class1 is called
	    }
	     
	    private class InnerClass1{  // a private class which can't be assessed outside the class Class1
	        public String getString()  // method 1 
	        {
	            return "InnerClass1 : getString invoked"; 
	        }
	        public String getAnotherString() // method 2
	        {
	            return "InnerClass1 : getAnotherString invoked";
	        }
	    }
	}
}
