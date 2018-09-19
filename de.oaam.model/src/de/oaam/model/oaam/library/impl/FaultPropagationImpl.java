/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.common.BoolA;
import de.oaam.model.oaam.common.IntegretyStateE;
import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;
import de.oaam.model.oaam.library.FaultPropagation;
import de.oaam.model.oaam.library.LibraryPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fault Propagation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.impl.FaultPropagationImpl#getOutputState <em>Output State</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.FaultPropagationImpl#getLogic <em>Logic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FaultPropagationImpl extends OaamBaseElementAImpl implements FaultPropagation {
	/**
	 * The default value of the '{@link #getOutputState() <em>Output State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputState()
	 * @generated
	 * @ordered
	 */
	protected static final IntegretyStateE OUTPUT_STATE_EDEFAULT = IntegretyStateE.OK;

	/**
	 * The cached value of the '{@link #getOutputState() <em>Output State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputState()
	 * @generated
	 * @ordered
	 */
	protected IntegretyStateE outputState = OUTPUT_STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLogic() <em>Logic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogic()
	 * @generated
	 * @ordered
	 */
	protected BoolA logic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultPropagationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.FAULT_PROPAGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegretyStateE getOutputState() {
		return outputState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputState(IntegretyStateE newOutputState) {
		IntegretyStateE oldOutputState = outputState;
		outputState = newOutputState == null ? OUTPUT_STATE_EDEFAULT : newOutputState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.FAULT_PROPAGATION__OUTPUT_STATE, oldOutputState, outputState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolA getLogic() {
		return logic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogic(BoolA newLogic, NotificationChain msgs) {
		BoolA oldLogic = logic;
		logic = newLogic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LibraryPackage.FAULT_PROPAGATION__LOGIC, oldLogic, newLogic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogic(BoolA newLogic) {
		if (newLogic != logic) {
			NotificationChain msgs = null;
			if (logic != null)
				msgs = ((InternalEObject)logic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LibraryPackage.FAULT_PROPAGATION__LOGIC, null, msgs);
			if (newLogic != null)
				msgs = ((InternalEObject)newLogic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LibraryPackage.FAULT_PROPAGATION__LOGIC, null, msgs);
			msgs = basicSetLogic(newLogic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.FAULT_PROPAGATION__LOGIC, newLogic, newLogic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.FAULT_PROPAGATION__LOGIC:
				return basicSetLogic(null, msgs);
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
			case LibraryPackage.FAULT_PROPAGATION__OUTPUT_STATE:
				return getOutputState();
			case LibraryPackage.FAULT_PROPAGATION__LOGIC:
				return getLogic();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LibraryPackage.FAULT_PROPAGATION__OUTPUT_STATE:
				setOutputState((IntegretyStateE)newValue);
				return;
			case LibraryPackage.FAULT_PROPAGATION__LOGIC:
				setLogic((BoolA)newValue);
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
			case LibraryPackage.FAULT_PROPAGATION__OUTPUT_STATE:
				setOutputState(OUTPUT_STATE_EDEFAULT);
				return;
			case LibraryPackage.FAULT_PROPAGATION__LOGIC:
				setLogic((BoolA)null);
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
			case LibraryPackage.FAULT_PROPAGATION__OUTPUT_STATE:
				return outputState != OUTPUT_STATE_EDEFAULT;
			case LibraryPackage.FAULT_PROPAGATION__LOGIC:
				return logic != null;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (outputState: ");
		result.append(outputState);
		result.append(')');
		return result.toString();
	}

} //FaultPropagationImpl
