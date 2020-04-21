/**
 */
package de.oaam.model.oaam.systems.provider;


import de.oaam.model.oaam.common.CommonFactory;
import de.oaam.model.oaam.common.CommonPackage;

import de.oaam.model.oaam.scenario.ScenarioFactory;
import de.oaam.model.oaam.scenario.ScenarioPackage;

import de.oaam.model.oaam.systems.InformationSignal;
import de.oaam.model.oaam.systems.SystemsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.oaam.model.oaam.systems.InformationSignal} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InformationSignalItemProvider extends ProvidedInformationAItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationSignalItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addStylePropertyDescriptor(object);
			addDocumentationPropertyDescriptor(object);
			addModifiedPropertyDescriptor(object);
			addModifierPropertyDescriptor(object);
			addTraceLinkPropertyDescriptor(object);
			addVariantsPropertyDescriptor(object);
			addRatePropertyDescriptor(object);
			addLatencyPropertyDescriptor(object);
			addAccuracyPropertyDescriptor(object);
			addResolutionPropertyDescriptor(object);
			addUnitPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OaamBaseElementA_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OaamBaseElementA_id_feature", "_UI_OaamBaseElementA_type"),
				 CommonPackage.Literals.OAAM_BASE_ELEMENT_A__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OaamBaseElementA_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OaamBaseElementA_name_feature", "_UI_OaamBaseElementA_type"),
				 CommonPackage.Literals.OAAM_BASE_ELEMENT_A__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OaamBaseElementA_style_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OaamBaseElementA_style_feature", "_UI_OaamBaseElementA_type"),
				 CommonPackage.Literals.OAAM_BASE_ELEMENT_A__STYLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Documentation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDocumentationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OaamBaseElementA_documentation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OaamBaseElementA_documentation_feature", "_UI_OaamBaseElementA_type"),
				 CommonPackage.Literals.OAAM_BASE_ELEMENT_A__DOCUMENTATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Modified feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModifiedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OaamBaseElementA_modified_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OaamBaseElementA_modified_feature", "_UI_OaamBaseElementA_type"),
				 CommonPackage.Literals.OAAM_BASE_ELEMENT_A__MODIFIED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Modifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OaamBaseElementA_modifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OaamBaseElementA_modifier_feature", "_UI_OaamBaseElementA_type"),
				 CommonPackage.Literals.OAAM_BASE_ELEMENT_A__MODIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trace Link feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTraceLinkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OaamBaseElementA_traceLink_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OaamBaseElementA_traceLink_feature", "_UI_OaamBaseElementA_type"),
				 CommonPackage.Literals.OAAM_BASE_ELEMENT_A__TRACE_LINK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
	 * This adds a property descriptor for the Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InformationSignal_rate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InformationSignal_rate_feature", "_UI_InformationSignal_type"),
				 SystemsPackage.Literals.INFORMATION_SIGNAL__RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Latency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLatencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InformationSignal_latency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InformationSignal_latency_feature", "_UI_InformationSignal_type"),
				 SystemsPackage.Literals.INFORMATION_SIGNAL__LATENCY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Accuracy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccuracyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InformationSignal_accuracy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InformationSignal_accuracy_feature", "_UI_InformationSignal_type"),
				 SystemsPackage.Literals.INFORMATION_SIGNAL__ACCURACY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resolution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InformationSignal_resolution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InformationSignal_resolution_feature", "_UI_InformationSignal_type"),
				 SystemsPackage.Literals.INFORMATION_SIGNAL__RESOLUTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InformationSignal_unit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InformationSignal_unit_feature", "_UI_InformationSignal_type"),
				 SystemsPackage.Literals.INFORMATION_SIGNAL__UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(CommonPackage.Literals.OAAM_BASE_ELEMENT_A__ATTRIBUTES);
			childrenFeatures.add(ScenarioPackage.Literals.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES);
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
	 * This returns InformationSignal.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InformationSignal"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((InformationSignal)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_InformationSignal_type") :
			getString("_UI_InformationSignal_type") + " " + label;
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

		switch (notification.getFeatureID(InformationSignal.class)) {
			case SystemsPackage.INFORMATION_SIGNAL__ID:
			case SystemsPackage.INFORMATION_SIGNAL__NAME:
			case SystemsPackage.INFORMATION_SIGNAL__STYLE:
			case SystemsPackage.INFORMATION_SIGNAL__DOCUMENTATION:
			case SystemsPackage.INFORMATION_SIGNAL__MODIFIED:
			case SystemsPackage.INFORMATION_SIGNAL__MODIFIER:
			case SystemsPackage.INFORMATION_SIGNAL__TRACE_LINK:
			case SystemsPackage.INFORMATION_SIGNAL__RATE:
			case SystemsPackage.INFORMATION_SIGNAL__LATENCY:
			case SystemsPackage.INFORMATION_SIGNAL__ACCURACY:
			case SystemsPackage.INFORMATION_SIGNAL__RESOLUTION:
			case SystemsPackage.INFORMATION_SIGNAL__UNIT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SystemsPackage.INFORMATION_SIGNAL__ATTRIBUTES:
			case SystemsPackage.INFORMATION_SIGNAL__OPERATION_MODES:
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
				(CommonPackage.Literals.OAAM_BASE_ELEMENT_A__ATTRIBUTES,
				 CommonFactory.eINSTANCE.createAttributeString()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.OAAM_BASE_ELEMENT_A__ATTRIBUTES,
				 CommonFactory.eINSTANCE.createAttributeNumeric()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.OAAM_BASE_ELEMENT_A__ATTRIBUTES,
				 CommonFactory.eINSTANCE.createAttributeContainment()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.OAAM_BASE_ELEMENT_A__ATTRIBUTES,
				 CommonFactory.eINSTANCE.createAttributeReference()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES,
				 ScenarioFactory.eINSTANCE.createOperationModeReference()));
	}

}
