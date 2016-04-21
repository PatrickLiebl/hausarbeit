/**
 * generated by Xtext 2.9.2
 */
package de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>of Event Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflowPackage#getofEventType()
 * @model
 * @generated
 */
public enum ofEventType implements Enumerator
{
  /**
   * The '<em><b>Next Clicked</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NEXT_CLICKED_VALUE
   * @generated
   * @ordered
   */
  NEXT_CLICKED(0, "nextClicked", "nextClicked"),

  /**
   * The '<em><b>Back Clicked</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BACK_CLICKED_VALUE
   * @generated
   * @ordered
   */
  BACK_CLICKED(1, "backClicked", "backClicked"),

  /**
   * The '<em><b>Cancel Clicked</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CANCEL_CLICKED_VALUE
   * @generated
   * @ordered
   */
  CANCEL_CLICKED(2, "cancelClicked", "cancelClicked");

  /**
   * The '<em><b>Next Clicked</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Next Clicked</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NEXT_CLICKED
   * @model name="nextClicked"
   * @generated
   * @ordered
   */
  public static final int NEXT_CLICKED_VALUE = 0;

  /**
   * The '<em><b>Back Clicked</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Back Clicked</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BACK_CLICKED
   * @model name="backClicked"
   * @generated
   * @ordered
   */
  public static final int BACK_CLICKED_VALUE = 1;

  /**
   * The '<em><b>Cancel Clicked</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Cancel Clicked</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CANCEL_CLICKED
   * @model name="cancelClicked"
   * @generated
   * @ordered
   */
  public static final int CANCEL_CLICKED_VALUE = 2;

  /**
   * An array of all the '<em><b>of Event Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ofEventType[] VALUES_ARRAY =
    new ofEventType[]
    {
      NEXT_CLICKED,
      BACK_CLICKED,
      CANCEL_CLICKED,
    };

  /**
   * A public read-only list of all the '<em><b>of Event Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ofEventType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>of Event Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ofEventType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ofEventType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>of Event Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ofEventType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ofEventType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>of Event Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ofEventType get(int value)
  {
    switch (value)
    {
      case NEXT_CLICKED_VALUE: return NEXT_CLICKED;
      case BACK_CLICKED_VALUE: return BACK_CLICKED;
      case CANCEL_CLICKED_VALUE: return CANCEL_CLICKED;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private ofEventType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ofEventType
