/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.common.DataTypeA;

import de.oaam.model.oaam.common.impl.ElementAImpl;
import de.oaam.model.oaam.library.FaultPropagation;
import de.oaam.model.oaam.library.LibraryPackage;
import de.oaam.model.oaam.library.OutputDeclaration;
import de.oaam.model.oaam.library.OutputTrigger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.impl.OutputDeclarationImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.OutputDeclarationImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.OutputDeclarationImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.OutputDeclarationImpl#getRange <em>Range</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.OutputDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.OutputDeclarationImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.OutputDeclarationImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.OutputDeclarationImpl#getFaultPropagations <em>Fault Propagations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputDeclarationImpl extends ElementAImpl implements OutputDeclaration {
	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostcondition() <em>Postcondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTCONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected String postcondition = POSTCONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected OutputTrigger trigger;

	/**
	 * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected static final String RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected String range = RANGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DataTypeA type;

	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_BOUND_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected int lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_BOUND_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected int upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFaultPropagations() <em>Fault Propagations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultPropagations()
	 * @generated
	 * @ordered
	 */
	protected EList<FaultPropagation> faultPropagations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.OUTPUT_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OUTPUT_DECLARATION__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostcondition() {
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostcondition(String newPostcondition) {
		String oldPostcondition = postcondition;
		postcondition = newPostcondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OUTPUT_DECLARATION__POSTCONDITION, oldPostcondition, postcondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputTrigger getTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrigger(OutputTrigger newTrigger, NotificationChain msgs) {
		OutputTrigger oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LibraryPackage.OUTPUT_DECLARATION__TRIGGER, oldTrigger, newTrigger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(OutputTrigger newTrigger) {
		if (newTrigger != trigger) {
			NotificationChain msgs = null;
			if (trigger != null)
				msgs = ((InternalEObject)trigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LibraryPackage.OUTPUT_DECLARATION__TRIGGER, null, msgs);
			if (newTrigger != null)
				msgs = ((InternalEObject)newTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LibraryPackage.OUTPUT_DECLARATION__TRIGGER, null, msgs);
			msgs = basicSetTrigger(newTrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OUTPUT_DECLARATION__TRIGGER, newTrigger, newTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(String newRange) {
		String oldRange = range;
		range = newRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OUTPUT_DECLARATION__RANGE, oldRange, range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeA getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (DataTypeA)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LibraryPackage.OUTPUT_DECLARATION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeA basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DataTypeA newType) {
		DataTypeA oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OUTPUT_DECLARATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(int newLowerBound) {
		int oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OUTPUT_DECLARATION__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(int newUpperBound) {
		int oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OUTPUT_DECLARATION__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FaultPropagation> getFaultPropagations() {
		if (faultPropagations == null) {
			faultPropagations = new EObjectContainmentEList<FaultPropagation>(FaultPropagation.class, this, LibraryPackage.OUTPUT_DECLARATION__FAULT_PROPAGATIONS);
		}
		return faultPropagations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.OUTPUT_DECLARATION__TRIGGER:
				return basicSetTrigger(null, msgs);
			case LibraryPackage.OUTPUT_DECLARATION__FAULT_PROPAGATIONS:
				return ((InternalEList<?>)getFaultPropagations()).basicRemove(otherEnd, msgs);
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
			case LibraryPackage.OUTPUT_DECLARATION__UNIT:
				return getUnit();
			case LibraryPackage.OUTPUT_DECLARATION__POSTCONDITION:
				return getPostcondition();
			case LibraryPackage.OUTPUT_DECLARATION__TRIGGER:
				return getTrigger();
			case LibraryPackage.OUTPUT_DECLARATION__RANGE:
				return getRange();
			case LibraryPackage.OUTPUT_DECLARATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case LibraryPackage.OUTPUT_DECLARATION__LOWER_BOUND:
				return getLowerBound();
			case LibraryPackage.OUTPUT_DECLARATION__UPPER_BOUND:
				return getUpperBound();
			case LibraryPackage.OUTPUT_DECLARATION__FAULT_PROPAGATIONS:
				return getFaultPropagations();
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
			case LibraryPackage.OUTPUT_DECLARATION__UNIT:
				setUnit((String)newValue);
				return;
			case LibraryPackage.OUTPUT_DECLARATION__POSTCONDITION:
				setPostcondition((String)newValue);
				return;
			case LibraryPackage.OUTPUT_DECLARATION__TRIGGER:
				setTrigger((OutputTrigger)newValue);
				return;
			case LibraryPackage.OUTPUT_DECLARATION__RANGE:
				setRange((String)newValue);
				return;
			case LibraryPackage.OUTPUT_DECLARATION__TYPE:
				setType((DataTypeA)newValue);
				return;
			case LibraryPackage.OUTPUT_DECLARATION__LOWER_BOUND:
				setLowerBound((Integer)newValue);
				return;
			case LibraryPackage.OUTPUT_DECLARATION__UPPER_BOUND:
				setUpperBound((Integer)newValue);
				return;
			case LibraryPackage.OUTPUT_DECLARATION__FAULT_PROPAGATIONS:
				getFaultPropagations().clear();
				getFaultPropagations().addAll((Collection<? extends FaultPropagation>)newValue);
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
			case LibraryPackage.OUTPUT_DECLARATION__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case LibraryPackage.OUTPUT_DECLARATION__POSTCONDITION:
				setPostcondition(POSTCONDITION_EDEFAULT);
				return;
			case LibraryPackage.OUTPUT_DECLARATION__TRIGGER:
				setTrigger((OutputTrigger)null);
				return;
			case LibraryPackage.OUTPUT_DECLARATION__RANGE:
				setRange(RANGE_EDEFAULT);
				return;
			case LibraryPackage.OUTPUT_DECLARATION__TYPE:
				setType((DataTypeA)null);
				return;
			case LibraryPackage.OUTPUT_DECLARATION__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case LibraryPackage.OUTPUT_DECLARATION__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case LibraryPackage.OUTPUT_DECLARATION__FAULT_PROPAGATIONS:
				getFaultPropagations().clear();
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
			case LibraryPackage.OUTPUT_DECLARATION__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
			case LibraryPackage.OUTPUT_DECLARATION__POSTCONDITION:
				return POSTCONDITION_EDEFAULT == null ? postcondition != null : !POSTCONDITION_EDEFAULT.equals(postcondition);
			case LibraryPackage.OUTPUT_DECLARATION__TRIGGER:
				return trigger != null;
			case LibraryPackage.OUTPUT_DECLARATION__RANGE:
				return RANGE_EDEFAULT == null ? range != null : !RANGE_EDEFAULT.equals(range);
			case LibraryPackage.OUTPUT_DECLARATION__TYPE:
				return type != null;
			case LibraryPackage.OUTPUT_DECLARATION__LOWER_BOUND:
				return lowerBound != LOWER_BOUND_EDEFAULT;
			case LibraryPackage.OUTPUT_DECLARATION__UPPER_BOUND:
				return upperBound != UPPER_BOUND_EDEFAULT;
			case LibraryPackage.OUTPUT_DECLARATION__FAULT_PROPAGATIONS:
				return faultPropagations != null && !faultPropagations.isEmpty();
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
		result.append(" (unit: ");
		result.append(unit);
		result.append(", postcondition: ");
		result.append(postcondition);
		result.append(", range: ");
		result.append(range);
		result.append(", lowerBound: ");
		result.append(lowerBound);
		result.append(", upperBound: ");
		result.append(upperBound);
		result.append(')');
		return result.toString();
	}

} //OutputDeclarationImpl
