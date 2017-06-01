/**
 */
package de.oaam.model.oaam.mapping.provider;


import de.oaam.model.oaam.common.provider._ElementAItemProvider;

import de.oaam.model.oaam.mapping.MappingContainerA;
import de.oaam.model.oaam.mapping.MappingFactory;
import de.oaam.model.oaam.mapping.MappingPackage;

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
 * This is the item provider adapter for a {@link de.oaam.model.oaam.mapping.MappingContainerA} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingContainerAItemProvider extends _ElementAItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingContainerAItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(MappingPackage.Literals.MAPPING_CONTAINER_A__DEVICE_ASSIGNMENTS);
			childrenFeatures.add(MappingPackage.Literals.MAPPING_CONTAINER_A__SUB_DEVICE_ASSIGNMENTS);
			childrenFeatures.add(MappingPackage.Literals.MAPPING_CONTAINER_A__CONNECTION_ASSIGNMENTS);
			childrenFeatures.add(MappingPackage.Literals.MAPPING_CONTAINER_A__TASK_ASSIGNMENTS);
			childrenFeatures.add(MappingPackage.Literals.MAPPING_CONTAINER_A__SIGNAL_ASSIGNMENTS);
			childrenFeatures.add(MappingPackage.Literals.MAPPING_CONTAINER_A__SUPMAPPING);
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
		String label = ((MappingContainerA)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MappingContainerA_type") :
			getString("_UI_MappingContainerA_type") + " " + label;
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

		switch (notification.getFeatureID(MappingContainerA.class)) {
			case MappingPackage.MAPPING_CONTAINER_A__DEVICE_ASSIGNMENTS:
			case MappingPackage.MAPPING_CONTAINER_A__SUB_DEVICE_ASSIGNMENTS:
			case MappingPackage.MAPPING_CONTAINER_A__CONNECTION_ASSIGNMENTS:
			case MappingPackage.MAPPING_CONTAINER_A__TASK_ASSIGNMENTS:
			case MappingPackage.MAPPING_CONTAINER_A__SIGNAL_ASSIGNMENTS:
			case MappingPackage.MAPPING_CONTAINER_A__SUPMAPPING:
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
				(MappingPackage.Literals.MAPPING_CONTAINER_A__DEVICE_ASSIGNMENTS,
				 MappingFactory.eINSTANCE.createDeviceAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING_CONTAINER_A__SUB_DEVICE_ASSIGNMENTS,
				 MappingFactory.eINSTANCE.createSubDeviceAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING_CONTAINER_A__CONNECTION_ASSIGNMENTS,
				 MappingFactory.eINSTANCE.createConnectionAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING_CONTAINER_A__TASK_ASSIGNMENTS,
				 MappingFactory.eINSTANCE.createTaskAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING_CONTAINER_A__SIGNAL_ASSIGNMENTS,
				 MappingFactory.eINSTANCE.createSignalAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING_CONTAINER_A__SUPMAPPING,
				 MappingFactory.eINSTANCE.createSupmapping()));
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
