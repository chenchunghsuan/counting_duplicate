package counting_duplicate_words;
import java.util.*;
public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input;
Scanner sc=new Scanner(System.in);
while(true) {
	int num=0;
	System.out.println("Please Enter a sentence : (if enter q it will quit)");
	Map<String,String> wordMap = new HashMap<String,String>(); 
	Map<String,String> printedMap = new HashMap<String,String>();
input=sc.nextLine();
if(input.equals("q"))break;
String[] words = input.split(" ");
for(int i=0;i<words.length;i++) {
    String word = words[i].toUpperCase(); // for case insensitive comparison
    if(wordMap.get(word)!=null) {
        // we found a duplicated word!
        if(printedMap.get(word)==null) { // first check if it is printed already!
            printedMap.put(word, word); 
            num++;
        }
        
    }else {
    	
        wordMap.put(word, word);
    }
}
System.out.println("The number of duplicated word: "+num);
}
	}

}
