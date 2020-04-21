/**
 */
package de.oaam.model.oaam.functions.provider;


import de.oaam.model.oaam.common.CommonFactory;

import de.oaam.model.oaam.common.provider.OaamBaseElementAItemProvider;

import de.oaam.model.oaam.functions.FailureCondition;
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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.oaam.model.oaam.functions.FailureCondition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FailureConditionItemProvider extends OaamBaseElementAItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureConditionItemProvider(AdapterFactory adapterFactory) {
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
			addConditionPropertyDescriptor(object);
			addMaxOccurrenceProbabilityPropertyDescriptor(object);
			addNoSingleFailurePropertyDescriptor(object);
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
	 * This adds a property descriptor for the Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FailureCondition_condition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FailureCondition_condition_feature", "_UI_FailureCondition_type"),
				 FunctionsPackage.Literals.FAILURE_CONDITION__CONDITION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Occurrence Probability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxOccurrenceProbabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FailureCondition_maxOccurrenceProbability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FailureCondition_maxOccurrenceProbability_feature", "_UI_FailureCondition_type"),
				 FunctionsPackage.Literals.FAILURE_CONDITION__MAX_OCCURRENCE_PROBABILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the No Single Failure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNoSingleFailurePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FailureCondition_noSingleFailure_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FailureCondition_noSingleFailure_feature", "_UI_FailureCondition_type"),
				 FunctionsPackage.Literals.FAILURE_CONDITION__NO_SINGLE_FAILURE,
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
			childrenFeatures.add(ScenarioPackage.Literals.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES);
			childrenFeatures.add(FunctionsPackage.Literals.FAILURE_CONDITION__BOOLEAN_OPERATIONS);
			childrenFeatures.add(FunctionsPackage.Literals.FAILURE_CONDITION__BOOLEAN_NOTS);
			childrenFeatures.add(FunctionsPackage.Literals.FAILURE_CONDITION__OUTPUT_INTEGRITY_STATES);
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
	 * This returns FailureCondition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FailureCondition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FailureCondition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FailureCondition_type") :
			getString("_UI_FailureCondition_type") + " " + label;
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

		switch (notification.getFeatureID(FailureCondition.class)) {
			case FunctionsPackage.FAILURE_CONDITION__MAX_OCCURRENCE_PROBABILITY:
			case FunctionsPackage.FAILURE_CONDITION__NO_SINGLE_FAILURE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FunctionsPackage.FAILURE_CONDITION__OPERATION_MODES:
			case FunctionsPackage.FAILURE_CONDITION__BOOLEAN_OPERATIONS:
			case FunctionsPackage.FAILURE_CONDITION__BOOLEAN_NOTS:
			case FunctionsPackage.FAILURE_CONDITION__OUTPUT_INTEGRITY_STATES:
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
				(FunctionsPackage.Literals.FAILURE_CONDITION__BOOLEAN_OPERATIONS,
				 CommonFactory.eINSTANCE.createBoolOperation()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.FAILURE_CONDITION__BOOLEAN_NOTS,
				 CommonFactory.eINSTANCE.createBoolNot()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.FAILURE_CONDITION__OUTPUT_INTEGRITY_STATES,
				 FunctionsFactory.eINSTANCE.createOutputIntegrityState()));
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
