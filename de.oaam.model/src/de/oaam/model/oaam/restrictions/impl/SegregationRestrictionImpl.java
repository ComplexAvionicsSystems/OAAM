/**
 */
package de.oaam.model.oaam.restrictions.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.functions.FunctionsContainerA;
import de.oaam.model.oaam.functions.Signal;
import de.oaam.model.oaam.functions.SignalGroup;
import de.oaam.model.oaam.functions.Task;
import de.oaam.model.oaam.functions.TaskGroup;

import de.oaam.model.oaam.hardware.Connection;
import de.oaam.model.oaam.hardware.Device;

import de.oaam.model.oaam.restrictions.RestrictionsPackage;
import de.oaam.model.oaam.restrictions.SegregationRestriction;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.OperationModeReference;
import de.oaam.model.oaam.scenario.ScenarioPackage;
import de.oaam.model.oaam.scenario.Variant;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Segregation Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.SegregationRestrictionImpl#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.SegregationRestrictionImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.SegregationRestrictionImpl#getTasksA <em>Tasks A</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.SegregationRestrictionImpl#getTasksB <em>Tasks B</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.SegregationRestrictionImpl#isDissimilarTechnology <em>Dissimilar Technology</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.SegregationRestrictionImpl#isDissimilarLocation <em>Dissimilar Location</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.SegregationRestrictionImpl#getSubfunctionsA <em>Subfunctions A</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.SegregationRestrictionImpl#getSubfunctionsB <em>Subfunctions B</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.SegregationRestrictionImpl#isDissimilarArea <em>Dissimilar Area</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.SegregationRestrictionImpl#isDissimilarPowerSource <em>Dissimilar Power Source</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.SegregationRestrictionImpl#getSignalsA <em>Signals A</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.SegregationRestrictionImpl#getSignalsB <em>Signals B</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.SegregationRestrictionImpl#getTaskGroupsA <em>Task Groups A</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.SegregationRestrictionImpl#getTaskGroupsB <em>Task Groups B</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.SegregationRestrictionImpl#getSignalGroupsB <em>Signal Groups B</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.SegregationRestrictionImpl#getSignalGroupsA <em>Signal Groups A</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.SegregationRestrictionImpl#getDevicesA <em>Devices A</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.SegregationRestrictionImpl#getDevicesB <em>Devices B</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.SegregationRestrictionImpl#getConnectionsA <em>Connections A</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.SegregationRestrictionImpl#getConnectionsB <em>Connections B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SegregationRestrictionImpl extends OaamBaseElementAImpl implements SegregationRestriction {
	/**
	 * The cached value of the '{@link #getOperationModes() <em>Operation Modes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationModes()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationModeReference> operationModes;

	/**
	 * The cached value of the '{@link #getVariants() <em>Variants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariants()
	 * @generated
	 * @ordered
	 */
	protected EList<Variant> variants;

	/**
	 * The cached value of the '{@link #getTasksA() <em>Tasks A</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasksA()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasksA;

	/**
	 * The cached value of the '{@link #getTasksB() <em>Tasks B</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasksB()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasksB;

	/**
	 * The default value of the '{@link #isDissimilarTechnology() <em>Dissimilar Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDissimilarTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISSIMILAR_TECHNOLOGY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDissimilarTechnology() <em>Dissimilar Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDissimilarTechnology()
	 * @generated
	 * @ordered
	 */
	protected boolean dissimilarTechnology = DISSIMILAR_TECHNOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #isDissimilarLocation() <em>Dissimilar Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDissimilarLocation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISSIMILAR_LOCATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDissimilarLocation() <em>Dissimilar Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDissimilarLocation()
	 * @generated
	 * @ordered
	 */
	protected boolean dissimilarLocation = DISSIMILAR_LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubfunctionsA() <em>Subfunctions A</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubfunctionsA()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionsContainerA> subfunctionsA;

	/**
	 * The cached value of the '{@link #getSubfunctionsB() <em>Subfunctions B</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubfunctionsB()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionsContainerA> subfunctionsB;

	/**
	 * The default value of the '{@link #isDissimilarArea() <em>Dissimilar Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDissimilarArea()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISSIMILAR_AREA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDissimilarArea() <em>Dissimilar Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDissimilarArea()
	 * @generated
	 * @ordered
	 */
	protected boolean dissimilarArea = DISSIMILAR_AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #isDissimilarPowerSource() <em>Dissimilar Power Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDissimilarPowerSource()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISSIMILAR_POWER_SOURCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDissimilarPowerSource() <em>Dissimilar Power Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDissimilarPowerSource()
	 * @generated
	 * @ordered
	 */
	protected boolean dissimilarPowerSource = DISSIMILAR_POWER_SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSignalsA() <em>Signals A</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalsA()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> signalsA;

	/**
	 * The cached value of the '{@link #getSignalsB() <em>Signals B</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalsB()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> signalsB;

	/**
	 * The cached value of the '{@link #getTaskGroupsA() <em>Task Groups A</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskGroupsA()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskGroup> taskGroupsA;

	/**
	 * The cached value of the '{@link #getTaskGroupsB() <em>Task Groups B</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskGroupsB()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskGroup> taskGroupsB;

	/**
	 * The cached value of the '{@link #getSignalGroupsB() <em>Signal Groups B</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalGroupsB()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalGroup> signalGroupsB;

	/**
	 * The cached value of the '{@link #getSignalGroupsA() <em>Signal Groups A</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalGroupsA()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalGroup> signalGroupsA;

	/**
	 * The cached value of the '{@link #getDevicesA() <em>Devices A</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevicesA()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> devicesA;

	/**
	 * The cached value of the '{@link #getDevicesB() <em>Devices B</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevicesB()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> devicesB;

	/**
	 * The cached value of the '{@link #getConnectionsA() <em>Connections A</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionsA()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connectionsA;

	/**
	 * The cached value of the '{@link #getConnectionsB() <em>Connections B</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionsB()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connectionsB;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SegregationRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestrictionsPackage.Literals.SEGREGATION_RESTRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationModeReference> getOperationModes() {
		if (operationModes == null) {
			operationModes = new EObjectContainmentEList<OperationModeReference>(OperationModeReference.class, this, RestrictionsPackage.SEGREGATION_RESTRICTION__OPERATION_MODES);
		}
		return operationModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variant> getVariants() {
		if (variants == null) {
			variants = new EObjectResolvingEList<Variant>(Variant.class, this, RestrictionsPackage.SEGREGATION_RESTRICTION__VARIANTS);
		}
		return variants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasksA() {
		if (tasksA == null) {
			tasksA = new EObjectResolvingEList<Task>(Task.class, this, RestrictionsPackage.SEGREGATION_RESTRICTION__TASKS_A);
		}
		return tasksA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasksB() {
		if (tasksB == null) {
			tasksB = new EObjectResolvingEList<Task>(Task.class, this, RestrictionsPackage.SEGREGATION_RESTRICTION__TASKS_B);
		}
		return tasksB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDissimilarTechnology() {
		return dissimilarTechnology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDissimilarTechnology(boolean newDissimilarTechnology) {
		boolean oldDissimilarTechnology = dissimilarTechnology;
		dissimilarTechnology = newDissimilarTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.SEGREGATION_RESTRICTION__DISSIMILAR_TECHNOLOGY, oldDissimilarTechnology, dissimilarTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDissimilarLocation() {
		return dissimilarLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDissimilarLocation(boolean newDissimilarLocation) {
		boolean oldDissimilarLocation = dissimilarLocation;
		dissimilarLocation = newDissimilarLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.SEGREGATION_RESTRICTION__DISSIMILAR_LOCATION, oldDissimilarLocation, dissimilarLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionsContainerA> getSubfunctionsA() {
		if (subfunctionsA == null) {
			subfunctionsA = new EObjectResolvingEList<FunctionsContainerA>(FunctionsContainerA.class, this, RestrictionsPackage.SEGREGATION_RESTRICTION__SUBFUNCTIONS_A);
		}
		return subfunctionsA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionsContainerA> getSubfunctionsB() {
		if (subfunctionsB == null) {
			subfunctionsB = new EObjectResolvingEList<FunctionsContainerA>(FunctionsContainerA.class, this, RestrictionsPackage.SEGREGATION_RESTRICTION__SUBFUNCTIONS_B);
		}
		return subfunctionsB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDissimilarArea() {
		return dissimilarArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDissimilarArea(boolean newDissimilarArea) {
		boolean oldDissimilarArea = dissimilarArea;
		dissimilarArea = newDissimilarArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.SEGREGATION_RESTRICTION__DISSIMILAR_AREA, oldDissimilarArea, dissimilarArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDissimilarPowerSource() {
		return dissimilarPowerSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDissimilarPowerSource(boolean newDissimilarPowerSource) {
		boolean oldDissimilarPowerSource = dissimilarPowerSource;
		dissimilarPowerSource = newDissimilarPowerSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.SEGREGATION_RESTRICTION__DISSIMILAR_POWER_SOURCE, oldDissimilarPowerSource, dissimilarPowerSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signal> getSignalsA() {
		if (signalsA == null) {
			signalsA = new EObjectResolvingEList<Signal>(Signal.class, this, RestrictionsPackage.SEGREGATION_RESTRICTION__SIGNALS_A);
		}
		return signalsA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signal> getSignalsB() {
		if (signalsB == null) {
			signalsB = new EObjectResolvingEList<Signal>(Signal.class, this, RestrictionsPackage.SEGREGATION_RESTRICTION__SIGNALS_B);
		}
		return signalsB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskGroup> getTaskGroupsA() {
		if (taskGroupsA == null) {
			taskGroupsA = new EObjectResolvingEList<TaskGroup>(TaskGroup.class, this, RestrictionsPackage.SEGREGATION_RESTRICTION__TASK_GROUPS_A);
		}
		return taskGroupsA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskGroup> getTaskGroupsB() {
		if (taskGroupsB == null) {
			taskGroupsB = new EObjectResolvingEList<TaskGroup>(TaskGroup.class, this, RestrictionsPackage.SEGREGATION_RESTRICTION__TASK_GROUPS_B);
		}
		return taskGroupsB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalGroup> getSignalGroupsB() {
		if (signalGroupsB == null) {
			signalGroupsB = new EObjectResolvingEList<SignalGroup>(SignalGroup.class, this, RestrictionsPackage.SEGREGATION_RESTRICTION__SIGNAL_GROUPS_B);
		}
		return signalGroupsB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalGroup> getSignalGroupsA() {
		if (signalGroupsA == null) {
			signalGroupsA = new EObjectResolvingEList<SignalGroup>(SignalGroup.class, this, RestrictionsPackage.SEGREGATION_RESTRICTION__SIGNAL_GROUPS_A);
		}
		return signalGroupsA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getDevicesA() {
		if (devicesA == null) {
			devicesA = new EObjectResolvingEList<Device>(Device.class, this, RestrictionsPackage.SEGREGATION_RESTRICTION__DEVICES_A);
		}
		return devicesA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getDevicesB() {
		if (devicesB == null) {
			devicesB = new EObjectResolvingEList<Device>(Device.class, this, RestrictionsPackage.SEGREGATION_RESTRICTION__DEVICES_B);
		}
		return devicesB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnectionsA() {
		if (connectionsA == null) {
			connectionsA = new EObjectResolvingEList<Connection>(Connection.class, this, RestrictionsPackage.SEGREGATION_RESTRICTION__CONNECTIONS_A);
		}
		return connectionsA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnectionsB() {
		if (connectionsB == null) {
			connectionsB = new EObjectResolvingEList<Connection>(Connection.class, this, RestrictionsPackage.SEGREGATION_RESTRICTION__CONNECTIONS_B);
		}
		return connectionsB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestrictionsPackage.SEGREGATION_RESTRICTION__OPERATION_MODES:
				return ((InternalEList<?>)getOperationModes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestrictionsPackage.SEGREGATION_RESTRICTION__OPERATION_MODES:
				return getOperationModes();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__VARIANTS:
				return getVariants();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__TASKS_A:
				return getTasksA();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__TASKS_B:
				return getTasksB();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__DISSIMILAR_TECHNOLOGY:
				return isDissimilarTechnology();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__DISSIMILAR_LOCATION:
				return isDissimilarLocation();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__SUBFUNCTIONS_A:
				return getSubfunctionsA();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__SUBFUNCTIONS_B:
				return getSubfunctionsB();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__DISSIMILAR_AREA:
				return isDissimilarArea();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__DISSIMILAR_POWER_SOURCE:
				return isDissimilarPowerSource();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__SIGNALS_A:
				return getSignalsA();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__SIGNALS_B:
				return getSignalsB();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__TASK_GROUPS_A:
				return getTaskGroupsA();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__TASK_GROUPS_B:
				return getTaskGroupsB();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__SIGNAL_GROUPS_B:
				return getSignalGroupsB();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__SIGNAL_GROUPS_A:
				return getSignalGroupsA();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__DEVICES_A:
				return getDevicesA();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__DEVICES_B:
				return getDevicesB();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__CONNECTIONS_A:
				return getConnectionsA();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__CONNECTIONS_B:
				return getConnectionsB();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RestrictionsPackage.SEGREGATION_RESTRICTION__OPERATION_MODES:
				getOperationModes().clear();
				getOperationModes().addAll((Collection<? extends OperationModeReference>)newValue);
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__TASKS_A:
				getTasksA().clear();
				getTasksA().addAll((Collection<? extends Task>)newValue);
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__TASKS_B:
				getTasksB().clear();
				getTasksB().addAll((Collection<? extends Task>)newValue);
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__DISSIMILAR_TECHNOLOGY:
				setDissimilarTechnology((Boolean)newValue);
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__DISSIMILAR_LOCATION:
				setDissimilarLocation((Boolean)newValue);
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__SUBFUNCTIONS_A:
				getSubfunctionsA().clear();
				getSubfunctionsA().addAll((Collection<? extends FunctionsContainerA>)newValue);
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__SUBFUNCTIONS_B:
				getSubfunctionsB().clear();
				getSubfunctionsB().addAll((Collection<? extends FunctionsContainerA>)newValue);
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__DISSIMILAR_AREA:
				setDissimilarArea((Boolean)newValue);
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__DISSIMILAR_POWER_SOURCE:
				setDissimilarPowerSource((Boolean)newValue);
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__SIGNALS_A:
				getSignalsA().clear();
				getSignalsA().addAll((Collection<? extends Signal>)newValue);
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__SIGNALS_B:
				getSignalsB().clear();
				getSignalsB().addAll((Collection<? extends Signal>)newValue);
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__TASK_GROUPS_A:
				getTaskGroupsA().clear();
				getTaskGroupsA().addAll((Collection<? extends TaskGroup>)newValue);
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__TASK_GROUPS_B:
				getTaskGroupsB().clear();
				getTaskGroupsB().addAll((Collection<? extends TaskGroup>)newValue);
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__SIGNAL_GROUPS_B:
				getSignalGroupsB().clear();
				getSignalGroupsB().addAll((Collection<? extends SignalGroup>)newValue);
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__SIGNAL_GROUPS_A:
				getSignalGroupsA().clear();
				getSignalGroupsA().addAll((Collection<? extends SignalGroup>)newValue);
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__DEVICES_A:
				getDevicesA().clear();
				getDevicesA().addAll((Collection<? extends Device>)newValue);
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__DEVICES_B:
				getDevicesB().clear();
				getDevicesB().addAll((Collection<? extends Device>)newValue);
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__CONNECTIONS_A:
				getConnectionsA().clear();
				getConnectionsA().addAll((Collection<? extends Connection>)newValue);
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__CONNECTIONS_B:
				getConnectionsB().clear();
				getConnectionsB().addAll((Collection<? extends Connection>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RestrictionsPackage.SEGREGATION_RESTRICTION__OPERATION_MODES:
				getOperationModes().clear();
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__VARIANTS:
				getVariants().clear();
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__TASKS_A:
				getTasksA().clear();
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__TASKS_B:
				getTasksB().clear();
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__DISSIMILAR_TECHNOLOGY:
				setDissimilarTechnology(DISSIMILAR_TECHNOLOGY_EDEFAULT);
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__DISSIMILAR_LOCATION:
				setDissimilarLocation(DISSIMILAR_LOCATION_EDEFAULT);
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__SUBFUNCTIONS_A:
				getSubfunctionsA().clear();
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__SUBFUNCTIONS_B:
				getSubfunctionsB().clear();
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__DISSIMILAR_AREA:
				setDissimilarArea(DISSIMILAR_AREA_EDEFAULT);
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__DISSIMILAR_POWER_SOURCE:
				setDissimilarPowerSource(DISSIMILAR_POWER_SOURCE_EDEFAULT);
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__SIGNALS_A:
				getSignalsA().clear();
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__SIGNALS_B:
				getSignalsB().clear();
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__TASK_GROUPS_A:
				getTaskGroupsA().clear();
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__TASK_GROUPS_B:
				getTaskGroupsB().clear();
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__SIGNAL_GROUPS_B:
				getSignalGroupsB().clear();
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__SIGNAL_GROUPS_A:
				getSignalGroupsA().clear();
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__DEVICES_A:
				getDevicesA().clear();
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__DEVICES_B:
				getDevicesB().clear();
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__CONNECTIONS_A:
				getConnectionsA().clear();
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__CONNECTIONS_B:
				getConnectionsB().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RestrictionsPackage.SEGREGATION_RESTRICTION__OPERATION_MODES:
				return operationModes != null && !operationModes.isEmpty();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__VARIANTS:
				return variants != null && !variants.isEmpty();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__TASKS_A:
				return tasksA != null && !tasksA.isEmpty();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__TASKS_B:
				return tasksB != null && !tasksB.isEmpty();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__DISSIMILAR_TECHNOLOGY:
				return dissimilarTechnology != DISSIMILAR_TECHNOLOGY_EDEFAULT;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__DISSIMILAR_LOCATION:
				return dissimilarLocation != DISSIMILAR_LOCATION_EDEFAULT;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__SUBFUNCTIONS_A:
				return subfunctionsA != null && !subfunctionsA.isEmpty();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__SUBFUNCTIONS_B:
				return subfunctionsB != null && !subfunctionsB.isEmpty();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__DISSIMILAR_AREA:
				return dissimilarArea != DISSIMILAR_AREA_EDEFAULT;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__DISSIMILAR_POWER_SOURCE:
				return dissimilarPowerSource != DISSIMILAR_POWER_SOURCE_EDEFAULT;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__SIGNALS_A:
				return signalsA != null && !signalsA.isEmpty();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__SIGNALS_B:
				return signalsB != null && !signalsB.isEmpty();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__TASK_GROUPS_A:
				return taskGroupsA != null && !taskGroupsA.isEmpty();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__TASK_GROUPS_B:
				return taskGroupsB != null && !taskGroupsB.isEmpty();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__SIGNAL_GROUPS_B:
				return signalGroupsB != null && !signalGroupsB.isEmpty();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__SIGNAL_GROUPS_A:
				return signalGroupsA != null && !signalGroupsA.isEmpty();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__DEVICES_A:
				return devicesA != null && !devicesA.isEmpty();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__DEVICES_B:
				return devicesB != null && !devicesB.isEmpty();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__CONNECTIONS_A:
				return connectionsA != null && !connectionsA.isEmpty();
			case RestrictionsPackage.SEGREGATION_RESTRICTION__CONNECTIONS_B:
				return connectionsB != null && !connectionsB.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ModeDependentElementA.class) {
			switch (derivedFeatureID) {
				case RestrictionsPackage.SEGREGATION_RESTRICTION__OPERATION_MODES: return ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES;
				default: return -1;
			}
		}
		if (baseClass == VariantDependentElementA.class) {
			switch (derivedFeatureID) {
				case RestrictionsPackage.SEGREGATION_RESTRICTION__VARIANTS: return ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ModeDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES: return RestrictionsPackage.SEGREGATION_RESTRICTION__OPERATION_MODES;
				default: return -1;
			}
		}
		if (baseClass == VariantDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS: return RestrictionsPackage.SEGREGATION_RESTRICTION__VARIANTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (dissimilarTechnology: ");
		result.append(dissimilarTechnology);
		result.append(", dissimilarLocation: ");
		result.append(dissimilarLocation);
		result.append(", dissimilarArea: ");
		result.append(dissimilarArea);
		result.append(", dissimilarPowerSource: ");
		result.append(dissimilarPowerSource);
		result.append(')');
		return result.toString();
	}

} //SegregationRestrictionImpl
