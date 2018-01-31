/**
 */
package de.oaam.model.oaam.anatomy.impl;

import de.oaam.model.oaam.anatomy.AnatomyPackage;
import de.oaam.model.oaam.anatomy.Duct;
import de.oaam.model.oaam.anatomy.DuctOpening;

import de.oaam.model.oaam.common.AttributeA;
import de.oaam.model.oaam.common.CommonPackage;
import de.oaam.model.oaam.common.ElementA;
import de.oaam.model.oaam.library.DuctType;

import de.oaam.model.oaam.library.impl.ResourceProviderInstanceAImpl;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.OperationModeReference;
import de.oaam.model.oaam.scenario.ScenarioPackage;
import de.oaam.model.oaam.scenario.Variant;
import de.oaam.model.oaam.scenario.VariantDependentElementA;
import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Duct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.anatomy.impl.DuctImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.impl.DuctImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.impl.DuctImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.impl.DuctImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.impl.DuctImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.impl.DuctImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.impl.DuctImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.impl.DuctImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.impl.DuctImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.impl.DuctImpl#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.impl.DuctImpl#getLength <em>Length</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.impl.DuctImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.impl.DuctImpl#getDuctopeningA <em>Ductopening A</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.impl.DuctImpl#getDuctopeningB <em>Ductopening B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DuctImpl extends ResourceProviderInstanceAImpl implements Duct {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

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
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected Date modified = MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected String modifier = MODIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTraceLink() <em>Trace Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceLink()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACE_LINK_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTraceLink() <em>Trace Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceLink()
	 * @generated
	 * @ordered
	 */
	protected String traceLink = TRACE_LINK_EDEFAULT;

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
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final double LENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected double length = LENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DuctType type;

	/**
	 * The cached value of the '{@link #getDuctopeningA() <em>Ductopening A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuctopeningA()
	 * @generated
	 * @ordered
	 */
	protected DuctOpening ductopeningA;

	/**
	 * The cached value of the '{@link #getDuctopeningB() <em>Ductopening B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuctopeningB()
	 * @generated
	 * @ordered
	 */
	protected DuctOpening ductopeningB;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DuctImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnatomyPackage.Literals.DUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnatomyPackage.DUCT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnatomyPackage.DUCT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnatomyPackage.DUCT__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeA> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributeA>(AttributeA.class, this, AnatomyPackage.DUCT__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnatomyPackage.DUCT__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getModified() {
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModified(Date newModified) {
		Date oldModified = modified;
		modified = newModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnatomyPackage.DUCT__MODIFIED, oldModified, modified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModifier() {
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifier(String newModifier) {
		String oldModifier = modifier;
		modifier = newModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnatomyPackage.DUCT__MODIFIER, oldModifier, modifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTraceLink() {
		return traceLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceLink(String newTraceLink) {
		String oldTraceLink = traceLink;
		traceLink = newTraceLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnatomyPackage.DUCT__TRACE_LINK, oldTraceLink, traceLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variant> getVariants() {
		if (variants == null) {
			variants = new EObjectResolvingEList<Variant>(Variant.class, this, AnatomyPackage.DUCT__VARIANTS);
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
			operationModes = new EObjectContainmentEList<OperationModeReference>(OperationModeReference.class, this, AnatomyPackage.DUCT__OPERATION_MODES);
		}
		return operationModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(double newLength) {
		double oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnatomyPackage.DUCT__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DuctType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (DuctType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnatomyPackage.DUCT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DuctType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DuctType newType) {
		DuctType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnatomyPackage.DUCT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DuctOpening getDuctopeningA() {
		if (ductopeningA != null && ductopeningA.eIsProxy()) {
			InternalEObject oldDuctopeningA = (InternalEObject)ductopeningA;
			ductopeningA = (DuctOpening)eResolveProxy(oldDuctopeningA);
			if (ductopeningA != oldDuctopeningA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnatomyPackage.DUCT__DUCTOPENING_A, oldDuctopeningA, ductopeningA));
			}
		}
		return ductopeningA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DuctOpening basicGetDuctopeningA() {
		return ductopeningA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuctopeningA(DuctOpening newDuctopeningA) {
		DuctOpening oldDuctopeningA = ductopeningA;
		ductopeningA = newDuctopeningA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnatomyPackage.DUCT__DUCTOPENING_A, oldDuctopeningA, ductopeningA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DuctOpening getDuctopeningB() {
		if (ductopeningB != null && ductopeningB.eIsProxy()) {
			InternalEObject oldDuctopeningB = (InternalEObject)ductopeningB;
			ductopeningB = (DuctOpening)eResolveProxy(oldDuctopeningB);
			if (ductopeningB != oldDuctopeningB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnatomyPackage.DUCT__DUCTOPENING_B, oldDuctopeningB, ductopeningB));
			}
		}
		return ductopeningB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DuctOpening basicGetDuctopeningB() {
		return ductopeningB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuctopeningB(DuctOpening newDuctopeningB) {
		DuctOpening oldDuctopeningB = ductopeningB;
		ductopeningB = newDuctopeningB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnatomyPackage.DUCT__DUCTOPENING_B, oldDuctopeningB, ductopeningB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnatomyPackage.DUCT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case AnatomyPackage.DUCT__OPERATION_MODES:
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
			case AnatomyPackage.DUCT__ID:
				return getId();
			case AnatomyPackage.DUCT__NAME:
				return getName();
			case AnatomyPackage.DUCT__STYLE:
				return getStyle();
			case AnatomyPackage.DUCT__ATTRIBUTES:
				return getAttributes();
			case AnatomyPackage.DUCT__DOCUMENTATION:
				return getDocumentation();
			case AnatomyPackage.DUCT__MODIFIED:
				return getModified();
			case AnatomyPackage.DUCT__MODIFIER:
				return getModifier();
			case AnatomyPackage.DUCT__TRACE_LINK:
				return getTraceLink();
			case AnatomyPackage.DUCT__VARIANTS:
				return getVariants();
			case AnatomyPackage.DUCT__OPERATION_MODES:
				return getOperationModes();
			case AnatomyPackage.DUCT__LENGTH:
				return getLength();
			case AnatomyPackage.DUCT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case AnatomyPackage.DUCT__DUCTOPENING_A:
				if (resolve) return getDuctopeningA();
				return basicGetDuctopeningA();
			case AnatomyPackage.DUCT__DUCTOPENING_B:
				if (resolve) return getDuctopeningB();
				return basicGetDuctopeningB();
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
			case AnatomyPackage.DUCT__ID:
				setId((String)newValue);
				return;
			case AnatomyPackage.DUCT__NAME:
				setName((String)newValue);
				return;
			case AnatomyPackage.DUCT__STYLE:
				setStyle((String)newValue);
				return;
			case AnatomyPackage.DUCT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeA>)newValue);
				return;
			case AnatomyPackage.DUCT__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case AnatomyPackage.DUCT__MODIFIED:
				setModified((Date)newValue);
				return;
			case AnatomyPackage.DUCT__MODIFIER:
				setModifier((String)newValue);
				return;
			case AnatomyPackage.DUCT__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case AnatomyPackage.DUCT__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case AnatomyPackage.DUCT__OPERATION_MODES:
				getOperationModes().clear();
				getOperationModes().addAll((Collection<? extends OperationModeReference>)newValue);
				return;
			case AnatomyPackage.DUCT__LENGTH:
				setLength((Double)newValue);
				return;
			case AnatomyPackage.DUCT__TYPE:
				setType((DuctType)newValue);
				return;
			case AnatomyPackage.DUCT__DUCTOPENING_A:
				setDuctopeningA((DuctOpening)newValue);
				return;
			case AnatomyPackage.DUCT__DUCTOPENING_B:
				setDuctopeningB((DuctOpening)newValue);
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
			case AnatomyPackage.DUCT__ID:
				setId(ID_EDEFAULT);
				return;
			case AnatomyPackage.DUCT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AnatomyPackage.DUCT__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case AnatomyPackage.DUCT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case AnatomyPackage.DUCT__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case AnatomyPackage.DUCT__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case AnatomyPackage.DUCT__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case AnatomyPackage.DUCT__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case AnatomyPackage.DUCT__VARIANTS:
				getVariants().clear();
				return;
			case AnatomyPackage.DUCT__OPERATION_MODES:
				getOperationModes().clear();
				return;
			case AnatomyPackage.DUCT__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case AnatomyPackage.DUCT__TYPE:
				setType((DuctType)null);
				return;
			case AnatomyPackage.DUCT__DUCTOPENING_A:
				setDuctopeningA((DuctOpening)null);
				return;
			case AnatomyPackage.DUCT__DUCTOPENING_B:
				setDuctopeningB((DuctOpening)null);
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
			case AnatomyPackage.DUCT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AnatomyPackage.DUCT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AnatomyPackage.DUCT__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case AnatomyPackage.DUCT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case AnatomyPackage.DUCT__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case AnatomyPackage.DUCT__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case AnatomyPackage.DUCT__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case AnatomyPackage.DUCT__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case AnatomyPackage.DUCT__VARIANTS:
				return variants != null && !variants.isEmpty();
			case AnatomyPackage.DUCT__OPERATION_MODES:
				return operationModes != null && !operationModes.isEmpty();
			case AnatomyPackage.DUCT__LENGTH:
				return length != LENGTH_EDEFAULT;
			case AnatomyPackage.DUCT__TYPE:
				return type != null;
			case AnatomyPackage.DUCT__DUCTOPENING_A:
				return ductopeningA != null;
			case AnatomyPackage.DUCT__DUCTOPENING_B:
				return ductopeningB != null;
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
		if (baseClass == ElementA.class) {
			switch (derivedFeatureID) {
				case AnatomyPackage.DUCT__ID: return CommonPackage.ELEMENT_A__ID;
				case AnatomyPackage.DUCT__NAME: return CommonPackage.ELEMENT_A__NAME;
				case AnatomyPackage.DUCT__STYLE: return CommonPackage.ELEMENT_A__STYLE;
				case AnatomyPackage.DUCT__ATTRIBUTES: return CommonPackage.ELEMENT_A__ATTRIBUTES;
				case AnatomyPackage.DUCT__DOCUMENTATION: return CommonPackage.ELEMENT_A__DOCUMENTATION;
				case AnatomyPackage.DUCT__MODIFIED: return CommonPackage.ELEMENT_A__MODIFIED;
				case AnatomyPackage.DUCT__MODIFIER: return CommonPackage.ELEMENT_A__MODIFIER;
				case AnatomyPackage.DUCT__TRACE_LINK: return CommonPackage.ELEMENT_A__TRACE_LINK;
				default: return -1;
			}
		}
		if (baseClass == VariantDependentElementA.class) {
			switch (derivedFeatureID) {
				case AnatomyPackage.DUCT__VARIANTS: return ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (derivedFeatureID) {
				case AnatomyPackage.DUCT__OPERATION_MODES: return ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES;
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
		if (baseClass == ElementA.class) {
			switch (baseFeatureID) {
				case CommonPackage.ELEMENT_A__ID: return AnatomyPackage.DUCT__ID;
				case CommonPackage.ELEMENT_A__NAME: return AnatomyPackage.DUCT__NAME;
				case CommonPackage.ELEMENT_A__STYLE: return AnatomyPackage.DUCT__STYLE;
				case CommonPackage.ELEMENT_A__ATTRIBUTES: return AnatomyPackage.DUCT__ATTRIBUTES;
				case CommonPackage.ELEMENT_A__DOCUMENTATION: return AnatomyPackage.DUCT__DOCUMENTATION;
				case CommonPackage.ELEMENT_A__MODIFIED: return AnatomyPackage.DUCT__MODIFIED;
				case CommonPackage.ELEMENT_A__MODIFIER: return AnatomyPackage.DUCT__MODIFIER;
				case CommonPackage.ELEMENT_A__TRACE_LINK: return AnatomyPackage.DUCT__TRACE_LINK;
				default: return -1;
			}
		}
		if (baseClass == VariantDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS: return AnatomyPackage.DUCT__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES: return AnatomyPackage.DUCT__OPERATION_MODES;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", style: ");
		result.append(style);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(", modified: ");
		result.append(modified);
		result.append(", modifier: ");
		result.append(modifier);
		result.append(", traceLink: ");
		result.append(traceLink);
		result.append(", length: ");
		result.append(length);
		result.append(')');
		return result.toString();
	}

} //DuctImpl
