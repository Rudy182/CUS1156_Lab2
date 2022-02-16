import java.util.ArrayList;
import java.util.Collections;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
	  int count = 0;
	  int repeat = 0;
	  ArrayList<String> priorRepeats = new ArrayList<>();
	 
	  
      for (int i = 0; i < list.size(); i++)
      {		
    	  int occurances = Collections.frequency(list, list.get(i));
    	  
    	  if(occurances>1 && !priorRepeats.contains(list.get(i)))
    	  {
    		  repeat++;
    		  priorRepeats.add(list.get(i));
    	  }
      }
      count = list.size() - repeat;
      return count;
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
