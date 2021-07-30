/**
 */
package de.oaam.model.oaam.common.impl;

import de.oaam.model.oaam.common.Array;
import de.oaam.model.oaam.common.AttributeContainment;
import de.oaam.model.oaam.common.AttributeNumeric;
import de.oaam.model.oaam.common.AttributeReference;
import de.oaam.model.oaam.common.AttributeString;
import de.oaam.model.oaam.common.BoolNot;
import de.oaam.model.oaam.common.BoolOperation;
import de.oaam.model.oaam.common.BoolOperationTypesE;
import de.oaam.model.oaam.common.CommonFactory;
import de.oaam.model.oaam.common.CommonPackage;
import de.oaam.model.oaam.common.EndianessE;
import de.oaam.model.oaam.common.FloatingPoint;
import de.oaam.model.oaam.common.IntegrityStateE;
import de.oaam.model.oaam.common.Struct;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonFactoryImpl extends EFactoryImpl implements CommonFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommonFactory init() {
		try {
			CommonFactory theCommonFactory = (CommonFactory)EPackage.Registry.INSTANCE.getEFactory(CommonPackage.eNS_URI);
			if (theCommonFactory != null) {
				return theCommonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CommonPackage.ATTRIBUTE_STRING: return createAttributeString();
			case CommonPackage.ATTRIBUTE_NUMERIC: return createAttributeNumeric();
			case CommonPackage.ATTRIBUTE_CONTAINMENT: return createAttributeContainment();
			case CommonPackage.ATTRIBUTE_REFERENCE: return createAttributeReference();
			case CommonPackage.BOOL_OPERATION: return createBoolOperation();
			case CommonPackage.BOOL_NOT: return createBoolNot();
			case CommonPackage.INTEGER: return createInteger();
			case CommonPackage.ARRAY: return createArray();
			case CommonPackage.STRUCT: return createStruct();
			case CommonPackage.FLOATING_POINT: return createFloatingPoint();
			case CommonPackage.BYTE: return createByte();
			case CommonPackage.CHARACTER: return createCharacter();
			case CommonPackage.BOOLEAN: return createBoolean();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CommonPackage.BOOL_OPERATION_TYPES_E:
				return createBoolOperationTypesEFromString(eDataType, initialValue);
			case CommonPackage.INTEGRITY_STATE_E:
				return createIntegrityStateEFromString(eDataType, initialValue);
			case CommonPackage.ENDIANESS_E:
				return createEndianessEFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CommonPackage.BOOL_OPERATION_TYPES_E:
				return convertBoolOperationTypesEToString(eDataType, instanceValue);
			case CommonPackage.INTEGRITY_STATE_E:
				return convertIntegrityStateEToString(eDataType, instanceValue);
			case CommonPackage.ENDIANESS_E:
				return convertEndianessEToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeString createAttributeString() {
		AttributeStringImpl attributeString = new AttributeStringImpl();
		return attributeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeNumeric createAttributeNumeric() {
		AttributeNumericImpl attributeNumeric = new AttributeNumericImpl();
		return attributeNumeric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeContainment createAttributeContainment() {
		AttributeContainmentImpl attributeContainment = new AttributeContainmentImpl();
		return attributeContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeReference createAttributeReference() {
		AttributeReferenceImpl attributeReference = new AttributeReferenceImpl();
		return attributeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolOperation createBoolOperation() {
		BoolOperationImpl boolOperation = new BoolOperationImpl();
		return boolOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolNot createBoolNot() {
		BoolNotImpl boolNot = new BoolNotImpl();
		return boolNot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.oaam.model.oaam.common.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Array createArray() {
		ArrayImpl array = new ArrayImpl();
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Struct createStruct() {
		StructImpl struct = new StructImpl();
		return struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatingPoint createFloatingPoint() {
		FloatingPointImpl floatingPoint = new FloatingPointImpl();
		return floatingPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.oaam.model.oaam.common.Byte createByte() {
		ByteImpl byte_ = new ByteImpl();
		return byte_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.oaam.model.oaam.common.Character createCharacter() {
		CharacterImpl character = new CharacterImpl();
		return character;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.oaam.model.oaam.common.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolOperationTypesE createBoolOperationTypesEFromString(EDataType eDataType, String initialValue) {
		BoolOperationTypesE result = BoolOperationTypesE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBoolOperationTypesEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityStateE createIntegrityStateEFromString(EDataType eDataType, String initialValue) {
		IntegrityStateE result = IntegrityStateE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegrityStateEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndianessE createEndianessEFromString(EDataType eDataType, String initialValue) {
		EndianessE result = EndianessE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndianessEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonPackage getCommonPackage() {
		return (CommonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommonPackage getPackage() {
		return CommonPackage.eINSTANCE;
	}

} //CommonFactoryImpl
