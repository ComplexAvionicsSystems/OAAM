/**
 */
package de.oaam.model.oaam.provider;


import de.oaam.model.oaam.Architecture;
import de.oaam.model.oaam.OaamPackage;

import de.oaam.model.oaam.allocations.AllocationsFactory;

import de.oaam.model.oaam.anatomy.AnatomyFactory;

import de.oaam.model.oaam.capabilities.CapabilitiesFactory;

import de.oaam.model.oaam.common.provider.OaamBaseElementAItemProvider;

import de.oaam.model.oaam.functions.FunctionsFactory;

import de.oaam.model.oaam.hardware.HardwareFactory;

import de.oaam.model.oaam.library.LibraryFactory;

import de.oaam.model.oaam.restrictions.RestrictionsFactory;

import de.oaam.model.oaam.scenario.ScenarioFactory;

import de.oaam.model.oaam.systems.SystemsFactory;

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
 * This is the item provider adapter for a {@link de.oaam.model.oaam.Architecture} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchitectureItemProvider extends OaamBaseElementAItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureItemProvider(AdapterFactory adapterFactory) {
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

			addIncludePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Include feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncludePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Architecture_include_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Architecture_include_feature", "_UI_Architecture_type"),
				 OaamPackage.Literals.ARCHITECTURE__INCLUDE,
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
			childrenFeatures.add(OaamPackage.Literals.ARCHITECTURE__LIBRARY);
			childrenFeatures.add(OaamPackage.Literals.ARCHITECTURE__SCENARIO);
			childrenFeatures.add(OaamPackage.Literals.ARCHITECTURE__SYSTEMS);
			childrenFeatures.add(OaamPackage.Literals.ARCHITECTURE__FUNCTIONS);
			childrenFeatures.add(OaamPackage.Literals.ARCHITECTURE__HARDWARE);
			childrenFeatures.add(OaamPackage.Literals.ARCHITECTURE__ANATOMY);
			childrenFeatures.add(OaamPackage.Literals.ARCHITECTURE__CAPABILITIES);
			childrenFeatures.add(OaamPackage.Literals.ARCHITECTURE__RESTRICTIONS);
			childrenFeatures.add(OaamPackage.Literals.ARCHITECTURE__ALLOCATIONS);
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
	 * This returns Architecture.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Architecture"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Architecture)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Architecture_type") :
			getString("_UI_Architecture_type") + " " + label;
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

		switch (notification.getFeatureID(Architecture.class)) {
			case OaamPackage.ARCHITECTURE__LIBRARY:
			case OaamPackage.ARCHITECTURE__SCENARIO:
			case OaamPackage.ARCHITECTURE__SYSTEMS:
			case OaamPackage.ARCHITECTURE__FUNCTIONS:
			case OaamPackage.ARCHITECTURE__HARDWARE:
			case OaamPackage.ARCHITECTURE__ANATOMY:
			case OaamPackage.ARCHITECTURE__CAPABILITIES:
			case OaamPackage.ARCHITECTURE__RESTRICTIONS:
			case OaamPackage.ARCHITECTURE__ALLOCATIONS:
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
				(OaamPackage.Literals.ARCHITECTURE__LIBRARY,
				 LibraryFactory.eINSTANCE.createLibrary()));

		newChildDescriptors.add
			(createChildParameter
				(OaamPackage.Literals.ARCHITECTURE__SCENARIO,
				 ScenarioFactory.eINSTANCE.createScenario()));

		newChildDescriptors.add
			(createChildParameter
				(OaamPackage.Literals.ARCHITECTURE__SYSTEMS,
				 SystemsFactory.eINSTANCE.createSystems()));

		newChildDescriptors.add
			(createChildParameter
				(OaamPackage.Literals.ARCHITECTURE__FUNCTIONS,
				 FunctionsFactory.eINSTANCE.createFunctions()));

		newChildDescriptors.add
			(createChildParameter
				(OaamPackage.Literals.ARCHITECTURE__HARDWARE,
				 HardwareFactory.eINSTANCE.createHardware()));

		newChildDescriptors.add
			(createChildParameter
				(OaamPackage.Literals.ARCHITECTURE__ANATOMY,
				 AnatomyFactory.eINSTANCE.createAnatomy()));

		newChildDescriptors.add
			(createChildParameter
				(OaamPackage.Literals.ARCHITECTURE__CAPABILITIES,
				 CapabilitiesFactory.eINSTANCE.createCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(OaamPackage.Literals.ARCHITECTURE__RESTRICTIONS,
				 RestrictionsFactory.eINSTANCE.createRestrictions()));

		newChildDescriptors.add
			(createChildParameter
				(OaamPackage.Literals.ARCHITECTURE__ALLOCATIONS,
				 AllocationsFactory.eINSTANCE.createAllocations()));
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
