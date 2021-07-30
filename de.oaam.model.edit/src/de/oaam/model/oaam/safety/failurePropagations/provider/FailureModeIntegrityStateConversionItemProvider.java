/**
 */
package de.oaam.model.oaam.safety.failurePropagations.provider;


import de.oaam.model.oaam.common.provider.OaamBaseElementAItemProvider;

import de.oaam.model.oaam.provider.OaamEditPlugin;

import de.oaam.model.oaam.safety.failurePropagations.FailureModeIntegrityStateConversion;
import de.oaam.model.oaam.safety.failurePropagations.FailurePropagationsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.oaam.model.oaam.safety.failurePropagations.FailureModeIntegrityStateConversion} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FailureModeIntegrityStateConversionItemProvider extends OaamBaseElementAItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureModeIntegrityStateConversionItemProvider(AdapterFactory adapterFactory) {
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

			addInputPropertyDescriptor(object);
			addOutputIntegrityStatePropertyDescriptor(object);
			addInputFailureModePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FailureModeIntegrityStateConversion_input_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FailureModeIntegrityStateConversion_input_feature", "_UI_FailureModeIntegrityStateConversion_type"),
				 FailurePropagationsPackage.Literals.FAILURE_MODE_INTEGRITY_STATE_CONVERSION__INPUT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output Integrity State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputIntegrityStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FailureModeIntegrityStateConversion_outputIntegrityState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FailureModeIntegrityStateConversion_outputIntegrityState_feature", "_UI_FailureModeIntegrityStateConversion_type"),
				 FailurePropagationsPackage.Literals.FAILURE_MODE_INTEGRITY_STATE_CONVERSION__OUTPUT_INTEGRITY_STATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input Failure Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputFailureModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FailureModeIntegrityStateConversion_inputFailureMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FailureModeIntegrityStateConversion_inputFailureMode_feature", "_UI_FailureModeIntegrityStateConversion_type"),
				 FailurePropagationsPackage.Literals.FAILURE_MODE_INTEGRITY_STATE_CONVERSION__INPUT_FAILURE_MODE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns FailureModeIntegrityStateConversion.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FailureModeIntegrityStateConversion"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FailureModeIntegrityStateConversion)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FailureModeIntegrityStateConversion_type") :
			getString("_UI_FailureModeIntegrityStateConversion_type") + " " + label;
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

		switch (notification.getFeatureID(FailureModeIntegrityStateConversion.class)) {
			case FailurePropagationsPackage.FAILURE_MODE_INTEGRITY_STATE_CONVERSION__OUTPUT_INTEGRITY_STATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
