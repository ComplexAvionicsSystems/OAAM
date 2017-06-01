/**
 */
package de.oaam.model.oaam.common;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Endianess E</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Possible options for the endianess of data types
 * <!-- end-model-doc -->
 * @see de.oaam.model.oaam.common.CommonPackage#getEndianessE()
 * @model
 * @generated
 */
public enum EndianessE implements Enumerator {
	/**
	 * The '<em><b>BIG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIG_VALUE
	 * @generated
	 * @ordered
	 */
	BIG(0, "BIG", "BIG"),

	/**
	 * The '<em><b>LITTLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LITTLE_VALUE
	 * @generated
	 * @ordered
	 */
	LITTLE(1, "LITTLE", "LITTLE");

	/**
	 * The '<em><b>BIG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Big endian: The most significant bit comes first
	 * <!-- end-model-doc -->
	 * @see #BIG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BIG_VALUE = 0;

	/**
	 * The '<em><b>LITTLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Little endian: The least significant bit comes first.
	 * <!-- end-model-doc -->
	 * @see #LITTLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LITTLE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Endianess E</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EndianessE[] VALUES_ARRAY =
		new EndianessE[] {
			BIG,
			LITTLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Endianess E</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EndianessE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Endianess E</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EndianessE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EndianessE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Endianess E</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EndianessE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EndianessE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Endianess E</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EndianessE get(int value) {
		switch (value) {
			case BIG_VALUE: return BIG;
			case LITTLE_VALUE: return LITTLE;
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
	private EndianessE(int value, String name, String literal) {
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
	
} //EndianessE
