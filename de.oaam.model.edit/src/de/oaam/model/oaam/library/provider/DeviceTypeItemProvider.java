/**
 */
package de.oaam.model.oaam.library.provider;


import de.oaam.model.oaam.common.CommonFactory;
import de.oaam.model.oaam.common.CommonPackage;

import de.oaam.model.oaam.library.DeviceType;
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
 * This is the item provider adapter for a {@link de.oaam.model.oaam.library.DeviceType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DeviceTypeItemProvider extends ResourceConsumerAItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceTypeItemProvider(AdapterFactory adapterFactory) {
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

			addPossibleResourceProvisionsPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addStylePropertyDescriptor(object);
			addDocumentationPropertyDescriptor(object);
			addModifiedPropertyDescriptor(object);
			addModifierPropertyDescriptor(object);
			addTraceLinkPropertyDescriptor(object);
			addIsSubdevicePropertyDescriptor(object);
			addCanHaveSubdevicesPropertyDescriptor(object);
			addMtbfPropertyDescriptor(object);
			addWeightPropertyDescriptor(object);
			addCostPropertyDescriptor(object);
			addIsSelfManagingPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Possible Resource Provisions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPossibleResourceProvisionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceProviderA_possibleResourceProvisions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceProviderA_possibleResourceProvisions_feature", "_UI_ResourceProviderA_type"),
				 LibraryPackage.Literals.RESOURCE_PROVIDER_A__POSSIBLE_RESOURCE_PROVISIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
				 getString("_UI_ElementA_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementA_id_feature", "_UI_ElementA_type"),
				 CommonPackage.Literals.ELEMENT_A__ID,
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
				 getString("_UI_ElementA_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementA_name_feature", "_UI_ElementA_type"),
				 CommonPackage.Literals.ELEMENT_A__NAME,
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
				 getString("_UI_ElementA_style_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementA_style_feature", "_UI_ElementA_type"),
				 CommonPackage.Literals.ELEMENT_A__STYLE,
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
				 getString("_UI_ElementA_documentation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementA_documentation_feature", "_UI_ElementA_type"),
				 CommonPackage.Literals.ELEMENT_A__DOCUMENTATION,
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
				 getString("_UI_ElementA_modified_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementA_modified_feature", "_UI_ElementA_type"),
				 CommonPackage.Literals.ELEMENT_A__MODIFIED,
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
				 getString("_UI_ElementA_modifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementA_modifier_feature", "_UI_ElementA_type"),
				 CommonPackage.Literals.ELEMENT_A__MODIFIER,
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
				 getString("_UI_ElementA_traceLink_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementA_traceLink_feature", "_UI_ElementA_type"),
				 CommonPackage.Literals.ELEMENT_A__TRACE_LINK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Subdevice feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSubdevicePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviceType_isSubdevice_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviceType_isSubdevice_feature", "_UI_DeviceType_type"),
				 LibraryPackage.Literals.DEVICE_TYPE__IS_SUBDEVICE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Can Have Subdevices feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanHaveSubdevicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviceType_canHaveSubdevices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviceType_canHaveSubdevices_feature", "_UI_DeviceType_type"),
				 LibraryPackage.Literals.DEVICE_TYPE__CAN_HAVE_SUBDEVICES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mtbf feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMtbfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviceType_mtbf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviceType_mtbf_feature", "_UI_DeviceType_type"),
				 LibraryPackage.Literals.DEVICE_TYPE__MTBF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Weight feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviceType_weight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviceType_weight_feature", "_UI_DeviceType_type"),
				 LibraryPackage.Literals.DEVICE_TYPE__WEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cost feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviceType_cost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviceType_cost_feature", "_UI_DeviceType_type"),
				 LibraryPackage.Literals.DEVICE_TYPE__COST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Self Managing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSelfManagingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviceType_isSelfManaging_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviceType_isSelfManaging_feature", "_UI_DeviceType_type"),
				 LibraryPackage.Literals.DEVICE_TYPE__IS_SELF_MANAGING,
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
			childrenFeatures.add(LibraryPackage.Literals.RESOURCE_PROVIDER_A__PROVIDED_BUNDLES);
			childrenFeatures.add(LibraryPackage.Literals.RESOURCE_PROVIDER_A__PROVIDED_GROUPS);
			childrenFeatures.add(LibraryPackage.Literals.RESOURCE_PROVIDER_A__RESOURCE_LINKS);
			childrenFeatures.add(CommonPackage.Literals.ELEMENT_A__ATTRIBUTES);
			childrenFeatures.add(LibraryPackage.Literals.DEVICE_TYPE__IOS);
			childrenFeatures.add(LibraryPackage.Literals.DEVICE_TYPE__IO_GROUPS);
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
	 * This returns DeviceType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DeviceType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DeviceType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DeviceType_type") :
			getString("_UI_DeviceType_type") + " " + label;
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

		switch (notification.getFeatureID(DeviceType.class)) {
			case LibraryPackage.DEVICE_TYPE__ID:
			case LibraryPackage.DEVICE_TYPE__NAME:
			case LibraryPackage.DEVICE_TYPE__STYLE:
			case LibraryPackage.DEVICE_TYPE__DOCUMENTATION:
			case LibraryPackage.DEVICE_TYPE__MODIFIED:
			case LibraryPackage.DEVICE_TYPE__MODIFIER:
			case LibraryPackage.DEVICE_TYPE__TRACE_LINK:
			case LibraryPackage.DEVICE_TYPE__IS_SUBDEVICE:
			case LibraryPackage.DEVICE_TYPE__CAN_HAVE_SUBDEVICES:
			case LibraryPackage.DEVICE_TYPE__MTBF:
			case LibraryPackage.DEVICE_TYPE__WEIGHT:
			case LibraryPackage.DEVICE_TYPE__COST:
			case LibraryPackage.DEVICE_TYPE__IS_SELF_MANAGING:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LibraryPackage.DEVICE_TYPE__PROVIDED_BUNDLES:
			case LibraryPackage.DEVICE_TYPE__PROVIDED_GROUPS:
			case LibraryPackage.DEVICE_TYPE__RESOURCE_LINKS:
			case LibraryPackage.DEVICE_TYPE__ATTRIBUTES:
			case LibraryPackage.DEVICE_TYPE__IOS:
			case LibraryPackage.DEVICE_TYPE__IO_GROUPS:
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
				(LibraryPackage.Literals.RESOURCE_PROVIDER_A__PROVIDED_BUNDLES,
				 LibraryFactory.eINSTANCE.createResourceBundles()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.RESOURCE_PROVIDER_A__PROVIDED_GROUPS,
				 LibraryFactory.eINSTANCE.createResourceGroup()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.RESOURCE_PROVIDER_A__RESOURCE_LINKS,
				 LibraryFactory.eINSTANCE.createResourceLink()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ELEMENT_A__ATTRIBUTES,
				 CommonFactory.eINSTANCE.createAttributeString()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ELEMENT_A__ATTRIBUTES,
				 CommonFactory.eINSTANCE.createAttributeNumeric()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ELEMENT_A__ATTRIBUTES,
				 CommonFactory.eINSTANCE.createAttributeContainment()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ELEMENT_A__ATTRIBUTES,
				 CommonFactory.eINSTANCE.createAttributeReference()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.DEVICE_TYPE__IOS,
				 LibraryFactory.eINSTANCE.createIoDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.DEVICE_TYPE__IO_GROUPS,
				 LibraryFactory.eINSTANCE.createIoGroup()));
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
			childFeature == LibraryPackage.Literals.RESOURCE_CONSUMER_A__CONSUMED_GROUPS ||
			childFeature == LibraryPackage.Literals.RESOURCE_PROVIDER_A__PROVIDED_GROUPS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
