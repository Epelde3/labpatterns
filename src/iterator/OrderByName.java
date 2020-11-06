package iterator;

import java.util.Comparator;

import domain.Symptom;

public class OrderByName implements Comparator<Symptom> {

	@Override
	public int compare(Symptom o1, Symptom o2) {
		for (int i = 0; i <Math.min(o1.getName().length(),o2.getName().length()); i++) {//zenbakia aldau
			if(o1.getName().charAt(i)<o2.getName().charAt(i)) {
				return -1;
			}else if(o1.getName().charAt(i)>o2.getName().charAt(i)) {
				return 1;
			}
		}
		return 0;
	}

}
