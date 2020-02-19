/**
 */
package de.oaam.model.oaam.allocations.provider;


import de.oaam.model.oaam.allocations.AllocationsPackage;
import de.oaam.model.oaam.allocations.SignalToMessageAssignment;

import de.oaam.model.oaam.common.CommonFactory;

import de.oaam.model.oaam.provider.OaamEditPlugin;

import de.oaam.model.oaam.scenario.ScenarioFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.oaam.model.oaam.allocations.SignalToMessageAssignment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SignalToMessageAssignmentItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalToMessageAssignmentItemProvider(AdapterFactory adapterFactory) {
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

			addSignalPropertyDescriptor(object);
			addVariantsPropertyDescriptor(object);
			addPositionPropertyDescriptor(object);
			addCapabilityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Signal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSignalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SignalToMessageAssignment_signal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SignalToMessageAssignment_signal_feature", "_UI_SignalToMessageAssignment_type"),
				 AllocationsPackage.Literals.SIGNAL_TO_MESSAGE_ASSIGNMENT__SIGNAL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Variants feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariantsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SignalToMessageAssignment_variants_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SignalToMessageAssignment_variants_feature", "_UI_SignalToMessageAssignment_type"),
				 AllocationsPackage.Literals.SIGNAL_TO_MESSAGE_ASSIGNMENT__VARIANTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SignalToMessageAssignment_position_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SignalToMessageAssignment_position_feature", "_UI_SignalToMessageAssignment_type"),
				 AllocationsPackage.Literals.SIGNAL_TO_MESSAGE_ASSIGNMENT__POSITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Capability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SignalToMessageAssignment_capability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SignalToMessageAssignment_capability_feature", "_UI_SignalToMessageAssignment_type"),
				 AllocationsPackage.Literals.SIGNAL_TO_MESSAGE_ASSIGNMENT__CAPABILITY,
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
			childrenFeatures.add(AllocationsPackage.Literals.SIGNAL_TO_MESSAGE_ASSIGNMENT__ATTRIBUTES);
			childrenFeatures.add(AllocationsPackage.Literals.SIGNAL_TO_MESSAGE_ASSIGNMENT__OPERATION_MODES);
			childrenFeatures.add(AllocationsPackage.Literals.SIGNAL_TO_MESSAGE_ASSIGNMENT__DATA_TYPE);
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
	 * This returns SignalToMessageAssignment.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SignalToMessageAssignment"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		SignalToMessageAssignment signalToMessageAssignment = (SignalToMessageAssignment)object;
		return getString("_UI_SignalToMessageAssignment_type") + " " + signalToMessageAssignment.getPosition();
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

		switch (notification.getFeatureID(SignalToMessageAssignment.class)) {
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__POSITION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__ATTRIBUTES:
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__OPERATION_MODES:
			case AllocationsPackage.SIGNAL_TO_MESSAGE_ASSIGNMENT__DATA_TYPE:
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
				(AllocationsPackage.Literals.SIGNAL_TO_MESSAGE_ASSIGNMENT__ATTRIBUTES,
				 CommonFactory.eINSTANCE.createAttributeString()));

		newChildDescriptors.add
			(createChildParameter
				(AllocationsPackage.Literals.SIGNAL_TO_MESSAGE_ASSIGNMENT__ATTRIBUTES,
				 CommonFactory.eINSTANCE.createAttributeNumeric()));

		newChildDescriptors.add
			(createChildParameter
				(AllocationsPackage.Literals.SIGNAL_TO_MESSAGE_ASSIGNMENT__ATTRIBUTES,
				 CommonFactory.eINSTANCE.createAttributeContainment()));

		newChildDescriptors.add
			(createChildParameter
				(AllocationsPackage.Literals.SIGNAL_TO_MESSAGE_ASSIGNMENT__ATTRIBUTES,
				 CommonFactory.eINSTANCE.createAttributeReference()));

		newChildDescriptors.add
			(createChildParameter
				(AllocationsPackage.Literals.SIGNAL_TO_MESSAGE_ASSIGNMENT__OPERATION_MODES,
				 ScenarioFactory.eINSTANCE.createOperationModeReference()));

		newChildDescriptors.add
			(createChildParameter
				(AllocationsPackage.Literals.SIGNAL_TO_MESSAGE_ASSIGNMENT__DATA_TYPE,
				 CommonFactory.eINSTANCE.createInteger()));

		newChildDescriptors.add
			(createChildParameter
				(AllocationsPackage.Literals.SIGNAL_TO_MESSAGE_ASSIGNMENT__DATA_TYPE,
				 CommonFactory.eINSTANCE.createArray()));

		newChildDescriptors.add
			(createChildParameter
				(AllocationsPackage.Literals.SIGNAL_TO_MESSAGE_ASSIGNMENT__DATA_TYPE,
				 CommonFactory.eINSTANCE.createStruct()));

		newChildDescriptors.add
			(createChildParameter
				(AllocationsPackage.Literals.SIGNAL_TO_MESSAGE_ASSIGNMENT__DATA_TYPE,
				 CommonFactory.eINSTANCE.createFloatingPoint()));

		newChildDescriptors.add
			(createChildParameter
				(AllocationsPackage.Literals.SIGNAL_TO_MESSAGE_ASSIGNMENT__DATA_TYPE,
				 CommonFactory.eINSTANCE.createByte()));

		newChildDescriptors.add
			(createChildParameter
				(AllocationsPackage.Literals.SIGNAL_TO_MESSAGE_ASSIGNMENT__DATA_TYPE,
				 CommonFactory.eINSTANCE.createCharacter()));

		newChildDescriptors.add
			(createChildParameter
				(AllocationsPackage.Literals.SIGNAL_TO_MESSAGE_ASSIGNMENT__DATA_TYPE,
				 CommonFactory.eINSTANCE.createBoolean()));
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
