/**
 */
package de.oaam.model.oaam.hardware.provider;


import de.oaam.model.oaam.common.provider.OaamBaseElementAItemProvider;

import de.oaam.model.oaam.hardware.HardwareContainerA;
import de.oaam.model.oaam.hardware.HardwareFactory;
import de.oaam.model.oaam.hardware.HardwarePackage;

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
 * This is the item provider adapter for a {@link de.oaam.model.oaam.hardware.HardwareContainerA} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwareContainerAItemProvider extends OaamBaseElementAItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareContainerAItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(HardwarePackage.Literals.HARDWARE_CONTAINER_A__DEVICES);
			childrenFeatures.add(HardwarePackage.Literals.HARDWARE_CONTAINER_A__DEVICE_SYMMETRIES);
			childrenFeatures.add(HardwarePackage.Literals.HARDWARE_CONTAINER_A__CONNECTIONS);
			childrenFeatures.add(HardwarePackage.Literals.HARDWARE_CONTAINER_A__SUBHARDWARE);
			childrenFeatures.add(HardwarePackage.Literals.HARDWARE_CONTAINER_A__BUSES);
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
		String label = ((HardwareContainerA)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HardwareContainerA_type") :
			getString("_UI_HardwareContainerA_type") + " " + label;
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

		switch (notification.getFeatureID(HardwareContainerA.class)) {
			case HardwarePackage.HARDWARE_CONTAINER_A__DEVICES:
			case HardwarePackage.HARDWARE_CONTAINER_A__DEVICE_SYMMETRIES:
			case HardwarePackage.HARDWARE_CONTAINER_A__CONNECTIONS:
			case HardwarePackage.HARDWARE_CONTAINER_A__SUBHARDWARE:
			case HardwarePackage.HARDWARE_CONTAINER_A__BUSES:
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
				(HardwarePackage.Literals.HARDWARE_CONTAINER_A__DEVICES,
				 HardwareFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(HardwarePackage.Literals.HARDWARE_CONTAINER_A__DEVICE_SYMMETRIES,
				 HardwareFactory.eINSTANCE.createDeviceSymmetry()));

		newChildDescriptors.add
			(createChildParameter
				(HardwarePackage.Literals.HARDWARE_CONTAINER_A__CONNECTIONS,
				 HardwareFactory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(HardwarePackage.Literals.HARDWARE_CONTAINER_A__SUBHARDWARE,
				 HardwareFactory.eINSTANCE.createSubhardware()));

		newChildDescriptors.add
			(createChildParameter
				(HardwarePackage.Literals.HARDWARE_CONTAINER_A__BUSES,
				 HardwareFactory.eINSTANCE.createBus()));
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
