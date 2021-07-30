/**
 */
package de.oaam.model.oaam.common;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Integrity State E</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Classification of the integrity of a signal, task output or task
 * <!-- end-model-doc -->
 * @see de.oaam.model.oaam.common.CommonPackage#getIntegrityStateE()
 * @model
 * @generated
 */
public enum IntegrityStateE implements Enumerator {
	/**
	 * The '<em><b>OK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state is OK, which means it works as it should do.
	 * <!-- end-model-doc -->
	 * @see #OK_VALUE
	 * @generated
	 * @ordered
	 */
	OK(0, "OK", "OK"),

	/**
	 * The '<em><b>FAILED DETECTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state is failed, but it is known to be failed. 
	 * <!-- end-model-doc -->
	 * @see #FAILED_DETECTED_VALUE
	 * @generated
	 * @ordered
	 */
	FAILED_DETECTED(1, "FAILED_DETECTED", "FAILED_DETECTED"),

	/**
	 * The '<em><b>FAILED UNDETECTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state can be ok or failed or out-of-control. Compared to to the other states it is not known. Therefore, no fault containment can take place.
	 * <!-- end-model-doc -->
	 * @see #FAILED_UNDETECTED_VALUE
	 * @generated
	 * @ordered
	 */
	FAILED_UNDETECTED(2, "FAILED_UNDETECTED", "UNDETECTED");

	/**
	 * The '<em><b>OK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state is OK, which means it works as it should do.
	 * <!-- end-model-doc -->
	 * @see #OK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OK_VALUE = 0;

	/**
	 * The '<em><b>FAILED DETECTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state is failed, but it is known to be failed. 
	 * <!-- end-model-doc -->
	 * @see #FAILED_DETECTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FAILED_DETECTED_VALUE = 1;

	/**
	 * The '<em><b>FAILED UNDETECTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state can be ok or failed or out-of-control. Compared to to the other states it is not known. Therefore, no fault containment can take place.
	 * <!-- end-model-doc -->
	 * @see #FAILED_UNDETECTED
	 * @model literal="UNDETECTED"
	 * @generated
	 * @ordered
	 */
	public static final int FAILED_UNDETECTED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Integrity State E</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IntegrityStateE[] VALUES_ARRAY =
		new IntegrityStateE[] {
			OK,
			FAILED_DETECTED,
			FAILED_UNDETECTED,
		};

	/**
	 * A public read-only list of all the '<em><b>Integrity State E</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IntegrityStateE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Integrity State E</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IntegrityStateE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IntegrityStateE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Integrity State E</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IntegrityStateE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IntegrityStateE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Integrity State E</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IntegrityStateE get(int value) {
		switch (value) {
			case OK_VALUE: return OK;
			case FAILED_DETECTED_VALUE: return FAILED_DETECTED;
			case FAILED_UNDETECTED_VALUE: return FAILED_UNDETECTED;
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
	private IntegrityStateE(int value, String name, String literal) {
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
	
} //IntegrityStateE
