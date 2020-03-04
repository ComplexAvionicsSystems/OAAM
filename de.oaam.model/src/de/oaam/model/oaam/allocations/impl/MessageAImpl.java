/**
 */
package de.oaam.model.oaam.allocations.impl;

import de.oaam.model.oaam.allocations.AllocationsPackage;
import de.oaam.model.oaam.allocations.MessageA;
import de.oaam.model.oaam.allocations.MessageSegment;
import de.oaam.model.oaam.allocations.Schedule;
import de.oaam.model.oaam.allocations.SignalToMessageAssignment;
import de.oaam.model.oaam.allocations.Submessage;

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
 * An implementation of the model object '<em><b>Message A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.MessageAImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.MessageAImpl#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.MessageAImpl#getSchedules <em>Schedules</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.MessageAImpl#getSubmessages <em>Submessages</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.MessageAImpl#getSignalToMessageAssignments <em>Signal To Message Assignments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.MessageAImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.MessageAImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MessageAImpl extends OaamBaseElementAImpl implements MessageA {
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
	protected EList<MessageSegment> segments;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllocationsPackage.Literals.MESSAGE_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variant> getVariants() {
		if (variants == null) {
			variants = new EObjectResolvingEList<Variant>(Variant.class, this, AllocationsPackage.MESSAGE_A__VARIANTS);
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
			operationModes = new EObjectContainmentEList<OperationModeReference>(OperationModeReference.class, this, AllocationsPackage.MESSAGE_A__OPERATION_MODES);
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
			schedules = new EObjectContainmentEList<Schedule>(Schedule.class, this, AllocationsPackage.MESSAGE_A__SCHEDULES);
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
			submessages = new EObjectContainmentEList<Submessage>(Submessage.class, this, AllocationsPackage.MESSAGE_A__SUBMESSAGES);
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
			signalToMessageAssignments = new EObjectContainmentEList<SignalToMessageAssignment>(SignalToMessageAssignment.class, this, AllocationsPackage.MESSAGE_A__SIGNAL_TO_MESSAGE_ASSIGNMENTS);
		}
		return signalToMessageAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageSegment> getSegments() {
		if (segments == null) {
			segments = new EObjectContainmentEList<MessageSegment>(MessageSegment.class, this, AllocationsPackage.MESSAGE_A__SEGMENTS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationsPackage.MESSAGE_A__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.MESSAGE_A__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AllocationsPackage.MESSAGE_A__OPERATION_MODES:
				return ((InternalEList<?>)getOperationModes()).basicRemove(otherEnd, msgs);
			case AllocationsPackage.MESSAGE_A__SCHEDULES:
				return ((InternalEList<?>)getSchedules()).basicRemove(otherEnd, msgs);
			case AllocationsPackage.MESSAGE_A__SUBMESSAGES:
				return ((InternalEList<?>)getSubmessages()).basicRemove(otherEnd, msgs);
			case AllocationsPackage.MESSAGE_A__SIGNAL_TO_MESSAGE_ASSIGNMENTS:
				return ((InternalEList<?>)getSignalToMessageAssignments()).basicRemove(otherEnd, msgs);
			case AllocationsPackage.MESSAGE_A__SEGMENTS:
				return ((InternalEList<?>)getSegments()).basicRemove(otherEnd, msgs);
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
			case AllocationsPackage.MESSAGE_A__VARIANTS:
				return getVariants();
			case AllocationsPackage.MESSAGE_A__OPERATION_MODES:
				return getOperationModes();
			case AllocationsPackage.MESSAGE_A__SCHEDULES:
				return getSchedules();
			case AllocationsPackage.MESSAGE_A__SUBMESSAGES:
				return getSubmessages();
			case AllocationsPackage.MESSAGE_A__SIGNAL_TO_MESSAGE_ASSIGNMENTS:
				return getSignalToMessageAssignments();
			case AllocationsPackage.MESSAGE_A__SEGMENTS:
				return getSegments();
			case AllocationsPackage.MESSAGE_A__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case AllocationsPackage.MESSAGE_A__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case AllocationsPackage.MESSAGE_A__OPERATION_MODES:
				getOperationModes().clear();
				getOperationModes().addAll((Collection<? extends OperationModeReference>)newValue);
				return;
			case AllocationsPackage.MESSAGE_A__SCHEDULES:
				getSchedules().clear();
				getSchedules().addAll((Collection<? extends Schedule>)newValue);
				return;
			case AllocationsPackage.MESSAGE_A__SUBMESSAGES:
				getSubmessages().clear();
				getSubmessages().addAll((Collection<? extends Submessage>)newValue);
				return;
			case AllocationsPackage.MESSAGE_A__SIGNAL_TO_MESSAGE_ASSIGNMENTS:
				getSignalToMessageAssignments().clear();
				getSignalToMessageAssignments().addAll((Collection<? extends SignalToMessageAssignment>)newValue);
				return;
			case AllocationsPackage.MESSAGE_A__SEGMENTS:
				getSegments().clear();
				getSegments().addAll((Collection<? extends MessageSegment>)newValue);
				return;
			case AllocationsPackage.MESSAGE_A__TYPE:
				setType((MessageType)newValue);
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
			case AllocationsPackage.MESSAGE_A__VARIANTS:
				getVariants().clear();
				return;
			case AllocationsPackage.MESSAGE_A__OPERATION_MODES:
				getOperationModes().clear();
				return;
			case AllocationsPackage.MESSAGE_A__SCHEDULES:
				getSchedules().clear();
				return;
			case AllocationsPackage.MESSAGE_A__SUBMESSAGES:
				getSubmessages().clear();
				return;
			case AllocationsPackage.MESSAGE_A__SIGNAL_TO_MESSAGE_ASSIGNMENTS:
				getSignalToMessageAssignments().clear();
				return;
			case AllocationsPackage.MESSAGE_A__SEGMENTS:
				getSegments().clear();
				return;
			case AllocationsPackage.MESSAGE_A__TYPE:
				setType((MessageType)null);
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
			case AllocationsPackage.MESSAGE_A__VARIANTS:
				return variants != null && !variants.isEmpty();
			case AllocationsPackage.MESSAGE_A__OPERATION_MODES:
				return operationModes != null && !operationModes.isEmpty();
			case AllocationsPackage.MESSAGE_A__SCHEDULES:
				return schedules != null && !schedules.isEmpty();
			case AllocationsPackage.MESSAGE_A__SUBMESSAGES:
				return submessages != null && !submessages.isEmpty();
			case AllocationsPackage.MESSAGE_A__SIGNAL_TO_MESSAGE_ASSIGNMENTS:
				return signalToMessageAssignments != null && !signalToMessageAssignments.isEmpty();
			case AllocationsPackage.MESSAGE_A__SEGMENTS:
				return segments != null && !segments.isEmpty();
			case AllocationsPackage.MESSAGE_A__TYPE:
				return type != null;
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
				case AllocationsPackage.MESSAGE_A__VARIANTS: return ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (derivedFeatureID) {
				case AllocationsPackage.MESSAGE_A__OPERATION_MODES: return ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES;
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
				case ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS: return AllocationsPackage.MESSAGE_A__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES: return AllocationsPackage.MESSAGE_A__OPERATION_MODES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //MessageAImpl
