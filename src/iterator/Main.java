package iterator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import adapter.Sorting;
import domain.Covid19Pacient;
import domain.Symptom;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient p = new Covid19Pacient("Ane", 29);
		p.addSymptom(new Symptom("s1", 10, 16), 1);
		p.addSymptom(new Symptom("s2", 10, 15), 2);
		p.addSymptom(new Symptom("s3", 10, 118), 3);
		p.addSymptom(new Symptom("s4", 10, 13), 4);
		p.addSymptom(new Symptom("s5", 10, 12), 5);
		
		
		
		Adapter it=new Adapter(p);
		
		
		Comparator comparator=new OrderByName();
		Comparator comparator2=new OrderByIndex();

		Iterator i=Sorting.sortedIterator(it, comparator2);
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
