/**
 */
package de.oaam.model.oaam.capabilities.provider;


import de.oaam.model.oaam.capabilities.CapabilitiesPackage;
import de.oaam.model.oaam.capabilities.SubDeviceCapability;

import de.oaam.model.oaam.common.CommonFactory;
import de.oaam.model.oaam.common.CommonPackage;

import de.oaam.model.oaam.scenario.ScenarioFactory;
import de.oaam.model.oaam.scenario.ScenarioPackage;

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
 * This is the item provider adapter for a {@link de.oaam.model.oaam.capabilities.SubDeviceCapability} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SubDeviceCapabilityItemProvider extends CapabilityAItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubDeviceCapabilityItemProvider(AdapterFactory adapterFactory) {
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
			addSubDeviceTypePropertyDescriptor(object);
			addTargetDeviceTypePropertyDescriptor(object);
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
				 getString("_UI_ElementA_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementA_id_feature", "_UI_ElementA_type"),
				 CommonPackage.Literals.ELEMENT_A__ID,
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
				 getString("_UI_ElementA_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementA_name_feature", "_UI_ElementA_type"),
				 CommonPackage.Literals.ELEMENT_A__NAME,
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
				 getString("_UI_ElementA_style_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementA_style_feature", "_UI_ElementA_type"),
				 CommonPackage.Literals.ELEMENT_A__STYLE,
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
				 getString("_UI_ElementA_documentation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementA_documentation_feature", "_UI_ElementA_type"),
				 CommonPackage.Literals.ELEMENT_A__DOCUMENTATION,
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
				 getString("_UI_ElementA_modified_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementA_modified_feature", "_UI_ElementA_type"),
				 CommonPackage.Literals.ELEMENT_A__MODIFIED,
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
				 getString("_UI_ElementA_modifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementA_modifier_feature", "_UI_ElementA_type"),
				 CommonPackage.Literals.ELEMENT_A__MODIFIER,
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
				 getString("_UI_ElementA_traceLink_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementA_traceLink_feature", "_UI_ElementA_type"),
				 CommonPackage.Literals.ELEMENT_A__TRACE_LINK,
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
	 * This adds a property descriptor for the Sub Device Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubDeviceTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubDeviceCapability_subDeviceType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubDeviceCapability_subDeviceType_feature", "_UI_SubDeviceCapability_type"),
				 CapabilitiesPackage.Literals.SUB_DEVICE_CAPABILITY__SUB_DEVICE_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Device Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetDeviceTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubDeviceCapability_targetDeviceType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubDeviceCapability_targetDeviceType_feature", "_UI_SubDeviceCapability_type"),
				 CapabilitiesPackage.Literals.SUB_DEVICE_CAPABILITY__TARGET_DEVICE_TYPE,
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
			childrenFeatures.add(CommonPackage.Literals.ELEMENT_A__ATTRIBUTES);
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
	 * This returns SubDeviceCapability.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SubDeviceCapability"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SubDeviceCapability)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SubDeviceCapability_type") :
			getString("_UI_SubDeviceCapability_type") + " " + label;
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

		switch (notification.getFeatureID(SubDeviceCapability.class)) {
			case CapabilitiesPackage.SUB_DEVICE_CAPABILITY__ID:
			case CapabilitiesPackage.SUB_DEVICE_CAPABILITY__NAME:
			case CapabilitiesPackage.SUB_DEVICE_CAPABILITY__STYLE:
			case CapabilitiesPackage.SUB_DEVICE_CAPABILITY__DOCUMENTATION:
			case CapabilitiesPackage.SUB_DEVICE_CAPABILITY__MODIFIED:
			case CapabilitiesPackage.SUB_DEVICE_CAPABILITY__MODIFIER:
			case CapabilitiesPackage.SUB_DEVICE_CAPABILITY__TRACE_LINK:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CapabilitiesPackage.SUB_DEVICE_CAPABILITY__ATTRIBUTES:
			case CapabilitiesPackage.SUB_DEVICE_CAPABILITY__OPERATION_MODES:
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
				(CommonPackage.Literals.ELEMENT_A__ATTRIBUTES,
				 CommonFactory.eINSTANCE.createAttributeString()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ELEMENT_A__ATTRIBUTES,
				 CommonFactory.eINSTANCE.createAttributeNumeric()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ELEMENT_A__ATTRIBUTES,
				 CommonFactory.eINSTANCE.createAttributeContainment()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ELEMENT_A__ATTRIBUTES,
				 CommonFactory.eINSTANCE.createAttributeReference()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES,
				 ScenarioFactory.eINSTANCE.createOperationModeReference()));
	}

}
