/**
 */
package de.oaam.model.oaam.systems.provider;


import de.oaam.model.oaam.common.provider.OaamBaseElementAItemProvider;

import de.oaam.model.oaam.provider.OaamEditPlugin;

import de.oaam.model.oaam.systems.SystemsContainerA;
import de.oaam.model.oaam.systems.SystemsFactory;
import de.oaam.model.oaam.systems.SystemsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.oaam.model.oaam.systems.SystemsContainerA} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemsContainerAItemProvider extends OaamBaseElementAItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemsContainerAItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(SystemsPackage.Literals.SYSTEMS_CONTAINER_A__SYSTEMS);
			childrenFeatures.add(SystemsPackage.Literals.SYSTEMS_CONTAINER_A__INFORMATION_FLOWS);
			childrenFeatures.add(SystemsPackage.Literals.SYSTEMS_CONTAINER_A__INPUT_SEGREGATIONS);
			childrenFeatures.add(SystemsPackage.Literals.SYSTEMS_CONTAINER_A__SUBSYSTEMS);
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
		String label = ((SystemsContainerA)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SystemsContainerA_type") :
			getString("_UI_SystemsContainerA_type") + " " + label;
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

		switch (notification.getFeatureID(SystemsContainerA.class)) {
			case SystemsPackage.SYSTEMS_CONTAINER_A__SYSTEMS:
			case SystemsPackage.SYSTEMS_CONTAINER_A__INFORMATION_FLOWS:
			case SystemsPackage.SYSTEMS_CONTAINER_A__INPUT_SEGREGATIONS:
			case SystemsPackage.SYSTEMS_CONTAINER_A__SUBSYSTEMS:
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
				(SystemsPackage.Literals.SYSTEMS_CONTAINER_A__SYSTEMS,
				 SystemsFactory.eINSTANCE.createSystem()));

		newChildDescriptors.add
			(createChildParameter
				(SystemsPackage.Literals.SYSTEMS_CONTAINER_A__INFORMATION_FLOWS,
				 SystemsFactory.eINSTANCE.createInformationFlow()));

		newChildDescriptors.add
			(createChildParameter
				(SystemsPackage.Literals.SYSTEMS_CONTAINER_A__INPUT_SEGREGATIONS,
				 SystemsFactory.eINSTANCE.createInputSegregation()));

		newChildDescriptors.add
			(createChildParameter
				(SystemsPackage.Literals.SYSTEMS_CONTAINER_A__SUBSYSTEMS,
				 SystemsFactory.eINSTANCE.createSubsystem()));
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
