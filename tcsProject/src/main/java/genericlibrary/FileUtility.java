package genericlibrary;



	import java.io.FileInputStream;

	import java.io.IOException;
	import java.util.Properties;

	public class FileUtility {
	       public static  String getProperty(String key)throws  IOException {
			//step:1 get the java representation of physical file
	    	   FileInputStream fis = new FileInputStream("./src/test/resources/testData/commonData.properties");
			
	    	 //step 2 : create the object of properties class
	    	   Properties pObj=new Properties();
	    	   //step 3:load all key and values to properties object
				pObj.load(fis);
			
	    	   //step 4: get the value using key
	    	   return pObj.getProperty(key);
	    	   
		}
	}

	


