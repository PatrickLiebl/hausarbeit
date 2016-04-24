package de.nak.xtext.hausarbeit.rentalSystem.tests;

import com.google.inject.Inject;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystem;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage;
import de.nak.xtext.hausarbeit.rentalSystem.tests.BothLanguagesInjectorProvider;
import de.nak.xtext.hausarbeit.rentalSystem.validation.RentalSystemValidator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(BothLanguagesInjectorProvider.class)
@SuppressWarnings("all")
public class RentalSystemValidationTest {
  @Inject
  @Extension
  private ParseHelper<RentalSystem> parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper validationTestHelper;
  
  @Test
  public void titleMustNotBeEmpty() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("rentalSystem SampleSystem \"\"");
      _builder.newLine();
      _builder.append("(");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append(")");
      _builder.newLine();
      final RentalSystem result = this.parseHelper.parse(_builder);
      EClass _rentalSystem = RentalSystemPackage.eINSTANCE.getRentalSystem();
      this.validationTestHelper.assertError(result, _rentalSystem, RentalSystemValidator.RENTAL_SYSTEM__EMPTY_TITLE, "The title must not be empty.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void nameMustBeSet() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("rentalSystem \"Titel\"");
      _builder.newLine();
      _builder.append("(");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append(")");
      _builder.newLine();
      final RentalSystem result = this.parseHelper.parse(_builder);
      EClass _rentalSystem = RentalSystemPackage.eINSTANCE.getRentalSystem();
      this.validationTestHelper.assertError(result, _rentalSystem, RentalSystemValidator.RENTAL_SYSTEM__EMPTY_TITLE, "The title must not be empty.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
