/**
 */
package de.oaam.model.oaam.safety.failurePropagations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Failure Propagation Generic Type E</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The generic failure effects a failure mode can have on requirement components.
 * <!-- end-model-doc -->
 * @see de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage#getFailurePropagationGenericTypeE()
 * @model
 * @generated
 */
public enum FailurePropagationGenericTypeE implements Enumerator {
	/**
	 * The '<em><b>INTEGRITY STATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string attribute
	 * <!-- end-model-doc -->
	 * @see #INTEGRITY_STATE_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGRITY_STATE(0, "INTEGRITY_STATE", "INTEGRITY_STATE"),

	/**
	 * The '<em><b>FAILURE MODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A numerical value attribute
	 * <!-- end-model-doc -->
	 * @see #FAILURE_MODE_VALUE
	 * @generated
	 * @ordered
	 */
	FAILURE_MODE(1, "FAILURE_MODE", "FAILURE_MODE");

	/**
	 * The '<em><b>INTEGRITY STATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string attribute
	 * <!-- end-model-doc -->
	 * @see #INTEGRITY_STATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGRITY_STATE_VALUE = 0;

	/**
	 * The '<em><b>FAILURE MODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A numerical value attribute
	 * <!-- end-model-doc -->
	 * @see #FAILURE_MODE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FAILURE_MODE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Failure Propagation Generic Type E</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FailurePropagationGenericTypeE[] VALUES_ARRAY =
		new FailurePropagationGenericTypeE[] {
			INTEGRITY_STATE,
			FAILURE_MODE,
		};

	/**
	 * A public read-only list of all the '<em><b>Failure Propagation Generic Type E</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FailurePropagationGenericTypeE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Failure Propagation Generic Type E</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FailurePropagationGenericTypeE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FailurePropagationGenericTypeE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Failure Propagation Generic Type E</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FailurePropagationGenericTypeE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FailurePropagationGenericTypeE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Failure Propagation Generic Type E</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FailurePropagationGenericTypeE get(int value) {
		switch (value) {
			case INTEGRITY_STATE_VALUE: return INTEGRITY_STATE;
			case FAILURE_MODE_VALUE: return FAILURE_MODE;
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
	private FailurePropagationGenericTypeE(int value, String name, String literal) {
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
	
} //FailurePropagationGenericTypeE
