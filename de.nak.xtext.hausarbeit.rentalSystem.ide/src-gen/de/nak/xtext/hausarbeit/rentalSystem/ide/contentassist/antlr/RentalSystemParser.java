/*
 * generated by Xtext 2.9.2
 */
package de.nak.xtext.hausarbeit.rentalSystem.ide.contentassist.antlr;

import com.google.inject.Inject;
import de.nak.xtext.hausarbeit.rentalSystem.ide.contentassist.antlr.internal.InternalRentalSystemParser;
import de.nak.xtext.hausarbeit.rentalSystem.services.RentalSystemGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class RentalSystemParser extends AbstractContentAssistParser {

	@Inject
	private RentalSystemGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalRentalSystemParser createParser() {
		InternalRentalSystemParser result = new InternalRentalSystemParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTypeAccess().getAlternatives_0(), "rule__Type__Alternatives_0");
					put(grammarAccess.getOfTypeAccess().getAlternatives(), "rule__OfType__Alternatives");
					put(grammarAccess.getRentalSystemAccess().getGroup(), "rule__RentalSystem__Group__0");
					put(grammarAccess.getTypeAccess().getGroup(), "rule__Type__Group__0");
					put(grammarAccess.getRentalWorkflowAccess().getGroup(), "rule__RentalWorkflow__Group__0");
					put(grammarAccess.getTypeAttributeAccess().getGroup(), "rule__TypeAttribute__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getCustomerAccess().getGroup(), "rule__Customer__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getRentalSystemAccess().getNameAssignment_1(), "rule__RentalSystem__NameAssignment_1");
					put(grammarAccess.getRentalSystemAccess().getTitleAssignment_2(), "rule__RentalSystem__TitleAssignment_2");
					put(grammarAccess.getRentalSystemAccess().getTypesAssignment_3(), "rule__RentalSystem__TypesAssignment_3");
					put(grammarAccess.getRentalSystemAccess().getCustomersAssignment_4(), "rule__RentalSystem__CustomersAssignment_4");
					put(grammarAccess.getTypeAccess().getMovableAssignment_0_0(), "rule__Type__MovableAssignment_0_0");
					put(grammarAccess.getTypeAccess().getDigitalAssignment_0_1(), "rule__Type__DigitalAssignment_0_1");
					put(grammarAccess.getTypeAccess().getFixAssignment_0_2(), "rule__Type__FixAssignment_0_2");
					put(grammarAccess.getTypeAccess().getNameAssignment_2(), "rule__Type__NameAssignment_2");
					put(grammarAccess.getTypeAccess().getRentalWorkflowAssignment_4(), "rule__Type__RentalWorkflowAssignment_4");
					put(grammarAccess.getTypeAccess().getTypeAttributesAssignment_5(), "rule__Type__TypeAttributesAssignment_5");
					put(grammarAccess.getRentalWorkflowAccess().getRentalWorkflowAssignment_1(), "rule__RentalWorkflow__RentalWorkflowAssignment_1");
					put(grammarAccess.getTypeAttributeAccess().getNameAssignment_1(), "rule__TypeAttribute__NameAssignment_1");
					put(grammarAccess.getTypeAttributeAccess().getOfTypeAssignment_3(), "rule__TypeAttribute__OfTypeAssignment_3");
					put(grammarAccess.getCustomerAccess().getNameAssignment_1(), "rule__Customer__NameAssignment_1");
					put(grammarAccess.getCustomerAccess().getAttributesAssignment_3(), "rule__Customer__AttributesAssignment_3");
					put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
					put(grammarAccess.getAttributeAccess().getValueAssignment_2(), "rule__Attribute__ValueAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalRentalSystemParser typedParser = (InternalRentalSystemParser) parser;
			typedParser.entryRuleRentalSystem();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public RentalSystemGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RentalSystemGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
