
public class ConstMethRefImp {
	
	public static void main(String[] args) {
	 
		System.out.println("Learning  Constructor  Refernce ");
		
		///////////////////////// [Lambda ]///////////////////////
	 
		ProviderInetrf pIntLambda = () -> new Student(); //Using Lambda :create a interface of Provide and create stud obj
		Student std = pIntLambda .getStudent();//here we are running above statmenet 'ProviderInetrf pInt = () -> new Student();' and created student object
		std.disPlay(); //from display method function
		
		
		
		///////////////////////// OR [MethodReference ]///////////////////////
		/*
		 * ClassName::new;
		 */
		ProviderInetrf pIntMetRef = Student::new;
		Student std2 = pIntMetRef.getStudent();//here we are running above statmenet 'ProviderInetrf pInt = () -> new Student();' and created student object
		std2.disPlay(); //from display method function 
	}

}
