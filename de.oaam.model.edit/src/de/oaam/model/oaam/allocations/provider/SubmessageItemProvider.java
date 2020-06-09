/**
 */
package de.oaam.model.oaam.allocations.provider;


import de.oaam.model.oaam.allocations.AllocationsFactory;
import de.oaam.model.oaam.allocations.AllocationsPackage;
import de.oaam.model.oaam.allocations.Submessage;

import de.oaam.model.oaam.common.provider.OaamBaseElementAItemProvider;
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
 * This is the item provider adapter for a {@link de.oaam.model.oaam.allocations.Submessage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SubmessageItemProvider extends OaamBaseElementAItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmessageItemProvider(AdapterFactory adapterFactory) {
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
			addTypePropertyDescriptor(object);
			addIsPersistentPropertyDescriptor(object);
			addLengthPropertyDescriptor(object);
			addPathPropertyDescriptor(object);
			addCapabilityPropertyDescriptor(object);
			addPositionPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MessageA_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MessageA_type_feature", "_UI_MessageA_type"),
				 AllocationsPackage.Literals.MESSAGE_A__TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Persistent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsPersistentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MessageA_isPersistent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MessageA_isPersistent_feature", "_UI_MessageA_type"),
				 AllocationsPackage.Literals.MESSAGE_A__IS_PERSISTENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MessageA_length_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MessageA_length_feature", "_UI_MessageA_type"),
				 AllocationsPackage.Literals.MESSAGE_A__LENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MessageA_path_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MessageA_path_feature", "_UI_MessageA_type"),
				 AllocationsPackage.Literals.MESSAGE_A__PATH,
				 true,
				 false,
				 true,
				 null,
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
				 getString("_UI_Submessage_capability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Submessage_capability_feature", "_UI_Submessage_type"),
				 AllocationsPackage.Literals.SUBMESSAGE__CAPABILITY,
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
				 getString("_UI_Submessage_position_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Submessage_position_feature", "_UI_Submessage_type"),
				 AllocationsPackage.Literals.SUBMESSAGE__POSITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(AllocationsPackage.Literals.MESSAGE_A__SCHEDULES);
			childrenFeatures.add(AllocationsPackage.Literals.MESSAGE_A__SUBMESSAGES);
			childrenFeatures.add(AllocationsPackage.Literals.MESSAGE_A__SIGNAL_TO_MESSAGE_ASSIGNMENTS);
			childrenFeatures.add(AllocationsPackage.Literals.MESSAGE_A__SEGMENTS);
			childrenFeatures.add(AllocationsPackage.Literals.MESSAGE_A__PATH);
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
	 * This returns Submessage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Submessage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Submessage)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Submessage_type") :
			getString("_UI_Submessage_type") + " " + label;
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

		switch (notification.getFeatureID(Submessage.class)) {
			case AllocationsPackage.SUBMESSAGE__IS_PERSISTENT:
			case AllocationsPackage.SUBMESSAGE__LENGTH:
			case AllocationsPackage.SUBMESSAGE__POSITION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AllocationsPackage.SUBMESSAGE__OPERATION_MODES:
			case AllocationsPackage.SUBMESSAGE__SCHEDULES:
			case AllocationsPackage.SUBMESSAGE__SUBMESSAGES:
			case AllocationsPackage.SUBMESSAGE__SIGNAL_TO_MESSAGE_ASSIGNMENTS:
			case AllocationsPackage.SUBMESSAGE__SEGMENTS:
			case AllocationsPackage.SUBMESSAGE__PATH:
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
				(AllocationsPackage.Literals.MESSAGE_A__SCHEDULES,
				 AllocationsFactory.eINSTANCE.createSchedule()));

		newChildDescriptors.add
			(createChildParameter
				(AllocationsPackage.Literals.MESSAGE_A__SUBMESSAGES,
				 AllocationsFactory.eINSTANCE.createSubmessage()));

		newChildDescriptors.add
			(createChildParameter
				(AllocationsPackage.Literals.MESSAGE_A__SIGNAL_TO_MESSAGE_ASSIGNMENTS,
				 AllocationsFactory.eINSTANCE.createSignalToMessageAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(AllocationsPackage.Literals.MESSAGE_A__SEGMENTS,
				 AllocationsFactory.eINSTANCE.createSegment()));

		newChildDescriptors.add
			(createChildParameter
				(AllocationsPackage.Literals.MESSAGE_A__SEGMENTS,
				 AllocationsFactory.eINSTANCE.createPath()));

		newChildDescriptors.add
			(createChildParameter
				(AllocationsPackage.Literals.MESSAGE_A__SEGMENTS,
				 AllocationsFactory.eINSTANCE.createPathGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AllocationsPackage.Literals.MESSAGE_A__PATH,
				 AllocationsFactory.eINSTANCE.createPath()));

		newChildDescriptors.add
			(createChildParameter
				(AllocationsPackage.Literals.MESSAGE_A__PATH,
				 AllocationsFactory.eINSTANCE.createPathGroup()));
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
			childFeature == AllocationsPackage.Literals.MESSAGE_A__SEGMENTS ||
			childFeature == AllocationsPackage.Literals.MESSAGE_A__PATH;

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
