/**
 */
package de.oaam.model.oaam.library.provider;


import de.oaam.model.oaam.common.CommonFactory;

import de.oaam.model.oaam.common.provider.OaamBaseElementAItemProvider;

import de.oaam.model.oaam.library.LibraryContainerA;
import de.oaam.model.oaam.library.LibraryFactory;
import de.oaam.model.oaam.library.LibraryPackage;

import de.oaam.model.oaam.provider.OaamEditPlugin;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.oaam.model.oaam.library.LibraryContainerA} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LibraryContainerAItemProvider extends OaamBaseElementAItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryContainerAItemProvider(AdapterFactory adapterFactory) {
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

			addBusTypesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Bus Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBusTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LibraryContainerA_busTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LibraryContainerA_busTypes_feature", "_UI_LibraryContainerA_type"),
				 LibraryPackage.Literals.LIBRARY_CONTAINER_A__BUS_TYPES,
				 true,
				 false,
				 false,
				 null,
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
			childrenFeatures.add(LibraryPackage.Literals.LIBRARY_CONTAINER_A__DATA_TYPES);
			childrenFeatures.add(LibraryPackage.Literals.LIBRARY_CONTAINER_A__RESOURCE_TYPES);
			childrenFeatures.add(LibraryPackage.Literals.LIBRARY_CONTAINER_A__RESOURCE_BUNDLES);
			childrenFeatures.add(LibraryPackage.Literals.LIBRARY_CONTAINER_A__RESOURCE_MODIFIERS);
			childrenFeatures.add(LibraryPackage.Literals.LIBRARY_CONTAINER_A__RESOURCE_TYPE_DISSIMILARITIES);
			childrenFeatures.add(LibraryPackage.Literals.LIBRARY_CONTAINER_A__TASK_TYPES);
			childrenFeatures.add(LibraryPackage.Literals.LIBRARY_CONTAINER_A__TASK_TYPE_DISSIMILARITY);
			childrenFeatures.add(LibraryPackage.Literals.LIBRARY_CONTAINER_A__SIGNAL_TYPES);
			childrenFeatures.add(LibraryPackage.Literals.LIBRARY_CONTAINER_A__DEVICE_TYPES);
			childrenFeatures.add(LibraryPackage.Literals.LIBRARY_CONTAINER_A__DEVICE_TYPE_SYMMETRIES);
			childrenFeatures.add(LibraryPackage.Literals.LIBRARY_CONTAINER_A__DEVICE_TYPE_DISSIMILARITIES);
			childrenFeatures.add(LibraryPackage.Literals.LIBRARY_CONTAINER_A__CONNECTION_TYPES);
			childrenFeatures.add(LibraryPackage.Literals.LIBRARY_CONTAINER_A__WIRE_TYPES);
			childrenFeatures.add(LibraryPackage.Literals.LIBRARY_CONTAINER_A__LOCATION_TYPES);
			childrenFeatures.add(LibraryPackage.Literals.LIBRARY_CONTAINER_A__DUCT_TYPES);
			childrenFeatures.add(LibraryPackage.Literals.LIBRARY_CONTAINER_A__GENERIC_ATTRIBUTES);
			childrenFeatures.add(LibraryPackage.Literals.LIBRARY_CONTAINER_A__POWER_SOURCES);
			childrenFeatures.add(LibraryPackage.Literals.LIBRARY_CONTAINER_A__SUBLIBRARIES);
			childrenFeatures.add(LibraryPackage.Literals.LIBRARY_CONTAINER_A__IO_TYPES);
			childrenFeatures.add(LibraryPackage.Literals.LIBRARY_CONTAINER_A__HARDWARE_GROUP_TYPES);
			childrenFeatures.add(LibraryPackage.Literals.LIBRARY_CONTAINER_A__MESSAGE_TYPES);
			childrenFeatures.add(LibraryPackage.Literals.LIBRARY_CONTAINER_A__BUS_TYPES);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LibraryContainerA)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_LibraryContainerA_type") :
			getString("_UI_LibraryContainerA_type") + " " + label;
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

		switch (notification.getFeatureID(LibraryContainerA.class)) {
			case LibraryPackage.LIBRARY_CONTAINER_A__DATA_TYPES:
			case LibraryPackage.LIBRARY_CONTAINER_A__RESOURCE_TYPES:
			case LibraryPackage.LIBRARY_CONTAINER_A__RESOURCE_BUNDLES:
			case LibraryPackage.LIBRARY_CONTAINER_A__RESOURCE_MODIFIERS:
			case LibraryPackage.LIBRARY_CONTAINER_A__RESOURCE_TYPE_DISSIMILARITIES:
			case LibraryPackage.LIBRARY_CONTAINER_A__TASK_TYPES:
			case LibraryPackage.LIBRARY_CONTAINER_A__TASK_TYPE_DISSIMILARITY:
			case LibraryPackage.LIBRARY_CONTAINER_A__SIGNAL_TYPES:
			case LibraryPackage.LIBRARY_CONTAINER_A__DEVICE_TYPES:
			case LibraryPackage.LIBRARY_CONTAINER_A__DEVICE_TYPE_SYMMETRIES:
			case LibraryPackage.LIBRARY_CONTAINER_A__DEVICE_TYPE_DISSIMILARITIES:
			case LibraryPackage.LIBRARY_CONTAINER_A__CONNECTION_TYPES:
			case LibraryPackage.LIBRARY_CONTAINER_A__WIRE_TYPES:
			case LibraryPackage.LIBRARY_CONTAINER_A__LOCATION_TYPES:
			case LibraryPackage.LIBRARY_CONTAINER_A__DUCT_TYPES:
			case LibraryPackage.LIBRARY_CONTAINER_A__GENERIC_ATTRIBUTES:
			case LibraryPackage.LIBRARY_CONTAINER_A__POWER_SOURCES:
			case LibraryPackage.LIBRARY_CONTAINER_A__SUBLIBRARIES:
			case LibraryPackage.LIBRARY_CONTAINER_A__IO_TYPES:
			case LibraryPackage.LIBRARY_CONTAINER_A__HARDWARE_GROUP_TYPES:
			case LibraryPackage.LIBRARY_CONTAINER_A__MESSAGE_TYPES:
			case LibraryPackage.LIBRARY_CONTAINER_A__BUS_TYPES:
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
				(LibraryPackage.Literals.LIBRARY_CONTAINER_A__DATA_TYPES,
				 CommonFactory.eINSTANCE.createInteger()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.LIBRARY_CONTAINER_A__DATA_TYPES,
				 CommonFactory.eINSTANCE.createArray()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.LIBRARY_CONTAINER_A__DATA_TYPES,
				 CommonFactory.eINSTANCE.createStruct()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.LIBRARY_CONTAINER_A__DATA_TYPES,
				 CommonFactory.eINSTANCE.createFloatingPoint()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.LIBRARY_CONTAINER_A__DATA_TYPES,
				 CommonFactory.eINSTANCE.createByte()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.LIBRARY_CONTAINER_A__DATA_TYPES,
				 CommonFactory.eINSTANCE.createCharacter()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.LIBRARY_CONTAINER_A__DATA_TYPES,
				 CommonFactory.eINSTANCE.createBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.LIBRARY_CONTAINER_A__RESOURCE_TYPES,
				 LibraryFactory.eINSTANCE.createResourceType()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.LIBRARY_CONTAINER_A__RESOURCE_BUNDLES,
				 LibraryFactory.eINSTANCE.createResourceBundle()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.LIBRARY_CONTAINER_A__RESOURCE_MODIFIERS,
				 LibraryFactory.eINSTANCE.createResourceTypeModifier()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.LIBRARY_CONTAINER_A__RESOURCE_TYPE_DISSIMILARITIES,
				 LibraryFactory.eINSTANCE.createResourceTypeDissimilarity()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.LIBRARY_CONTAINER_A__TASK_TYPES,
				 LibraryFactory.eINSTANCE.createTaskType()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.LIBRARY_CONTAINER_A__TASK_TYPE_DISSIMILARITY,
				 LibraryFactory.eINSTANCE.createTaskTypeDissimilarity()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.LIBRARY_CONTAINER_A__SIGNAL_TYPES,
				 LibraryFactory.eINSTANCE.createSignalType()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.LIBRARY_CONTAINER_A__DEVICE_TYPES,
				 LibraryFactory.eINSTANCE.createDeviceType()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.LIBRARY_CONTAINER_A__DEVICE_TYPE_SYMMETRIES,
				 LibraryFactory.eINSTANCE.createDeviceTypeSymmetry()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.LIBRARY_CONTAINER_A__DEVICE_TYPE_DISSIMILARITIES,
				 LibraryFactory.eINSTANCE.createDeviceTypeDissimilarity()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.LIBRARY_CONTAINER_A__CONNECTION_TYPES,
				 LibraryFactory.eINSTANCE.createConnectionType()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.LIBRARY_CONTAINER_A__WIRE_TYPES,
				 LibraryFactory.eINSTANCE.createWireType()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.LIBRARY_CONTAINER_A__LOCATION_TYPES,
				 LibraryFactory.eINSTANCE.createLocationType()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.LIBRARY_CONTAINER_A__DUCT_TYPES,
				 LibraryFactory.eINSTANCE.createDuctType()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.LIBRARY_CONTAINER_A__GENERIC_ATTRIBUTES,
				 LibraryFactory.eINSTANCE.createAttributeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.LIBRARY_CONTAINER_A__POWER_SOURCES,
				 LibraryFactory.eINSTANCE.createPowerSource()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.LIBRARY_CONTAINER_A__SUBLIBRARIES,
				 LibraryFactory.eINSTANCE.createSublibrary()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.LIBRARY_CONTAINER_A__IO_TYPES,
				 LibraryFactory.eINSTANCE.createIoType()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.LIBRARY_CONTAINER_A__HARDWARE_GROUP_TYPES,
				 LibraryFactory.eINSTANCE.createBusType()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.LIBRARY_CONTAINER_A__MESSAGE_TYPES,
				 LibraryFactory.eINSTANCE.createMessageType()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.LIBRARY_CONTAINER_A__BUS_TYPES,
				 LibraryFactory.eINSTANCE.createBusType()));
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
			childFeature == LibraryPackage.Literals.LIBRARY_CONTAINER_A__HARDWARE_GROUP_TYPES ||
			childFeature == LibraryPackage.Literals.LIBRARY_CONTAINER_A__BUS_TYPES;

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
