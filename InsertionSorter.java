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
     */
    public void mySort() {
		for (int i = 0; i < elements.size(); i++)
			insert1(i);
    }
}
