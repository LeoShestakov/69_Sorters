/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {


    /**
      Construct an instance to process the user's data
     */
    public InsertionSorter(ArrayList< String> usersData) {
        super(usersData);
    }

	/**
	  Precondition(s): a list sorted up to index alreadyInserted, alreadyInserted < length of list
	  Synopsis: Inserts the first unsorted element in its place in the current sorted region.
	  Postcondition(s): a list sorted up to index alreadyInserted + 1
	 */
    public void insert1(int alreadyInserted) {
    		String valueToInsert = elements.get(alreadyInserted);
    		for (int indexToCompare = alreadyInserted - 1; indexToCompare >= 0; indexToCompare--) {
    			if (valueToInsert.compareTo(elements.get(indexToCompare)) < 0) {
    				String temp = elements.get(indexToCompare);
    				elements.set(indexToCompare, valueToInsert);
    				elements.set(indexToCompare + 1, temp);
    			}
    		}
    }

    /**
      sort the user's data, implementing insertion sort
	  
	  Precondition(s): a list of elements
	  Synopsis: Runs insert1 for positions 1 through n–1 in the list. 
	  Postcondition(s): a sorted list of elements
     */
    public void mySort() {
		for (int i = 0; i < elements.size(); i++)
			insert1(i);
    }
}
