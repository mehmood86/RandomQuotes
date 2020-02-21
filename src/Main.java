import java.io.*;
import java.util.Random;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		File file = new File("src/RandomQuotes");
		BufferedReader br = new BufferedReader(new FileReader(file)); 

		ArrayList<String> quotesList = new ArrayList<String>();
		String st;
		
		while ((st = br.readLine()) != null) {
			quotesList.add(st);
		}
		
        Random rand = new Random();        
        JsonQuote jq = new JsonQuote(quotesList.get(rand.nextInt(quotesList.size())));
        System.out.println(jq.quote());
        br.close();
        
        /*
         String str="";
         
        for (int i=1; i<10; i++){
        	for (int j=1; j<11; j++) {
        		str += j*i;
        		str += "\t";
        	}
        	str += "\n";
        	//str += rand.nextInt(10);
        }
        System.out.println(str);
        */
        
	}

}
