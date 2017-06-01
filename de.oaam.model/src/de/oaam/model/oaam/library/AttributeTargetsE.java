/**
 */
package de.oaam.model.oaam.library;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Attribute Targets E</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Classification of the target class of a object class bound additional attribute
 * <!-- end-model-doc -->
 * @see de.oaam.model.oaam.library.LibraryPackage#getAttributeTargetsE()
 * @model
 * @generated
 */
public enum AttributeTargetsE implements Enumerator {
	/**
	 * The '<em><b>DEVICE TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_TYPE(0, "DEVICE_TYPE", "DEVICE_TYPE"),

	/**
	 * The '<em><b>DEVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE(1, "DEVICE", "DEVICE"),

	/**
	 * The '<em><b>FUNCTION TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION_TYPE(2, "FUNCTION_TYPE", "FUNCTION_TYPE"),

	/**
	 * The '<em><b>FUNCTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION(3, "FUNCTION", "FUNCTION"),

	/**
	 * The '<em><b>WIRE TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIRE_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	WIRE_TYPE(4, "WIRE_TYPE", "WIRE_TYPE"),

	/**
	 * The '<em><b>RESOURCE TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCE_TYPE(5, "RESOURCE_TYPE", "RESOURCE_TYPE"),

	/**
	 * The '<em><b>RESOURCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCE(6, "RESOURCE", "RESOURCE"),

	/**
	 * The '<em><b>SIGNAL TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNAL_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNAL_TYPE(7, "SIGNAL_TYPE", "SIGNAL_TYPE"),

	/**
	 * The '<em><b>SIGNAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNAL(8, "SIGNAL", "SIGNAL"),

	/**
	 * The '<em><b>CONNECTION TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTION_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECTION_TYPE(9, "CONNECTION_TYPE", "CONNECTION_TYPE"),

	/**
	 * The '<em><b>CONNECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTION_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECTION(10, "CONNECTION", "CONNECTION"),

	/**
	 * The '<em><b>LOCATION TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCATION_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	LOCATION_TYPE(11, "LOCATION_TYPE", "LOCATION_TYPE"),

	/**
	 * The '<em><b>LOCATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCATION_VALUE
	 * @generated
	 * @ordered
	 */
	LOCATION(12, "LOCATION", "LOCATION"),

	/**
	 * The '<em><b>DUCT TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUCT_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	DUCT_TYPE(13, "DUCT_TYPE", "DUCT_TYPE"),

	/**
	 * The '<em><b>DUCT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUCT_VALUE
	 * @generated
	 * @ordered
	 */
	DUCT(14, "DUCT", "DUCT"),

	/**
	 * The '<em><b>RESOURCE BUNDLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_BUNDLE_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCE_BUNDLE(15, "RESOURCE_BUNDLE", "RESOURCE_BUNDLE"),

	/**
	 * The '<em><b>RESOURCE ALTERNATIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_ALTERNATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCE_ALTERNATIVE(17, "RESOURCE_ALTERNATIVE", "RESOURCE_ALTERNATIVE"),

	/**
	 * The '<em><b>RESOURCE GROUP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCE_GROUP(18, "RESOURCE_GROUP", "RESOURCE_GROUP"),

	/**
	 * The '<em><b>AREA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AREA_VALUE
	 * @generated
	 * @ordered
	 */
	AREA(19, "AREA", "AREA"),

	/**
	 * The '<em><b>VARIANT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIANT_VALUE
	 * @generated
	 * @ordered
	 */
	VARIANT(20, "VARIANT", "VARIANT"),

	/**
	 * The '<em><b>TIMEFRAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMEFRAME_VALUE
	 * @generated
	 * @ordered
	 */
	TIMEFRAME(21, "TIMEFRAME", "TIMEFRAME");

	/**
	 * The '<em><b>DEVICE TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEVICE TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEVICE_TYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_TYPE_VALUE = 0;

	/**
	 * The '<em><b>DEVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEVICE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_VALUE = 1;

	/**
	 * The '<em><b>FUNCTION TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FUNCTION TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_TYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_TYPE_VALUE = 2;

	/**
	 * The '<em><b>FUNCTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FUNCTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_VALUE = 3;

	/**
	 * The '<em><b>WIRE TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WIRE TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIRE_TYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_TYPE_VALUE = 4;

	/**
	 * The '<em><b>RESOURCE TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESOURCE TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_TYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_TYPE_VALUE = 5;

	/**
	 * The '<em><b>RESOURCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESOURCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESOURCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_VALUE = 6;

	/**
	 * The '<em><b>SIGNAL TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIGNAL TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIGNAL_TYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGNAL_TYPE_VALUE = 7;

	/**
	 * The '<em><b>SIGNAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIGNAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIGNAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGNAL_VALUE = 8;

	/**
	 * The '<em><b>CONNECTION TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONNECTION TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECTION_TYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_TYPE_VALUE = 9;

	/**
	 * The '<em><b>CONNECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONNECTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_VALUE = 10;

	/**
	 * The '<em><b>LOCATION TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOCATION TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCATION_TYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION_TYPE_VALUE = 11;

	/**
	 * The '<em><b>LOCATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOCATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION_VALUE = 12;

	/**
	 * The '<em><b>DUCT TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DUCT TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DUCT_TYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_TYPE_VALUE = 13;

	/**
	 * The '<em><b>DUCT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DUCT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DUCT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_VALUE = 14;

	/**
	 * The '<em><b>RESOURCE BUNDLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESOURCE BUNDLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_BUNDLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_BUNDLE_VALUE = 15;

	/**
	 * The '<em><b>RESOURCE ALTERNATIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESOURCE ALTERNATIVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_ALTERNATIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_ALTERNATIVE_VALUE = 17;

	/**
	 * The '<em><b>RESOURCE GROUP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESOURCE GROUP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_GROUP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_GROUP_VALUE = 18;

	/**
	 * The '<em><b>AREA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AREA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AREA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AREA_VALUE = 19;

	/**
	 * The '<em><b>VARIANT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VARIANT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VARIANT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VARIANT_VALUE = 20;

	/**
	 * The '<em><b>TIMEFRAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIMEFRAME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMEFRAME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIMEFRAME_VALUE = 21;

	/**
	 * An array of all the '<em><b>Attribute Targets E</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AttributeTargetsE[] VALUES_ARRAY =
		new AttributeTargetsE[] {
			DEVICE_TYPE,
			DEVICE,
			FUNCTION_TYPE,
			FUNCTION,
			WIRE_TYPE,
			RESOURCE_TYPE,
			RESOURCE,
			SIGNAL_TYPE,
			SIGNAL,
			CONNECTION_TYPE,
			CONNECTION,
			LOCATION_TYPE,
			LOCATION,
			DUCT_TYPE,
			DUCT,
			RESOURCE_BUNDLE,
			RESOURCE_ALTERNATIVE,
			RESOURCE_GROUP,
			AREA,
			VARIANT,
			TIMEFRAME,
		};

	/**
	 * A public read-only list of all the '<em><b>Attribute Targets E</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AttributeTargetsE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Attribute Targets E</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AttributeTargetsE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AttributeTargetsE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Attribute Targets E</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AttributeTargetsE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AttributeTargetsE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Attribute Targets E</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AttributeTargetsE get(int value) {
		switch (value) {
			case DEVICE_TYPE_VALUE: return DEVICE_TYPE;
			case DEVICE_VALUE: return DEVICE;
			case FUNCTION_TYPE_VALUE: return FUNCTION_TYPE;
			case FUNCTION_VALUE: return FUNCTION;
			case WIRE_TYPE_VALUE: return WIRE_TYPE;
			case RESOURCE_TYPE_VALUE: return RESOURCE_TYPE;
			case RESOURCE_VALUE: return RESOURCE;
			case SIGNAL_TYPE_VALUE: return SIGNAL_TYPE;
			case SIGNAL_VALUE: return SIGNAL;
			case CONNECTION_TYPE_VALUE: return CONNECTION_TYPE;
			case CONNECTION_VALUE: return CONNECTION;
			case LOCATION_TYPE_VALUE: return LOCATION_TYPE;
			case LOCATION_VALUE: return LOCATION;
			case DUCT_TYPE_VALUE: return DUCT_TYPE;
			case DUCT_VALUE: return DUCT;
			case RESOURCE_BUNDLE_VALUE: return RESOURCE_BUNDLE;
			case RESOURCE_ALTERNATIVE_VALUE: return RESOURCE_ALTERNATIVE;
			case RESOURCE_GROUP_VALUE: return RESOURCE_GROUP;
			case AREA_VALUE: return AREA;
			case VARIANT_VALUE: return VARIANT;
			case TIMEFRAME_VALUE: return TIMEFRAME;
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
	private AttributeTargetsE(int value, String name, String literal) {
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
	
} //AttributeTargetsE
