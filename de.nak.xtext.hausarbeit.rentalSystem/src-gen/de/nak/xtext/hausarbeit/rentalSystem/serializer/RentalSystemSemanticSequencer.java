/*
 * generated by Xtext 2.9.2
 */
package de.nak.xtext.hausarbeit.rentalSystem.serializer;

import com.google.inject.Inject;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Attribute;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Customer;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystem;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalType;
import de.nak.xtext.hausarbeit.rentalSystem.services.RentalSystemGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class RentalSystemSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RentalSystemGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RentalSystemPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RentalSystemPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case RentalSystemPackage.CUSTOMER:
				sequence_Customer(context, (Customer) semanticObject); 
				return; 
			case RentalSystemPackage.DEAL:
				sequence_Deal(context, (Deal) semanticObject); 
				return; 
			case RentalSystemPackage.RENTAL_SYSTEM:
				sequence_RentalSystem(context, (RentalSystem) semanticObject); 
				return; 
			case RentalSystemPackage.RENTAL_TYPE:
				sequence_RentalType(context, (RentalType) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (name=ID value=STRING ofType=OfType)
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RentalSystemPackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RentalSystemPackage.Literals.ATTRIBUTE__NAME));
			if (transientValues.isValueTransient(semanticObject, RentalSystemPackage.Literals.ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RentalSystemPackage.Literals.ATTRIBUTE__VALUE));
			if (transientValues.isValueTransient(semanticObject, RentalSystemPackage.Literals.ATTRIBUTE__OF_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RentalSystemPackage.Literals.ATTRIBUTE__OF_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getAttributeAccess().getOfTypeOfTypeEnumRuleCall_3_0(), semanticObject.getOfType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Customer returns Customer
	 *
	 * Constraint:
	 *     (name=ID customerAttribute+=Attribute*)
	 */
	protected void sequence_Customer(ISerializationContext context, Customer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Deal returns Deal
	 *
	 * Constraint:
	 *     (name=ID customer=[Customer|ID] rentalType=[RentalType|ID] dealAttributes+=Attribute*)
	 */
	protected void sequence_Deal(ISerializationContext context, Deal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RentalSystem returns RentalSystem
	 *
	 * Constraint:
	 *     (name=ID title=STRING rentalTypes+=RentalType* customers+=Customer* deals+=Deal*)
	 */
	protected void sequence_RentalSystem(ISerializationContext context, RentalSystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RentalType returns RentalType
	 *
	 * Constraint:
	 *     ((movable?='movable' | digital?='digital' | fix?='fix') name=ID typeAttributes+=Attribute*)
	 */
	protected void sequence_RentalType(ISerializationContext context, RentalType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
