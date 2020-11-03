package observer;

import java.util.Observable;

import domain.Covid19Pacient;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Observable pacient=new Covid19Pacient("Melvin",25);
		Observable pacient1=new Covid19Pacient("Juan", 65);
		PacientObserverGUI a=new PacientObserverGUI(pacient);
		PacientSymptomGUI frame=new PacientSymptomGUI((Covid19Pacient) pacient);
		PacientThermometerGUI frameT=new PacientThermometerGUI(pacient);
		SemaphorGUI frameS=new SemaphorGUI(pacient);
		
//		PacientObserverGUI b=new PacientObserverGUI(pacient1);
//		PacientSymptomGUI frame1=new PacientSymptomGUI((Covid19Pacient) pacient1);
//		PacientThermometerGUI frameT2=new PacientThermometerGUI(pacient1);

	}


}
