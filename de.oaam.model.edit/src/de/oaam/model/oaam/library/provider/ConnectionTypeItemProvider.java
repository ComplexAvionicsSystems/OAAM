/**
 */
package de.oaam.model.oaam.library.provider;


import de.oaam.model.oaam.common.CommonFactory;
import de.oaam.model.oaam.common.CommonPackage;

import de.oaam.model.oaam.library.ConnectionType;
import de.oaam.model.oaam.library.LibraryFactory;
import de.oaam.model.oaam.library.LibraryPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.oaam.model.oaam.library.ConnectionType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectionTypeItemProvider extends ResourceProviderAItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addStylePropertyDescriptor(object);
			addDocumentationPropertyDescriptor(object);
			addModifiedPropertyDescriptor(object);
			addModifierPropertyDescriptor(object);
			addTraceLinkPropertyDescriptor(object);
			addIsInformationPropertyDescriptor(object);
			addIsPowerPropertyDescriptor(object);
			addWireTypesPropertyDescriptor(object);
			addIsWirelessPropertyDescriptor(object);
			addAllowsCirclesPropertyDescriptor(object);
			addNStartingPointsPropertyDescriptor(object);
			addStartingPointResourceTypesPropertyDescriptor(object);
			addNEndPointsPropertyDescriptor(object);
			addEndPointResourceTypesPropertyDescriptor(object);
			addNJointsPropertyDescriptor(object);
			addMaxJointBranchesPropertyDescriptor(object);
			addMaxInterfaceToJointDistancePropertyDescriptor(object);
			addSwitchTypesPropertyDescriptor(object);
			addIsSwitchedPropertyDescriptor(object);
			addDirectConnectionsAllowedPropertyDescriptor(object);
			addMaxLengthPropertyDescriptor(object);
			addIsUnidirectionalPropertyDescriptor(object);
			addRequiresMasterPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OaamBaseElementA_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OaamBaseElementA_id_feature", "_UI_OaamBaseElementA_type"),
				 CommonPackage.Literals.OAAM_BASE_ELEMENT_A__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OaamBaseElementA_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OaamBaseElementA_name_feature", "_UI_OaamBaseElementA_type"),
				 CommonPackage.Literals.OAAM_BASE_ELEMENT_A__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OaamBaseElementA_style_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OaamBaseElementA_style_feature", "_UI_OaamBaseElementA_type"),
				 CommonPackage.Literals.OAAM_BASE_ELEMENT_A__STYLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Documentation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDocumentationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OaamBaseElementA_documentation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OaamBaseElementA_documentation_feature", "_UI_OaamBaseElementA_type"),
				 CommonPackage.Literals.OAAM_BASE_ELEMENT_A__DOCUMENTATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Modified feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModifiedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OaamBaseElementA_modified_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OaamBaseElementA_modified_feature", "_UI_OaamBaseElementA_type"),
				 CommonPackage.Literals.OAAM_BASE_ELEMENT_A__MODIFIED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Modifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OaamBaseElementA_modifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OaamBaseElementA_modifier_feature", "_UI_OaamBaseElementA_type"),
				 CommonPackage.Literals.OAAM_BASE_ELEMENT_A__MODIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trace Link feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTraceLinkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OaamBaseElementA_traceLink_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OaamBaseElementA_traceLink_feature", "_UI_OaamBaseElementA_type"),
				 CommonPackage.Literals.OAAM_BASE_ELEMENT_A__TRACE_LINK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Information feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsInformationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectionType_isInformation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectionType_isInformation_feature", "_UI_ConnectionType_type"),
				 LibraryPackage.Literals.CONNECTION_TYPE__IS_INFORMATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsPowerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectionType_isPower_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectionType_isPower_feature", "_UI_ConnectionType_type"),
				 LibraryPackage.Literals.CONNECTION_TYPE__IS_POWER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wire Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWireTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectionType_wireTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectionType_wireTypes_feature", "_UI_ConnectionType_type"),
				 LibraryPackage.Literals.CONNECTION_TYPE__WIRE_TYPES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Wireless feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsWirelessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectionType_isWireless_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectionType_isWireless_feature", "_UI_ConnectionType_type"),
				 LibraryPackage.Literals.CONNECTION_TYPE__IS_WIRELESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allows Circles feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowsCirclesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectionType_allowsCircles_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectionType_allowsCircles_feature", "_UI_ConnectionType_type"),
				 LibraryPackage.Literals.CONNECTION_TYPE__ALLOWS_CIRCLES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NStarting Points feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNStartingPointsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectionType_nStartingPoints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectionType_nStartingPoints_feature", "_UI_ConnectionType_type"),
				 LibraryPackage.Literals.CONNECTION_TYPE__NSTARTING_POINTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Starting Point Resource Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartingPointResourceTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectionType_startingPointResourceTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectionType_startingPointResourceTypes_feature", "_UI_ConnectionType_type"),
				 LibraryPackage.Literals.CONNECTION_TYPE__STARTING_POINT_RESOURCE_TYPES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NEnd Points feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNEndPointsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectionType_nEndPoints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectionType_nEndPoints_feature", "_UI_ConnectionType_type"),
				 LibraryPackage.Literals.CONNECTION_TYPE__NEND_POINTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the End Point Resource Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndPointResourceTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectionType_endPointResourceTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectionType_endPointResourceTypes_feature", "_UI_ConnectionType_type"),
				 LibraryPackage.Literals.CONNECTION_TYPE__END_POINT_RESOURCE_TYPES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NJoints feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNJointsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectionType_nJoints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectionType_nJoints_feature", "_UI_ConnectionType_type"),
				 LibraryPackage.Literals.CONNECTION_TYPE__NJOINTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Joint Branches feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxJointBranchesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectionType_maxJointBranches_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectionType_maxJointBranches_feature", "_UI_ConnectionType_type"),
				 LibraryPackage.Literals.CONNECTION_TYPE__MAX_JOINT_BRANCHES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Interface To Joint Distance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxInterfaceToJointDistancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectionType_maxInterfaceToJointDistance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectionType_maxInterfaceToJointDistance_feature", "_UI_ConnectionType_type"),
				 LibraryPackage.Literals.CONNECTION_TYPE__MAX_INTERFACE_TO_JOINT_DISTANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Switch Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwitchTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectionType_switchTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectionType_switchTypes_feature", "_UI_ConnectionType_type"),
				 LibraryPackage.Literals.CONNECTION_TYPE__SWITCH_TYPES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Switched feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSwitchedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectionType_isSwitched_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectionType_isSwitched_feature", "_UI_ConnectionType_type"),
				 LibraryPackage.Literals.CONNECTION_TYPE__IS_SWITCHED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Direct Connections Allowed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectConnectionsAllowedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectionType_directConnectionsAllowed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectionType_directConnectionsAllowed_feature", "_UI_ConnectionType_type"),
				 LibraryPackage.Literals.CONNECTION_TYPE__DIRECT_CONNECTIONS_ALLOWED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectionType_maxLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectionType_maxLength_feature", "_UI_ConnectionType_type"),
				 LibraryPackage.Literals.CONNECTION_TYPE__MAX_LENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Unidirectional feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsUnidirectionalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectionType_isUnidirectional_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectionType_isUnidirectional_feature", "_UI_ConnectionType_type"),
				 LibraryPackage.Literals.CONNECTION_TYPE__IS_UNIDIRECTIONAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Requires Master feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiresMasterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectionType_requiresMaster_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectionType_requiresMaster_feature", "_UI_ConnectionType_type"),
				 LibraryPackage.Literals.CONNECTION_TYPE__REQUIRES_MASTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(LibraryPackage.Literals.RESOURCE_CONSUMER_A__REQUIRED_RESOURCES);
			childrenFeatures.add(LibraryPackage.Literals.RESOURCE_CONSUMER_A__CONSUMED_GROUPS);
			childrenFeatures.add(CommonPackage.Literals.OAAM_BASE_ELEMENT_A__ATTRIBUTES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ConnectionType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConnectionType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ConnectionType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ConnectionType_type") :
			getString("_UI_ConnectionType_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ConnectionType.class)) {
			case LibraryPackage.CONNECTION_TYPE__ID:
			case LibraryPackage.CONNECTION_TYPE__NAME:
			case LibraryPackage.CONNECTION_TYPE__STYLE:
			case LibraryPackage.CONNECTION_TYPE__DOCUMENTATION:
			case LibraryPackage.CONNECTION_TYPE__MODIFIED:
			case LibraryPackage.CONNECTION_TYPE__MODIFIER:
			case LibraryPackage.CONNECTION_TYPE__TRACE_LINK:
			case LibraryPackage.CONNECTION_TYPE__IS_INFORMATION:
			case LibraryPackage.CONNECTION_TYPE__IS_POWER:
			case LibraryPackage.CONNECTION_TYPE__IS_WIRELESS:
			case LibraryPackage.CONNECTION_TYPE__ALLOWS_CIRCLES:
			case LibraryPackage.CONNECTION_TYPE__NSTARTING_POINTS:
			case LibraryPackage.CONNECTION_TYPE__NEND_POINTS:
			case LibraryPackage.CONNECTION_TYPE__NJOINTS:
			case LibraryPackage.CONNECTION_TYPE__MAX_JOINT_BRANCHES:
			case LibraryPackage.CONNECTION_TYPE__MAX_INTERFACE_TO_JOINT_DISTANCE:
			case LibraryPackage.CONNECTION_TYPE__IS_SWITCHED:
			case LibraryPackage.CONNECTION_TYPE__DIRECT_CONNECTIONS_ALLOWED:
			case LibraryPackage.CONNECTION_TYPE__MAX_LENGTH:
			case LibraryPackage.CONNECTION_TYPE__IS_UNIDIRECTIONAL:
			case LibraryPackage.CONNECTION_TYPE__REQUIRES_MASTER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LibraryPackage.CONNECTION_TYPE__REQUIRED_RESOURCES:
			case LibraryPackage.CONNECTION_TYPE__CONSUMED_GROUPS:
			case LibraryPackage.CONNECTION_TYPE__ATTRIBUTES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.RESOURCE_CONSUMER_A__REQUIRED_RESOURCES,
				 LibraryFactory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.RESOURCE_CONSUMER_A__CONSUMED_GROUPS,
				 LibraryFactory.eINSTANCE.createResourceGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.OAAM_BASE_ELEMENT_A__ATTRIBUTES,
				 CommonFactory.eINSTANCE.createAttributeString()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.OAAM_BASE_ELEMENT_A__ATTRIBUTES,
				 CommonFactory.eINSTANCE.createAttributeNumeric()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.OAAM_BASE_ELEMENT_A__ATTRIBUTES,
				 CommonFactory.eINSTANCE.createAttributeContainment()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.OAAM_BASE_ELEMENT_A__ATTRIBUTES,
				 CommonFactory.eINSTANCE.createAttributeReference()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == LibraryPackage.Literals.RESOURCE_PROVIDER_A__PROVIDED_GROUPS ||
			childFeature == LibraryPackage.Literals.RESOURCE_CONSUMER_A__CONSUMED_GROUPS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
