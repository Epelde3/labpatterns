package iterator;

import java.util.Comparator;

import domain.Symptom;

public class OrderByIndex implements Comparator<Symptom> {

	@Override
	public int compare(Symptom arg0, Symptom arg1) {
		if (arg0.getSeverityIndex() < arg1.getSeverityIndex()) {
			return -1;
		} else if (arg0.getSeverityIndex() > arg1.getSeverityIndex()) {
			return 1;
		} else {
			return 0;
		}
	}

}
