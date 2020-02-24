
public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	throw new MyException(9);
	
}
catch( MyException e) {
	System.out.println(e);
}
class MyException extends Exception
{
	int a;
	MyException (int b){
		a=b;
	}
	public string tostring()
	{
		return ("Exception number ="+a);
	}
}
	}

}
