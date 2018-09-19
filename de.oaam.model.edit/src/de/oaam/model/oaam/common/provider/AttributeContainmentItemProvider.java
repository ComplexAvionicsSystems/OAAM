/**
 */
package de.oaam.model.oaam.common.provider;


import de.oaam.model.oaam.OaamFactory;

import de.oaam.model.oaam.allocations.AllocationsFactory;
import de.oaam.model.oaam.anatomy.AnatomyFactory;

import de.oaam.model.oaam.capabilities.CapabilitiesFactory;

import de.oaam.model.oaam.common.AttributeContainment;
import de.oaam.model.oaam.common.CommonFactory;
import de.oaam.model.oaam.common.CommonPackage;

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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.oaam.model.oaam.common.AttributeContainment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeContainmentItemProvider extends AttributeAItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeContainmentItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE);
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
	 * This returns AttributeContainment.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AttributeContainment"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AttributeContainment)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AttributeContainment_type") :
			getString("_UI_AttributeContainment_type") + " " + label;
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

		switch (notification.getFeatureID(AttributeContainment.class)) {
			case CommonPackage.ATTRIBUTE_CONTAINMENT__VALUE:
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
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 CommonFactory.eINSTANCE.createAttributeString()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 CommonFactory.eINSTANCE.createAttributeNumeric()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 CommonFactory.eINSTANCE.createAttributeContainment()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 CommonFactory.eINSTANCE.createAttributeReference()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 CommonFactory.eINSTANCE.createBoolOperation()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 CommonFactory.eINSTANCE.createBoolNot()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 CommonFactory.eINSTANCE.createInteger()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 CommonFactory.eINSTANCE.createArray()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 CommonFactory.eINSTANCE.createStruct()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 CommonFactory.eINSTANCE.createFloatingPoint()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 CommonFactory.eINSTANCE.createByte()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 CommonFactory.eINSTANCE.createCharacter()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 CommonFactory.eINSTANCE.createBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 OaamFactory.eINSTANCE.createArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createResourceType()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createResourceAlternatives()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createResourceBundle()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createTaskType()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createSignalType()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createDeviceType()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createConnectionType()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createLocationType()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createDuctType()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createWireType()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createInputDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createOutputDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createIoDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createDuctOpeningDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createResourceGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createDeviceTypeSymmetry()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createIoGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createAttributeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createFaultPropagation()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createFunctionInputState()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createPowerSource()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createResourceLink()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createResourceTypeModifier()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createResourceTypeModifierLevel()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createResourceTypeModifierReference()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createTaskTypeDissimilarity()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createDeviceTypeDissimilarity()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createResourceTypeDissimilarity()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createLibrary()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createSublibrary()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createOutputTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createFunctionInputTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createInternalStateDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 LibraryFactory.eINSTANCE.createParameterDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 ScenarioFactory.eINSTANCE.createOperationMode()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 ScenarioFactory.eINSTANCE.createParameterNumeric()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 ScenarioFactory.eINSTANCE.createParameterBool()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 ScenarioFactory.eINSTANCE.createVariant()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 ScenarioFactory.eINSTANCE.createOperationModeReference()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 ScenarioFactory.eINSTANCE.createScenario()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 ScenarioFactory.eINSTANCE.createSubscenario()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 SystemsFactory.eINSTANCE.createSystems()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 SystemsFactory.eINSTANCE.createSubsystem()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 SystemsFactory.eINSTANCE.createSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 SystemsFactory.eINSTANCE.createInformation()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 SystemsFactory.eINSTANCE.createInformationFlow()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 SystemsFactory.eINSTANCE.createPower()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 SystemsFactory.eINSTANCE.createElectricPower()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 SystemsFactory.eINSTANCE.createHydraulicPower()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 SystemsFactory.eINSTANCE.createRotaryPower()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 SystemsFactory.eINSTANCE.createLinearPower()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 SystemsFactory.eINSTANCE.createInputSegregation()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 FunctionsFactory.eINSTANCE.createFunctions()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 FunctionsFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 FunctionsFactory.eINSTANCE.createExternalTaskLink()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 FunctionsFactory.eINSTANCE.createTaskGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 FunctionsFactory.eINSTANCE.createTaskSymmetry()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 FunctionsFactory.eINSTANCE.createTaskRedundancy()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 FunctionsFactory.eINSTANCE.createFailureCondition()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 FunctionsFactory.eINSTANCE.createSystemInputState()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 FunctionsFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 FunctionsFactory.eINSTANCE.createSignalGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 FunctionsFactory.eINSTANCE.createInput()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 FunctionsFactory.eINSTANCE.createOutput()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 FunctionsFactory.eINSTANCE.createExternalOutputLink()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 FunctionsFactory.eINSTANCE.createSubfunctions()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 FunctionsFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 HardwareFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 HardwareFactory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 HardwareFactory.eINSTANCE.createIo()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 HardwareFactory.eINSTANCE.createDeviceSymmetry()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 HardwareFactory.eINSTANCE.createHardware()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 HardwareFactory.eINSTANCE.createSubhardware()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 AnatomyFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 AnatomyFactory.eINSTANCE.createArea()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 AnatomyFactory.eINSTANCE.createDuct()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 AnatomyFactory.eINSTANCE.createDuctOpening()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 AnatomyFactory.eINSTANCE.createPosition3D()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 AnatomyFactory.eINSTANCE.createLocationSymmetry()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 AnatomyFactory.eINSTANCE.createAnatomy()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 AnatomyFactory.eINSTANCE.createSubanatomy()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 CapabilitiesFactory.eINSTANCE.createTaskOnDeviceCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 CapabilitiesFactory.eINSTANCE.createDeviceInLocationCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 CapabilitiesFactory.eINSTANCE.createConnectionInDuctOrLocationCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 CapabilitiesFactory.eINSTANCE.createSignalOnConnectionOrDeviceCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 CapabilitiesFactory.eINSTANCE.createSubdeviceInDeviceCapability()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 CapabilitiesFactory.eINSTANCE.createResourceConsumption()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 CapabilitiesFactory.eINSTANCE.createCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 CapabilitiesFactory.eINSTANCE.createSubcapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 RestrictionsFactory.eINSTANCE.createRestrictions()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 RestrictionsFactory.eINSTANCE.createLocationRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 RestrictionsFactory.eINSTANCE.createAreaRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 RestrictionsFactory.eINSTANCE.createPowerSourceRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 RestrictionsFactory.eINSTANCE.createDeviceRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 RestrictionsFactory.eINSTANCE.createDeviceTypeRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 RestrictionsFactory.eINSTANCE.createConectionTypeRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 RestrictionsFactory.eINSTANCE.createConnectionRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 RestrictionsFactory.eINSTANCE.createSegregationRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 RestrictionsFactory.eINSTANCE.createSynchronicityRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 RestrictionsFactory.eINSTANCE.createTaskAtomicRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 RestrictionsFactory.eINSTANCE.createTaskSymmetryRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 RestrictionsFactory.eINSTANCE.createTimeDelayRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 RestrictionsFactory.eINSTANCE.createSubrestrictions()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 AllocationsFactory.eINSTANCE.createTaskAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 AllocationsFactory.eINSTANCE.createSignalAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 AllocationsFactory.eINSTANCE.createConnectionAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 AllocationsFactory.eINSTANCE.createSignalAssignmentSegment()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 AllocationsFactory.eINSTANCE.createDeviceAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 AllocationsFactory.eINSTANCE.createConnectionAssignmentSegment()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 AllocationsFactory.eINSTANCE.createSubdeviceAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 AllocationsFactory.eINSTANCE.createAllocations()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 AllocationsFactory.eINSTANCE.createSuballocations()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 AllocationsFactory.eINSTANCE.createSchedule()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE,
				 AllocationsFactory.eINSTANCE.createScheduledTime()));
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
			childFeature == CommonPackage.Literals.OAAM_BASE_ELEMENT_A__ATTRIBUTES ||
			childFeature == CommonPackage.Literals.ATTRIBUTE_CONTAINMENT__VALUE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
