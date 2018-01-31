/**
 */
package de.oaam.model.oaam.library.provider;


import de.oaam.model.oaam.common.CommonFactory;

import de.oaam.model.oaam.common.provider.ElementAItemProvider;
import de.oaam.model.oaam.functions.FunctionsFactory;

import de.oaam.model.oaam.library.LibraryFactory;
import de.oaam.model.oaam.library.LibraryPackage;
import de.oaam.model.oaam.library.OutputTrigger;

import de.oaam.model.oaam.provider.OaamEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.oaam.model.oaam.library.OutputTrigger} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OutputTriggerItemProvider extends ElementAItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputTriggerItemProvider(AdapterFactory adapterFactory) {
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

			addFixedRatePropertyDescriptor(object);
			addIsFixedRatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Fixed Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFixedRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OutputTrigger_fixedRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutputTrigger_fixedRate_feature", "_UI_OutputTrigger_type"),
				 LibraryPackage.Literals.OUTPUT_TRIGGER__FIXED_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Fixed Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsFixedRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OutputTrigger_isFixedRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutputTrigger_isFixedRate_feature", "_UI_OutputTrigger_type"),
				 LibraryPackage.Literals.OUTPUT_TRIGGER__IS_FIXED_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(LibraryPackage.Literals.OUTPUT_TRIGGER__LOGIC);
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
	 * This returns OutputTrigger.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OutputTrigger"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OutputTrigger)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_OutputTrigger_type") :
			getString("_UI_OutputTrigger_type") + " " + label;
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

		switch (notification.getFeatureID(OutputTrigger.class)) {
			case LibraryPackage.OUTPUT_TRIGGER__FIXED_RATE:
			case LibraryPackage.OUTPUT_TRIGGER__IS_FIXED_RATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LibraryPackage.OUTPUT_TRIGGER__LOGIC:
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
				(LibraryPackage.Literals.OUTPUT_TRIGGER__LOGIC,
				 LibraryFactory.eINSTANCE.createFunctionInputState()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.OUTPUT_TRIGGER__LOGIC,
				 LibraryFactory.eINSTANCE.createFunctionInputTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.OUTPUT_TRIGGER__LOGIC,
				 CommonFactory.eINSTANCE.createBoolOperation()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.OUTPUT_TRIGGER__LOGIC,
				 CommonFactory.eINSTANCE.createBoolNot()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.OUTPUT_TRIGGER__LOGIC,
				 FunctionsFactory.eINSTANCE.createSystemInputState()));
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
