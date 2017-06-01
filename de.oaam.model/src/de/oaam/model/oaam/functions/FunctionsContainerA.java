/**
 */
package de.oaam.model.oaam.functions;

import de.oaam.model.oaam.common._ElementA;

import de.oaam.model.oaam.scenario._ModeDependentElementA;
import de.oaam.model.oaam.scenario._VariantDependentElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract base class of an element that can hold functions and related elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.functions.FunctionsContainerA#isIsAtomic <em>Is Atomic</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.FunctionsContainerA#getTasks <em>Tasks</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.FunctionsContainerA#getTaskLinks <em>Task Links</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.FunctionsContainerA#getTaskGroups <em>Task Groups</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.FunctionsContainerA#getTaskSymmetries <em>Task Symmetries</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.FunctionsContainerA#getTaskRedundancies <em>Task Redundancies</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.FunctionsContainerA#getSignals <em>Signals</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.FunctionsContainerA#getSignalGroups <em>Signal Groups</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.FunctionsContainerA#getFailureEvents <em>Failure Events</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.FunctionsContainerA#getSubfunctions <em>Subfunctions</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.functions.FunctionsPackage#getFunctionsContainerA()
 * @model
 * @generated
 */
public interface FunctionsContainerA extends _ElementA, _VariantDependentElementA, _ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether functions and signals of this subfunction can be distributed over multiple modules or not
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Atomic</em>' attribute.
	 * @see #setIsAtomic(boolean)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getFunctionsContainerA_IsAtomic()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsAtomic();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.FunctionsContainerA#isIsAtomic <em>Is Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Atomic</em>' attribute.
	 * @see #isIsAtomic()
	 * @generated
	 */
	void setIsAtomic(boolean value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All functions in this container
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getFunctionsContainerA_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Task Links</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.TaskLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All task links of the function model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task Links</em>' containment reference list.
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getFunctionsContainerA_TaskLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskLink> getTaskLinks();

	/**
	 * Returns the value of the '<em><b>Task Groups</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.TaskGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All functions groups in this container
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task Groups</em>' containment reference list.
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getFunctionsContainerA_TaskGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskGroup> getTaskGroups();

	/**
	 * Returns the value of the '<em><b>Task Symmetries</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.TaskSymmetry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All functions symmetries in this container
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task Symmetries</em>' containment reference list.
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getFunctionsContainerA_TaskSymmetries()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskSymmetry> getTaskSymmetries();

	/**
	 * Returns the value of the '<em><b>Task Redundancies</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.TaskRedundancy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All functions redundancies in this container
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task Redundancies</em>' containment reference list.
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getFunctionsContainerA_TaskRedundancies()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskRedundancy> getTaskRedundancies();

	/**
	 * Returns the value of the '<em><b>Signals</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.Signal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All signals in this container
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signals</em>' containment reference list.
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getFunctionsContainerA_Signals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Signal> getSignals();

	/**
	 * Returns the value of the '<em><b>Signal Groups</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.SignalGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All functions groups in this container
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Groups</em>' containment reference list.
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getFunctionsContainerA_SignalGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<SignalGroup> getSignalGroups();

	/**
	 * Returns the value of the '<em><b>Failure Events</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.FailureCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All failure events of this system description.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Failure Events</em>' containment reference list.
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getFunctionsContainerA_FailureEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<FailureCondition> getFailureEvents();

	/**
	 * Returns the value of the '<em><b>Subfunctions</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.Subfunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All subfunctions included
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subfunctions</em>' containment reference list.
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getFunctionsContainerA_Subfunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subfunction> getSubfunctions();

} // FunctionsContainerA
