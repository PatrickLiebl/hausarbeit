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
 * A representation of the literals of the enumeration '<em><b>of Command Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.nak.xtext.hausarbeit.rentalWorkflow.rentalWorkflow.RentalWorkflowPackage#getofCommandType()
 * @model
 * @generated
 */
public enum ofCommandType implements Enumerator
{
  /**
   * The '<em><b>Do Save</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DO_SAVE_VALUE
   * @generated
   * @ordered
   */
  DO_SAVE(0, "doSave", "doSave"),

  /**
   * The '<em><b>Do Abord</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DO_ABORD_VALUE
   * @generated
   * @ordered
   */
  DO_ABORD(1, "doAbord", "doAbort"),

  /**
   * The '<em><b>Do Delete</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DO_DELETE_VALUE
   * @generated
   * @ordered
   */
  DO_DELETE(2, "doDelete", "doDelete");

  /**
   * The '<em><b>Do Save</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Do Save</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DO_SAVE
   * @model name="doSave"
   * @generated
   * @ordered
   */
  public static final int DO_SAVE_VALUE = 0;

  /**
   * The '<em><b>Do Abord</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Do Abord</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DO_ABORD
   * @model name="doAbord" literal="doAbort"
   * @generated
   * @ordered
   */
  public static final int DO_ABORD_VALUE = 1;

  /**
   * The '<em><b>Do Delete</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Do Delete</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DO_DELETE
   * @model name="doDelete"
   * @generated
   * @ordered
   */
  public static final int DO_DELETE_VALUE = 2;

  /**
   * An array of all the '<em><b>of Command Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ofCommandType[] VALUES_ARRAY =
    new ofCommandType[]
    {
      DO_SAVE,
      DO_ABORD,
      DO_DELETE,
    };

  /**
   * A public read-only list of all the '<em><b>of Command Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ofCommandType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>of Command Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ofCommandType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ofCommandType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>of Command Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ofCommandType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ofCommandType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>of Command Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ofCommandType get(int value)
  {
    switch (value)
    {
      case DO_SAVE_VALUE: return DO_SAVE;
      case DO_ABORD_VALUE: return DO_ABORD;
      case DO_DELETE_VALUE: return DO_DELETE;
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
  private ofCommandType(int value, String name, String literal)
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
  
} //ofCommandType
