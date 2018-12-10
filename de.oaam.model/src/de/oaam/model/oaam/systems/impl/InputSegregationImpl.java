/**
 */
package de.oaam.model.oaam.systems.impl;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.systems.InputSegregation;
import de.oaam.model.oaam.systems.RequiredInformationA;
import de.oaam.model.oaam.systems.SystemsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Segregation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.systems.impl.InputSegregationImpl#isDissimilarSource <em>Dissimilar Source</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.InputSegregationImpl#isDissimilarRoute <em>Dissimilar Route</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.InputSegregationImpl#getDissimilarTechnology <em>Dissimilar Technology</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.InputSegregationImpl#getGroupA <em>Group A</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.impl.InputSegregationImpl#getGroupB <em>Group B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputSegregationImpl extends OaamBaseElementAImpl implements InputSegregation {
	/**
	 * The default value of the '{@link #isDissimilarSource() <em>Dissimilar Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDissimilarSource()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISSIMILAR_SOURCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDissimilarSource() <em>Dissimilar Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDissimilarSource()
	 * @generated
	 * @ordered
	 */
	protected boolean dissimilarSource = DISSIMILAR_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDissimilarRoute() <em>Dissimilar Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDissimilarRoute()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISSIMILAR_ROUTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDissimilarRoute() <em>Dissimilar Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDissimilarRoute()
	 * @generated
	 * @ordered
	 */
	protected boolean dissimilarRoute = DISSIMILAR_ROUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDissimilarTechnology() <em>Dissimilar Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDissimilarTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DISSIMILAR_TECHNOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDissimilarTechnology() <em>Dissimilar Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDissimilarTechnology()
	 * @generated
	 * @ordered
	 */
	protected Boolean dissimilarTechnology = DISSIMILAR_TECHNOLOGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGroupA() <em>Group A</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupA()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredInformationA> groupA;

	/**
	 * The cached value of the '{@link #getGroupB() <em>Group B</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupB()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredInformationA> groupB;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputSegregationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemsPackage.Literals.INPUT_SEGREGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDissimilarSource() {
		return dissimilarSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDissimilarSource(boolean newDissimilarSource) {
		boolean oldDissimilarSource = dissimilarSource;
		dissimilarSource = newDissimilarSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemsPackage.INPUT_SEGREGATION__DISSIMILAR_SOURCE, oldDissimilarSource, dissimilarSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDissimilarRoute() {
		return dissimilarRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDissimilarRoute(boolean newDissimilarRoute) {
		boolean oldDissimilarRoute = dissimilarRoute;
		dissimilarRoute = newDissimilarRoute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemsPackage.INPUT_SEGREGATION__DISSIMILAR_ROUTE, oldDissimilarRoute, dissimilarRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getDissimilarTechnology() {
		return dissimilarTechnology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDissimilarTechnology(Boolean newDissimilarTechnology) {
		Boolean oldDissimilarTechnology = dissimilarTechnology;
		dissimilarTechnology = newDissimilarTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemsPackage.INPUT_SEGREGATION__DISSIMILAR_TECHNOLOGY, oldDissimilarTechnology, dissimilarTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredInformationA> getGroupA() {
		if (groupA == null) {
			groupA = new EObjectResolvingEList<RequiredInformationA>(RequiredInformationA.class, this, SystemsPackage.INPUT_SEGREGATION__GROUP_A);
		}
		return groupA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredInformationA> getGroupB() {
		if (groupB == null) {
			groupB = new EObjectResolvingEList<RequiredInformationA>(RequiredInformationA.class, this, SystemsPackage.INPUT_SEGREGATION__GROUP_B);
		}
		return groupB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemsPackage.INPUT_SEGREGATION__DISSIMILAR_SOURCE:
				return isDissimilarSource();
			case SystemsPackage.INPUT_SEGREGATION__DISSIMILAR_ROUTE:
				return isDissimilarRoute();
			case SystemsPackage.INPUT_SEGREGATION__DISSIMILAR_TECHNOLOGY:
				return getDissimilarTechnology();
			case SystemsPackage.INPUT_SEGREGATION__GROUP_A:
				return getGroupA();
			case SystemsPackage.INPUT_SEGREGATION__GROUP_B:
				return getGroupB();
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
			case SystemsPackage.INPUT_SEGREGATION__DISSIMILAR_SOURCE:
				setDissimilarSource((Boolean)newValue);
				return;
			case SystemsPackage.INPUT_SEGREGATION__DISSIMILAR_ROUTE:
				setDissimilarRoute((Boolean)newValue);
				return;
			case SystemsPackage.INPUT_SEGREGATION__DISSIMILAR_TECHNOLOGY:
				setDissimilarTechnology((Boolean)newValue);
				return;
			case SystemsPackage.INPUT_SEGREGATION__GROUP_A:
				getGroupA().clear();
				getGroupA().addAll((Collection<? extends RequiredInformationA>)newValue);
				return;
			case SystemsPackage.INPUT_SEGREGATION__GROUP_B:
				getGroupB().clear();
				getGroupB().addAll((Collection<? extends RequiredInformationA>)newValue);
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
			case SystemsPackage.INPUT_SEGREGATION__DISSIMILAR_SOURCE:
				setDissimilarSource(DISSIMILAR_SOURCE_EDEFAULT);
				return;
			case SystemsPackage.INPUT_SEGREGATION__DISSIMILAR_ROUTE:
				setDissimilarRoute(DISSIMILAR_ROUTE_EDEFAULT);
				return;
			case SystemsPackage.INPUT_SEGREGATION__DISSIMILAR_TECHNOLOGY:
				setDissimilarTechnology(DISSIMILAR_TECHNOLOGY_EDEFAULT);
				return;
			case SystemsPackage.INPUT_SEGREGATION__GROUP_A:
				getGroupA().clear();
				return;
			case SystemsPackage.INPUT_SEGREGATION__GROUP_B:
				getGroupB().clear();
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
			case SystemsPackage.INPUT_SEGREGATION__DISSIMILAR_SOURCE:
				return dissimilarSource != DISSIMILAR_SOURCE_EDEFAULT;
			case SystemsPackage.INPUT_SEGREGATION__DISSIMILAR_ROUTE:
				return dissimilarRoute != DISSIMILAR_ROUTE_EDEFAULT;
			case SystemsPackage.INPUT_SEGREGATION__DISSIMILAR_TECHNOLOGY:
				return DISSIMILAR_TECHNOLOGY_EDEFAULT == null ? dissimilarTechnology != null : !DISSIMILAR_TECHNOLOGY_EDEFAULT.equals(dissimilarTechnology);
			case SystemsPackage.INPUT_SEGREGATION__GROUP_A:
				return groupA != null && !groupA.isEmpty();
			case SystemsPackage.INPUT_SEGREGATION__GROUP_B:
				return groupB != null && !groupB.isEmpty();
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
		result.append(" (dissimilarSource: ");
		result.append(dissimilarSource);
		result.append(", dissimilarRoute: ");
		result.append(dissimilarRoute);
		result.append(", dissimilarTechnology: ");
		result.append(dissimilarTechnology);
		result.append(')');
		return result.toString();
	}

} //InputSegregationImpl
