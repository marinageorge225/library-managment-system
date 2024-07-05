import java.io.*;
import java.util.*;
public class Librarymangementsystem {
	public static void main(String []args) throws IOException {
}
		String file="C:\\exsel.xsls";
		ArrayList<String> result = new ArrayList<>();
		BufferedReader reader=null;
		String line="";
		try {
			reader = new BufferedReader(new FileReader(file));
			while((line = reader.readLine())!=null) {
				String[]row=line.split(",");
				for(String index : row) {
					System.out.printf("%-30s",index);
				}
				System.out.println();
			}
			

			try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			    while (br.ready()) {
			        result.add(br.readLine());
			    }
			    System.out.print(result);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally {
			reader.close();
			}}}
		