/**
 */
package de.oaam.model.oaam.safety;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Requirement Failure Effect Types E</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The generic failure effects a failure mode can have on requirement components.
 * <!-- end-model-doc -->
 * @see de.oaam.model.oaam.safety.SafetyPackage#getRequirementFailureEffectTypesE()
 * @model
 * @generated
 */
public enum RequirementFailureEffectTypesE implements Enumerator {
	/**
	 * The '<em><b>EARLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string attribute
	 * <!-- end-model-doc -->
	 * @see #EARLY_VALUE
	 * @generated
	 * @ordered
	 */
	EARLY(0, "EARLY", "EARLY"),

	/**
	 * The '<em><b>LATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A numerical value attribute
	 * <!-- end-model-doc -->
	 * @see #LATE_VALUE
	 * @generated
	 * @ordered
	 */
	LATE(1, "LATE", "LATE"),

	/**
	 * The '<em><b>ALWAYS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Boolean attribute
	 * <!-- end-model-doc -->
	 * @see #ALWAYS_VALUE
	 * @generated
	 * @ordered
	 */
	ALWAYS(2, "ALWAYS", "ALWAYS"),

	/**
	 * The '<em><b>NEVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Boolean attribute
	 * <!-- end-model-doc -->
	 * @see #NEVER_VALUE
	 * @generated
	 * @ordered
	 */
	NEVER(3, "NEVER", "NEVER");

	/**
	 * The '<em><b>EARLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string attribute
	 * <!-- end-model-doc -->
	 * @see #EARLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EARLY_VALUE = 0;

	/**
	 * The '<em><b>LATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A numerical value attribute
	 * <!-- end-model-doc -->
	 * @see #LATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LATE_VALUE = 1;

	/**
	 * The '<em><b>ALWAYS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Boolean attribute
	 * <!-- end-model-doc -->
	 * @see #ALWAYS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALWAYS_VALUE = 2;

	/**
	 * The '<em><b>NEVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Boolean attribute
	 * <!-- end-model-doc -->
	 * @see #NEVER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEVER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Requirement Failure Effect Types E</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RequirementFailureEffectTypesE[] VALUES_ARRAY =
		new RequirementFailureEffectTypesE[] {
			EARLY,
			LATE,
			ALWAYS,
			NEVER,
		};

	/**
	 * A public read-only list of all the '<em><b>Requirement Failure Effect Types E</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RequirementFailureEffectTypesE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Requirement Failure Effect Types E</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequirementFailureEffectTypesE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RequirementFailureEffectTypesE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Requirement Failure Effect Types E</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequirementFailureEffectTypesE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RequirementFailureEffectTypesE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Requirement Failure Effect Types E</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequirementFailureEffectTypesE get(int value) {
		switch (value) {
			case EARLY_VALUE: return EARLY;
			case LATE_VALUE: return LATE;
			case ALWAYS_VALUE: return ALWAYS;
			case NEVER_VALUE: return NEVER;
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
	private RequirementFailureEffectTypesE(int value, String name, String literal) {
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
	
} //RequirementFailureEffectTypesE
