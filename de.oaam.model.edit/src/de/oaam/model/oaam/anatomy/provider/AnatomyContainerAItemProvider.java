/**
 */
package de.oaam.model.oaam.anatomy.provider;


import de.oaam.model.oaam.anatomy.AnatomyContainerA;
import de.oaam.model.oaam.anatomy.AnatomyFactory;
import de.oaam.model.oaam.anatomy.AnatomyPackage;
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
 * This is the item provider adapter for a {@link de.oaam.model.oaam.anatomy.AnatomyContainerA} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AnatomyContainerAItemProvider extends OaamBaseElementAItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnatomyContainerAItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(AnatomyPackage.Literals.ANATOMY_CONTAINER_A__LOCATIONS);
			childrenFeatures.add(AnatomyPackage.Literals.ANATOMY_CONTAINER_A__LOCATION_SYMMETRIES);
			childrenFeatures.add(AnatomyPackage.Literals.ANATOMY_CONTAINER_A__DUCTS);
			childrenFeatures.add(AnatomyPackage.Literals.ANATOMY_CONTAINER_A__AREAS);
			childrenFeatures.add(AnatomyPackage.Literals.ANATOMY_CONTAINER_A__SUBANATOMIES);
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
		String label = ((AnatomyContainerA)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AnatomyContainerA_type") :
			getString("_UI_AnatomyContainerA_type") + " " + label;
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

		switch (notification.getFeatureID(AnatomyContainerA.class)) {
			case AnatomyPackage.ANATOMY_CONTAINER_A__LOCATIONS:
			case AnatomyPackage.ANATOMY_CONTAINER_A__LOCATION_SYMMETRIES:
			case AnatomyPackage.ANATOMY_CONTAINER_A__DUCTS:
			case AnatomyPackage.ANATOMY_CONTAINER_A__AREAS:
			case AnatomyPackage.ANATOMY_CONTAINER_A__SUBANATOMIES:
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
				(AnatomyPackage.Literals.ANATOMY_CONTAINER_A__LOCATIONS,
				 AnatomyFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(AnatomyPackage.Literals.ANATOMY_CONTAINER_A__LOCATION_SYMMETRIES,
				 AnatomyFactory.eINSTANCE.createLocationSymmetry()));

		newChildDescriptors.add
			(createChildParameter
				(AnatomyPackage.Literals.ANATOMY_CONTAINER_A__DUCTS,
				 AnatomyFactory.eINSTANCE.createDuct()));

		newChildDescriptors.add
			(createChildParameter
				(AnatomyPackage.Literals.ANATOMY_CONTAINER_A__AREAS,
				 AnatomyFactory.eINSTANCE.createArea()));

		newChildDescriptors.add
			(createChildParameter
				(AnatomyPackage.Literals.ANATOMY_CONTAINER_A__SUBANATOMIES,
				 AnatomyFactory.eINSTANCE.createSubanatomy()));
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
