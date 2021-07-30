/**
 */
package de.oaam.model.oaam.physical.util;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.physical.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.oaam.model.oaam.physical.PhysicalPackage
 * @generated
 */
public class PhysicalAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PhysicalPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PhysicalPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalSwitch<Adapter> modelSwitch =
		new PhysicalSwitch<Adapter>() {
			@Override
			public Adapter casePhysicalInteractionContainerA(PhysicalInteractionContainerA object) {
				return createPhysicalInteractionContainerAAdapter();
			}
			@Override
			public Adapter caseSensor(Sensor object) {
				return createSensorAdapter();
			}
			@Override
			public Adapter caseEffector(Effector object) {
				return createEffectorAdapter();
			}
			@Override
			public Adapter casePhysicalInterfaceA(PhysicalInterfaceA object) {
				return createPhysicalInterfaceAAdapter();
			}
			@Override
			public Adapter casePhysicalInteraction(PhysicalInteraction object) {
				return createPhysicalInteractionAdapter();
			}
			@Override
			public Adapter caseSubphysicalInteraction(SubphysicalInteraction object) {
				return createSubphysicalInteractionAdapter();
			}
			@Override
			public Adapter caseOaamBaseElementA(OaamBaseElementA object) {
				return createOaamBaseElementAAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.physical.PhysicalInteractionContainerA <em>Interaction Container A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.physical.PhysicalInteractionContainerA
	 * @generated
	 */
	public Adapter createPhysicalInteractionContainerAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.physical.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.physical.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.physical.Effector <em>Effector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.physical.Effector
	 * @generated
	 */
	public Adapter createEffectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.physical.PhysicalInterfaceA <em>Interface A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.physical.PhysicalInterfaceA
	 * @generated
	 */
	public Adapter createPhysicalInterfaceAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.physical.PhysicalInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.physical.PhysicalInteraction
	 * @generated
	 */
	public Adapter createPhysicalInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.physical.SubphysicalInteraction <em>Subphysical Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.physical.SubphysicalInteraction
	 * @generated
	 */
	public Adapter createSubphysicalInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.oaam.model.oaam.common.OaamBaseElementA <em>Oaam Base Element A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.oaam.model.oaam.common.OaamBaseElementA
	 * @generated
	 */
	public Adapter createOaamBaseElementAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PhysicalAdapterFactory
