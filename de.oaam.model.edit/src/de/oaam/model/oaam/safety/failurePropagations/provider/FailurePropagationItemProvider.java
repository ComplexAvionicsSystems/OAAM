/**
 */
package de.oaam.model.oaam.safety.failurePropagations.provider;


import de.oaam.model.oaam.common.provider.OaamBaseElementAItemProvider;

import de.oaam.model.oaam.provider.OaamEditPlugin;

import de.oaam.model.oaam.safety.failurePropagations.FailurePropagation;
import de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsFactory;
import de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage;

import de.oaam.model.oaam.safety.failurePropagations.failurePropagationMatrices.FailurePropagationMatricesFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.oaam.model.oaam.safety.failurePropagations.FailurePropagation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FailurePropagationItemProvider extends OaamBaseElementAItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailurePropagationItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(FailurePropagationsPackage.Literals.FAILURE_PROPAGATION__PROPAGATORS);
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
	 * This returns FailurePropagation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FailurePropagation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FailurePropagation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FailurePropagation_type") :
			getString("_UI_FailurePropagation_type") + " " + label;
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

		switch (notification.getFeatureID(FailurePropagation.class)) {
			case FailurePropagationsPackage.FAILURE_PROPAGATION__PROPAGATORS:
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
				(FailurePropagationsPackage.Literals.FAILURE_PROPAGATION__PROPAGATORS,
				 FailurePropagationsFactory.eINSTANCE.createBooleanAnd()));

		newChildDescriptors.add
			(createChildParameter
				(FailurePropagationsPackage.Literals.FAILURE_PROPAGATION__PROPAGATORS,
				 FailurePropagationsFactory.eINSTANCE.createBooleanOr()));

		newChildDescriptors.add
			(createChildParameter
				(FailurePropagationsPackage.Literals.FAILURE_PROPAGATION__PROPAGATORS,
				 FailurePropagationsFactory.eINSTANCE.createBooleanXor()));

		newChildDescriptors.add
			(createChildParameter
				(FailurePropagationsPackage.Literals.FAILURE_PROPAGATION__PROPAGATORS,
				 FailurePropagationsFactory.eINSTANCE.createBooleanNot()));

		newChildDescriptors.add
			(createChildParameter
				(FailurePropagationsPackage.Literals.FAILURE_PROPAGATION__PROPAGATORS,
				 FailurePropagationsFactory.eINSTANCE.createIntegrityStateBooleanConversion()));

		newChildDescriptors.add
			(createChildParameter
				(FailurePropagationsPackage.Literals.FAILURE_PROPAGATION__PROPAGATORS,
				 FailurePropagationsFactory.eINSTANCE.createFailureModeBooleanConversion()));

		newChildDescriptors.add
			(createChildParameter
				(FailurePropagationsPackage.Literals.FAILURE_PROPAGATION__PROPAGATORS,
				 FailurePropagationsFactory.eINSTANCE.createBooleanFailureModeConversion()));

		newChildDescriptors.add
			(createChildParameter
				(FailurePropagationsPackage.Literals.FAILURE_PROPAGATION__PROPAGATORS,
				 FailurePropagationsFactory.eINSTANCE.createIntegrityStateFailureModeConversion()));

		newChildDescriptors.add
			(createChildParameter
				(FailurePropagationsPackage.Literals.FAILURE_PROPAGATION__PROPAGATORS,
				 FailurePropagationsFactory.eINSTANCE.createFailureModeIntegrityStateConversion()));

		newChildDescriptors.add
			(createChildParameter
				(FailurePropagationsPackage.Literals.FAILURE_PROPAGATION__PROPAGATORS,
				 FailurePropagationsFactory.eINSTANCE.createBooleanIntegrityStateConversion()));

		newChildDescriptors.add
			(createChildParameter
				(FailurePropagationsPackage.Literals.FAILURE_PROPAGATION__PROPAGATORS,
				 FailurePropagationsFactory.eINSTANCE.createPropagationInput()));

		newChildDescriptors.add
			(createChildParameter
				(FailurePropagationsPackage.Literals.FAILURE_PROPAGATION__PROPAGATORS,
				 FailurePropagationsFactory.eINSTANCE.createPropagationOutput()));

		newChildDescriptors.add
			(createChildParameter
				(FailurePropagationsPackage.Literals.FAILURE_PROPAGATION__PROPAGATORS,
				 FailurePropagationsFactory.eINSTANCE.createPropagationSource()));

		newChildDescriptors.add
			(createChildParameter
				(FailurePropagationsPackage.Literals.FAILURE_PROPAGATION__PROPAGATORS,
				 FailurePropagationsFactory.eINSTANCE.createPropagationSink()));

		newChildDescriptors.add
			(createChildParameter
				(FailurePropagationsPackage.Literals.FAILURE_PROPAGATION__PROPAGATORS,
				 FailurePropagationMatricesFactory.eINSTANCE.createFailureModeMatrix()));

		newChildDescriptors.add
			(createChildParameter
				(FailurePropagationsPackage.Literals.FAILURE_PROPAGATION__PROPAGATORS,
				 FailurePropagationMatricesFactory.eINSTANCE.createIntegrityStateMatrix()));

		newChildDescriptors.add
			(createChildParameter
				(FailurePropagationsPackage.Literals.FAILURE_PROPAGATION__PROPAGATORS,
				 FailurePropagationMatricesFactory.eINSTANCE.createBooleanMatrix()));
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
