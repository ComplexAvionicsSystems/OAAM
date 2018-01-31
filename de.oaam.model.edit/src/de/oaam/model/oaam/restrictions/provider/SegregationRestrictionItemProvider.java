/**
 */
package de.oaam.model.oaam.restrictions.provider;


import de.oaam.model.oaam.common.provider.ElementAItemProvider;
import de.oaam.model.oaam.provider.OaamEditPlugin;

import de.oaam.model.oaam.restrictions.RestrictionsPackage;
import de.oaam.model.oaam.restrictions.SegregationRestriction;

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
 * This is the item provider adapter for a {@link de.oaam.model.oaam.restrictions.SegregationRestriction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SegregationRestrictionItemProvider extends ElementAItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegregationRestrictionItemProvider(AdapterFactory adapterFactory) {
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
			addTasksAPropertyDescriptor(object);
			addTasksBPropertyDescriptor(object);
			addDissimilarTechnologyPropertyDescriptor(object);
			addDissimilarLocationPropertyDescriptor(object);
			addSubFunctionsAPropertyDescriptor(object);
			addSubFunctionsBPropertyDescriptor(object);
			addDissimilarAreaPropertyDescriptor(object);
			addDissimilarPowerSourcePropertyDescriptor(object);
			addSignalsAPropertyDescriptor(object);
			addSignalsBPropertyDescriptor(object);
			addTaskGroupsAPropertyDescriptor(object);
			addTaskGroupsBPropertyDescriptor(object);
			addSignalGroupsBPropertyDescriptor(object);
			addSignalGroupsAPropertyDescriptor(object);
			addDevicesAPropertyDescriptor(object);
			addDevicesBPropertyDescriptor(object);
			addConnectionsAPropertyDescriptor(object);
			addConnectionsBPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Tasks A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTasksAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SegregationRestriction_tasksA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SegregationRestriction_tasksA_feature", "_UI_SegregationRestriction_type"),
				 RestrictionsPackage.Literals.SEGREGATION_RESTRICTION__TASKS_A,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tasks B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTasksBPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SegregationRestriction_tasksB_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SegregationRestriction_tasksB_feature", "_UI_SegregationRestriction_type"),
				 RestrictionsPackage.Literals.SEGREGATION_RESTRICTION__TASKS_B,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dissimilar Technology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDissimilarTechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SegregationRestriction_dissimilarTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SegregationRestriction_dissimilarTechnology_feature", "_UI_SegregationRestriction_type"),
				 RestrictionsPackage.Literals.SEGREGATION_RESTRICTION__DISSIMILAR_TECHNOLOGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dissimilar Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDissimilarLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SegregationRestriction_dissimilarLocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SegregationRestriction_dissimilarLocation_feature", "_UI_SegregationRestriction_type"),
				 RestrictionsPackage.Literals.SEGREGATION_RESTRICTION__DISSIMILAR_LOCATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sub Functions A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubFunctionsAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SegregationRestriction_subFunctionsA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SegregationRestriction_subFunctionsA_feature", "_UI_SegregationRestriction_type"),
				 RestrictionsPackage.Literals.SEGREGATION_RESTRICTION__SUB_FUNCTIONS_A,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sub Functions B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubFunctionsBPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SegregationRestriction_subFunctionsB_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SegregationRestriction_subFunctionsB_feature", "_UI_SegregationRestriction_type"),
				 RestrictionsPackage.Literals.SEGREGATION_RESTRICTION__SUB_FUNCTIONS_B,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dissimilar Area feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDissimilarAreaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SegregationRestriction_dissimilarArea_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SegregationRestriction_dissimilarArea_feature", "_UI_SegregationRestriction_type"),
				 RestrictionsPackage.Literals.SEGREGATION_RESTRICTION__DISSIMILAR_AREA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dissimilar Power Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDissimilarPowerSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SegregationRestriction_dissimilarPowerSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SegregationRestriction_dissimilarPowerSource_feature", "_UI_SegregationRestriction_type"),
				 RestrictionsPackage.Literals.SEGREGATION_RESTRICTION__DISSIMILAR_POWER_SOURCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Signals A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSignalsAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SegregationRestriction_signalsA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SegregationRestriction_signalsA_feature", "_UI_SegregationRestriction_type"),
				 RestrictionsPackage.Literals.SEGREGATION_RESTRICTION__SIGNALS_A,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Signals B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSignalsBPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SegregationRestriction_signalsB_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SegregationRestriction_signalsB_feature", "_UI_SegregationRestriction_type"),
				 RestrictionsPackage.Literals.SEGREGATION_RESTRICTION__SIGNALS_B,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Task Groups A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTaskGroupsAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SegregationRestriction_taskGroupsA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SegregationRestriction_taskGroupsA_feature", "_UI_SegregationRestriction_type"),
				 RestrictionsPackage.Literals.SEGREGATION_RESTRICTION__TASK_GROUPS_A,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Task Groups B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTaskGroupsBPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SegregationRestriction_taskGroupsB_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SegregationRestriction_taskGroupsB_feature", "_UI_SegregationRestriction_type"),
				 RestrictionsPackage.Literals.SEGREGATION_RESTRICTION__TASK_GROUPS_B,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Signal Groups B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSignalGroupsBPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SegregationRestriction_signalGroupsB_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SegregationRestriction_signalGroupsB_feature", "_UI_SegregationRestriction_type"),
				 RestrictionsPackage.Literals.SEGREGATION_RESTRICTION__SIGNAL_GROUPS_B,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Signal Groups A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSignalGroupsAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SegregationRestriction_signalGroupsA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SegregationRestriction_signalGroupsA_feature", "_UI_SegregationRestriction_type"),
				 RestrictionsPackage.Literals.SEGREGATION_RESTRICTION__SIGNAL_GROUPS_A,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Devices A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDevicesAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SegregationRestriction_devicesA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SegregationRestriction_devicesA_feature", "_UI_SegregationRestriction_type"),
				 RestrictionsPackage.Literals.SEGREGATION_RESTRICTION__DEVICES_A,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Devices B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDevicesBPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SegregationRestriction_devicesB_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SegregationRestriction_devicesB_feature", "_UI_SegregationRestriction_type"),
				 RestrictionsPackage.Literals.SEGREGATION_RESTRICTION__DEVICES_B,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connections A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectionsAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SegregationRestriction_connectionsA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SegregationRestriction_connectionsA_feature", "_UI_SegregationRestriction_type"),
				 RestrictionsPackage.Literals.SEGREGATION_RESTRICTION__CONNECTIONS_A,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connections B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectionsBPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SegregationRestriction_connectionsB_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SegregationRestriction_connectionsB_feature", "_UI_SegregationRestriction_type"),
				 RestrictionsPackage.Literals.SEGREGATION_RESTRICTION__CONNECTIONS_B,
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
	 * This returns SegregationRestriction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SegregationRestriction"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SegregationRestriction)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SegregationRestriction_type") :
			getString("_UI_SegregationRestriction_type") + " " + label;
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

		switch (notification.getFeatureID(SegregationRestriction.class)) {
			case RestrictionsPackage.SEGREGATION_RESTRICTION__DISSIMILAR_TECHNOLOGY:
			case RestrictionsPackage.SEGREGATION_RESTRICTION__DISSIMILAR_LOCATION:
			case RestrictionsPackage.SEGREGATION_RESTRICTION__DISSIMILAR_AREA:
			case RestrictionsPackage.SEGREGATION_RESTRICTION__DISSIMILAR_POWER_SOURCE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RestrictionsPackage.SEGREGATION_RESTRICTION__OPERATION_MODES:
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
