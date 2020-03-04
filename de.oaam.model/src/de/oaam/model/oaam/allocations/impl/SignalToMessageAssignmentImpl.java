/**
 */
package de.oaam.model.oaam.allocations.impl;

import de.oaam.model.oaam.allocations.AllocationsPackage;
import de.oaam.model.oaam.allocations.SignalToMessageAssignment;

import de.oaam.model.oaam.capabilities.SignalInMessageCapability;

import de.oaam.model.oaam.common.AttributeA;
import de.oaam.model.oaam.common.DataTypeA;

import de.oaam.model.oaam.functions.Signal;

import de.oaam.model.oaam.scenario.OperationModeReference;
import de.oaam.model.oaam.scenario.Variant;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal To Message Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SignalToMessageAssignmentImpl#getSignal <em>Signal</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SignalToMessageAssignmentImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SignalToMessageAssignmentImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SignalToMessageAssignmentImpl#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SignalToMessageAssignmentImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SignalToMessageAssignmentImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.impl.SignalToMessageAssignmentImpl#getCapability <em>Capability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignalToMessageAssignmentImpl extends MinimalEObjectImpl.Container implements SignalToMessageAssignment {
	/**
	 * The cached value of the '{@link #getSignal() <em>Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignal()
	 * @generated
	 * @ordered
	 */
	protected Signal signal;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeA> attributes;

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
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataTypeA dataType;

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
	 * The cached value of the '{@link #getCapability() <em>Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability()
	 * @generated
	 * @ordered
	 */
	protected SignalInMessageCapability capability;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalToMessageAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllocationsPackage.Literals.SIGNAL_TO_MESSAGE_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal getSignal() {
		if (signal != null && signal.eIsProxy()) {
			InternalEObject oldSignal = (InternalEObject)signal;
			signal = (Signal)eResolveProxy(oldSignal);
			if (signal != oldSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__SIGNAL, oldSignal, signal));
			}
		}
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetSignal() {
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignal(Signal newSignal) {
		Signal oldSignal = signal;
		signal = newSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__SIGNAL, oldSignal, signal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeA> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributeA>(AttributeA.class, this, AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variant> getVariants() {
		if (variants == null) {
			variants = new EObjectResolvingEList<Variant>(Variant.class, this, AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__VARIANTS);
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
			operationModes = new EObjectContainmentEList<OperationModeReference>(OperationModeReference.class, this, AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__OPERATION_MODES);
		}
		return operationModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeA getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataType(DataTypeA newDataType, NotificationChain msgs) {
		DataTypeA oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__DATA_TYPE, oldDataType, newDataType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DataTypeA newDataType) {
		if (newDataType != dataType) {
			NotificationChain msgs = null;
			if (dataType != null)
				msgs = ((InternalEObject)dataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__DATA_TYPE, null, msgs);
			if (newDataType != null)
				msgs = ((InternalEObject)newDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__DATA_TYPE, null, msgs);
			msgs = basicSetDataType(newDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__DATA_TYPE, newDataType, newDataType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInMessageCapability getCapability() {
		if (capability != null && capability.eIsProxy()) {
			InternalEObject oldCapability = (InternalEObject)capability;
			capability = (SignalInMessageCapability)eResolveProxy(oldCapability);
			if (capability != oldCapability) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__CAPABILITY, oldCapability, capability));
			}
		}
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInMessageCapability basicGetCapability() {
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapability(SignalInMessageCapability newCapability) {
		SignalInMessageCapability oldCapability = capability;
		capability = newCapability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__CAPABILITY, oldCapability, capability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__OPERATION_MODES:
				return ((InternalEList<?>)getOperationModes()).basicRemove(otherEnd, msgs);
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__DATA_TYPE:
				return basicSetDataType(null, msgs);
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
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__SIGNAL:
				if (resolve) return getSignal();
				return basicGetSignal();
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__ATTRIBUTES:
				return getAttributes();
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__VARIANTS:
				return getVariants();
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__OPERATION_MODES:
				return getOperationModes();
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__DATA_TYPE:
				return getDataType();
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__POSITION:
				return getPosition();
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__CAPABILITY:
				if (resolve) return getCapability();
				return basicGetCapability();
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
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__SIGNAL:
				setSignal((Signal)newValue);
				return;
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeA>)newValue);
				return;
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__OPERATION_MODES:
				getOperationModes().clear();
				getOperationModes().addAll((Collection<? extends OperationModeReference>)newValue);
				return;
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__DATA_TYPE:
				setDataType((DataTypeA)newValue);
				return;
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__POSITION:
				setPosition((Integer)newValue);
				return;
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__CAPABILITY:
				setCapability((SignalInMessageCapability)newValue);
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
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__SIGNAL:
				setSignal((Signal)null);
				return;
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__VARIANTS:
				getVariants().clear();
				return;
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__OPERATION_MODES:
				getOperationModes().clear();
				return;
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__DATA_TYPE:
				setDataType((DataTypeA)null);
				return;
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__CAPABILITY:
				setCapability((SignalInMessageCapability)null);
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
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__SIGNAL:
				return signal != null;
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__VARIANTS:
				return variants != null && !variants.isEmpty();
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__OPERATION_MODES:
				return operationModes != null && !operationModes.isEmpty();
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__DATA_TYPE:
				return dataType != null;
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__POSITION:
				return position != POSITION_EDEFAULT;
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__CAPABILITY:
				return capability != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (position: ");
		result.append(position);
		result.append(')');
		return result.toString();
	}

} //SignalToMessageAssignmentImpl
