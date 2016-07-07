import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemUnixProcessBuilder {

	public static void bash(String api, String username, String password){
try {
			
			
			String[] cf_login = {"/usr/local/bin/cf" , "login" , "-a"  , api , "-u" , username , "-p" , password};
			
			ProcessBuilder pb = new ProcessBuilder(cf_login);
			Process login = pb.start();
			
			
			 // Printing output of login
            // Get input streams
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(login.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(login.getErrorStream()));
			
            // Read command standard output
			 String s;
			 while ((s = stdInput.readLine()) != null) {
				 System.out.println(s);
			 }
            
			 // Read command errors
			 while ((s = stdError.readLine()) != null) {
                System.out.println(s);	
			 }
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public static void main(String[] args){
		bash("url", "user", "password");
	}
	
}
