import java.util.Optional;


//optional class basically check teh container that it has the values or not.
//if container has not particular variable values so it handle that state of null
public class OptionalExample {
	
	
	public static Optional<String> getName() {
		// TODO Auto-generated method stub
		
		String name ="samina";
		
		return Optional.ofNullable(name);
	}
	
	

	public static void main(String[] args) {
		
		String str = null;
		String str2 ="Hello";
		
		/////////////////////////////  Traditional ///////////////////
			/*	if (str == null) {
					System.out.println("null");
				}
				else {
					System.out.println(str.toString());
				}*/
	  
		/////////////////////////////  optional ///////////////////
		
				Optional<String> opt = Optional.ofNullable(str);
				System.out.println(opt.isPresent());
				//System.out.println(opt.get()); //put in checks
				System.out.println(opt.orElse("No values found"));
				
				
				Optional<String> opt2 = Optional.ofNullable(str2);
				System.out.println(opt2.isPresent());
				System.out.println(opt2.get());
				System.out.println(opt2.orElse("No values found"));

			
				
		///////////////////////////// Calling  optional Method ///////////////////		
				
				
				Optional<String> optMeth = getName();
				System.out.println(optMeth.isPresent());
				System.out.println(optMeth.orElse("No ValueFound"));
				
				
		///////////////////////////// Pros and cons of optional Method ///////////////////	
		/*
		 * 1) Instance Variable of class :
		 * 						should not be Optional because further on if we sending it to through API it would not seriaalizible
		 * Also, class variable represent the state of the class, so it could not be optional
		 * 
		 * 2) Return type of getter:
		 *						 can be Optional [best practice]
		 *		
		 */
				
				
				
		
	}

}
