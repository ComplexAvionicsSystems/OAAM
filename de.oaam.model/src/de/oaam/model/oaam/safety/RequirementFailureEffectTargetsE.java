/**
 */
package de.oaam.model.oaam.safety;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Requirement Failure Effect Targets E</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Enumeration of all requirement components.
 * <!-- end-model-doc -->
 * @see de.oaam.model.oaam.safety.SafetyPackage#getRequirementFailureEffectTargetsE()
 * @model
 * @generated
 */
public enum RequirementFailureEffectTargetsE implements Enumerator {
	/**
	 * The '<em><b>NO TARGET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_TARGET_VALUE
	 * @generated
	 * @ordered
	 */
	NO_TARGET(0, "NO_TARGET", "NO_TARGET"),

	/**
	 * The '<em><b>BELOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BELOW_VALUE
	 * @generated
	 * @ordered
	 */
	BELOW(1, "BELOW", "Below"),

	/**
	 * The '<em><b>ABOVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABOVE_VALUE
	 * @generated
	 * @ordered
	 */
	ABOVE(2, "ABOVE", "ABOVE"),

	/**
	 * The '<em><b>SIGNAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNAL(3, "SIGNAL", "SIGNAL"),

	/**
	 * The '<em><b>VALUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	VALUE(4, "VALUE", "VALUE"),

	/**
	 * The '<em><b>AND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND_VALUE
	 * @generated
	 * @ordered
	 */
	AND(6, "AND", "AND"),

	/**
	 * The '<em><b>OR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR_VALUE
	 * @generated
	 * @ordered
	 */
	OR(7, "OR", "OR"),

	/**
	 * The '<em><b>NOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_VALUE
	 * @generated
	 * @ordered
	 */
	NOT(8, "NOT", "NOT"),

	/**
	 * The '<em><b>CONTRACT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRACT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRACT(9, "CONTRACT", "CONTRACT"),

	/**
	 * The '<em><b>AGREEMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGREEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	AGREEMENT(10, "AGREEMENT", "Agreement");

	/**
	 * The '<em><b>NO TARGET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_TARGET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_TARGET_VALUE = 0;

	/**
	 * The '<em><b>BELOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BELOW
	 * @model literal="Below"
	 * @generated
	 * @ordered
	 */
	public static final int BELOW_VALUE = 1;

	/**
	 * The '<em><b>ABOVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABOVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ABOVE_VALUE = 2;

	/**
	 * The '<em><b>SIGNAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGNAL_VALUE = 3;

	/**
	 * The '<em><b>VALUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_VALUE = 4;

	/**
	 * The '<em><b>AND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AND_VALUE = 6;

	/**
	 * The '<em><b>OR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OR_VALUE = 7;

	/**
	 * The '<em><b>NOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_VALUE = 8;

	/**
	 * The '<em><b>CONTRACT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRACT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACT_VALUE = 9;

	/**
	 * The '<em><b>AGREEMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGREEMENT
	 * @model literal="Agreement"
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT_VALUE = 10;

	/**
	 * An array of all the '<em><b>Requirement Failure Effect Targets E</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RequirementFailureEffectTargetsE[] VALUES_ARRAY =
		new RequirementFailureEffectTargetsE[] {
			NO_TARGET,
			BELOW,
			ABOVE,
			SIGNAL,
			VALUE,
			AND,
			OR,
			NOT,
			CONTRACT,
			AGREEMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Requirement Failure Effect Targets E</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RequirementFailureEffectTargetsE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Requirement Failure Effect Targets E</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequirementFailureEffectTargetsE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RequirementFailureEffectTargetsE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Requirement Failure Effect Targets E</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequirementFailureEffectTargetsE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RequirementFailureEffectTargetsE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Requirement Failure Effect Targets E</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequirementFailureEffectTargetsE get(int value) {
		switch (value) {
			case NO_TARGET_VALUE: return NO_TARGET;
			case BELOW_VALUE: return BELOW;
			case ABOVE_VALUE: return ABOVE;
			case SIGNAL_VALUE: return SIGNAL;
			case VALUE_VALUE: return VALUE;
			case AND_VALUE: return AND;
			case OR_VALUE: return OR;
			case NOT_VALUE: return NOT;
			case CONTRACT_VALUE: return CONTRACT;
			case AGREEMENT_VALUE: return AGREEMENT;
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
	private RequirementFailureEffectTargetsE(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RequirementFailureEffectTargetsE
