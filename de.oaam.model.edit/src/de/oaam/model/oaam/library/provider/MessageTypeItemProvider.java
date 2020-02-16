/**
 */
package de.oaam.model.oaam.library.provider;


import de.oaam.model.oaam.common.CommonFactory;

import de.oaam.model.oaam.common.provider.OaamBaseElementAItemProvider;

import de.oaam.model.oaam.library.LibraryFactory;
import de.oaam.model.oaam.library.LibraryPackage;
import de.oaam.model.oaam.library.MessageType;

import de.oaam.model.oaam.provider.OaamEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.oaam.model.oaam.library.MessageType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MessageTypeItemProvider extends OaamBaseElementAItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTypeItemProvider(AdapterFactory adapterFactory) {
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
			addMinLengthPropertyDescriptor(object);
			addMaxLengthPropertyDescriptor(object);
			addAllignmentPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Min Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MessageType_minLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MessageType_minLength_feature", "_UI_MessageType_type"),
				 LibraryPackage.Literals.MESSAGE_TYPE__MIN_LENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
				 getString("_UI_MessageType_maxLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MessageType_maxLength_feature", "_UI_MessageType_type"),
				 LibraryPackage.Literals.MESSAGE_TYPE__MAX_LENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allignment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllignmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MessageType_allignment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MessageType_allignment_feature", "_UI_MessageType_type"),
				 LibraryPackage.Literals.MESSAGE_TYPE__ALLIGNMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(LibraryPackage.Literals.RESOURCE_PROVIDER_A__PROVIDED_BUNDLES);
			childrenFeatures.add(LibraryPackage.Literals.RESOURCE_PROVIDER_A__PROVIDED_GROUPS);
			childrenFeatures.add(LibraryPackage.Literals.RESOURCE_PROVIDER_A__RESOURCE_LINKS);
			childrenFeatures.add(LibraryPackage.Literals.MESSAGE_TYPE__HEADER_DEFINITION);
			childrenFeatures.add(LibraryPackage.Literals.MESSAGE_TYPE__TRAILER_DEFINITION);
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
	 * This returns MessageType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MessageType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MessageType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MessageType_type") :
			getString("_UI_MessageType_type") + " " + label;
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

		switch (notification.getFeatureID(MessageType.class)) {
			case LibraryPackage.MESSAGE_TYPE__MIN_LENGTH:
			case LibraryPackage.MESSAGE_TYPE__MAX_LENGTH:
			case LibraryPackage.MESSAGE_TYPE__ALLIGNMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LibraryPackage.MESSAGE_TYPE__REQUIRED_RESOURCES:
			case LibraryPackage.MESSAGE_TYPE__CONSUMED_GROUPS:
			case LibraryPackage.MESSAGE_TYPE__PROVIDED_BUNDLES:
			case LibraryPackage.MESSAGE_TYPE__PROVIDED_GROUPS:
			case LibraryPackage.MESSAGE_TYPE__RESOURCE_LINKS:
			case LibraryPackage.MESSAGE_TYPE__HEADER_DEFINITION:
			case LibraryPackage.MESSAGE_TYPE__TRAILER_DEFINITION:
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
				(LibraryPackage.Literals.RESOURCE_PROVIDER_A__PROVIDED_BUNDLES,
				 LibraryFactory.eINSTANCE.createResourceBundle()));

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
				(LibraryPackage.Literals.MESSAGE_TYPE__HEADER_DEFINITION,
				 CommonFactory.eINSTANCE.createInteger()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.MESSAGE_TYPE__HEADER_DEFINITION,
				 CommonFactory.eINSTANCE.createArray()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.MESSAGE_TYPE__HEADER_DEFINITION,
				 CommonFactory.eINSTANCE.createStruct()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.MESSAGE_TYPE__HEADER_DEFINITION,
				 CommonFactory.eINSTANCE.createFloatingPoint()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.MESSAGE_TYPE__HEADER_DEFINITION,
				 CommonFactory.eINSTANCE.createByte()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.MESSAGE_TYPE__HEADER_DEFINITION,
				 CommonFactory.eINSTANCE.createCharacter()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.MESSAGE_TYPE__HEADER_DEFINITION,
				 CommonFactory.eINSTANCE.createBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.MESSAGE_TYPE__TRAILER_DEFINITION,
				 CommonFactory.eINSTANCE.createInteger()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.MESSAGE_TYPE__TRAILER_DEFINITION,
				 CommonFactory.eINSTANCE.createArray()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.MESSAGE_TYPE__TRAILER_DEFINITION,
				 CommonFactory.eINSTANCE.createStruct()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.MESSAGE_TYPE__TRAILER_DEFINITION,
				 CommonFactory.eINSTANCE.createFloatingPoint()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.MESSAGE_TYPE__TRAILER_DEFINITION,
				 CommonFactory.eINSTANCE.createByte()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.MESSAGE_TYPE__TRAILER_DEFINITION,
				 CommonFactory.eINSTANCE.createCharacter()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.MESSAGE_TYPE__TRAILER_DEFINITION,
				 CommonFactory.eINSTANCE.createBoolean()));
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
			childFeature == LibraryPackage.Literals.RESOURCE_PROVIDER_A__PROVIDED_GROUPS ||
			childFeature == LibraryPackage.Literals.MESSAGE_TYPE__HEADER_DEFINITION ||
			childFeature == LibraryPackage.Literals.MESSAGE_TYPE__TRAILER_DEFINITION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return OaamEditPlugin.INSTANCE;
	}

}
