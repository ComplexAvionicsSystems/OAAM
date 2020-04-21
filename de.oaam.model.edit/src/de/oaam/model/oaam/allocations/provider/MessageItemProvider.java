/**
 */
package de.oaam.model.oaam.allocations.provider;


import de.oaam.model.oaam.allocations.AllocationsFactory;
import de.oaam.model.oaam.allocations.AllocationsPackage;
import de.oaam.model.oaam.allocations.Message;

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
 * This is the item provider adapter for a {@link de.oaam.model.oaam.allocations.Message} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MessageItemProvider extends OaamBaseElementAItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageItemProvider(AdapterFactory adapterFactory) {
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
			addBusPropertyDescriptor(object);
			addSourceDevicesPropertyDescriptor(object);
			addDestinationDevicesPropertyDescriptor(object);
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
				 getString("_UI_Message_capability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Message_capability_feature", "_UI_Message_type"),
				 AllocationsPackage.Literals.MESSAGE__CAPABILITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Message_bus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Message_bus_feature", "_UI_Message_type"),
				 AllocationsPackage.Literals.MESSAGE__BUS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Devices feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceDevicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Message_sourceDevices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Message_sourceDevices_feature", "_UI_Message_type"),
				 AllocationsPackage.Literals.MESSAGE__SOURCE_DEVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Destination Devices feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDestinationDevicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Message_destinationDevices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Message_destinationDevices_feature", "_UI_Message_type"),
				 AllocationsPackage.Literals.MESSAGE__DESTINATION_DEVICES,
				 true,
				 false,
				 true,
				 null,
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
	 * This returns Message.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Message"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Message)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Message_type") :
			getString("_UI_Message_type") + " " + label;
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

		switch (notification.getFeatureID(Message.class)) {
			case AllocationsPackage.MESSAGE__IS_PERSISTENT:
			case AllocationsPackage.MESSAGE__LENGTH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AllocationsPackage.MESSAGE__OPERATION_MODES:
			case AllocationsPackage.MESSAGE__SCHEDULES:
			case AllocationsPackage.MESSAGE__SUBMESSAGES:
			case AllocationsPackage.MESSAGE__SIGNAL_TO_MESSAGE_ASSIGNMENTS:
			case AllocationsPackage.MESSAGE__SEGMENTS:
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
