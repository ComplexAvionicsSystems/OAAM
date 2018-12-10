/**
 */
package de.oaam.model.oaam.functions.provider;


import de.oaam.model.oaam.common.provider.OaamBaseElementAItemProvider;

import de.oaam.model.oaam.functions.FunctionsContainerA;
import de.oaam.model.oaam.functions.FunctionsFactory;
import de.oaam.model.oaam.functions.FunctionsPackage;

import de.oaam.model.oaam.provider.OaamEditPlugin;

import de.oaam.model.oaam.scenario.ScenarioFactory;
import de.oaam.model.oaam.scenario.ScenarioPackage;

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
 * This is the item provider adapter for a {@link de.oaam.model.oaam.functions.FunctionsContainerA} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionsContainerAItemProvider extends OaamBaseElementAItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionsContainerAItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(FunctionsPackage.Literals.FUNCTIONS_CONTAINER_A__TASKS);
			childrenFeatures.add(FunctionsPackage.Literals.FUNCTIONS_CONTAINER_A__TASK_LINKS);
			childrenFeatures.add(FunctionsPackage.Literals.FUNCTIONS_CONTAINER_A__TASK_GROUPS);
			childrenFeatures.add(FunctionsPackage.Literals.FUNCTIONS_CONTAINER_A__TASK_SYMMETRIES);
			childrenFeatures.add(FunctionsPackage.Literals.FUNCTIONS_CONTAINER_A__TASK_REDUNDANCIES);
			childrenFeatures.add(FunctionsPackage.Literals.FUNCTIONS_CONTAINER_A__SIGNALS);
			childrenFeatures.add(FunctionsPackage.Literals.FUNCTIONS_CONTAINER_A__SIGNAL_GROUPS);
			childrenFeatures.add(FunctionsPackage.Literals.FUNCTIONS_CONTAINER_A__FAILURE_CONDITIONS);
			childrenFeatures.add(FunctionsPackage.Literals.FUNCTIONS_CONTAINER_A__SUBFUNCTIONS);
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
		String label = ((FunctionsContainerA)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FunctionsContainerA_type") :
			getString("_UI_FunctionsContainerA_type") + " " + label;
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

		switch (notification.getFeatureID(FunctionsContainerA.class)) {
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__OPERATION_MODES:
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASKS:
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASK_LINKS:
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASK_GROUPS:
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASK_SYMMETRIES:
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__TASK_REDUNDANCIES:
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__SIGNALS:
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__SIGNAL_GROUPS:
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__FAILURE_CONDITIONS:
			case FunctionsPackage.FUNCTIONS_CONTAINER_A__SUBFUNCTIONS:
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
				(FunctionsPackage.Literals.FUNCTIONS_CONTAINER_A__TASKS,
				 FunctionsFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.FUNCTIONS_CONTAINER_A__TASK_LINKS,
				 FunctionsFactory.eINSTANCE.createExternalTaskLink()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.FUNCTIONS_CONTAINER_A__TASK_GROUPS,
				 FunctionsFactory.eINSTANCE.createTaskGroup()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.FUNCTIONS_CONTAINER_A__TASK_SYMMETRIES,
				 FunctionsFactory.eINSTANCE.createTaskSymmetry()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.FUNCTIONS_CONTAINER_A__TASK_REDUNDANCIES,
				 FunctionsFactory.eINSTANCE.createTaskRedundancy()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.FUNCTIONS_CONTAINER_A__SIGNALS,
				 FunctionsFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.FUNCTIONS_CONTAINER_A__SIGNAL_GROUPS,
				 FunctionsFactory.eINSTANCE.createSignalGroup()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.FUNCTIONS_CONTAINER_A__FAILURE_CONDITIONS,
				 FunctionsFactory.eINSTANCE.createFailureCondition()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.FUNCTIONS_CONTAINER_A__SUBFUNCTIONS,
				 FunctionsFactory.eINSTANCE.createSubfunctions()));
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
