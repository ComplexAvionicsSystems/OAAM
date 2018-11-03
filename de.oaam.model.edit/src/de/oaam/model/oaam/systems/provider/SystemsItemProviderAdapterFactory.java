/**
 */
package de.oaam.model.oaam.systems.provider;

import de.oaam.model.oaam.systems.util.SystemsAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemsItemProviderAdapterFactory extends SystemsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.systems.Systems} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemsItemProvider systemsItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.systems.Systems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemsAdapter() {
		if (systemsItemProvider == null) {
			systemsItemProvider = new SystemsItemProvider(this);
		}

		return systemsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.systems.Subsystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubsystemItemProvider subsystemItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.systems.Subsystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubsystemAdapter() {
		if (subsystemItemProvider == null) {
			subsystemItemProvider = new SubsystemItemProvider(this);
		}

		return subsystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.systems.System} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemItemProvider systemItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.systems.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemAdapter() {
		if (systemItemProvider == null) {
			systemItemProvider = new SystemItemProvider(this);
		}

		return systemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.systems.InformationFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationFlowItemProvider informationFlowItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.systems.InformationFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInformationFlowAdapter() {
		if (informationFlowItemProvider == null) {
			informationFlowItemProvider = new InformationFlowItemProvider(this);
		}

		return informationFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.systems.InformationSignal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationSignalItemProvider informationSignalItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.systems.InformationSignal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInformationSignalAdapter() {
		if (informationSignalItemProvider == null) {
			informationSignalItemProvider = new InformationSignalItemProvider(this);
		}

		return informationSignalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.systems.InformationMaterial} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationMaterialItemProvider informationMaterialItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.systems.InformationMaterial}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInformationMaterialAdapter() {
		if (informationMaterialItemProvider == null) {
			informationMaterialItemProvider = new InformationMaterialItemProvider(this);
		}

		return informationMaterialItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.systems.InformationPower} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationPowerItemProvider informationPowerItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.systems.InformationPower}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInformationPowerAdapter() {
		if (informationPowerItemProvider == null) {
			informationPowerItemProvider = new InformationPowerItemProvider(this);
		}

		return informationPowerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.systems.ElectricPower} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectricPowerItemProvider electricPowerItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.systems.ElectricPower}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElectricPowerAdapter() {
		if (electricPowerItemProvider == null) {
			electricPowerItemProvider = new ElectricPowerItemProvider(this);
		}

		return electricPowerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.systems.HydraulicPower} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HydraulicPowerItemProvider hydraulicPowerItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.systems.HydraulicPower}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHydraulicPowerAdapter() {
		if (hydraulicPowerItemProvider == null) {
			hydraulicPowerItemProvider = new HydraulicPowerItemProvider(this);
		}

		return hydraulicPowerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.systems.RotaryPower} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotaryPowerItemProvider rotaryPowerItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.systems.RotaryPower}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRotaryPowerAdapter() {
		if (rotaryPowerItemProvider == null) {
			rotaryPowerItemProvider = new RotaryPowerItemProvider(this);
		}

		return rotaryPowerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.systems.LinearPower} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinearPowerItemProvider linearPowerItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.systems.LinearPower}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinearPowerAdapter() {
		if (linearPowerItemProvider == null) {
			linearPowerItemProvider = new LinearPowerItemProvider(this);
		}

		return linearPowerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.systems.InputSegregation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputSegregationItemProvider inputSegregationItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.systems.InputSegregation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputSegregationAdapter() {
		if (inputSegregationItemProvider == null) {
			inputSegregationItemProvider = new InputSegregationItemProvider(this);
		}

		return inputSegregationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (systemsItemProvider != null) systemsItemProvider.dispose();
		if (subsystemItemProvider != null) subsystemItemProvider.dispose();
		if (systemItemProvider != null) systemItemProvider.dispose();
		if (informationFlowItemProvider != null) informationFlowItemProvider.dispose();
		if (informationSignalItemProvider != null) informationSignalItemProvider.dispose();
		if (informationMaterialItemProvider != null) informationMaterialItemProvider.dispose();
		if (informationPowerItemProvider != null) informationPowerItemProvider.dispose();
		if (electricPowerItemProvider != null) electricPowerItemProvider.dispose();
		if (hydraulicPowerItemProvider != null) hydraulicPowerItemProvider.dispose();
		if (rotaryPowerItemProvider != null) rotaryPowerItemProvider.dispose();
		if (linearPowerItemProvider != null) linearPowerItemProvider.dispose();
		if (inputSegregationItemProvider != null) inputSegregationItemProvider.dispose();
	}

}
