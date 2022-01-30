package ram;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class ComparatorComparator {
	

	private static final Comparator<ComparatorComparator> ComparatorRollno = null;
	private static final Comparator<ComparatorComparator> StuNameComparator = null;

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	ArrayList<ComparatorComparator> arraylist = new ArrayList<ComparatorComparator>();
	arraylist.add(new ComparatorComparator());
	arraylist.add(new ComparatorComparator());
	arraylist.add(new ComparatorComparator());

	/*Sorting based on Student Name*/
	System.out.println("Student Name Sorting:");
	Collections.sort(arraylist, ComparatorComparator.StuNameComparator);

	for(ComparatorComparator str: arraylist){
	System.out.println(str);
	}

	/* Sorting on Rollno property*/
	System.out.println("RollNum Sorting:");
	extracted(arraylist);
	for(ComparatorComparator str: arraylist){
	System.out.println(str);
	}


	}

	private static void extracted(ArrayList<ComparatorComparator> arraylist) {
		Collections.sort(arraylist, ComparatorComparator.ComparatorRollno);
	}

	}


