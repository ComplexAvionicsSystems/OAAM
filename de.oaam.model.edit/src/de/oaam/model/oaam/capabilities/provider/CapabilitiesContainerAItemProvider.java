/**
 */
package de.oaam.model.oaam.capabilities.provider;


import de.oaam.model.oaam.capabilities.CapabilitiesContainerA;
import de.oaam.model.oaam.capabilities.CapabilitiesFactory;
import de.oaam.model.oaam.capabilities.CapabilitiesPackage;

import de.oaam.model.oaam.common.provider.OaamBaseElementAItemProvider;

import de.oaam.model.oaam.provider.OaamEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.oaam.model.oaam.capabilities.CapabilitiesContainerA} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CapabilitiesContainerAItemProvider extends OaamBaseElementAItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilitiesContainerAItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(CapabilitiesPackage.Literals.CAPABILITIES_CONTAINER_A__TASK_ON_DEVICE_CAPABILITIES);
			childrenFeatures.add(CapabilitiesPackage.Literals.CAPABILITIES_CONTAINER_A__SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITIES);
			childrenFeatures.add(CapabilitiesPackage.Literals.CAPABILITIES_CONTAINER_A__DEVICE_IN_LOCATION_CAPABILITIES);
			childrenFeatures.add(CapabilitiesPackage.Literals.CAPABILITIES_CONTAINER_A__SUBDEVICE_IN_DEVICE_CAPABILITIES);
			childrenFeatures.add(CapabilitiesPackage.Literals.CAPABILITIES_CONTAINER_A__CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITIES);
			childrenFeatures.add(CapabilitiesPackage.Literals.CAPABILITIES_CONTAINER_A__SUBCAPABILITIES);
			childrenFeatures.add(CapabilitiesPackage.Literals.CAPABILITIES_CONTAINER_A__SUBCONNECTION_IN_DEVICE_CAPABILITIES);
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
		String label = ((CapabilitiesContainerA)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CapabilitiesContainerA_type") :
			getString("_UI_CapabilitiesContainerA_type") + " " + label;
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

		switch (notification.getFeatureID(CapabilitiesContainerA.class)) {
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__TASK_ON_DEVICE_CAPABILITIES:
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITIES:
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__DEVICE_IN_LOCATION_CAPABILITIES:
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUBDEVICE_IN_DEVICE_CAPABILITIES:
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITIES:
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUBCAPABILITIES:
			case CapabilitiesPackage.CAPABILITIES_CONTAINER_A__SUBCONNECTION_IN_DEVICE_CAPABILITIES:
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
				(CapabilitiesPackage.Literals.CAPABILITIES_CONTAINER_A__TASK_ON_DEVICE_CAPABILITIES,
				 CapabilitiesFactory.eINSTANCE.createTaskOnDeviceCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilitiesPackage.Literals.CAPABILITIES_CONTAINER_A__SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITIES,
				 CapabilitiesFactory.eINSTANCE.createSignalOnConnectionOrDeviceCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilitiesPackage.Literals.CAPABILITIES_CONTAINER_A__DEVICE_IN_LOCATION_CAPABILITIES,
				 CapabilitiesFactory.eINSTANCE.createDeviceInLocationCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilitiesPackage.Literals.CAPABILITIES_CONTAINER_A__SUBDEVICE_IN_DEVICE_CAPABILITIES,
				 CapabilitiesFactory.eINSTANCE.createSubdeviceInDeviceCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilitiesPackage.Literals.CAPABILITIES_CONTAINER_A__CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITIES,
				 CapabilitiesFactory.eINSTANCE.createConnectionInDuctOrLocationCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilitiesPackage.Literals.CAPABILITIES_CONTAINER_A__SUBCAPABILITIES,
				 CapabilitiesFactory.eINSTANCE.createSubcapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(CapabilitiesPackage.Literals.CAPABILITIES_CONTAINER_A__SUBCONNECTION_IN_DEVICE_CAPABILITIES,
				 CapabilitiesFactory.eINSTANCE.createSubconnectionInDeviceCapability()));
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
