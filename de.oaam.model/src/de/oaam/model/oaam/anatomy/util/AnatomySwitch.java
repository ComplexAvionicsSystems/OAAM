/**
 */
package de.oaam.model.oaam.anatomy.util;

import de.oaam.model.oaam.anatomy.*;

import de.oaam.model.oaam.common.ElementA;
import de.oaam.model.oaam.library.ResourceProviderInstanceA;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;
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
 * @see de.oaam.model.oaam.anatomy.AnatomyPackage
 * @generated
 */
public class AnatomySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AnatomyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnatomySwitch() {
		if (modelPackage == null) {
			modelPackage = AnatomyPackage.eINSTANCE;
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
			case AnatomyPackage.ANATOMY_CONTAINER_A: {
				AnatomyContainerA anatomyContainerA = (AnatomyContainerA)theEObject;
				T result = caseAnatomyContainerA(anatomyContainerA);
				if (result == null) result = caseElementA(anatomyContainerA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnatomyPackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = caseResourceProviderInstanceA(location);
				if (result == null) result = caseElementA(location);
				if (result == null) result = caseVariantDependentElementA(location);
				if (result == null) result = caseModeDependentElementA(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnatomyPackage.AREA: {
				Area area = (Area)theEObject;
				T result = caseArea(area);
				if (result == null) result = caseElementA(area);
				if (result == null) result = caseVariantDependentElementA(area);
				if (result == null) result = caseModeDependentElementA(area);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnatomyPackage.DUCT: {
				Duct duct = (Duct)theEObject;
				T result = caseDuct(duct);
				if (result == null) result = caseResourceProviderInstanceA(duct);
				if (result == null) result = caseElementA(duct);
				if (result == null) result = caseVariantDependentElementA(duct);
				if (result == null) result = caseModeDependentElementA(duct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnatomyPackage.DUCT_OPENING: {
				DuctOpening ductOpening = (DuctOpening)theEObject;
				T result = caseDuctOpening(ductOpening);
				if (result == null) result = caseElementA(ductOpening);
				if (result == null) result = caseVariantDependentElementA(ductOpening);
				if (result == null) result = caseModeDependentElementA(ductOpening);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnatomyPackage.POSITION3_D: {
				Position3D position3D = (Position3D)theEObject;
				T result = casePosition3D(position3D);
				if (result == null) result = caseElementA(position3D);
				if (result == null) result = caseVariantDependentElementA(position3D);
				if (result == null) result = caseModeDependentElementA(position3D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnatomyPackage.LOCATION_SYMMETRY: {
				LocationSymmetry locationSymmetry = (LocationSymmetry)theEObject;
				T result = caseLocationSymmetry(locationSymmetry);
				if (result == null) result = caseElementA(locationSymmetry);
				if (result == null) result = caseModeDependentElementA(locationSymmetry);
				if (result == null) result = caseVariantDependentElementA(locationSymmetry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnatomyPackage.ANATOMY: {
				Anatomy anatomy = (Anatomy)theEObject;
				T result = caseAnatomy(anatomy);
				if (result == null) result = caseAnatomyContainerA(anatomy);
				if (result == null) result = caseElementA(anatomy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnatomyPackage.SUBANATOMY: {
				Subanatomy subanatomy = (Subanatomy)theEObject;
				T result = caseSubanatomy(subanatomy);
				if (result == null) result = caseAnatomyContainerA(subanatomy);
				if (result == null) result = caseVariantDependentElementA(subanatomy);
				if (result == null) result = caseModeDependentElementA(subanatomy);
				if (result == null) result = caseElementA(subanatomy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnatomyContainerA(AnatomyContainerA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArea(Area object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuct(Duct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duct Opening</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duct Opening</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuctOpening(DuctOpening object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position3 D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position3 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePosition3D(Position3D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Symmetry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Symmetry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationSymmetry(LocationSymmetry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anatomy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anatomy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnatomy(Anatomy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subanatomy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subanatomy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubanatomy(Subanatomy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementA(ElementA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Provider Instance A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Provider Instance A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceProviderInstanceA(ResourceProviderInstanceA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variant Dependent Element A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variant Dependent Element A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariantDependentElementA(VariantDependentElementA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Dependent Element A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Dependent Element A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeDependentElementA(ModeDependentElementA object) {
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

} //AnatomySwitch
