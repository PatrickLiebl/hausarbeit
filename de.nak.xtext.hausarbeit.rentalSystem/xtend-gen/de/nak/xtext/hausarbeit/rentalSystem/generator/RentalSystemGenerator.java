package de.nak.xtext.hausarbeit.rentalSystem.generator;

import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Attribute;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Customer;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.Deal;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.OfType;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalSystem;
import de.nak.xtext.hausarbeit.rentalSystem.rentalSystem.RentalType;
import de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflow;
import de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.State;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class RentalSystemGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EList<EObject> _contents = resource.getContents();
    final EObject rentalSystem = IterableExtensions.<EObject>head(_contents);
    if ((rentalSystem instanceof RentalSystem)) {
      EList<Customer> _customers = ((RentalSystem)rentalSystem).getCustomers();
      for (final Customer customer : _customers) {
        {
          String _name = customer.getName();
          String _firstUpper = StringExtensions.toFirstUpper(_name);
          String _plus = ("src/main/java/" + _firstUpper);
          String _plus_1 = (_plus + ".java");
          CharSequence _generateCustomerBeans = this.generateCustomerBeans(customer, ((RentalSystem)rentalSystem));
          fsa.generateFile(_plus_1, _generateCustomerBeans);
          String _name_1 = customer.getName();
          String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
          String _plus_2 = ("src/main/java/I" + _firstUpper_1);
          String _plus_3 = (_plus_2 + "Repository.java");
          CharSequence _generateCustomerRepos = this.generateCustomerRepos(customer, ((RentalSystem)rentalSystem));
          fsa.generateFile(_plus_3, _generateCustomerRepos);
        }
      }
      EList<RentalType> _rentalTypes = ((RentalSystem)rentalSystem).getRentalTypes();
      for (final RentalType rentalType : _rentalTypes) {
        {
          String _name = rentalType.getName();
          String _firstUpper = StringExtensions.toFirstUpper(_name);
          String _plus = ("src/main/java/" + _firstUpper);
          String _plus_1 = (_plus + ".java");
          CharSequence _generateTypeBeans = this.generateTypeBeans(rentalType, ((RentalSystem)rentalSystem));
          fsa.generateFile(_plus_1, _generateTypeBeans);
          String _name_1 = rentalType.getName();
          String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
          String _plus_2 = ("src/main/java/I" + _firstUpper_1);
          String _plus_3 = (_plus_2 + "Repository.java");
          CharSequence _generateTypeRepos = this.generateTypeRepos(rentalType, ((RentalSystem)rentalSystem));
          fsa.generateFile(_plus_3, _generateTypeRepos);
        }
      }
      EList<Deal> _deals = ((RentalSystem)rentalSystem).getDeals();
      for (final Deal deal : _deals) {
        {
          String _name = deal.getName();
          String _firstUpper = StringExtensions.toFirstUpper(_name);
          String _plus = ("src/main/java/" + _firstUpper);
          String _plus_1 = (_plus + ".java");
          CharSequence _generateDealBeans = this.generateDealBeans(deal, ((RentalSystem)rentalSystem));
          fsa.generateFile(_plus_1, _generateDealBeans);
          String _name_1 = deal.getName();
          String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
          String _plus_2 = ("src/main/java/I" + _firstUpper_1);
          String _plus_3 = (_plus_2 + "Repository.java");
          CharSequence _generateDealRepos = this.generateDealRepos(deal, ((RentalSystem)rentalSystem));
          fsa.generateFile(_plus_3, _generateDealRepos);
          RentalWorkflow _rentalWorkflow = deal.getRentalWorkflow();
          EList<State> _states = _rentalWorkflow.getStates();
          for (final State state : _states) {
            {
              String _name_2 = deal.getName();
              String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
              String _plus_4 = ("src/main/java/" + _firstUpper_2);
              String _name_3 = state.getName();
              String _firstUpper_3 = StringExtensions.toFirstUpper(_name_3);
              String _plus_5 = (_plus_4 + _firstUpper_3);
              String _plus_6 = (_plus_5 + ".java");
              CharSequence _generateDealStateBeans = this.generateDealStateBeans(deal, state);
              fsa.generateFile(_plus_6, _generateDealStateBeans);
              String _name_4 = deal.getName();
              String _firstUpper_4 = StringExtensions.toFirstUpper(_name_4);
              String _plus_7 = ("src/main/java/I" + _firstUpper_4);
              String _name_5 = state.getName();
              String _firstUpper_5 = StringExtensions.toFirstUpper(_name_5);
              String _plus_8 = (_plus_7 + _firstUpper_5);
              String _plus_9 = (_plus_8 + "Repository.java");
              CharSequence _generateDealStateRepos = this.generateDealStateRepos(deal, state);
              fsa.generateFile(_plus_9, _generateDealStateRepos);
            }
          }
        }
      }
    }
  }
  
  public CharSequence generateCustomerBeans(final Customer customer, final RentalSystem rentalSystem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package de.nordakademie.xtext.hausarbeit.rentalSystem.web;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public class ");
    String _name = customer.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "\t\t");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@Id");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@GeneratedValue");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private Long id;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    {
      EList<Attribute> _customerAttribute = customer.getCustomerAttribute();
      for(final Attribute attribute : _customerAttribute) {
        _builder.append("\t\t");
        _builder.append("private ");
        OfType _ofType = attribute.getOfType();
        _builder.append(_ofType, "\t\t");
        _builder.append(" ");
        String _name_1 = attribute.getName();
        String _firstLower = StringExtensions.toFirstLower(_name_1);
        _builder.append(_firstLower, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public Long getId() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return id;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<Attribute> _customerAttribute_1 = customer.getCustomerAttribute();
      for(final Attribute attribute_1 : _customerAttribute_1) {
        _builder.append("\t\t");
        _builder.append("public ");
        OfType _ofType_1 = attribute_1.getOfType();
        _builder.append(_ofType_1, "\t\t");
        _builder.append(" get");
        String _name_2 = attribute_1.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
        _builder.append(_firstUpper_1, "\t\t");
        _builder.append("(){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("return ");
        String _name_3 = attribute_1.getName();
        String _firstLower_1 = StringExtensions.toFirstLower(_name_3);
        _builder.append(_firstLower_1, "\t\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public void setId(Long id) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("this.id = id;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<Attribute> _customerAttribute_2 = customer.getCustomerAttribute();
      for(final Attribute attribute_2 : _customerAttribute_2) {
        _builder.append("\t\t");
        _builder.append("public  void set");
        String _name_4 = attribute_2.getName();
        String _firstUpper_2 = StringExtensions.toFirstUpper(_name_4);
        _builder.append(_firstUpper_2, "\t\t");
        _builder.append("(");
        OfType _ofType_2 = attribute_2.getOfType();
        _builder.append(_ofType_2, "\t\t");
        _builder.append(" ");
        String _name_5 = attribute_2.getName();
        String _firstLower_2 = StringExtensions.toFirstLower(_name_5);
        _builder.append(_firstLower_2, "\t\t");
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("this.");
        String _name_6 = attribute_2.getName();
        String _firstLower_3 = StringExtensions.toFirstLower(_name_6);
        _builder.append(_firstLower_3, "\t\t\t");
        _builder.append(" = ");
        String _name_7 = attribute_2.getName();
        String _firstLower_4 = StringExtensions.toFirstLower(_name_7);
        _builder.append(_firstLower_4, "\t\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateCustomerRepos(final Customer customer, final RentalSystem rentalSystem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package de.nordakademie.xtext.hausarbeit.rentalSystem.web;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.springframework.data.repository.CrudRepository;");
    _builder.newLine();
    _builder.append("import org.springframework.stereotype.Repository;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Repository");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public interface I");
    String _name = customer.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "\t");
    _builder.append("Repository extends CrudRepository<");
    String _name_1 = customer.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "\t");
    _builder.append(", Long> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateTypeBeans(final RentalType rentalType, final RentalSystem rentalSystem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package de.nordakademie.xtext.hausarbeit.rentalSystem.web;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public class ");
    String _name = rentalType.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "\t\t");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@Id");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@GeneratedValue");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private Long id;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Attribute> _typeAttributes = rentalType.getTypeAttributes();
      for(final Attribute attribute : _typeAttributes) {
        _builder.append("\t\t");
        _builder.append("public ");
        OfType _ofType = attribute.getOfType();
        _builder.append(_ofType, "\t\t");
        _builder.append(" ");
        String _name_1 = attribute.getName();
        String _firstLower = StringExtensions.toFirstLower(_name_1);
        _builder.append(_firstLower, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public Long getId() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return id;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Attribute> _typeAttributes_1 = rentalType.getTypeAttributes();
      for(final Attribute attribute_1 : _typeAttributes_1) {
        _builder.append("\t\t");
        _builder.append("public ");
        OfType _ofType_1 = attribute_1.getOfType();
        _builder.append(_ofType_1, "\t\t");
        _builder.append(" get");
        String _name_2 = attribute_1.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
        _builder.append(_firstUpper_1, "\t\t");
        _builder.append("(){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("return ");
        String _name_3 = attribute_1.getName();
        String _firstLower_1 = StringExtensions.toFirstLower(_name_3);
        _builder.append(_firstLower_1, "\t\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public void setId(Long id) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("this.id = id;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<Attribute> _typeAttributes_2 = rentalType.getTypeAttributes();
      for(final Attribute attribute_2 : _typeAttributes_2) {
        _builder.append("\t\t");
        _builder.append("public  void set");
        String _name_4 = attribute_2.getName();
        String _firstUpper_2 = StringExtensions.toFirstUpper(_name_4);
        _builder.append(_firstUpper_2, "\t\t");
        _builder.append("(");
        OfType _ofType_2 = attribute_2.getOfType();
        _builder.append(_ofType_2, "\t\t");
        _builder.append(" ");
        String _name_5 = attribute_2.getName();
        String _firstLower_2 = StringExtensions.toFirstLower(_name_5);
        _builder.append(_firstLower_2, "\t\t");
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("this.");
        String _name_6 = attribute_2.getName();
        String _firstLower_3 = StringExtensions.toFirstLower(_name_6);
        _builder.append(_firstLower_3, "\t\t\t");
        _builder.append(" = ");
        String _name_7 = attribute_2.getName();
        String _firstLower_4 = StringExtensions.toFirstLower(_name_7);
        _builder.append(_firstLower_4, "\t\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateTypeRepos(final RentalType rentalType, final RentalSystem rentalSystem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package de.nordakademie.xtext.hausarbeit.rentalSystem.web;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.springframework.data.repository.CrudRepository;");
    _builder.newLine();
    _builder.append("import org.springframework.stereotype.Repository;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@Repository");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public interface I");
    String _name = rentalType.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "\t\t");
    _builder.append("Repository extends CrudRepository<");
    String _name_1 = rentalType.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "\t\t");
    _builder.append(", Long> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateDealBeans(final Deal deal, final RentalSystem rentalSystem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package de.nordakademie.xtext.hausarbeit.rentalSystem.web;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public class ");
    String _name = deal.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "\t\t");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@Id");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@GeneratedValue");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private Long id;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Attribute> _dealAttributes = deal.getDealAttributes();
      for(final Attribute attribute : _dealAttributes) {
        _builder.append("\t\t");
        _builder.append("public ");
        OfType _ofType = attribute.getOfType();
        _builder.append(_ofType, "\t\t");
        _builder.append(" ");
        String _name_1 = attribute.getName();
        String _firstLower = StringExtensions.toFirstLower(_name_1);
        _builder.append(_firstLower, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public Long getId() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return id;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Attribute> _dealAttributes_1 = deal.getDealAttributes();
      for(final Attribute attribute_1 : _dealAttributes_1) {
        _builder.append("\t\t");
        _builder.append("public ");
        OfType _ofType_1 = attribute_1.getOfType();
        _builder.append(_ofType_1, "\t\t");
        _builder.append(" get");
        String _name_2 = attribute_1.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
        _builder.append(_firstUpper_1, "\t\t");
        _builder.append("(){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("return ");
        String _name_3 = attribute_1.getName();
        String _firstLower_1 = StringExtensions.toFirstLower(_name_3);
        _builder.append(_firstLower_1, "\t\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public void setId(Long id) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("this.id = id;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<Attribute> _dealAttributes_2 = deal.getDealAttributes();
      for(final Attribute attribute_2 : _dealAttributes_2) {
        _builder.append("\t\t");
        _builder.append("public  void set");
        String _name_4 = attribute_2.getName();
        String _firstUpper_2 = StringExtensions.toFirstUpper(_name_4);
        _builder.append(_firstUpper_2, "\t\t");
        _builder.append("(");
        OfType _ofType_2 = attribute_2.getOfType();
        _builder.append(_ofType_2, "\t\t");
        _builder.append(" ");
        String _name_5 = attribute_2.getName();
        String _firstLower_2 = StringExtensions.toFirstLower(_name_5);
        _builder.append(_firstLower_2, "\t\t");
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("this.");
        String _name_6 = attribute_2.getName();
        String _firstLower_3 = StringExtensions.toFirstLower(_name_6);
        _builder.append(_firstLower_3, "\t\t\t");
        _builder.append(" = ");
        String _name_7 = attribute_2.getName();
        String _firstLower_4 = StringExtensions.toFirstLower(_name_7);
        _builder.append(_firstLower_4, "\t\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateDealRepos(final Deal deal, final RentalSystem rentalSystem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package de.nordakademie.xtext.hausarbeit.rentalSystem.web;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.springframework.data.repository.CrudRepository;");
    _builder.newLine();
    _builder.append("import org.springframework.stereotype.Repository;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@Repository");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public interface I");
    String _name = deal.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "\t\t");
    _builder.append("Repository extends CrudRepository<");
    String _name_1 = deal.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "\t\t");
    _builder.append(", Long> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateDealStateBeans(final Deal deal, final State state) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package de.nordakademie.xtext.hausarbeit.rentalSystem.web;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public class ");
    String _name = deal.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "\t\t");
    String _name_1 = deal.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "\t\t");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@Id");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@GeneratedValue");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private Long id;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public ");
    String _name_2 = state.getName();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
    _builder.append(_firstUpper_2, "\t\t");
    _builder.append(" ");
    String _name_3 = state.getName();
    String _firstLower = StringExtensions.toFirstLower(_name_3);
    _builder.append(_firstLower, "\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public ");
    String _name_4 = deal.getName();
    String _firstUpper_3 = StringExtensions.toFirstUpper(_name_4);
    _builder.append(_firstUpper_3, "\t\t");
    _builder.append(" ");
    String _name_5 = deal.getName();
    String _firstLower_1 = StringExtensions.toFirstLower(_name_5);
    _builder.append(_firstLower_1, "\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public ");
    String _name_6 = deal.getName();
    String _firstUpper_4 = StringExtensions.toFirstUpper(_name_6);
    _builder.append(_firstUpper_4, "\t\t");
    String _name_7 = state.getName();
    String _firstUpper_5 = StringExtensions.toFirstUpper(_name_7);
    _builder.append(_firstUpper_5, "\t\t");
    _builder.append("(");
    String _name_8 = state.getName();
    String _firstUpper_6 = StringExtensions.toFirstUpper(_name_8);
    _builder.append(_firstUpper_6, "\t\t");
    _builder.append(" ");
    String _name_9 = state.getName();
    String _firstLower_2 = StringExtensions.toFirstLower(_name_9);
    _builder.append(_firstLower_2, "\t\t");
    _builder.append(", ");
    String _name_10 = deal.getName();
    String _firstUpper_7 = StringExtensions.toFirstUpper(_name_10);
    _builder.append(_firstUpper_7, "\t\t");
    _builder.append(" ");
    String _name_11 = deal.getName();
    String _firstLower_3 = StringExtensions.toFirstLower(_name_11);
    _builder.append(_firstLower_3, "\t\t");
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("this.");
    String _name_12 = state.getName();
    String _firstUpper_8 = StringExtensions.toFirstUpper(_name_12);
    _builder.append(_firstUpper_8, "\t\t\t");
    _builder.append(" = ");
    String _name_13 = state.getName();
    String _firstLower_4 = StringExtensions.toFirstLower(_name_13);
    _builder.append(_firstLower_4, "\t\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("this.");
    String _name_14 = deal.getName();
    String _firstUpper_9 = StringExtensions.toFirstUpper(_name_14);
    _builder.append(_firstUpper_9, "\t\t\t");
    _builder.append(" = ");
    String _name_15 = deal.getName();
    String _firstUpper_10 = StringExtensions.toFirstUpper(_name_15);
    _builder.append(_firstUpper_10, "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public Long getId() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return id;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public ");
    String _name_16 = deal.getName();
    String _firstUpper_11 = StringExtensions.toFirstUpper(_name_16);
    _builder.append(_firstUpper_11, "\t\t");
    _builder.append(" get");
    String _name_17 = deal.getName();
    String _firstUpper_12 = StringExtensions.toFirstUpper(_name_17);
    _builder.append(_firstUpper_12, "\t\t");
    _builder.append("(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("return ");
    String _name_18 = deal.getName();
    String _firstLower_5 = StringExtensions.toFirstLower(_name_18);
    _builder.append(_firstLower_5, "\t\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public ");
    String _name_19 = state.getName();
    String _firstUpper_13 = StringExtensions.toFirstUpper(_name_19);
    _builder.append(_firstUpper_13, "\t\t");
    _builder.append(" get");
    String _name_20 = state.getName();
    String _firstUpper_14 = StringExtensions.toFirstUpper(_name_20);
    _builder.append(_firstUpper_14, "\t\t");
    _builder.append("(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("return ");
    String _name_21 = state.getName();
    String _firstLower_6 = StringExtensions.toFirstLower(_name_21);
    _builder.append(_firstLower_6, "\t\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public void setId(Long id) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("this.id = id;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public void set");
    String _name_22 = deal.getName();
    String _firstUpper_15 = StringExtensions.toFirstUpper(_name_22);
    _builder.append(_firstUpper_15, "\t\t");
    _builder.append("(");
    String _name_23 = deal.getName();
    String _firstUpper_16 = StringExtensions.toFirstUpper(_name_23);
    _builder.append(_firstUpper_16, "\t\t");
    _builder.append(" ");
    String _name_24 = deal.getName();
    String _firstLower_7 = StringExtensions.toFirstLower(_name_24);
    _builder.append(_firstLower_7, "\t\t");
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("this.");
    String _name_25 = deal.getName();
    String _firstLower_8 = StringExtensions.toFirstLower(_name_25);
    _builder.append(_firstLower_8, "\t\t\t");
    _builder.append(" = ");
    String _name_26 = deal.getName();
    String _firstLower_9 = StringExtensions.toFirstLower(_name_26);
    _builder.append(_firstLower_9, "\t\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public void set");
    String _name_27 = state.getName();
    String _firstUpper_17 = StringExtensions.toFirstUpper(_name_27);
    _builder.append(_firstUpper_17, "\t\t");
    _builder.append("(");
    String _name_28 = state.getName();
    String _firstUpper_18 = StringExtensions.toFirstUpper(_name_28);
    _builder.append(_firstUpper_18, "\t\t");
    _builder.append(" ");
    String _name_29 = state.getName();
    String _firstLower_10 = StringExtensions.toFirstLower(_name_29);
    _builder.append(_firstLower_10, "\t\t");
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("this.");
    String _name_30 = state.getName();
    String _firstLower_11 = StringExtensions.toFirstLower(_name_30);
    _builder.append(_firstLower_11, "\t\t\t");
    _builder.append(" = ");
    String _name_31 = state.getName();
    String _firstLower_12 = StringExtensions.toFirstLower(_name_31);
    _builder.append(_firstLower_12, "\t\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateDealStateRepos(final Deal deal, final State state) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package de.nordakademie.xtext.hausarbeit.rentalSystem.web;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.springframework.data.repository.CrudRepository;");
    _builder.newLine();
    _builder.append("import org.springframework.stereotype.Repository;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@Repository");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public interface I");
    String _name = deal.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "\t\t");
    String _name_1 = state.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "\t\t");
    _builder.append("Repository extends CrudRepository<");
    String _name_2 = deal.getName();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
    _builder.append(_firstUpper_2, "\t\t");
    String _name_3 = state.getName();
    String _firstUpper_3 = StringExtensions.toFirstUpper(_name_3);
    _builder.append(_firstUpper_3, "\t\t");
    _builder.append(", Long> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
