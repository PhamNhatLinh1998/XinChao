import java.util.*;
import java.io.*;
public class Helloworld{
	public static void main(String[] args){
		String filename;
		ArrayList<String> name=new ArrayList<String>();
		String s=" ";
		String s1=" ";
		int count=0;
                System.out.print("Please input filename: ");
        Scanner scanner = new Scanner(System.in); 
        filename = scanner.nextLine();
	    FileReader file = null;
	        try{
			file = new FileReader(filename);
			Scanner sc= new Scanner(file);
			    while(sc.hasNextLine()){
			          s=sc.nextLine();
			          s1=s.trim();
			          name.add(s1);
				      count ++;
			    } 
			    System.out.print("Hello World This is TDTU"+"\n");
			    for(int i = 0;i<name.size();i++){
			        System.out.print("Hello World I am"+" "+name.get(i)+"\n");
	            }
				System.out.print("Total"+" "+count+" "+"Students"+"\n");
			}
			catch(Exception e) {
			e.printStackTrace();
		    }
	}				       
}