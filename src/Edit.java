
import java.io.*;
import java.util.StringTokenizer;  
//****************
//START: READ ONLY
//****************
public class Edit {
//****************
//END: READ ONLY
//****************

// YOU CAN DEFINE YOUR OWN FUNCTIONS HERE IF YOU REALLY NEED ONE

//****************
//START: READ ONLY
//****************
 
    public static int EditDistance(String a, String b) {
//****************
//END: READ ONLY
//****************

		//WRITE YOUR NSID: 
		
		//start: edit and write your code here 
 
		
		return 0;
        //end: write your code here 
	 
		 
		
    }
//****************
//START: READ ONLY
//****************
    /**
     * Main Function.
     */
    public static void main(String[] args) {

        BufferedReader reader;
        File file = new File("output.txt"); 
		String line;
        try {
            reader = new BufferedReader(new FileReader("edit.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));            
            while(true){ 
				line = reader.readLine();
				if(line == null) break;				
				StringTokenizer st = new StringTokenizer(line, ",");
				String a = st.nextToken();
				String b = st.nextToken();
                writer.write(EditDistance(a,b) + "\n");
            } 

            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate input file.");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
