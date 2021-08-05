/**
 */
package de.oaam.model.oaam.common.util;

import de.oaam.model.oaam.common.Array;
import de.oaam.model.oaam.common.AttributeA;
import de.oaam.model.oaam.common.AttributeContainment;
import de.oaam.model.oaam.common.AttributeNumeric;
import de.oaam.model.oaam.common.AttributeReference;
import de.oaam.model.oaam.common.AttributeString;
import de.oaam.model.oaam.common.BoolA;
import de.oaam.model.oaam.common.BoolNot;
import de.oaam.model.oaam.common.BoolOperation;
import de.oaam.model.oaam.common.CommonPackage;
import de.oaam.model.oaam.common.DataTypeA;
import de.oaam.model.oaam.common.FloatingPoint;
import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.common.Struct;

import de.oaam.model.oaam.common.SystemBelongingElementA;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.oaam.model.oaam.common.CommonPackage
 * @generated
 */
public class CommonSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommonPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonSwitch() {
		if (modelPackage == null) {
			modelPackage = CommonPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CommonPackage.OAAM_BASE_ELEMENT_A: {
				OaamBaseElementA oaamBaseElementA = (OaamBaseElementA)theEObject;
				T result = caseOaamBaseElementA(oaamBaseElementA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.BOOL_A: {
				BoolA boolA = (BoolA)theEObject;
				T result = caseBoolA(boolA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.ATTRIBUTE_A: {
				AttributeA attributeA = (AttributeA)theEObject;
				T result = caseAttributeA(attributeA);
				if (result == null) result = caseOaamBaseElementA(attributeA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.ATTRIBUTE_STRING: {
				AttributeString attributeString = (AttributeString)theEObject;
				T result = caseAttributeString(attributeString);
				if (result == null) result = caseAttributeA(attributeString);
				if (result == null) result = caseOaamBaseElementA(attributeString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.ATTRIBUTE_NUMERIC: {
				AttributeNumeric attributeNumeric = (AttributeNumeric)theEObject;
				T result = caseAttributeNumeric(attributeNumeric);
				if (result == null) result = caseAttributeA(attributeNumeric);
				if (result == null) result = caseOaamBaseElementA(attributeNumeric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.ATTRIBUTE_CONTAINMENT: {
				AttributeContainment attributeContainment = (AttributeContainment)theEObject;
				T result = caseAttributeContainment(attributeContainment);
				if (result == null) result = caseAttributeA(attributeContainment);
				if (result == null) result = caseOaamBaseElementA(attributeContainment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.ATTRIBUTE_REFERENCE: {
				AttributeReference attributeReference = (AttributeReference)theEObject;
				T result = caseAttributeReference(attributeReference);
				if (result == null) result = caseAttributeA(attributeReference);
				if (result == null) result = caseOaamBaseElementA(attributeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.BOOL_OPERATION: {
				BoolOperation boolOperation = (BoolOperation)theEObject;
				T result = caseBoolOperation(boolOperation);
				if (result == null) result = caseBoolA(boolOperation);
				if (result == null) result = caseOaamBaseElementA(boolOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.BOOL_NOT: {
				BoolNot boolNot = (BoolNot)theEObject;
				T result = caseBoolNot(boolNot);
				if (result == null) result = caseBoolA(boolNot);
				if (result == null) result = caseOaamBaseElementA(boolNot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.DATA_TYPE_A: {
				DataTypeA dataTypeA = (DataTypeA)theEObject;
				T result = caseDataTypeA(dataTypeA);
				if (result == null) result = caseOaamBaseElementA(dataTypeA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.INTEGER: {
				de.oaam.model.oaam.common.Integer integer = (de.oaam.model.oaam.common.Integer)theEObject;
				T result = caseInteger(integer);
				if (result == null) result = caseDataTypeA(integer);
				if (result == null) result = caseOaamBaseElementA(integer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.ARRAY: {
				Array array = (Array)theEObject;
				T result = caseArray(array);
				if (result == null) result = caseDataTypeA(array);
				if (result == null) result = caseOaamBaseElementA(array);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.STRUCT: {
				Struct struct = (Struct)theEObject;
				T result = caseStruct(struct);
				if (result == null) result = caseDataTypeA(struct);
				if (result == null) result = caseOaamBaseElementA(struct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.FLOATING_POINT: {
				FloatingPoint floatingPoint = (FloatingPoint)theEObject;
				T result = caseFloatingPoint(floatingPoint);
				if (result == null) result = caseDataTypeA(floatingPoint);
				if (result == null) result = caseOaamBaseElementA(floatingPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.BYTE: {
				de.oaam.model.oaam.common.Byte byte_ = (de.oaam.model.oaam.common.Byte)theEObject;
				T result = caseByte(byte_);
				if (result == null) result = caseDataTypeA(byte_);
				if (result == null) result = caseOaamBaseElementA(byte_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.CHARACTER: {
				de.oaam.model.oaam.common.Character character = (de.oaam.model.oaam.common.Character)theEObject;
				T result = caseCharacter(character);
				if (result == null) result = caseDataTypeA(character);
				if (result == null) result = caseOaamBaseElementA(character);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.BOOLEAN: {
				de.oaam.model.oaam.common.Boolean boolean_ = (de.oaam.model.oaam.common.Boolean)theEObject;
				T result = caseBoolean(boolean_);
				if (result == null) result = caseDataTypeA(boolean_);
				if (result == null) result = caseOaamBaseElementA(boolean_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.SYSTEM_BELONGING_ELEMENT_A: {
				SystemBelongingElementA systemBelongingElementA = (SystemBelongingElementA)theEObject;
				T result = caseSystemBelongingElementA(systemBelongingElementA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oaam Base Element A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oaam Base Element A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOaamBaseElementA(OaamBaseElementA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolA(BoolA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeA(AttributeA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeString(AttributeString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Numeric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Numeric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeNumeric(AttributeNumeric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Containment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Containment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeContainment(AttributeContainment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeReference(AttributeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolOperation(BoolOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolNot(BoolNot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeA(DataTypeA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger(de.oaam.model.oaam.common.Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArray(Array object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStruct(Struct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floating Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floating Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatingPoint(FloatingPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Byte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Byte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseByte(de.oaam.model.oaam.common.Byte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter(de.oaam.model.oaam.common.Character object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(de.oaam.model.oaam.common.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Belonging Element A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Belonging Element A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemBelongingElementA(SystemBelongingElementA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CommonSwitch
