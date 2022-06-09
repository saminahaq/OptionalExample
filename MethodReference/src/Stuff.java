import java.util.Iterator;

public class Stuff {
	
	
	/*for the Method referencing, shoudl be same parameter, but return type could be different
	 * so "public static int  doStuff()"   or  "public static void doStuff()"
	 * both are fine for the Method refernce
	 * BUT
	 * "public static int  doStuff(int a)"   or  "public static void doStuff()"
	 * not fine, create issue ,so arguments should be same
	 */
	public static void  doStuff() {    
		
		System.out.println("Do stuff here");
		System.out.println("Again...Do stuff here");
		
	}
	
	
	public static void doThread() {
		
	      for (int i = 0; i < 10; i++) {
			
	    	  System.out.println( i *2);
	    	  try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	  
		}

	}
	
	
	public  void printnumber() {
		
	      for (int i = 0; i < 10; i++) {
			
	    	  System.out.println( i);
	    	  try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	  
		}

	}
	

}
