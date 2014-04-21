import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Longest_Word implements Comparator<String>{

	private HashSet<String> hs;
	
	public Longest_Word(){
		hs = new HashSet<String>();
	}
	
	private void find_longest_word(List<String> word_list){
		Collections.sort(word_list, new Longest_Word());
		for(int i=0;i<word_list.size();i++){
			hs.remove(word_list.get(i));
			if(search(word_list.get(i))){
				System.out.println("GOT:"+word_list.get(i));
			}
			hs.add(word_list.get(i));
		}
		
	}
	
	private boolean search(String str){
		try{
			if(hs.contains(str))
				return true;
			for(int i=0;i<str.length();i++){
				//System.out.println(str.substring(0, i) + " :" + str.substring(i,str.length()));
				if(hs.contains(str.substring(0, i)) && search(str.substring(i,str.length()))){
					return true;
				}
			}
			return false;
		}
		catch(StackOverflowError se){
			se.printStackTrace();
			return false;
		}
	}
	
	public void read_file(String filename){
		try{
			//read the file and throw file not found exception if applicable
			//FileInputStream fstream = new FileInputStream("test.txt");
			FileInputStream fstream = new FileInputStream("wordsforproblem.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
						
			String read;
			List<String> word_list = new ArrayList<String>();
			//read the data and throw io exception otherwise.
			while((read = br.readLine()) != null){
				  // Print the content on the console
				  //System.out.println (read);
				  //avoid blank lines.
				  if(read.length() > 0){
					  word_list.add(read);
					  hs.add(read);
				  }
			}
			br.close();
			fstream.close();
			
			//now find the longest word
			find_longest_word(word_list);
		}
		catch(FileNotFoundException e){
			System.out.println("File not found, input a correct file!!\n");
			e.printStackTrace();
		}
		catch(IOException io){
			System.out.println("Not able to read the file!!\n");
			io.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Longest_Word obj = new Longest_Word();
		obj.read_file(args[0]);
	}

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return -1*(o1.length()-o2.length());
	}

}
