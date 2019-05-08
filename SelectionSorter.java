/**
  Implement a selection sort, in the Sorters structure
 */
import java.util.ArrayList;

public class SelectionSorter extends Sorter {


    /**
      Construct an instance to process the user's data
     */
    public SelectionSorter(ArrayList< String> usersData) {
        super(usersData);
    }


	// from hw62 solutions
	/**
	  Precondition(s): a list sorted up to index startAt, startAt < length of list
	  Synopsis: Finds smallest value in unsorted region, moves it to the end of the sorted region.
	  Postcondition(s): a list sorted up to index startAt + 1
	 */
    private int dweebIndex( int startAt) {
        // use the starting element as a first guess
        int dweebAt = startAt;
        String dweeb = elements.get( dweebAt);
        
        for( int testAt = startAt +1
           ; testAt < elements.size()
           ; testAt++)
            if( elements.get( testAt).compareTo( dweeb) < 0) {
                // Found a smaller value. Remember it.
                dweebAt = testAt;
                dweeb = elements.get( dweebAt);
            }
        return dweebAt;
}

    /**
      sort the user's data, implementing selection sort
	  
	  Precondition(s): a list of elements
	  Synopsis: Runs reigningDweeb for positions 0 through n–2 in the list. 
	  Postcondition(s): a sorted list of elements
     */
    public void mySort() {
		// Iterate through each slot that is to be populated.
        for( int next = 0
           ; next < elements.size() -1  // last needs no sort
           ; next++) {
            elements.set( next
                        , elements.set( dweebIndex( next)
                                      , elements.get( next))
                        );
        }
    }

}
