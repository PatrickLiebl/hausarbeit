package de.nak.xtext.hausarbeit.rentalSystem.tests;

import com.google.inject.Injector;

import de.nak.xtext.hausarbeit.rentalSystem.tests.RentalSystemInjectorProvider;
import de.nak.xtext.hausarbeit.rentalWorkflow.tests.RentalWorkflowInjectorProvider;

public class BothLanguagesInjectorProvider extends RentalSystemInjectorProvider{

	@Override
	protected Injector internalCreateInjector() {
		// trigger injector creation of other language
		new RentalWorkflowInjectorProvider().getInjector();		
		return super.internalCreateInjector();
	}
}
