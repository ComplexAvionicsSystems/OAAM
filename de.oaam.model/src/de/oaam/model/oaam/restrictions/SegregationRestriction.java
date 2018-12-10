/**
 */
package de.oaam.model.oaam.restrictions;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.functions.FunctionsContainerA;
import de.oaam.model.oaam.functions.Signal;
import de.oaam.model.oaam.functions.SignalGroup;
import de.oaam.model.oaam.functions.Task;
import de.oaam.model.oaam.functions.TaskGroup;

import de.oaam.model.oaam.hardware.Connection;
import de.oaam.model.oaam.hardware.Device;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Segregation Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Functions and signals can be defined to be segregated. This implies that they have to be mapped to different devices or connections. In the segregation two groups A and B are defined. Elements in group A must be segregated from elements in group B.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.SegregationRestriction#getTasksA <em>Tasks A</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.SegregationRestriction#getTasksB <em>Tasks B</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.SegregationRestriction#isDissimilarTechnology <em>Dissimilar Technology</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.SegregationRestriction#isDissimilarLocation <em>Dissimilar Location</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.SegregationRestriction#getSubfunctionsA <em>Subfunctions A</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.SegregationRestriction#getSubfunctionsB <em>Subfunctions B</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.SegregationRestriction#isDissimilarArea <em>Dissimilar Area</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.SegregationRestriction#isDissimilarPowerSource <em>Dissimilar Power Source</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.SegregationRestriction#getSignalsA <em>Signals A</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.SegregationRestriction#getSignalsB <em>Signals B</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.SegregationRestriction#getTaskGroupsA <em>Task Groups A</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.SegregationRestriction#getTaskGroupsB <em>Task Groups B</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.SegregationRestriction#getSignalGroupsB <em>Signal Groups B</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.SegregationRestriction#getSignalGroupsA <em>Signal Groups A</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.SegregationRestriction#getDevicesA <em>Devices A</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.SegregationRestriction#getDevicesB <em>Devices B</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.SegregationRestriction#getConnectionsA <em>Connections A</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.SegregationRestriction#getConnectionsB <em>Connections B</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSegregationRestriction()
 * @model
 * @generated
 */
public interface SegregationRestriction extends OaamBaseElementA, ModeDependentElementA, VariantDependentElementA {
	/**
	 * Returns the value of the '<em><b>Tasks A</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All function of group A.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tasks A</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSegregationRestriction_TasksA()
	 * @model required="true"
	 * @generated
	 */
	EList<Task> getTasksA();

	/**
	 * Returns the value of the '<em><b>Tasks B</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All functions of group B
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tasks B</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSegregationRestriction_TasksB()
	 * @model required="true"
	 * @generated
	 */
	EList<Task> getTasksB();

	/**
	 * Returns the value of the '<em><b>Dissimilar Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elements from group A and B must be mapped to host of dissimilar technology.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dissimilar Technology</em>' attribute.
	 * @see #setDissimilarTechnology(boolean)
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSegregationRestriction_DissimilarTechnology()
	 * @model required="true"
	 * @generated
	 */
	boolean isDissimilarTechnology();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.SegregationRestriction#isDissimilarTechnology <em>Dissimilar Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dissimilar Technology</em>' attribute.
	 * @see #isDissimilarTechnology()
	 * @generated
	 */
	void setDissimilarTechnology(boolean value);

	/**
	 * Returns the value of the '<em><b>Dissimilar Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elements from group A and B must be mapped to dissimilar locations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dissimilar Location</em>' attribute.
	 * @see #setDissimilarLocation(boolean)
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSegregationRestriction_DissimilarLocation()
	 * @model required="true"
	 * @generated
	 */
	boolean isDissimilarLocation();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.SegregationRestriction#isDissimilarLocation <em>Dissimilar Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dissimilar Location</em>' attribute.
	 * @see #isDissimilarLocation()
	 * @generated
	 */
	void setDissimilarLocation(boolean value);

	/**
	 * Returns the value of the '<em><b>Subfunctions A</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.FunctionsContainerA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All sub functions of group A.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subfunctions A</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSegregationRestriction_SubfunctionsA()
	 * @model
	 * @generated
	 */
	EList<FunctionsContainerA> getSubfunctionsA();

	/**
	 * Returns the value of the '<em><b>Subfunctions B</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.FunctionsContainerA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All sub functions of group B.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subfunctions B</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSegregationRestriction_SubfunctionsB()
	 * @model
	 * @generated
	 */
	EList<FunctionsContainerA> getSubfunctionsB();

	/**
	 * Returns the value of the '<em><b>Dissimilar Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elements from group A and B must be mapped to locations in dissimilar areas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dissimilar Area</em>' attribute.
	 * @see #setDissimilarArea(boolean)
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSegregationRestriction_DissimilarArea()
	 * @model required="true"
	 * @generated
	 */
	boolean isDissimilarArea();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.SegregationRestriction#isDissimilarArea <em>Dissimilar Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dissimilar Area</em>' attribute.
	 * @see #isDissimilarArea()
	 * @generated
	 */
	void setDissimilarArea(boolean value);

	/**
	 * Returns the value of the '<em><b>Dissimilar Power Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elements from group A and B must be mapped on devices with dissimilar power supplies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dissimilar Power Source</em>' attribute.
	 * @see #setDissimilarPowerSource(boolean)
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSegregationRestriction_DissimilarPowerSource()
	 * @model required="true"
	 * @generated
	 */
	boolean isDissimilarPowerSource();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.restrictions.SegregationRestriction#isDissimilarPowerSource <em>Dissimilar Power Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dissimilar Power Source</em>' attribute.
	 * @see #isDissimilarPowerSource()
	 * @generated
	 */
	void setDissimilarPowerSource(boolean value);

	/**
	 * Returns the value of the '<em><b>Signals A</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.Signal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All signals of group A.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signals A</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSegregationRestriction_SignalsA()
	 * @model
	 * @generated
	 */
	EList<Signal> getSignalsA();

	/**
	 * Returns the value of the '<em><b>Signals B</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.Signal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All signals of group B.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signals B</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSegregationRestriction_SignalsB()
	 * @model
	 * @generated
	 */
	EList<Signal> getSignalsB();

	/**
	 * Returns the value of the '<em><b>Task Groups A</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.TaskGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All function groups of group A.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task Groups A</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSegregationRestriction_TaskGroupsA()
	 * @model
	 * @generated
	 */
	EList<TaskGroup> getTaskGroupsA();

	/**
	 * Returns the value of the '<em><b>Task Groups B</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.TaskGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All function groups of group B.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task Groups B</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSegregationRestriction_TaskGroupsB()
	 * @model
	 * @generated
	 */
	EList<TaskGroup> getTaskGroupsB();

	/**
	 * Returns the value of the '<em><b>Signal Groups B</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.SignalGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All signal groups of group A.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Groups B</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSegregationRestriction_SignalGroupsB()
	 * @model
	 * @generated
	 */
	EList<SignalGroup> getSignalGroupsB();

	/**
	 * Returns the value of the '<em><b>Signal Groups A</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.SignalGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All signal groups of group B.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Groups A</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSegregationRestriction_SignalGroupsA()
	 * @model
	 * @generated
	 */
	EList<SignalGroup> getSignalGroupsA();

	/**
	 * Returns the value of the '<em><b>Devices A</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.hardware.Device}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All devices of group A.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Devices A</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSegregationRestriction_DevicesA()
	 * @model
	 * @generated
	 */
	EList<Device> getDevicesA();

	/**
	 * Returns the value of the '<em><b>Devices B</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.hardware.Device}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All devices of group B.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Devices B</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSegregationRestriction_DevicesB()
	 * @model
	 * @generated
	 */
	EList<Device> getDevicesB();

	/**
	 * Returns the value of the '<em><b>Connections A</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.hardware.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All connections of group A.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connections A</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSegregationRestriction_ConnectionsA()
	 * @model
	 * @generated
	 */
	EList<Connection> getConnectionsA();

	/**
	 * Returns the value of the '<em><b>Connections B</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.hardware.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All connections of group B.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connections B</em>' reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getSegregationRestriction_ConnectionsB()
	 * @model
	 * @generated
	 */
	EList<Connection> getConnectionsB();

} // SegregationRestriction
