public class Quadratic 
{
  private double a;
  private double b;
  private double c;
  private double solution1;
  private double solution2;
 private boolean twosolutions;
 private boolean onesolution;
 private boolean nosolution;
 private boolean imaginary;
 String imaginary1;
 String imaginary2;
  
  
  public Quadratic(){
  a=0;
  b=0;
  c=0;
  nosolution=true;
  }
  	//inialization constructor
	Quadratic(double a, double b, double c){
	  		this.a = a;
		this.b = b;
		this.c = c;
		nosolution=true;
	}
	
	//modifier method for num1
	public void seta(double a)
	{
		this.a = a;
	}
	
	//modifider method for num2
	public void setb(double b)
	{
		this.b = b;
	}
	
	//modifier method for operator
public void setc(double c){
  this.c=c;
}
	
	//accessor method for num1
	public double geta()
	{
		return a;
	}
	
	//accessor method for num2
	public double getb()
	{
		return b;
	}
	
	
	public double getc()
	{
		return c;
	}
	
	public void solve(){
	  double x = (-b+(Math.sqrt(Math.pow(b, 2.0)-4.0*a*c)))/(2.0*a);
	  solution1 = x;
	  double y = (b+(Math.sqrt(Math.pow(b, 2.0)-4.0*a*c)))/(2.0*a);
	  solution2 = y;
	  double d=Math.pow(b,2)-4*a*c;
	  
	  	
	  nosolution=false;
	  
	  if(d>0){
	    twosolutions = true;
	  }
	  if(d==0){
	    onesolution = true;
	  }
	  if(d<0){
	    imaginary=true;
	  }

	  
	  
	  imaginary1=-b/2*a+" + " + Math.sqrt(-d)/(2*a)+"i";
	  imaginary2=-b/2*a+" + " + Math.sqrt(-d)/(2*a)+"i";
	}
	

	
	public String toString(){

	
	  
	 String G =a+"x^2 + " + b + "x + " + c;
	 String A="";
	 
	 if(onesolution==true){
	   A  = " has one root at " + solution1 + ".";
	 }
	 
	 if(twosolutions==true){
	   A  = " has two real roots at "+ solution1+" & "+ solution2+".";
	 }
	 
	 if(imaginary==true){
	   A  = " has two imaginary roots at "+imaginary1+" & " + imaginary2 + ".";
	 }
	 
	 if(nosolution==true){
	   A  = " has not been solved yet.";
	 }
	  return G+A;
	}
  
}