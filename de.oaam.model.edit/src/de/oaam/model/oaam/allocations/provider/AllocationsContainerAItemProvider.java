/**
 */
package de.oaam.model.oaam.allocations.provider;


import de.oaam.model.oaam.allocations.AllocationsContainerA;
import de.oaam.model.oaam.allocations.AllocationsFactory;
import de.oaam.model.oaam.allocations.AllocationsPackage;

import de.oaam.model.oaam.common.CommonPackage;
import de.oaam.model.oaam.common.provider.OaamBaseElementAItemProvider;

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
 * This is the item provider adapter for a {@link de.oaam.model.oaam.allocations.AllocationsContainerA} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AllocationsContainerAItemProvider extends OaamBaseElementAItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationsContainerAItemProvider(AdapterFactory adapterFactory) {
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

			addBelongsToPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Belongs To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBelongsToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SystemBelongingElementA_belongsTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SystemBelongingElementA_belongsTo_feature", "_UI_SystemBelongingElementA_type"),
				 CommonPackage.Literals.SYSTEM_BELONGING_ELEMENT_A__BELONGS_TO,
				 true,
				 false,
				 true,
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
			childrenFeatures.add(AllocationsPackage.Literals.ALLOCATIONS_CONTAINER_A__DEVICE_ASSIGNMENTS);
			childrenFeatures.add(AllocationsPackage.Literals.ALLOCATIONS_CONTAINER_A__SUBDEVICE_ASSIGNMENTS);
			childrenFeatures.add(AllocationsPackage.Literals.ALLOCATIONS_CONTAINER_A__CONNECTION_ASSIGNMENTS);
			childrenFeatures.add(AllocationsPackage.Literals.ALLOCATIONS_CONTAINER_A__TASK_ASSIGNMENTS);
			childrenFeatures.add(AllocationsPackage.Literals.ALLOCATIONS_CONTAINER_A__SIGNAL_ASSIGNMENTS);
			childrenFeatures.add(AllocationsPackage.Literals.ALLOCATIONS_CONTAINER_A__SUBALLOCATIONS);
			childrenFeatures.add(AllocationsPackage.Literals.ALLOCATIONS_CONTAINER_A__SUBCONNECTION_ASSIGNMENTS);
			childrenFeatures.add(AllocationsPackage.Literals.ALLOCATIONS_CONTAINER_A__MESSAGES);
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
		String label = ((AllocationsContainerA)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AllocationsContainerA_type") :
			getString("_UI_AllocationsContainerA_type") + " " + label;
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

		switch (notification.getFeatureID(AllocationsContainerA.class)) {
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__DEVICE_ASSIGNMENTS:
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__SUBDEVICE_ASSIGNMENTS:
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__CONNECTION_ASSIGNMENTS:
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__TASK_ASSIGNMENTS:
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__SIGNAL_ASSIGNMENTS:
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__SUBALLOCATIONS:
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__SUBCONNECTION_ASSIGNMENTS:
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A__MESSAGES:
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
				(AllocationsPackage.Literals.ALLOCATIONS_CONTAINER_A__DEVICE_ASSIGNMENTS,
				 AllocationsFactory.eINSTANCE.createDeviceAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(AllocationsPackage.Literals.ALLOCATIONS_CONTAINER_A__SUBDEVICE_ASSIGNMENTS,
				 AllocationsFactory.eINSTANCE.createSubdeviceAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(AllocationsPackage.Literals.ALLOCATIONS_CONTAINER_A__CONNECTION_ASSIGNMENTS,
				 AllocationsFactory.eINSTANCE.createConnectionAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(AllocationsPackage.Literals.ALLOCATIONS_CONTAINER_A__TASK_ASSIGNMENTS,
				 AllocationsFactory.eINSTANCE.createTaskAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(AllocationsPackage.Literals.ALLOCATIONS_CONTAINER_A__SIGNAL_ASSIGNMENTS,
				 AllocationsFactory.eINSTANCE.createSignalAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(AllocationsPackage.Literals.ALLOCATIONS_CONTAINER_A__SUBALLOCATIONS,
				 AllocationsFactory.eINSTANCE.createSuballocations()));

		newChildDescriptors.add
			(createChildParameter
				(AllocationsPackage.Literals.ALLOCATIONS_CONTAINER_A__SUBCONNECTION_ASSIGNMENTS,
				 AllocationsFactory.eINSTANCE.createSubconnectionAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(AllocationsPackage.Literals.ALLOCATIONS_CONTAINER_A__MESSAGES,
				 AllocationsFactory.eINSTANCE.createMessage()));
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
