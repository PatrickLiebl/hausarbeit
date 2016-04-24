package de.nak.xtext.hausarbeit.rentalSystem.tests;

import com.google.inject.Inject;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystem;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystemPackage;
import de.nak.xtext.hausarbeit.rentalSystem.tests.BothLanguagesInjectorProvider;
import de.nak.xtext.hausarbeit.rentalSystem.validation.AttributeValidator;
import de.nak.xtext.hausarbeit.rentalSystem.validation.CustomerValidator;
import de.nak.xtext.hausarbeit.rentalSystem.validation.RentalSystemValidator;
import java.util.Map;
import javax.inject.Provider;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
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
  
  @Inject
  @Extension
  private Provider<XtextResourceSet> resourceSetProvider;
  
  @Test
  public void attributeShallStartWithLowerCase() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("rentalSystem sampleSystem \"title\"(");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("movable typeMold rentalTypeID1(");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("attribute Title String");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("attribute price int");
      _builder.newLine();
      _builder.append("\t");
      _builder.append(")");
      _builder.newLine();
      _builder.append(")");
      _builder.newLine();
      final RentalSystem result = this.parseHelper.parse(_builder);
      EClass _attribute = RentalSystemPackage.eINSTANCE.getAttribute();
      this.validationTestHelper.assertIssue(result, _attribute, AttributeValidator.ATTRIBUTE__UPPER_CASE_NAME, Severity.WARNING, "The attribute should start with a lower case.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void customerShallStartWithLowerCase() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("rentalSystem testSystem \"title\"(");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("customerMold CustomerID1 (");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("attribute title int\t\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append(")\t");
      _builder.newLine();
      _builder.append(")");
      _builder.newLine();
      final RentalSystem result = this.parseHelper.parse(_builder);
      EClass _customer = RentalSystemPackage.eINSTANCE.getCustomer();
      this.validationTestHelper.assertIssue(result, _customer, CustomerValidator.CUSTOMER__UPPER_CASE_NAME, Severity.WARNING, "The customer should start with a lower case.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void dealShallStartWithLowerCase() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      URI _createURI = URI.createURI("workflow.rentalWorkflow");
      final Resource testWorkflow = resourceSet.createResource(_createURI);
      StringInputStream _stringInputStream = new StringInputStream(
        "defineWorkflow workflow1\r\n\t\t\tevents \r\n\t\t\t\tonNext nextClicked \r\n\t\t\t\tonCancel cancelClicked\r\n\t\t\t\tonBack backClicked\r\n\t\t\tend\r\n\t\t\t\r\n\t\t\tcommands\r\n\t\t\tabortNow doAbort\r\n\t\t\tdeleteNow doDelete\r\n\t\t\tsaveNow doSave \r\n\t\t\tend\r\n\t\t\t\r\n\t\t\tresetEvents\r\n\t\t\tonCancel\r\n\t\t\tend");
      Map<Object, Object> _emptyMap = CollectionLiterals.<Object, Object>emptyMap();
      testWorkflow.load(_stringInputStream, _emptyMap);
      this.validationTestHelper.assertNoErrors(testWorkflow);
      final RentalSystem testRentalSystem = this.parseHelper.parse(
        "rentalSystem testSystem \"title\"(\r\n\t\t\t\tmovable typeMold rentalTypeID1(\r\n\t\t\t\t\tattribute title String\r\n\t\t\t\t\tattribute price int\r\n\t\t\t\t)\r\n\t\t\t\tcustomerMold customerID1 (\r\n\t\t\t\t\tattribute title String\t\t\t\r\n\t\t\t\t)\r\n\t\t\t\tdeal DealID1(\r\n\t\t\t\t\tcustomer customerID1\r\n\t\t\t\t\trentalType rentalTypeID1 \r\n\t\t\t\t\tdealWorkflow  workflow1 \r\n\t\t\t\t\tdealAttribute\r\n\t\t\t\t)\r\n\t\t\t\t\r\n\t\t\t)", resourceSet);
      this.validationTestHelper.assertNoErrors(testRentalSystem);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void rentalSystemTitleMustNotBeEmpty() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("rentalSystem sampleSystem \"\"");
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
  public void rentalSystemNameMustBeSet() {
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
      this.validationTestHelper.assertError(result, _rentalSystem, null, "A name must be set.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void rentalSystemTitleShallStartWithLowerCase() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("rentalSystem sampleSystem \"Titel\"");
      _builder.newLine();
      _builder.append("(");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append(")");
      _builder.newLine();
      final RentalSystem result = this.parseHelper.parse(_builder);
      EClass _rentalSystem = RentalSystemPackage.eINSTANCE.getRentalSystem();
      this.validationTestHelper.assertIssue(result, _rentalSystem, RentalSystemValidator.RENTAL_SYSTEM__UPPER_CASE_TITLE, Severity.WARNING, "The title should start with a lower case.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void rentalSystemShallStartWithLowerCase() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("rentalSystem SampleSystem \"titel\"");
      _builder.newLine();
      _builder.append("(");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append(")");
      _builder.newLine();
      final RentalSystem result = this.parseHelper.parse(_builder);
      EClass _rentalSystem = RentalSystemPackage.eINSTANCE.getRentalSystem();
      this.validationTestHelper.assertIssue(result, _rentalSystem, RentalSystemValidator.RENTAL_SYSTEM__UPPER_CASE_NAME, Severity.WARNING, "The rentalSystem should start with a lower case.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void rentalTypeShallStartWithLowerCase() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      URI _createURI = URI.createURI("workflow.rentalWorkflow");
      final Resource testWorkflow = resourceSet.createResource(_createURI);
      StringInputStream _stringInputStream = new StringInputStream(
        "defineWorkflow workflow1\r\n\t\t\tevents \r\n\t\t\t\tonNext nextClicked \r\n\t\t\t\tonCancel cancelClicked\r\n\t\t\t\tonBack backClicked\r\n\t\t\tend\r\n\t\t\t\r\n\t\t\tcommands\r\n\t\t\tabortNow doAbort\r\n\t\t\tdeleteNow doDelete\r\n\t\t\tsaveNow doSave \r\n\t\t\tend\r\n\t\t\t\r\n\t\t\tresetEvents\r\n\t\t\tonCancel\r\n\t\t\tend");
      Map<Object, Object> _emptyMap = CollectionLiterals.<Object, Object>emptyMap();
      testWorkflow.load(_stringInputStream, _emptyMap);
      this.validationTestHelper.assertNoErrors(testWorkflow);
      final RentalSystem testRentalSystem = this.parseHelper.parse(
        "rentalSystem testSystem \"title\"(\r\n\t\t\t\tmovable typeMold RentalTypeID1(\r\n\t\t\t\t\tattribute title String\r\n\t\t\t\t\tattribute price int\r\n\t\t\t\t)\r\n\t\t\t\tcustomerMold customerID1 (\r\n\t\t\t\t\tattribute title String\t\t\t\r\n\t\t\t\t)\r\n\t\t\t\tdeal DealID1(\r\n\t\t\t\t\tcustomer customerID1\r\n\t\t\t\t\trentalType RentalTypeID1 \r\n\t\t\t\t\tdealWorkflow  workflow1 \r\n\t\t\t\t\tdealAttribute\r\n\t\t\t\t)\r\n\t\t\t\t\r\n\t\t\t)", resourceSet);
      this.validationTestHelper.assertNoErrors(testRentalSystem);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
