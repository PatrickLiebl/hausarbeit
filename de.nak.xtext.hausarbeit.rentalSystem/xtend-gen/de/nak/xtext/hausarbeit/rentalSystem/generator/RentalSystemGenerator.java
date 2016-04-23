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
      String _name = ((RentalSystem)rentalSystem).getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _plus = ("src/main/java/" + _firstUpper);
      String _plus_1 = (_plus + ".java");
      CharSequence _generateRentalSystemMain = this.generateRentalSystemMain(((RentalSystem)rentalSystem));
      fsa.generateFile(_plus_1, _generateRentalSystemMain);
      CharSequence _generateWebConfig = this.generateWebConfig();
      fsa.generateFile("src/main/java/WebConfiguration.java", _generateWebConfig);
      String _name_1 = ((RentalSystem)rentalSystem).getName();
      String _firstLower = StringExtensions.toFirstLower(_name_1);
      String _plus_2 = ("src/main/webapp/WEB-INF/views/jsp/" + _firstLower);
      String _plus_3 = (_plus_2 + ".jsp");
      CharSequence _generateIndexJsp = this.generateIndexJsp(((RentalSystem)rentalSystem));
      fsa.generateFile(_plus_3, _generateIndexJsp);
      CharSequence _generateCustomersIndexJsp = this.generateCustomersIndexJsp(((RentalSystem)rentalSystem));
      fsa.generateFile("src/main/webapp/WEB-INF/views/jsp/customersIndex.jsp", _generateCustomersIndexJsp);
      CharSequence _generateRentalTypesIndexJsp = this.generateRentalTypesIndexJsp(((RentalSystem)rentalSystem));
      fsa.generateFile("src/main/webapp/WEB-INF/views/jsp/rentalTypesIndex.jsp", _generateRentalTypesIndexJsp);
      CharSequence _generateDealsIndexJsp = this.generateDealsIndexJsp(((RentalSystem)rentalSystem));
      fsa.generateFile("src/main/webapp/WEB-INF/views/jsp/dealsIndex.jsp", _generateDealsIndexJsp);
      String _name_2 = ((RentalSystem)rentalSystem).getName();
      String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
      String _plus_4 = ("src/main/java/" + _firstUpper_1);
      String _plus_5 = (_plus_4 + "Controller.java");
      CharSequence _generateIndexController = this.generateIndexController(((RentalSystem)rentalSystem));
      fsa.generateFile(_plus_5, _generateIndexController);
      CharSequence _generateCustomerIndexController = this.generateCustomerIndexController();
      fsa.generateFile("src/main/java/CustomersIndexController.java", _generateCustomerIndexController);
      CharSequence _generateRentalTypesIndexController = this.generateRentalTypesIndexController();
      fsa.generateFile("src/main/java/RentalTypesIndexController.java", _generateRentalTypesIndexController);
      CharSequence _generateDealsIndexController = this.generateDealsIndexController();
      fsa.generateFile("src/main/java/DealsIndexController.java", _generateDealsIndexController);
      EList<Customer> _customers = ((RentalSystem)rentalSystem).getCustomers();
      for (final Customer customer : _customers) {
        {
          String _name_3 = customer.getName();
          String _firstUpper_2 = StringExtensions.toFirstUpper(_name_3);
          String _plus_6 = ("src/main/java/" + _firstUpper_2);
          String _plus_7 = (_plus_6 + ".java");
          CharSequence _generateCustomerBeans = this.generateCustomerBeans(customer, ((RentalSystem)rentalSystem));
          fsa.generateFile(_plus_7, _generateCustomerBeans);
          String _name_4 = customer.getName();
          String _firstUpper_3 = StringExtensions.toFirstUpper(_name_4);
          String _plus_8 = ("src/main/java/I" + _firstUpper_3);
          String _plus_9 = (_plus_8 + "Repository.java");
          CharSequence _generateCustomerRepos = this.generateCustomerRepos(customer, ((RentalSystem)rentalSystem));
          fsa.generateFile(_plus_9, _generateCustomerRepos);
          String _name_5 = customer.getName();
          String _firstLower_1 = StringExtensions.toFirstLower(_name_5);
          String _plus_10 = ("src/main/webapp/WEB-INF/views/jsp/" + _firstLower_1);
          String _plus_11 = (_plus_10 + ".jsp");
          CharSequence _generateCustomerJsp = this.generateCustomerJsp(customer, ((RentalSystem)rentalSystem));
          fsa.generateFile(_plus_11, _generateCustomerJsp);
        }
      }
      EList<RentalType> _rentalTypes = ((RentalSystem)rentalSystem).getRentalTypes();
      for (final RentalType rentalType : _rentalTypes) {
        {
          String _name_3 = rentalType.getName();
          String _firstUpper_2 = StringExtensions.toFirstUpper(_name_3);
          String _plus_6 = ("src/main/java/" + _firstUpper_2);
          String _plus_7 = (_plus_6 + ".java");
          CharSequence _generateTypeBeans = this.generateTypeBeans(rentalType, ((RentalSystem)rentalSystem));
          fsa.generateFile(_plus_7, _generateTypeBeans);
          String _name_4 = rentalType.getName();
          String _firstUpper_3 = StringExtensions.toFirstUpper(_name_4);
          String _plus_8 = ("src/main/java/I" + _firstUpper_3);
          String _plus_9 = (_plus_8 + "Repository.java");
          CharSequence _generateTypeRepos = this.generateTypeRepos(rentalType, ((RentalSystem)rentalSystem));
          fsa.generateFile(_plus_9, _generateTypeRepos);
        }
      }
      EList<Deal> _deals = ((RentalSystem)rentalSystem).getDeals();
      for (final Deal deal : _deals) {
        {
          String _name_3 = deal.getName();
          String _firstUpper_2 = StringExtensions.toFirstUpper(_name_3);
          String _plus_6 = ("src/main/java/" + _firstUpper_2);
          String _plus_7 = (_plus_6 + ".java");
          CharSequence _generateDealBeans = this.generateDealBeans(deal, ((RentalSystem)rentalSystem));
          fsa.generateFile(_plus_7, _generateDealBeans);
          String _name_4 = deal.getName();
          String _firstUpper_3 = StringExtensions.toFirstUpper(_name_4);
          String _plus_8 = ("src/main/java/I" + _firstUpper_3);
          String _plus_9 = (_plus_8 + "Repository.java");
          CharSequence _generateDealRepos = this.generateDealRepos(deal, ((RentalSystem)rentalSystem));
          fsa.generateFile(_plus_9, _generateDealRepos);
          RentalWorkflow _rentalWorkflow = deal.getRentalWorkflow();
          EList<State> _states = _rentalWorkflow.getStates();
          for (final State state : _states) {
            {
              String _name_5 = deal.getName();
              String _firstUpper_4 = StringExtensions.toFirstUpper(_name_5);
              String _plus_10 = ("src/main/java/" + _firstUpper_4);
              String _name_6 = state.getName();
              String _firstUpper_5 = StringExtensions.toFirstUpper(_name_6);
              String _plus_11 = (_plus_10 + _firstUpper_5);
              String _plus_12 = (_plus_11 + ".java");
              CharSequence _generateDealStateBeans = this.generateDealStateBeans(deal, state);
              fsa.generateFile(_plus_12, _generateDealStateBeans);
              String _name_7 = deal.getName();
              String _firstUpper_6 = StringExtensions.toFirstUpper(_name_7);
              String _plus_13 = ("src/main/java/I" + _firstUpper_6);
              String _name_8 = state.getName();
              String _firstUpper_7 = StringExtensions.toFirstUpper(_name_8);
              String _plus_14 = (_plus_13 + _firstUpper_7);
              String _plus_15 = (_plus_14 + "Repository.java");
              CharSequence _generateDealStateRepos = this.generateDealStateRepos(deal, state);
              fsa.generateFile(_plus_15, _generateDealStateRepos);
            }
          }
        }
      }
    }
  }
  
  public CharSequence generateRentalSystemMain(final RentalSystem rentalSystem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package de.nordakademie.xtext.hausarbeit.rentalSystem.web;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import org.springframework.boot.SpringApplication;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import org.springframework.boot.autoconfigure.SpringBootApplication;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@SpringBootApplication");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public class ");
    String _name = rentalSystem.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "\t");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("SpringApplication.run(");
    String _name_1 = rentalSystem.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "\t\t\t");
    _builder.append(".class, args);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateIndexController(final RentalSystem rentalSystem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package de.nordakademie.xtext.hausarbeit.rentalSystem.web;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import org.springframework.stereotype.Controller;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import org.springframework.web.bind.annotation.RequestMapping;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import org.springframework.web.servlet.ModelAndView;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Controller");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public class ");
    String _name = rentalSystem.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "\t");
    _builder.append("Controller {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@RequestMapping(value = \"/\")");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public ModelAndView index() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("System.out.println(\"INDEX\");");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("ModelAndView mav = new ModelAndView(\"");
    String _name_1 = rentalSystem.getName();
    String _firstLower = StringExtensions.toFirstLower(_name_1);
    _builder.append(_firstLower, "\t\t\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("return mav;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateCustomerIndexController() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package de.nordakademie.xtext.hausarbeit.rentalSystem.web;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import org.springframework.stereotype.Controller;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import org.springframework.web.bind.annotation.RequestMapping;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import org.springframework.web.servlet.ModelAndView;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Controller");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public class CustomersIndexController {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@RequestMapping(value=\"/customersIndex\")");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public ModelAndView customersIndex(){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("System.out.println(\"CUSTOMERSINDEX!\");");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("ModelAndView mav = new ModelAndView(\"customersIndex\");");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return mav;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateRentalTypesIndexController() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package de.nordakademie.xtext.hausarbeit.rentalSystem.web;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import org.springframework.stereotype.Controller;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import org.springframework.web.bind.annotation.RequestMapping;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import org.springframework.web.servlet.ModelAndView;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Controller");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public class RentalTypesIndexController {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@RequestMapping(value=\"/rentalTypesIndex\")");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public ModelAndView rentalTypesIndex(){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("System.out.println(\"RENTALTYPESINDEX\");");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("ModelAndView mav = new ModelAndView(\"rentalTypesIndex\");");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return mav;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateDealsIndexController() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package de.nordakademie.xtext.hausarbeit.rentalSystem.web;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import org.springframework.stereotype.Controller;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import org.springframework.web.bind.annotation.RequestMapping;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import org.springframework.web.servlet.ModelAndView;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Controller");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public class DealsIndexController {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@RequestMapping(value=\"/dealsIndex\")");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public ModelAndView dealsIndex(){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("System.out.println(\"DEALSINDEX\");");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("ModelAndView mav = new ModelAndView(\"dealsIndex\");");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return mav;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateWebConfig() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package de.nordakademie.xtext.hausarbeit.rentalSystem.web;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import org.springframework.context.annotation.Bean;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import org.springframework.context.annotation.Configuration;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import org.springframework.web.servlet.ViewResolver;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import org.springframework.web.servlet.view.InternalResourceViewResolver;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import org.springframework.web.servlet.view.JstlView;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Configuration");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public class WebConfiguration extends WebMvcConfigurerAdapter {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@Bean");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public ViewResolver viewResolver() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("final InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("viewResolver.setViewClass(JstlView.class);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("viewResolver.setPrefix(\"/WEB-INF/views/jsp/\");");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("viewResolver.setSuffix(\".jsp\");");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return viewResolver;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateIndexJsp(final RentalSystem rentalSystem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<%@taglib prefix=\"c\" uri=\"http://java.sun.com/jsp/jstl/core\"%>");
    _builder.newLine();
    _builder.append("<a href=\"customersIndex\" >Customers</a>");
    _builder.newLine();
    _builder.append("<a href=\"rentalTypesIndex\">RentalTypes</a>");
    _builder.newLine();
    _builder.append("<a href=\"dealsIndex\">Deals</a>");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateCustomersIndexJsp(final RentalSystem rentalSystem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<%@taglib prefix=\"c\" uri=\"http://java.sun.com/jsp/jstl/core\"%>");
    _builder.newLine();
    _builder.append("<h1>Customers</h1>");
    _builder.newLine();
    _builder.append("<a href=\"/\">Index</a>");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateRentalTypesIndexJsp(final RentalSystem rentalSystem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<%@taglib prefix=\"c\" uri=\"http://java.sun.com/jsp/jstl/core\"%>");
    _builder.newLine();
    _builder.append("<h1>RentalTypes</h1>");
    _builder.newLine();
    _builder.append("<a href=\"/\">Index</a>");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateDealsIndexJsp(final RentalSystem rentalSystem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<%@taglib prefix=\"c\" uri=\"http://java.sun.com/jsp/jstl/core\"%>");
    _builder.newLine();
    _builder.append("<h1>Deals</h1>");
    _builder.newLine();
    _builder.append("<a href=\"/\">Index</a>");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateCustomerBeans(final Customer customer, final RentalSystem rentalSystem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package de.nordakademie.xtext.hausarbeit.rentalSystem.web;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import javax.persistence.Entity;");
    _builder.newLine();
    _builder.append("import javax.persistence.GeneratedValue;");
    _builder.newLine();
    _builder.append("import javax.persistence.Id;");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@Entity");
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
  
  public CharSequence generateCustomerJsp(final Customer customer, final RentalSystem rentalSystem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<%@taglib prefix=\"c\" uri=\"http://java.sun.com/jsp/jstl/core\"%>");
    _builder.newLine();
    _builder.append("<h1>Customers</h1>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateTypeBeans(final RentalType rentalType, final RentalSystem rentalSystem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package de.nordakademie.xtext.hausarbeit.rentalSystem.web;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import javax.persistence.Entity;");
    _builder.newLine();
    _builder.append("import javax.persistence.GeneratedValue;");
    _builder.newLine();
    _builder.append("import javax.persistence.Id;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@Entity");
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
    _builder.append("import javax.persistence.Entity;");
    _builder.newLine();
    _builder.append("import javax.persistence.GeneratedValue;");
    _builder.newLine();
    _builder.append("import javax.persistence.Id;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@Entity");
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
    _builder.append("import javax.persistence.Entity;");
    _builder.newLine();
    _builder.append("import javax.persistence.GeneratedValue;");
    _builder.newLine();
    _builder.append("import javax.persistence.Id;");
    _builder.newLine();
    _builder.append("import javax.persistence.ManyToOne;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@Entity");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public class ");
    String _name = deal.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _name_1 = state.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    String _plus = (_firstUpper + _firstUpper_1);
    _builder.append(_plus, "\t\t");
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
    _builder.append("@ManyToOne");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private ");
    String _name_2 = deal.getName();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
    _builder.append(_firstUpper_2, "\t\t");
    _builder.append(" ");
    String _name_3 = deal.getName();
    String _firstLower = StringExtensions.toFirstLower(_name_3);
    _builder.append(_firstLower, "\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
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
    String _name_4 = deal.getName();
    String _firstUpper_3 = StringExtensions.toFirstUpper(_name_4);
    _builder.append(_firstUpper_3, "\t\t");
    _builder.append(" get");
    String _name_5 = deal.getName();
    String _firstUpper_4 = StringExtensions.toFirstUpper(_name_5);
    _builder.append(_firstUpper_4, "\t\t");
    _builder.append("(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("return ");
    String _name_6 = deal.getName();
    String _firstLower_1 = StringExtensions.toFirstLower(_name_6);
    _builder.append(_firstLower_1, "\t\t\t");
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
    String _name_7 = deal.getName();
    String _firstUpper_5 = StringExtensions.toFirstUpper(_name_7);
    _builder.append(_firstUpper_5, "\t\t");
    _builder.append("(");
    String _name_8 = deal.getName();
    String _firstUpper_6 = StringExtensions.toFirstUpper(_name_8);
    _builder.append(_firstUpper_6, "\t\t");
    _builder.append(" ");
    String _name_9 = deal.getName();
    String _firstLower_2 = StringExtensions.toFirstLower(_name_9);
    _builder.append(_firstLower_2, "\t\t");
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("this.");
    String _name_10 = deal.getName();
    String _firstLower_3 = StringExtensions.toFirstLower(_name_10);
    _builder.append(_firstLower_3, "\t\t\t");
    _builder.append(" = ");
    String _name_11 = deal.getName();
    String _firstLower_4 = StringExtensions.toFirstLower(_name_11);
    _builder.append(_firstLower_4, "\t\t\t");
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
    String _name_1 = state.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    String _plus = (_firstUpper + _firstUpper_1);
    _builder.append(_plus, "\t\t");
    _builder.append("Repository extends CrudRepository<");
    String _name_2 = deal.getName();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
    String _name_3 = state.getName();
    String _firstUpper_3 = StringExtensions.toFirstUpper(_name_3);
    String _plus_1 = (_firstUpper_2 + _firstUpper_3);
    _builder.append(_plus_1, "\t\t");
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
