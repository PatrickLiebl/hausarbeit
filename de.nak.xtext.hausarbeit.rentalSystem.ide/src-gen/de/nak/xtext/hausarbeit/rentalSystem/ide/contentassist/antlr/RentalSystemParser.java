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
					put(grammarAccess.getRentalTypeAccess().getAlternatives_0(), "rule__RentalType__Alternatives_0");
					put(grammarAccess.getOfTypeAccess().getAlternatives(), "rule__OfType__Alternatives");
					put(grammarAccess.getRentalSystemAccess().getGroup(), "rule__RentalSystem__Group__0");
					put(grammarAccess.getRentalTypeAccess().getGroup(), "rule__RentalType__Group__0");
					put(grammarAccess.getCustomerAccess().getGroup(), "rule__Customer__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getDealAccess().getGroup(), "rule__Deal__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getRentalSystemAccess().getNameAssignment_1(), "rule__RentalSystem__NameAssignment_1");
					put(grammarAccess.getRentalSystemAccess().getTitleAssignment_2(), "rule__RentalSystem__TitleAssignment_2");
					put(grammarAccess.getRentalSystemAccess().getRentalTypesAssignment_4(), "rule__RentalSystem__RentalTypesAssignment_4");
					put(grammarAccess.getRentalSystemAccess().getCustomersAssignment_5(), "rule__RentalSystem__CustomersAssignment_5");
					put(grammarAccess.getRentalSystemAccess().getDealsAssignment_6(), "rule__RentalSystem__DealsAssignment_6");
					put(grammarAccess.getRentalTypeAccess().getMovableAssignment_0_0(), "rule__RentalType__MovableAssignment_0_0");
					put(grammarAccess.getRentalTypeAccess().getDigitalAssignment_0_1(), "rule__RentalType__DigitalAssignment_0_1");
					put(grammarAccess.getRentalTypeAccess().getFixAssignment_0_2(), "rule__RentalType__FixAssignment_0_2");
					put(grammarAccess.getRentalTypeAccess().getNameAssignment_2(), "rule__RentalType__NameAssignment_2");
					put(grammarAccess.getRentalTypeAccess().getTypeAttributesAssignment_4(), "rule__RentalType__TypeAttributesAssignment_4");
					put(grammarAccess.getCustomerAccess().getNameAssignment_1(), "rule__Customer__NameAssignment_1");
					put(grammarAccess.getCustomerAccess().getCustomerAttributeAssignment_3(), "rule__Customer__CustomerAttributeAssignment_3");
					put(grammarAccess.getDealAccess().getNameAssignment_1(), "rule__Deal__NameAssignment_1");
					put(grammarAccess.getDealAccess().getCustomerAssignment_4(), "rule__Deal__CustomerAssignment_4");
					put(grammarAccess.getDealAccess().getRentalTypeAssignment_6(), "rule__Deal__RentalTypeAssignment_6");
					put(grammarAccess.getDealAccess().getWfAssignment_8(), "rule__Deal__WfAssignment_8");
					put(grammarAccess.getDealAccess().getDealAttributesAssignment_10(), "rule__Deal__DealAttributesAssignment_10");
					put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
					put(grammarAccess.getAttributeAccess().getValueAssignment_2(), "rule__Attribute__ValueAssignment_2");
					put(grammarAccess.getAttributeAccess().getOfTypeAssignment_3(), "rule__Attribute__OfTypeAssignment_3");
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
