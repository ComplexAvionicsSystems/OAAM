/**
 */
package de.oaam.model.oaam.systems.provider;


import de.oaam.model.oaam.common.provider.OaamBaseElementAItemProvider;

import de.oaam.model.oaam.provider.OaamEditPlugin;

import de.oaam.model.oaam.scenario.ScenarioFactory;
import de.oaam.model.oaam.scenario.ScenarioPackage;

import de.oaam.model.oaam.systems.SystemsFactory;
import de.oaam.model.oaam.systems.SystemsPackage;

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
 * This is the item provider adapter for a {@link de.oaam.model.oaam.systems.System} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemItemProvider extends OaamBaseElementAItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemItemProvider(AdapterFactory adapterFactory) {
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

			addVariantsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_VariantDependentElementA_variants_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariantDependentElementA_variants_feature", "_UI_VariantDependentElementA_type"),
				 ScenarioPackage.Literals.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS,
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
			childrenFeatures.add(ScenarioPackage.Literals.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES);
			childrenFeatures.add(SystemsPackage.Literals.SYSTEM__PROVIDED_OUTPUTS);
			childrenFeatures.add(SystemsPackage.Literals.SYSTEM__REQUIRED_INPUTS);
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
	 * This returns System.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/System"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((de.oaam.model.oaam.systems.System)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_System_type") :
			getString("_UI_System_type") + " " + label;
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

		switch (notification.getFeatureID(de.oaam.model.oaam.systems.System.class)) {
			case SystemsPackage.SYSTEM__OPERATION_MODES:
			case SystemsPackage.SYSTEM__PROVIDED_OUTPUTS:
			case SystemsPackage.SYSTEM__REQUIRED_INPUTS:
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
				(ScenarioPackage.Literals.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES,
				 ScenarioFactory.eINSTANCE.createOperationModeReference()));

		newChildDescriptors.add
			(createChildParameter
				(SystemsPackage.Literals.SYSTEM__PROVIDED_OUTPUTS,
				 SystemsFactory.eINSTANCE.createInformationSignal()));

		newChildDescriptors.add
			(createChildParameter
				(SystemsPackage.Literals.SYSTEM__PROVIDED_OUTPUTS,
				 SystemsFactory.eINSTANCE.createInformationMaterial()));

		newChildDescriptors.add
			(createChildParameter
				(SystemsPackage.Literals.SYSTEM__PROVIDED_OUTPUTS,
				 SystemsFactory.eINSTANCE.createInformationPower()));

		newChildDescriptors.add
			(createChildParameter
				(SystemsPackage.Literals.SYSTEM__PROVIDED_OUTPUTS,
				 SystemsFactory.eINSTANCE.createElectricPower()));

		newChildDescriptors.add
			(createChildParameter
				(SystemsPackage.Literals.SYSTEM__PROVIDED_OUTPUTS,
				 SystemsFactory.eINSTANCE.createHydraulicPower()));

		newChildDescriptors.add
			(createChildParameter
				(SystemsPackage.Literals.SYSTEM__PROVIDED_OUTPUTS,
				 SystemsFactory.eINSTANCE.createRotaryPower()));

		newChildDescriptors.add
			(createChildParameter
				(SystemsPackage.Literals.SYSTEM__PROVIDED_OUTPUTS,
				 SystemsFactory.eINSTANCE.createLinearPower()));

		newChildDescriptors.add
			(createChildParameter
				(SystemsPackage.Literals.SYSTEM__REQUIRED_INPUTS,
				 SystemsFactory.eINSTANCE.createInformationSignal()));

		newChildDescriptors.add
			(createChildParameter
				(SystemsPackage.Literals.SYSTEM__REQUIRED_INPUTS,
				 SystemsFactory.eINSTANCE.createInformationMaterial()));

		newChildDescriptors.add
			(createChildParameter
				(SystemsPackage.Literals.SYSTEM__REQUIRED_INPUTS,
				 SystemsFactory.eINSTANCE.createInformationPower()));

		newChildDescriptors.add
			(createChildParameter
				(SystemsPackage.Literals.SYSTEM__REQUIRED_INPUTS,
				 SystemsFactory.eINSTANCE.createElectricPower()));

		newChildDescriptors.add
			(createChildParameter
				(SystemsPackage.Literals.SYSTEM__REQUIRED_INPUTS,
				 SystemsFactory.eINSTANCE.createHydraulicPower()));

		newChildDescriptors.add
			(createChildParameter
				(SystemsPackage.Literals.SYSTEM__REQUIRED_INPUTS,
				 SystemsFactory.eINSTANCE.createRotaryPower()));

		newChildDescriptors.add
			(createChildParameter
				(SystemsPackage.Literals.SYSTEM__REQUIRED_INPUTS,
				 SystemsFactory.eINSTANCE.createLinearPower()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == SystemsPackage.Literals.SYSTEM__PROVIDED_OUTPUTS ||
			childFeature == SystemsPackage.Literals.SYSTEM__REQUIRED_INPUTS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
