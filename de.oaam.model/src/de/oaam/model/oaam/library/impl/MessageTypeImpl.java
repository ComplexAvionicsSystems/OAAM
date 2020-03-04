/**
 */
package de.oaam.model.oaam.library.impl;

import de.oaam.model.oaam.common.DataTypeA;

import de.oaam.model.oaam.common.impl.OaamBaseElementAImpl;

import de.oaam.model.oaam.library.LibraryPackage;
import de.oaam.model.oaam.library.MessageType;
import de.oaam.model.oaam.library.Resource;
import de.oaam.model.oaam.library.ResourceBundle;
import de.oaam.model.oaam.library.ResourceConsumerA;
import de.oaam.model.oaam.library.ResourceGroup;
import de.oaam.model.oaam.library.ResourceLink;
import de.oaam.model.oaam.library.ResourceProviderA;
import de.oaam.model.oaam.library.ResourceType;

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
 * An implementation of the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.impl.MessageTypeImpl#getRequiredResources <em>Required Resources</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.MessageTypeImpl#getConsumedGroups <em>Consumed Groups</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.MessageTypeImpl#getProvidedBundles <em>Provided Bundles</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.MessageTypeImpl#getPossibleResourceProvisions <em>Possible Resource Provisions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.MessageTypeImpl#getProvidedGroups <em>Provided Groups</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.MessageTypeImpl#getResourceLinks <em>Resource Links</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.MessageTypeImpl#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.MessageTypeImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.MessageTypeImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.MessageTypeImpl#getHeaderDefinition <em>Header Definition</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.impl.MessageTypeImpl#getTrailerDefinition <em>Trailer Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageTypeImpl extends OaamBaseElementAImpl implements MessageType {
	/**
	 * The cached value of the '{@link #getRequiredResources() <em>Required Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> requiredResources;

	/**
	 * The cached value of the '{@link #getConsumedGroups() <em>Consumed Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumedGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceGroup> consumedGroups;

	/**
	 * The cached value of the '{@link #getProvidedBundles() <em>Provided Bundles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedBundles()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceBundle> providedBundles;

	/**
	 * The cached value of the '{@link #getPossibleResourceProvisions() <em>Possible Resource Provisions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleResourceProvisions()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceType> possibleResourceProvisions;

	/**
	 * The cached value of the '{@link #getProvidedGroups() <em>Provided Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceGroup> providedGroups;

	/**
	 * The cached value of the '{@link #getResourceLinks() <em>Resource Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceLink> resourceLinks;

	/**
	 * The default value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected int minLength = MIN_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_LENGTH_EDEFAULT = 8;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected int maxLength = MAX_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final int ALIGNMENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected int alignment = ALIGNMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHeaderDefinition() <em>Header Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderDefinition()
	 * @generated
	 * @ordered
	 */
	protected DataTypeA headerDefinition;

	/**
	 * The cached value of the '{@link #getTrailerDefinition() <em>Trailer Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrailerDefinition()
	 * @generated
	 * @ordered
	 */
	protected DataTypeA trailerDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.MESSAGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getRequiredResources() {
		if (requiredResources == null) {
			requiredResources = new EObjectContainmentEList<Resource>(Resource.class, this, LibraryPackage.MESSAGE_TYPE__REQUIRED_RESOURCES);
		}
		return requiredResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceGroup> getConsumedGroups() {
		if (consumedGroups == null) {
			consumedGroups = new EObjectContainmentEList<ResourceGroup>(ResourceGroup.class, this, LibraryPackage.MESSAGE_TYPE__CONSUMED_GROUPS);
		}
		return consumedGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceBundle> getProvidedBundles() {
		if (providedBundles == null) {
			providedBundles = new EObjectContainmentEList<ResourceBundle>(ResourceBundle.class, this, LibraryPackage.MESSAGE_TYPE__PROVIDED_BUNDLES);
		}
		return providedBundles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceType> getPossibleResourceProvisions() {
		if (possibleResourceProvisions == null) {
			possibleResourceProvisions = new EObjectResolvingEList<ResourceType>(ResourceType.class, this, LibraryPackage.MESSAGE_TYPE__POSSIBLE_RESOURCE_PROVISIONS);
		}
		return possibleResourceProvisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceGroup> getProvidedGroups() {
		if (providedGroups == null) {
			providedGroups = new EObjectContainmentEList<ResourceGroup>(ResourceGroup.class, this, LibraryPackage.MESSAGE_TYPE__PROVIDED_GROUPS);
		}
		return providedGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceLink> getResourceLinks() {
		if (resourceLinks == null) {
			resourceLinks = new EObjectContainmentEList<ResourceLink>(ResourceLink.class, this, LibraryPackage.MESSAGE_TYPE__RESOURCE_LINKS);
		}
		return resourceLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinLength() {
		return minLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinLength(int newMinLength) {
		int oldMinLength = minLength;
		minLength = newMinLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.MESSAGE_TYPE__MIN_LENGTH, oldMinLength, minLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLength(int newMaxLength) {
		int oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.MESSAGE_TYPE__MAX_LENGTH, oldMaxLength, maxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignment(int newAlignment) {
		int oldAlignment = alignment;
		alignment = newAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.MESSAGE_TYPE__ALIGNMENT, oldAlignment, alignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeA getHeaderDefinition() {
		return headerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeaderDefinition(DataTypeA newHeaderDefinition, NotificationChain msgs) {
		DataTypeA oldHeaderDefinition = headerDefinition;
		headerDefinition = newHeaderDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LibraryPackage.MESSAGE_TYPE__HEADER_DEFINITION, oldHeaderDefinition, newHeaderDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderDefinition(DataTypeA newHeaderDefinition) {
		if (newHeaderDefinition != headerDefinition) {
			NotificationChain msgs = null;
			if (headerDefinition != null)
				msgs = ((InternalEObject)headerDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LibraryPackage.MESSAGE_TYPE__HEADER_DEFINITION, null, msgs);
			if (newHeaderDefinition != null)
				msgs = ((InternalEObject)newHeaderDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LibraryPackage.MESSAGE_TYPE__HEADER_DEFINITION, null, msgs);
			msgs = basicSetHeaderDefinition(newHeaderDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.MESSAGE_TYPE__HEADER_DEFINITION, newHeaderDefinition, newHeaderDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeA getTrailerDefinition() {
		return trailerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrailerDefinition(DataTypeA newTrailerDefinition, NotificationChain msgs) {
		DataTypeA oldTrailerDefinition = trailerDefinition;
		trailerDefinition = newTrailerDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LibraryPackage.MESSAGE_TYPE__TRAILER_DEFINITION, oldTrailerDefinition, newTrailerDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrailerDefinition(DataTypeA newTrailerDefinition) {
		if (newTrailerDefinition != trailerDefinition) {
			NotificationChain msgs = null;
			if (trailerDefinition != null)
				msgs = ((InternalEObject)trailerDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LibraryPackage.MESSAGE_TYPE__TRAILER_DEFINITION, null, msgs);
			if (newTrailerDefinition != null)
				msgs = ((InternalEObject)newTrailerDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LibraryPackage.MESSAGE_TYPE__TRAILER_DEFINITION, null, msgs);
			msgs = basicSetTrailerDefinition(newTrailerDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.MESSAGE_TYPE__TRAILER_DEFINITION, newTrailerDefinition, newTrailerDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.MESSAGE_TYPE__REQUIRED_RESOURCES:
				return ((InternalEList<?>)getRequiredResources()).basicRemove(otherEnd, msgs);
			case LibraryPackage.MESSAGE_TYPE__CONSUMED_GROUPS:
				return ((InternalEList<?>)getConsumedGroups()).basicRemove(otherEnd, msgs);
			case LibraryPackage.MESSAGE_TYPE__PROVIDED_BUNDLES:
				return ((InternalEList<?>)getProvidedBundles()).basicRemove(otherEnd, msgs);
			case LibraryPackage.MESSAGE_TYPE__PROVIDED_GROUPS:
				return ((InternalEList<?>)getProvidedGroups()).basicRemove(otherEnd, msgs);
			case LibraryPackage.MESSAGE_TYPE__RESOURCE_LINKS:
				return ((InternalEList<?>)getResourceLinks()).basicRemove(otherEnd, msgs);
			case LibraryPackage.MESSAGE_TYPE__HEADER_DEFINITION:
				return basicSetHeaderDefinition(null, msgs);
			case LibraryPackage.MESSAGE_TYPE__TRAILER_DEFINITION:
				return basicSetTrailerDefinition(null, msgs);
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
			case LibraryPackage.MESSAGE_TYPE__REQUIRED_RESOURCES:
				return getRequiredResources();
			case LibraryPackage.MESSAGE_TYPE__CONSUMED_GROUPS:
				return getConsumedGroups();
			case LibraryPackage.MESSAGE_TYPE__PROVIDED_BUNDLES:
				return getProvidedBundles();
			case LibraryPackage.MESSAGE_TYPE__POSSIBLE_RESOURCE_PROVISIONS:
				return getPossibleResourceProvisions();
			case LibraryPackage.MESSAGE_TYPE__PROVIDED_GROUPS:
				return getProvidedGroups();
			case LibraryPackage.MESSAGE_TYPE__RESOURCE_LINKS:
				return getResourceLinks();
			case LibraryPackage.MESSAGE_TYPE__MIN_LENGTH:
				return getMinLength();
			case LibraryPackage.MESSAGE_TYPE__MAX_LENGTH:
				return getMaxLength();
			case LibraryPackage.MESSAGE_TYPE__ALIGNMENT:
				return getAlignment();
			case LibraryPackage.MESSAGE_TYPE__HEADER_DEFINITION:
				return getHeaderDefinition();
			case LibraryPackage.MESSAGE_TYPE__TRAILER_DEFINITION:
				return getTrailerDefinition();
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
			case LibraryPackage.MESSAGE_TYPE__REQUIRED_RESOURCES:
				getRequiredResources().clear();
				getRequiredResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case LibraryPackage.MESSAGE_TYPE__CONSUMED_GROUPS:
				getConsumedGroups().clear();
				getConsumedGroups().addAll((Collection<? extends ResourceGroup>)newValue);
				return;
			case LibraryPackage.MESSAGE_TYPE__PROVIDED_BUNDLES:
				getProvidedBundles().clear();
				getProvidedBundles().addAll((Collection<? extends ResourceBundle>)newValue);
				return;
			case LibraryPackage.MESSAGE_TYPE__POSSIBLE_RESOURCE_PROVISIONS:
				getPossibleResourceProvisions().clear();
				getPossibleResourceProvisions().addAll((Collection<? extends ResourceType>)newValue);
				return;
			case LibraryPackage.MESSAGE_TYPE__PROVIDED_GROUPS:
				getProvidedGroups().clear();
				getProvidedGroups().addAll((Collection<? extends ResourceGroup>)newValue);
				return;
			case LibraryPackage.MESSAGE_TYPE__RESOURCE_LINKS:
				getResourceLinks().clear();
				getResourceLinks().addAll((Collection<? extends ResourceLink>)newValue);
				return;
			case LibraryPackage.MESSAGE_TYPE__MIN_LENGTH:
				setMinLength((Integer)newValue);
				return;
			case LibraryPackage.MESSAGE_TYPE__MAX_LENGTH:
				setMaxLength((Integer)newValue);
				return;
			case LibraryPackage.MESSAGE_TYPE__ALIGNMENT:
				setAlignment((Integer)newValue);
				return;
			case LibraryPackage.MESSAGE_TYPE__HEADER_DEFINITION:
				setHeaderDefinition((DataTypeA)newValue);
				return;
			case LibraryPackage.MESSAGE_TYPE__TRAILER_DEFINITION:
				setTrailerDefinition((DataTypeA)newValue);
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
			case LibraryPackage.MESSAGE_TYPE__REQUIRED_RESOURCES:
				getRequiredResources().clear();
				return;
			case LibraryPackage.MESSAGE_TYPE__CONSUMED_GROUPS:
				getConsumedGroups().clear();
				return;
			case LibraryPackage.MESSAGE_TYPE__PROVIDED_BUNDLES:
				getProvidedBundles().clear();
				return;
			case LibraryPackage.MESSAGE_TYPE__POSSIBLE_RESOURCE_PROVISIONS:
				getPossibleResourceProvisions().clear();
				return;
			case LibraryPackage.MESSAGE_TYPE__PROVIDED_GROUPS:
				getProvidedGroups().clear();
				return;
			case LibraryPackage.MESSAGE_TYPE__RESOURCE_LINKS:
				getResourceLinks().clear();
				return;
			case LibraryPackage.MESSAGE_TYPE__MIN_LENGTH:
				setMinLength(MIN_LENGTH_EDEFAULT);
				return;
			case LibraryPackage.MESSAGE_TYPE__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case LibraryPackage.MESSAGE_TYPE__ALIGNMENT:
				setAlignment(ALIGNMENT_EDEFAULT);
				return;
			case LibraryPackage.MESSAGE_TYPE__HEADER_DEFINITION:
				setHeaderDefinition((DataTypeA)null);
				return;
			case LibraryPackage.MESSAGE_TYPE__TRAILER_DEFINITION:
				setTrailerDefinition((DataTypeA)null);
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
			case LibraryPackage.MESSAGE_TYPE__REQUIRED_RESOURCES:
				return requiredResources != null && !requiredResources.isEmpty();
			case LibraryPackage.MESSAGE_TYPE__CONSUMED_GROUPS:
				return consumedGroups != null && !consumedGroups.isEmpty();
			case LibraryPackage.MESSAGE_TYPE__PROVIDED_BUNDLES:
				return providedBundles != null && !providedBundles.isEmpty();
			case LibraryPackage.MESSAGE_TYPE__POSSIBLE_RESOURCE_PROVISIONS:
				return possibleResourceProvisions != null && !possibleResourceProvisions.isEmpty();
			case LibraryPackage.MESSAGE_TYPE__PROVIDED_GROUPS:
				return providedGroups != null && !providedGroups.isEmpty();
			case LibraryPackage.MESSAGE_TYPE__RESOURCE_LINKS:
				return resourceLinks != null && !resourceLinks.isEmpty();
			case LibraryPackage.MESSAGE_TYPE__MIN_LENGTH:
				return minLength != MIN_LENGTH_EDEFAULT;
			case LibraryPackage.MESSAGE_TYPE__MAX_LENGTH:
				return maxLength != MAX_LENGTH_EDEFAULT;
			case LibraryPackage.MESSAGE_TYPE__ALIGNMENT:
				return alignment != ALIGNMENT_EDEFAULT;
			case LibraryPackage.MESSAGE_TYPE__HEADER_DEFINITION:
				return headerDefinition != null;
			case LibraryPackage.MESSAGE_TYPE__TRAILER_DEFINITION:
				return trailerDefinition != null;
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
		if (baseClass == ResourceConsumerA.class) {
			switch (derivedFeatureID) {
				case LibraryPackage.MESSAGE_TYPE__REQUIRED_RESOURCES: return LibraryPackage.RESOURCE_CONSUMER_A__REQUIRED_RESOURCES;
				case LibraryPackage.MESSAGE_TYPE__CONSUMED_GROUPS: return LibraryPackage.RESOURCE_CONSUMER_A__CONSUMED_GROUPS;
				default: return -1;
			}
		}
		if (baseClass == ResourceProviderA.class) {
			switch (derivedFeatureID) {
				case LibraryPackage.MESSAGE_TYPE__PROVIDED_BUNDLES: return LibraryPackage.RESOURCE_PROVIDER_A__PROVIDED_BUNDLES;
				case LibraryPackage.MESSAGE_TYPE__POSSIBLE_RESOURCE_PROVISIONS: return LibraryPackage.RESOURCE_PROVIDER_A__POSSIBLE_RESOURCE_PROVISIONS;
				case LibraryPackage.MESSAGE_TYPE__PROVIDED_GROUPS: return LibraryPackage.RESOURCE_PROVIDER_A__PROVIDED_GROUPS;
				case LibraryPackage.MESSAGE_TYPE__RESOURCE_LINKS: return LibraryPackage.RESOURCE_PROVIDER_A__RESOURCE_LINKS;
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
		if (baseClass == ResourceConsumerA.class) {
			switch (baseFeatureID) {
				case LibraryPackage.RESOURCE_CONSUMER_A__REQUIRED_RESOURCES: return LibraryPackage.MESSAGE_TYPE__REQUIRED_RESOURCES;
				case LibraryPackage.RESOURCE_CONSUMER_A__CONSUMED_GROUPS: return LibraryPackage.MESSAGE_TYPE__CONSUMED_GROUPS;
				default: return -1;
			}
		}
		if (baseClass == ResourceProviderA.class) {
			switch (baseFeatureID) {
				case LibraryPackage.RESOURCE_PROVIDER_A__PROVIDED_BUNDLES: return LibraryPackage.MESSAGE_TYPE__PROVIDED_BUNDLES;
				case LibraryPackage.RESOURCE_PROVIDER_A__POSSIBLE_RESOURCE_PROVISIONS: return LibraryPackage.MESSAGE_TYPE__POSSIBLE_RESOURCE_PROVISIONS;
				case LibraryPackage.RESOURCE_PROVIDER_A__PROVIDED_GROUPS: return LibraryPackage.MESSAGE_TYPE__PROVIDED_GROUPS;
				case LibraryPackage.RESOURCE_PROVIDER_A__RESOURCE_LINKS: return LibraryPackage.MESSAGE_TYPE__RESOURCE_LINKS;
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
		result.append(" (minLength: ");
		result.append(minLength);
		result.append(", maxLength: ");
		result.append(maxLength);
		result.append(", alignment: ");
		result.append(alignment);
		result.append(')');
		return result.toString();
	}

} //MessageTypeImpl
