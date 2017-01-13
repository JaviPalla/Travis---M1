package es.egc.app;

import org.apache.log4j.*;

/**
 * Hello world!
 *
 */
public class App 
{
	
	static Logger log=Logger.getLogger(App.class);
	
   static int getVal(){
	return 1;
	}
   
   public static void main(String[] args ){
	   System.out.println("Hello world");
	   log.info("Returning 1");
   }
}