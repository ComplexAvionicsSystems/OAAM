/**
 */
package de.oaam.model.oaam.impl;

import de.oaam.model.oaam.Architecture;
import de.oaam.model.oaam.OaamPackage;

import de.oaam.model.oaam.anatomy.Anatomy;

import de.oaam.model.oaam.capabilities.Capabilities;

import de.oaam.model.oaam.common.impl.ElementAImpl;
import de.oaam.model.oaam.functions.Functions;

import de.oaam.model.oaam.hardware.Hardware;

import de.oaam.model.oaam.library.Library;

import de.oaam.model.oaam.mapping.Mapping;

import de.oaam.model.oaam.restrictions.Restrictions;

import de.oaam.model.oaam.scenario.Scenario;

import de.oaam.model.oaam.systems.Systems;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.impl.ArchitectureImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link de.oaam.model.oaam.impl.ArchitectureImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link de.oaam.model.oaam.impl.ArchitectureImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link de.oaam.model.oaam.impl.ArchitectureImpl#getSystems <em>Systems</em>}</li>
 *   <li>{@link de.oaam.model.oaam.impl.ArchitectureImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link de.oaam.model.oaam.impl.ArchitectureImpl#getHardware <em>Hardware</em>}</li>
 *   <li>{@link de.oaam.model.oaam.impl.ArchitectureImpl#getAnatomy <em>Anatomy</em>}</li>
 *   <li>{@link de.oaam.model.oaam.impl.ArchitectureImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link de.oaam.model.oaam.impl.ArchitectureImpl#getRestrictions <em>Restrictions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.impl.ArchitectureImpl#getMapping <em>Mapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchitectureImpl extends ElementAImpl implements Architecture {
	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<Architecture> include;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected Library library;

	/**
	 * The cached value of the '{@link #getScenario() <em>Scenario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario()
	 * @generated
	 * @ordered
	 */
	protected Scenario scenario;

	/**
	 * The cached value of the '{@link #getSystems() <em>Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystems()
	 * @generated
	 * @ordered
	 */
	protected Systems systems;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected Functions function;

	/**
	 * The cached value of the '{@link #getHardware() <em>Hardware</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardware()
	 * @generated
	 * @ordered
	 */
	protected Hardware hardware;

	/**
	 * The cached value of the '{@link #getAnatomy() <em>Anatomy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnatomy()
	 * @generated
	 * @ordered
	 */
	protected Anatomy anatomy;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected Capabilities capabilities;

	/**
	 * The cached value of the '{@link #getRestrictions() <em>Restrictions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictions()
	 * @generated
	 * @ordered
	 */
	protected Restrictions restrictions;

	/**
	 * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected Mapping mapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OaamPackage.Literals.ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Architecture> getInclude() {
		if (include == null) {
			include = new EObjectResolvingEList<Architecture>(Architecture.class, this, OaamPackage.ARCHITECTURE__INCLUDE);
		}
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library getLibrary() {
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibrary(Library newLibrary, NotificationChain msgs) {
		Library oldLibrary = library;
		library = newLibrary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OaamPackage.ARCHITECTURE__LIBRARY, oldLibrary, newLibrary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibrary(Library newLibrary) {
		if (newLibrary != library) {
			NotificationChain msgs = null;
			if (library != null)
				msgs = ((InternalEObject)library).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OaamPackage.ARCHITECTURE__LIBRARY, null, msgs);
			if (newLibrary != null)
				msgs = ((InternalEObject)newLibrary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OaamPackage.ARCHITECTURE__LIBRARY, null, msgs);
			msgs = basicSetLibrary(newLibrary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaamPackage.ARCHITECTURE__LIBRARY, newLibrary, newLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario getScenario() {
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScenario(Scenario newScenario, NotificationChain msgs) {
		Scenario oldScenario = scenario;
		scenario = newScenario;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OaamPackage.ARCHITECTURE__SCENARIO, oldScenario, newScenario);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenario(Scenario newScenario) {
		if (newScenario != scenario) {
			NotificationChain msgs = null;
			if (scenario != null)
				msgs = ((InternalEObject)scenario).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OaamPackage.ARCHITECTURE__SCENARIO, null, msgs);
			if (newScenario != null)
				msgs = ((InternalEObject)newScenario).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OaamPackage.ARCHITECTURE__SCENARIO, null, msgs);
			msgs = basicSetScenario(newScenario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaamPackage.ARCHITECTURE__SCENARIO, newScenario, newScenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Systems getSystems() {
		return systems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystems(Systems newSystems, NotificationChain msgs) {
		Systems oldSystems = systems;
		systems = newSystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OaamPackage.ARCHITECTURE__SYSTEMS, oldSystems, newSystems);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystems(Systems newSystems) {
		if (newSystems != systems) {
			NotificationChain msgs = null;
			if (systems != null)
				msgs = ((InternalEObject)systems).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OaamPackage.ARCHITECTURE__SYSTEMS, null, msgs);
			if (newSystems != null)
				msgs = ((InternalEObject)newSystems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OaamPackage.ARCHITECTURE__SYSTEMS, null, msgs);
			msgs = basicSetSystems(newSystems, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaamPackage.ARCHITECTURE__SYSTEMS, newSystems, newSystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functions getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunction(Functions newFunction, NotificationChain msgs) {
		Functions oldFunction = function;
		function = newFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OaamPackage.ARCHITECTURE__FUNCTION, oldFunction, newFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(Functions newFunction) {
		if (newFunction != function) {
			NotificationChain msgs = null;
			if (function != null)
				msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OaamPackage.ARCHITECTURE__FUNCTION, null, msgs);
			if (newFunction != null)
				msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OaamPackage.ARCHITECTURE__FUNCTION, null, msgs);
			msgs = basicSetFunction(newFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaamPackage.ARCHITECTURE__FUNCTION, newFunction, newFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hardware getHardware() {
		return hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHardware(Hardware newHardware, NotificationChain msgs) {
		Hardware oldHardware = hardware;
		hardware = newHardware;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OaamPackage.ARCHITECTURE__HARDWARE, oldHardware, newHardware);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardware(Hardware newHardware) {
		if (newHardware != hardware) {
			NotificationChain msgs = null;
			if (hardware != null)
				msgs = ((InternalEObject)hardware).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OaamPackage.ARCHITECTURE__HARDWARE, null, msgs);
			if (newHardware != null)
				msgs = ((InternalEObject)newHardware).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OaamPackage.ARCHITECTURE__HARDWARE, null, msgs);
			msgs = basicSetHardware(newHardware, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaamPackage.ARCHITECTURE__HARDWARE, newHardware, newHardware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anatomy getAnatomy() {
		return anatomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnatomy(Anatomy newAnatomy, NotificationChain msgs) {
		Anatomy oldAnatomy = anatomy;
		anatomy = newAnatomy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OaamPackage.ARCHITECTURE__ANATOMY, oldAnatomy, newAnatomy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnatomy(Anatomy newAnatomy) {
		if (newAnatomy != anatomy) {
			NotificationChain msgs = null;
			if (anatomy != null)
				msgs = ((InternalEObject)anatomy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OaamPackage.ARCHITECTURE__ANATOMY, null, msgs);
			if (newAnatomy != null)
				msgs = ((InternalEObject)newAnatomy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OaamPackage.ARCHITECTURE__ANATOMY, null, msgs);
			msgs = basicSetAnatomy(newAnatomy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaamPackage.ARCHITECTURE__ANATOMY, newAnatomy, newAnatomy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capabilities getCapabilities() {
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapabilities(Capabilities newCapabilities, NotificationChain msgs) {
		Capabilities oldCapabilities = capabilities;
		capabilities = newCapabilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OaamPackage.ARCHITECTURE__CAPABILITIES, oldCapabilities, newCapabilities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapabilities(Capabilities newCapabilities) {
		if (newCapabilities != capabilities) {
			NotificationChain msgs = null;
			if (capabilities != null)
				msgs = ((InternalEObject)capabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OaamPackage.ARCHITECTURE__CAPABILITIES, null, msgs);
			if (newCapabilities != null)
				msgs = ((InternalEObject)newCapabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OaamPackage.ARCHITECTURE__CAPABILITIES, null, msgs);
			msgs = basicSetCapabilities(newCapabilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaamPackage.ARCHITECTURE__CAPABILITIES, newCapabilities, newCapabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Restrictions getRestrictions() {
		return restrictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestrictions(Restrictions newRestrictions, NotificationChain msgs) {
		Restrictions oldRestrictions = restrictions;
		restrictions = newRestrictions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OaamPackage.ARCHITECTURE__RESTRICTIONS, oldRestrictions, newRestrictions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestrictions(Restrictions newRestrictions) {
		if (newRestrictions != restrictions) {
			NotificationChain msgs = null;
			if (restrictions != null)
				msgs = ((InternalEObject)restrictions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OaamPackage.ARCHITECTURE__RESTRICTIONS, null, msgs);
			if (newRestrictions != null)
				msgs = ((InternalEObject)newRestrictions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OaamPackage.ARCHITECTURE__RESTRICTIONS, null, msgs);
			msgs = basicSetRestrictions(newRestrictions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaamPackage.ARCHITECTURE__RESTRICTIONS, newRestrictions, newRestrictions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping getMapping() {
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapping(Mapping newMapping, NotificationChain msgs) {
		Mapping oldMapping = mapping;
		mapping = newMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OaamPackage.ARCHITECTURE__MAPPING, oldMapping, newMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapping(Mapping newMapping) {
		if (newMapping != mapping) {
			NotificationChain msgs = null;
			if (mapping != null)
				msgs = ((InternalEObject)mapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OaamPackage.ARCHITECTURE__MAPPING, null, msgs);
			if (newMapping != null)
				msgs = ((InternalEObject)newMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OaamPackage.ARCHITECTURE__MAPPING, null, msgs);
			msgs = basicSetMapping(newMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaamPackage.ARCHITECTURE__MAPPING, newMapping, newMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OaamPackage.ARCHITECTURE__LIBRARY:
				return basicSetLibrary(null, msgs);
			case OaamPackage.ARCHITECTURE__SCENARIO:
				return basicSetScenario(null, msgs);
			case OaamPackage.ARCHITECTURE__SYSTEMS:
				return basicSetSystems(null, msgs);
			case OaamPackage.ARCHITECTURE__FUNCTION:
				return basicSetFunction(null, msgs);
			case OaamPackage.ARCHITECTURE__HARDWARE:
				return basicSetHardware(null, msgs);
			case OaamPackage.ARCHITECTURE__ANATOMY:
				return basicSetAnatomy(null, msgs);
			case OaamPackage.ARCHITECTURE__CAPABILITIES:
				return basicSetCapabilities(null, msgs);
			case OaamPackage.ARCHITECTURE__RESTRICTIONS:
				return basicSetRestrictions(null, msgs);
			case OaamPackage.ARCHITECTURE__MAPPING:
				return basicSetMapping(null, msgs);
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
			case OaamPackage.ARCHITECTURE__INCLUDE:
				return getInclude();
			case OaamPackage.ARCHITECTURE__LIBRARY:
				return getLibrary();
			case OaamPackage.ARCHITECTURE__SCENARIO:
				return getScenario();
			case OaamPackage.ARCHITECTURE__SYSTEMS:
				return getSystems();
			case OaamPackage.ARCHITECTURE__FUNCTION:
				return getFunction();
			case OaamPackage.ARCHITECTURE__HARDWARE:
				return getHardware();
			case OaamPackage.ARCHITECTURE__ANATOMY:
				return getAnatomy();
			case OaamPackage.ARCHITECTURE__CAPABILITIES:
				return getCapabilities();
			case OaamPackage.ARCHITECTURE__RESTRICTIONS:
				return getRestrictions();
			case OaamPackage.ARCHITECTURE__MAPPING:
				return getMapping();
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
			case OaamPackage.ARCHITECTURE__INCLUDE:
				getInclude().clear();
				getInclude().addAll((Collection<? extends Architecture>)newValue);
				return;
			case OaamPackage.ARCHITECTURE__LIBRARY:
				setLibrary((Library)newValue);
				return;
			case OaamPackage.ARCHITECTURE__SCENARIO:
				setScenario((Scenario)newValue);
				return;
			case OaamPackage.ARCHITECTURE__SYSTEMS:
				setSystems((Systems)newValue);
				return;
			case OaamPackage.ARCHITECTURE__FUNCTION:
				setFunction((Functions)newValue);
				return;
			case OaamPackage.ARCHITECTURE__HARDWARE:
				setHardware((Hardware)newValue);
				return;
			case OaamPackage.ARCHITECTURE__ANATOMY:
				setAnatomy((Anatomy)newValue);
				return;
			case OaamPackage.ARCHITECTURE__CAPABILITIES:
				setCapabilities((Capabilities)newValue);
				return;
			case OaamPackage.ARCHITECTURE__RESTRICTIONS:
				setRestrictions((Restrictions)newValue);
				return;
			case OaamPackage.ARCHITECTURE__MAPPING:
				setMapping((Mapping)newValue);
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
			case OaamPackage.ARCHITECTURE__INCLUDE:
				getInclude().clear();
				return;
			case OaamPackage.ARCHITECTURE__LIBRARY:
				setLibrary((Library)null);
				return;
			case OaamPackage.ARCHITECTURE__SCENARIO:
				setScenario((Scenario)null);
				return;
			case OaamPackage.ARCHITECTURE__SYSTEMS:
				setSystems((Systems)null);
				return;
			case OaamPackage.ARCHITECTURE__FUNCTION:
				setFunction((Functions)null);
				return;
			case OaamPackage.ARCHITECTURE__HARDWARE:
				setHardware((Hardware)null);
				return;
			case OaamPackage.ARCHITECTURE__ANATOMY:
				setAnatomy((Anatomy)null);
				return;
			case OaamPackage.ARCHITECTURE__CAPABILITIES:
				setCapabilities((Capabilities)null);
				return;
			case OaamPackage.ARCHITECTURE__RESTRICTIONS:
				setRestrictions((Restrictions)null);
				return;
			case OaamPackage.ARCHITECTURE__MAPPING:
				setMapping((Mapping)null);
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
			case OaamPackage.ARCHITECTURE__INCLUDE:
				return include != null && !include.isEmpty();
			case OaamPackage.ARCHITECTURE__LIBRARY:
				return library != null;
			case OaamPackage.ARCHITECTURE__SCENARIO:
				return scenario != null;
			case OaamPackage.ARCHITECTURE__SYSTEMS:
				return systems != null;
			case OaamPackage.ARCHITECTURE__FUNCTION:
				return function != null;
			case OaamPackage.ARCHITECTURE__HARDWARE:
				return hardware != null;
			case OaamPackage.ARCHITECTURE__ANATOMY:
				return anatomy != null;
			case OaamPackage.ARCHITECTURE__CAPABILITIES:
				return capabilities != null;
			case OaamPackage.ARCHITECTURE__RESTRICTIONS:
				return restrictions != null;
			case OaamPackage.ARCHITECTURE__MAPPING:
				return mapping != null;
		}
		return super.eIsSet(featureID);
	}

} //ArchitectureImpl
