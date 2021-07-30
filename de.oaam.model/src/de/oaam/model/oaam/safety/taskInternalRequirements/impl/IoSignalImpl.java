/**
 */
package de.oaam.model.oaam.safety.taskInternalRequirements.impl;

import de.oaam.model.oaam.library.InputDeclaration;
import de.oaam.model.oaam.library.OutputDeclaration;

import de.oaam.model.oaam.safety.taskInternalRequirements.IoSignal;
import de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Io Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.IoSignalImpl#getDeclaredInput <em>Declared Input</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.taskInternalRequirements.impl.IoSignalImpl#getDeclaredOutput <em>Declared Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IoSignalImpl extends SourceAImpl implements IoSignal {
	/**
	 * The cached value of the '{@link #getDeclaredInput() <em>Declared Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredInput()
	 * @generated
	 * @ordered
	 */
	protected InputDeclaration declaredInput;

	/**
	 * The cached value of the '{@link #getDeclaredOutput() <em>Declared Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredOutput()
	 * @generated
	 * @ordered
	 */
	protected OutputDeclaration declaredOutput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IoSignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskInternalRequirementsPackage.Literals.IO_SIGNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDeclaration getDeclaredInput() {
		if (declaredInput != null && declaredInput.eIsProxy()) {
			InternalEObject oldDeclaredInput = (InternalEObject)declaredInput;
			declaredInput = (InputDeclaration)eResolveProxy(oldDeclaredInput);
			if (declaredInput != oldDeclaredInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskInternalRequirementsPackage.IO_SIGNAL__DECLARED_INPUT, oldDeclaredInput, declaredInput));
			}
		}
		return declaredInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDeclaration basicGetDeclaredInput() {
		return declaredInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaredInput(InputDeclaration newDeclaredInput) {
		InputDeclaration oldDeclaredInput = declaredInput;
		declaredInput = newDeclaredInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskInternalRequirementsPackage.IO_SIGNAL__DECLARED_INPUT, oldDeclaredInput, declaredInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDeclaration getDeclaredOutput() {
		if (declaredOutput != null && declaredOutput.eIsProxy()) {
			InternalEObject oldDeclaredOutput = (InternalEObject)declaredOutput;
			declaredOutput = (OutputDeclaration)eResolveProxy(oldDeclaredOutput);
			if (declaredOutput != oldDeclaredOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskInternalRequirementsPackage.IO_SIGNAL__DECLARED_OUTPUT, oldDeclaredOutput, declaredOutput));
			}
		}
		return declaredOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDeclaration basicGetDeclaredOutput() {
		return declaredOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaredOutput(OutputDeclaration newDeclaredOutput) {
		OutputDeclaration oldDeclaredOutput = declaredOutput;
		declaredOutput = newDeclaredOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskInternalRequirementsPackage.IO_SIGNAL__DECLARED_OUTPUT, oldDeclaredOutput, declaredOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaskInternalRequirementsPackage.IO_SIGNAL__DECLARED_INPUT:
				if (resolve) return getDeclaredInput();
				return basicGetDeclaredInput();
			case TaskInternalRequirementsPackage.IO_SIGNAL__DECLARED_OUTPUT:
				if (resolve) return getDeclaredOutput();
				return basicGetDeclaredOutput();
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
			case TaskInternalRequirementsPackage.IO_SIGNAL__DECLARED_INPUT:
				setDeclaredInput((InputDeclaration)newValue);
				return;
			case TaskInternalRequirementsPackage.IO_SIGNAL__DECLARED_OUTPUT:
				setDeclaredOutput((OutputDeclaration)newValue);
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
			case TaskInternalRequirementsPackage.IO_SIGNAL__DECLARED_INPUT:
				setDeclaredInput((InputDeclaration)null);
				return;
			case TaskInternalRequirementsPackage.IO_SIGNAL__DECLARED_OUTPUT:
				setDeclaredOutput((OutputDeclaration)null);
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
			case TaskInternalRequirementsPackage.IO_SIGNAL__DECLARED_INPUT:
				return declaredInput != null;
			case TaskInternalRequirementsPackage.IO_SIGNAL__DECLARED_OUTPUT:
				return declaredOutput != null;
		}
		return super.eIsSet(featureID);
	}

} //IoSignalImpl
