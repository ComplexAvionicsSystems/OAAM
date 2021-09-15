/**
 */
package de.oaam.model.oaam.allocations.impl;

import de.oaam.model.oaam.allocations.AllocationsPackage;
import de.oaam.model.oaam.allocations.PathA;
import de.oaam.model.oaam.allocations.Schedule;
import de.oaam.model.oaam.allocations.SegmentA;
import de.oaam.model.oaam.allocations.SignalToMessageAssignment;
import de.oaam.model.oaam.allocations.Submessage;

import de.oaam.model.oaam.capabilities.SubmessageInMessageCapability;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.library.MessageType;

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
 * An implementation of the model object '<em><b>Submessage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SubmessageImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SubmessageImpl#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SubmessageImpl#getSchedules <em>Schedules</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SubmessageImpl#getSubmessages <em>Submessages</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SubmessageImpl#getSignalToMessageAssignments <em>Signal To Message Assignments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SubmessageImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SubmessageImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SubmessageImpl#isIsPersistent <em>Is Persistent</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SubmessageImpl#getLength <em>Length</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SubmessageImpl#getPath <em>Path</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SubmessageImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SubmessageImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubmessageImpl extends OaamBaseElementAImpl implements Submessage {
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
	 * The cached value of the '{@link #getOperationModes() <em>Operation Modes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationModes()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationModeReference> operationModes;

	/**
	 * The cached value of the '{@link #getSchedules() <em>Schedules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<Schedule> schedules;

	/**
	 * The cached value of the '{@link #getSubmessages() <em>Submessages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmessages()
	 * @generated
	 * @ordered
	 */
	protected EList<Submessage> submessages;

	/**
	 * The cached value of the '{@link #getSignalToMessageAssignments() <em>Signal To Message Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalToMessageAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalToMessageAssignment> signalToMessageAssignments;

	/**
	 * The cached value of the '{@link #getSegments() <em>Segments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegments()
	 * @generated
	 * @ordered
	 */
	protected EList<SegmentA> segments;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MessageType type;

	/**
	 * The default value of the '{@link #isIsPersistent() <em>Is Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPersistent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PERSISTENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPersistent() <em>Is Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPersistent()
	 * @generated
	 * @ordered
	 */
	protected boolean isPersistent = IS_PERSISTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected PathA path;

	/**
	 * The cached value of the '{@link #getCapability() <em>Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability()
	 * @generated
	 * @ordered
	 */
	protected SubmessageInMessageCapability capability;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected int position = POSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubmessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllocationsPackage.Literals.SUBMESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variant> getVariants() {
		if (variants == null) {
			variants = new EObjectResolvingEList<Variant>(Variant.class, this, AllocationsPackage.SUBMESSAGE__VARIANTS);
		}
		return variants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationModeReference> getOperationModes() {
		if (operationModes == null) {
			operationModes = new EObjectContainmentEList<OperationModeReference>(OperationModeReference.class, this, AllocationsPackage.SUBMESSAGE__OPERATION_MODES);
		}
		return operationModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schedule> getSchedules() {
		if (schedules == null) {
			schedules = new EObjectContainmentEList<Schedule>(Schedule.class, this, AllocationsPackage.SUBMESSAGE__SCHEDULES);
		}
		return schedules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Submessage> getSubmessages() {
		if (submessages == null) {
			submessages = new EObjectContainmentEList<Submessage>(Submessage.class, this, AllocationsPackage.SUBMESSAGE__SUBMESSAGES);
		}
		return submessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalToMessageAssignment> getSignalToMessageAssignments() {
		if (signalToMessageAssignments == null) {
			signalToMessageAssignments = new EObjectContainmentEList<SignalToMessageAssignment>(SignalToMessageAssignment.class, this, AllocationsPackage.SUBMESSAGE__SIGNAL_TO_MESSAGE_ASSIGNMENTS);
		}
		return signalToMessageAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SegmentA> getSegments() {
		if (segments == null) {
			segments = new EObjectContainmentEList<SegmentA>(SegmentA.class, this, AllocationsPackage.SUBMESSAGE__SEGMENTS);
		}
		return segments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (MessageType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationsPackage.SUBMESSAGE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(MessageType newType) {
		MessageType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.SUBMESSAGE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPersistent() {
		return isPersistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPersistent(boolean newIsPersistent) {
		boolean oldIsPersistent = isPersistent;
		isPersistent = newIsPersistent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.SUBMESSAGE__IS_PERSISTENT, oldIsPersistent, isPersistent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.SUBMESSAGE__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathA getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(PathA newPath, NotificationChain msgs) {
		PathA oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AllocationsPackage.SUBMESSAGE__PATH, oldPath, newPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(PathA newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AllocationsPackage.SUBMESSAGE__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AllocationsPackage.SUBMESSAGE__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.SUBMESSAGE__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmessageInMessageCapability getCapability() {
		if (capability != null && capability.eIsProxy()) {
			InternalEObject oldCapability = (InternalEObject)capability;
			capability = (SubmessageInMessageCapability)eResolveProxy(oldCapability);
			if (capability != oldCapability) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationsPackage.SUBMESSAGE__CAPABILITY, oldCapability, capability));
			}
		}
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmessageInMessageCapability basicGetCapability() {
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapability(SubmessageInMessageCapability newCapability) {
		SubmessageInMessageCapability oldCapability = capability;
		capability = newCapability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.SUBMESSAGE__CAPABILITY, oldCapability, capability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(int newPosition) {
		int oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.SUBMESSAGE__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AllocationsPackage.SUBMESSAGE__OPERATION_MODES:
				return ((InternalEList<?>)getOperationModes()).basicRemove(otherEnd, msgs);
			case AllocationsPackage.SUBMESSAGE__SCHEDULES:
				return ((InternalEList<?>)getSchedules()).basicRemove(otherEnd, msgs);
			case AllocationsPackage.SUBMESSAGE__SUBMESSAGES:
				return ((InternalEList<?>)getSubmessages()).basicRemove(otherEnd, msgs);
			case AllocationsPackage.SUBMESSAGE__SIGNAL_TO_MESSAGE_ASSIGNMENTS:
				return ((InternalEList<?>)getSignalToMessageAssignments()).basicRemove(otherEnd, msgs);
			case AllocationsPackage.SUBMESSAGE__SEGMENTS:
				return ((InternalEList<?>)getSegments()).basicRemove(otherEnd, msgs);
			case AllocationsPackage.SUBMESSAGE__PATH:
				return basicSetPath(null, msgs);
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
			case AllocationsPackage.SUBMESSAGE__VARIANTS:
				return getVariants();
			case AllocationsPackage.SUBMESSAGE__OPERATION_MODES:
				return getOperationModes();
			case AllocationsPackage.SUBMESSAGE__SCHEDULES:
				return getSchedules();
			case AllocationsPackage.SUBMESSAGE__SUBMESSAGES:
				return getSubmessages();
			case AllocationsPackage.SUBMESSAGE__SIGNAL_TO_MESSAGE_ASSIGNMENTS:
				return getSignalToMessageAssignments();
			case AllocationsPackage.SUBMESSAGE__SEGMENTS:
				return getSegments();
			case AllocationsPackage.SUBMESSAGE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case AllocationsPackage.SUBMESSAGE__IS_PERSISTENT:
				return isIsPersistent();
			case AllocationsPackage.SUBMESSAGE__LENGTH:
				return getLength();
			case AllocationsPackage.SUBMESSAGE__PATH:
				return getPath();
			case AllocationsPackage.SUBMESSAGE__CAPABILITY:
				if (resolve) return getCapability();
				return basicGetCapability();
			case AllocationsPackage.SUBMESSAGE__POSITION:
				return getPosition();
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
			case AllocationsPackage.SUBMESSAGE__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case AllocationsPackage.SUBMESSAGE__OPERATION_MODES:
				getOperationModes().clear();
				getOperationModes().addAll((Collection<? extends OperationModeReference>)newValue);
				return;
			case AllocationsPackage.SUBMESSAGE__SCHEDULES:
				getSchedules().clear();
				getSchedules().addAll((Collection<? extends Schedule>)newValue);
				return;
			case AllocationsPackage.SUBMESSAGE__SUBMESSAGES:
				getSubmessages().clear();
				getSubmessages().addAll((Collection<? extends Submessage>)newValue);
				return;
			case AllocationsPackage.SUBMESSAGE__SIGNAL_TO_MESSAGE_ASSIGNMENTS:
				getSignalToMessageAssignments().clear();
				getSignalToMessageAssignments().addAll((Collection<? extends SignalToMessageAssignment>)newValue);
				return;
			case AllocationsPackage.SUBMESSAGE__SEGMENTS:
				getSegments().clear();
				getSegments().addAll((Collection<? extends SegmentA>)newValue);
				return;
			case AllocationsPackage.SUBMESSAGE__TYPE:
				setType((MessageType)newValue);
				return;
			case AllocationsPackage.SUBMESSAGE__IS_PERSISTENT:
				setIsPersistent((Boolean)newValue);
				return;
			case AllocationsPackage.SUBMESSAGE__LENGTH:
				setLength((Integer)newValue);
				return;
			case AllocationsPackage.SUBMESSAGE__PATH:
				setPath((PathA)newValue);
				return;
			case AllocationsPackage.SUBMESSAGE__CAPABILITY:
				setCapability((SubmessageInMessageCapability)newValue);
				return;
			case AllocationsPackage.SUBMESSAGE__POSITION:
				setPosition((Integer)newValue);
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
			case AllocationsPackage.SUBMESSAGE__VARIANTS:
				getVariants().clear();
				return;
			case AllocationsPackage.SUBMESSAGE__OPERATION_MODES:
				getOperationModes().clear();
				return;
			case AllocationsPackage.SUBMESSAGE__SCHEDULES:
				getSchedules().clear();
				return;
			case AllocationsPackage.SUBMESSAGE__SUBMESSAGES:
				getSubmessages().clear();
				return;
			case AllocationsPackage.SUBMESSAGE__SIGNAL_TO_MESSAGE_ASSIGNMENTS:
				getSignalToMessageAssignments().clear();
				return;
			case AllocationsPackage.SUBMESSAGE__SEGMENTS:
				getSegments().clear();
				return;
			case AllocationsPackage.SUBMESSAGE__TYPE:
				setType((MessageType)null);
				return;
			case AllocationsPackage.SUBMESSAGE__IS_PERSISTENT:
				setIsPersistent(IS_PERSISTENT_EDEFAULT);
				return;
			case AllocationsPackage.SUBMESSAGE__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case AllocationsPackage.SUBMESSAGE__PATH:
				setPath((PathA)null);
				return;
			case AllocationsPackage.SUBMESSAGE__CAPABILITY:
				setCapability((SubmessageInMessageCapability)null);
				return;
			case AllocationsPackage.SUBMESSAGE__POSITION:
				setPosition(POSITION_EDEFAULT);
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
			case AllocationsPackage.SUBMESSAGE__VARIANTS:
				return variants != null && !variants.isEmpty();
			case AllocationsPackage.SUBMESSAGE__OPERATION_MODES:
				return operationModes != null && !operationModes.isEmpty();
			case AllocationsPackage.SUBMESSAGE__SCHEDULES:
				return schedules != null && !schedules.isEmpty();
			case AllocationsPackage.SUBMESSAGE__SUBMESSAGES:
				return submessages != null && !submessages.isEmpty();
			case AllocationsPackage.SUBMESSAGE__SIGNAL_TO_MESSAGE_ASSIGNMENTS:
				return signalToMessageAssignments != null && !signalToMessageAssignments.isEmpty();
			case AllocationsPackage.SUBMESSAGE__SEGMENTS:
				return segments != null && !segments.isEmpty();
			case AllocationsPackage.SUBMESSAGE__TYPE:
				return type != null;
			case AllocationsPackage.SUBMESSAGE__IS_PERSISTENT:
				return isPersistent != IS_PERSISTENT_EDEFAULT;
			case AllocationsPackage.SUBMESSAGE__LENGTH:
				return length != LENGTH_EDEFAULT;
			case AllocationsPackage.SUBMESSAGE__PATH:
				return path != null;
			case AllocationsPackage.SUBMESSAGE__CAPABILITY:
				return capability != null;
			case AllocationsPackage.SUBMESSAGE__POSITION:
				return position != POSITION_EDEFAULT;
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
		if (baseClass == VariantDependentElementA.class) {
			switch (derivedFeatureID) {
				case AllocationsPackage.SUBMESSAGE__VARIANTS: return ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (derivedFeatureID) {
				case AllocationsPackage.SUBMESSAGE__OPERATION_MODES: return ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES;
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
		if (baseClass == VariantDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS: return AllocationsPackage.SUBMESSAGE__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES: return AllocationsPackage.SUBMESSAGE__OPERATION_MODES;
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
		result.append(" (isPersistent: ");
		result.append(isPersistent);
		result.append(", length: ");
		result.append(length);
		result.append(", position: ");
		result.append(position);
		result.append(')');
		return result.toString();
	}

} //SubmessageImpl
