
public class MethodReference1 {

	//Method Refernce Explaination
	public static void main(String[] args) {
		System.out.println("Method Reference Starr !!!");
		
		
		//Provide the implemetation of workInterf class
		
		WorkInterf wIntf = new WorkInterf() {
			
			@Override
			public void doTask() {
				
				System.out.println("From Interface Traditional");
				
			}
		};
		wIntf.doTask();
		
		///////////////////////// OR [Lambda ]///////////////////////
		
		WorkInterf wInf = () -> System.out.println("From Interface  : Lambda");
		wInf.doTask();
		
		///////////////////////// OR [Method reference : Static Method ]///////////////////////
		/*
		 * as we know the Stuff has already a function doStuff(), want to call that exsisting function 
		 * instead of passing new SOP
		 * 
		 * as doStuff has the static method so, traditionaly we used the class name first and than the function name
		 * e.g  Stuff.doStuff(); Traditional Calling
		 * :: used for Method refernce / Constructor reference
		 * Stuff::doStuff; //not the () included
		 * ClassName::MethdName//without ()
		 * 
		 * used by [left hand sight]  shoudl be FuntionalInterface , custom FunctionalInterface [WorkIntf], Runnable, Callable, Comparator
		 */
		
		//referred Static method :Using customised FunctionalInterface
		WorkInterf WMethodRef = Stuff::doStuff; //Now, all the body of the doStuff() has been referred here.
		WMethodRef.doTask();
		
		
		//referred Static method
		Runnable runable = Stuff::doThread; //making thread
		Thread thread =new Thread(runable); //assigning thread
		thread.start();//start thread
		
		
		///////////////////////// OR [Method reference : Non Static Method ]///////////////////////
		/*
		 * for non static method 
		 * 1) we need to create the object of that class and used
		 * 2) used that obj to callMethod inside the reference
		 */
		
		//create a obj of that class
		Stuff st = new Stuff();
		//Create Thread like that
		//ObjName::MethodName
		Runnable run = st::printnumber; //refer non static method
		Thread th = new Thread(run);
		th.start();
		
		
	}
}
