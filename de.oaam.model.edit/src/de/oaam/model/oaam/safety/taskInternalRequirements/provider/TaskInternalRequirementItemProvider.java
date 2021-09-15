/**
 */
package de.oaam.model.oaam.safety.taskInternalRequirements.provider;


import de.oaam.model.oaam.common.provider.OaamBaseElementAItemProvider;

import de.oaam.model.oaam.provider.OaamEditPlugin;

import de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirement;
import de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsFactory;
import de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage;

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
 * This is the item provider adapter for a {@link de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskInternalRequirementItemProvider extends OaamBaseElementAItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskInternalRequirementItemProvider(AdapterFactory adapterFactory) {
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

			addRequiresPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Requires feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiresPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskInternalRequirement_requires_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskInternalRequirement_requires_feature", "_UI_TaskInternalRequirement_type"),
				 TaskInternalRequirementsPackage.Literals.TASK_INTERNAL_REQUIREMENT__REQUIRES,
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
			childrenFeatures.add(TaskInternalRequirementsPackage.Literals.TASK_INTERNAL_REQUIREMENT__COMPONENTS);
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
	 * This returns TaskInternalRequirement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TaskInternalRequirement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TaskInternalRequirement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TaskInternalRequirement_type") :
			getString("_UI_TaskInternalRequirement_type") + " " + label;
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

		switch (notification.getFeatureID(TaskInternalRequirement.class)) {
			case TaskInternalRequirementsPackage.TASK_INTERNAL_REQUIREMENT__COMPONENTS:
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
				(TaskInternalRequirementsPackage.Literals.TASK_INTERNAL_REQUIREMENT__COMPONENTS,
				 TaskInternalRequirementsFactory.eINSTANCE.createAgreement()));

		newChildDescriptors.add
			(createChildParameter
				(TaskInternalRequirementsPackage.Literals.TASK_INTERNAL_REQUIREMENT__COMPONENTS,
				 TaskInternalRequirementsFactory.eINSTANCE.createBelow()));

		newChildDescriptors.add
			(createChildParameter
				(TaskInternalRequirementsPackage.Literals.TASK_INTERNAL_REQUIREMENT__COMPONENTS,
				 TaskInternalRequirementsFactory.eINSTANCE.createAbove()));

		newChildDescriptors.add
			(createChildParameter
				(TaskInternalRequirementsPackage.Literals.TASK_INTERNAL_REQUIREMENT__COMPONENTS,
				 TaskInternalRequirementsFactory.eINSTANCE.createIoSignal()));

		newChildDescriptors.add
			(createChildParameter
				(TaskInternalRequirementsPackage.Literals.TASK_INTERNAL_REQUIREMENT__COMPONENTS,
				 TaskInternalRequirementsFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(TaskInternalRequirementsPackage.Literals.TASK_INTERNAL_REQUIREMENT__COMPONENTS,
				 TaskInternalRequirementsFactory.eINSTANCE.createBoolTimeout()));

		newChildDescriptors.add
			(createChildParameter
				(TaskInternalRequirementsPackage.Literals.TASK_INTERNAL_REQUIREMENT__COMPONENTS,
				 TaskInternalRequirementsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(TaskInternalRequirementsPackage.Literals.TASK_INTERNAL_REQUIREMENT__COMPONENTS,
				 TaskInternalRequirementsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(TaskInternalRequirementsPackage.Literals.TASK_INTERNAL_REQUIREMENT__COMPONENTS,
				 TaskInternalRequirementsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(TaskInternalRequirementsPackage.Literals.TASK_INTERNAL_REQUIREMENT__COMPONENTS,
				 TaskInternalRequirementsFactory.eINSTANCE.createContract()));
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
