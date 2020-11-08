package iterator;

import java.util.ArrayList;
import java.util.List;

import adapter.InvertedIterator;
import domain.Covid19Pacient;
import domain.Symptom;

public class Adapter implements InvertedIterator{
	List<Symptom> lista;
	int posizioa;
	public Adapter(Covid19Pacient p) {
		
		this.lista=new ArrayList<>(p.getSymptoms());
	}

	@Override
	public Object previous() {
		Symptom sintoma=lista.get(posizioa);
		posizioa--;
		return sintoma;
	}

	@Override
	public boolean hasPrevious() {
		
		return posizioa>=0;
	}

	@Override
	public void goLast() {
		this.posizioa=this.lista.size()-1;
		
	}
	

}
