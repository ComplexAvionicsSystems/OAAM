/**
 */
package de.oaam.model.oaam.physical.provider;


import de.oaam.model.oaam.common.provider.OaamBaseElementAItemProvider;

import de.oaam.model.oaam.physical.PhysicalFactory;
import de.oaam.model.oaam.physical.PhysicalInteractionContainerA;
import de.oaam.model.oaam.physical.PhysicalPackage;

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
 * This is the item provider adapter for a {@link de.oaam.model.oaam.physical.PhysicalInteractionContainerA} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PhysicalInteractionContainerAItemProvider extends OaamBaseElementAItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalInteractionContainerAItemProvider(AdapterFactory adapterFactory) {
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

			addFunctionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Function feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalInteractionContainerA_function_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalInteractionContainerA_function_feature", "_UI_PhysicalInteractionContainerA_type"),
				 PhysicalPackage.Literals.PHYSICAL_INTERACTION_CONTAINER_A__FUNCTION,
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
			childrenFeatures.add(PhysicalPackage.Literals.PHYSICAL_INTERACTION_CONTAINER_A__SUBPHYSICAL_INTERACTIONS);
			childrenFeatures.add(PhysicalPackage.Literals.PHYSICAL_INTERACTION_CONTAINER_A__SENSORS);
			childrenFeatures.add(PhysicalPackage.Literals.PHYSICAL_INTERACTION_CONTAINER_A__EFFECTORS);
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
		String label = ((PhysicalInteractionContainerA)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_PhysicalInteractionContainerA_type") :
			getString("_UI_PhysicalInteractionContainerA_type") + " " + label;
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

		switch (notification.getFeatureID(PhysicalInteractionContainerA.class)) {
			case PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__SUBPHYSICAL_INTERACTIONS:
			case PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__SENSORS:
			case PhysicalPackage.PHYSICAL_INTERACTION_CONTAINER_A__EFFECTORS:
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
				(PhysicalPackage.Literals.PHYSICAL_INTERACTION_CONTAINER_A__SUBPHYSICAL_INTERACTIONS,
				 PhysicalFactory.eINSTANCE.createSubphysicalInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(PhysicalPackage.Literals.PHYSICAL_INTERACTION_CONTAINER_A__SENSORS,
				 PhysicalFactory.eINSTANCE.createSensor()));

		newChildDescriptors.add
			(createChildParameter
				(PhysicalPackage.Literals.PHYSICAL_INTERACTION_CONTAINER_A__EFFECTORS,
				 PhysicalFactory.eINSTANCE.createEffector()));
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
