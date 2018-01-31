/**
 */
package de.oaam.model.oaam.restrictions.provider;


import de.oaam.model.oaam.common.provider.ElementAItemProvider;
import de.oaam.model.oaam.provider.OaamEditPlugin;

import de.oaam.model.oaam.restrictions.RestrictionsContainerA;
import de.oaam.model.oaam.restrictions.RestrictionsFactory;
import de.oaam.model.oaam.restrictions.RestrictionsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.oaam.model.oaam.restrictions.RestrictionsContainerA} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RestrictionsContainerAItemProvider extends ElementAItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionsContainerAItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A__DEVICE_TYPE_RESTRICTIONS);
			childrenFeatures.add(RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A__DEVICE_RESTRICTIONS);
			childrenFeatures.add(RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A__LOCATION_RESTRICTIONS);
			childrenFeatures.add(RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A__AREA_RESTRICTIONS);
			childrenFeatures.add(RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A__POWER_SOURCE_RESTRICTIONS);
			childrenFeatures.add(RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A__TASK_ATOMIC_RESTRICTIONS);
			childrenFeatures.add(RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A__TASK_SYMMETRY_RESTRICTIONS);
			childrenFeatures.add(RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A__TASK_RATE_RESTRICTIONS);
			childrenFeatures.add(RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A__INPUT_SYNCHRONICITY_RESTRICTION);
			childrenFeatures.add(RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A__CONNECTION_RESTRICTIONS);
			childrenFeatures.add(RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A__CONNECTION_TYPE_RESTRICTIONS);
			childrenFeatures.add(RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A__SEGREGATIONS_RESTRICTIONS);
			childrenFeatures.add(RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A__SIGNAL_DELAY_RESTRICTION);
			childrenFeatures.add(RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A__SUBRESTRICTIONS);
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
		String label = ((RestrictionsContainerA)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_RestrictionsContainerA_type") :
			getString("_UI_RestrictionsContainerA_type") + " " + label;
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

		switch (notification.getFeatureID(RestrictionsContainerA.class)) {
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__DEVICE_TYPE_RESTRICTIONS:
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__DEVICE_RESTRICTIONS:
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__LOCATION_RESTRICTIONS:
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__AREA_RESTRICTIONS:
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__POWER_SOURCE_RESTRICTIONS:
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__TASK_ATOMIC_RESTRICTIONS:
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__TASK_SYMMETRY_RESTRICTIONS:
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__TASK_RATE_RESTRICTIONS:
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__INPUT_SYNCHRONICITY_RESTRICTION:
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__CONNECTION_RESTRICTIONS:
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__CONNECTION_TYPE_RESTRICTIONS:
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__SEGREGATIONS_RESTRICTIONS:
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__SIGNAL_DELAY_RESTRICTION:
			case RestrictionsPackage.RESTRICTIONS_CONTAINER_A__SUBRESTRICTIONS:
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
				(RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A__DEVICE_TYPE_RESTRICTIONS,
				 RestrictionsFactory.eINSTANCE.createDeviceTypeRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A__DEVICE_RESTRICTIONS,
				 RestrictionsFactory.eINSTANCE.createDeviceRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A__LOCATION_RESTRICTIONS,
				 RestrictionsFactory.eINSTANCE.createLocationRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A__AREA_RESTRICTIONS,
				 RestrictionsFactory.eINSTANCE.createAreaRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A__POWER_SOURCE_RESTRICTIONS,
				 RestrictionsFactory.eINSTANCE.createPowerSourceRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A__TASK_ATOMIC_RESTRICTIONS,
				 RestrictionsFactory.eINSTANCE.createTaskAtomicRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A__TASK_SYMMETRY_RESTRICTIONS,
				 RestrictionsFactory.eINSTANCE.createTaskSymmetryRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A__TASK_RATE_RESTRICTIONS,
				 RestrictionsFactory.eINSTANCE.createTaskRateRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A__INPUT_SYNCHRONICITY_RESTRICTION,
				 RestrictionsFactory.eINSTANCE.createInputSynchronicityRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A__CONNECTION_RESTRICTIONS,
				 RestrictionsFactory.eINSTANCE.createConnectionRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A__CONNECTION_TYPE_RESTRICTIONS,
				 RestrictionsFactory.eINSTANCE.createConectionTypeRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A__SEGREGATIONS_RESTRICTIONS,
				 RestrictionsFactory.eINSTANCE.createSegregationRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A__SIGNAL_DELAY_RESTRICTION,
				 RestrictionsFactory.eINSTANCE.createPathDelayRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(RestrictionsPackage.Literals.RESTRICTIONS_CONTAINER_A__SUBRESTRICTIONS,
				 RestrictionsFactory.eINSTANCE.createSubrestrictions()));
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
