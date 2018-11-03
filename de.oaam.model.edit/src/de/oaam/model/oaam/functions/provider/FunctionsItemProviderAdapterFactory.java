/**
 */
package de.oaam.model.oaam.functions.provider;

import de.oaam.model.oaam.functions.util.FunctionsAdapterFactory;

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
public class FunctionsItemProviderAdapterFactory extends FunctionsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public FunctionsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.functions.Functions} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionsItemProvider functionsItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.functions.Functions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionsAdapter() {
		if (functionsItemProvider == null) {
			functionsItemProvider = new FunctionsItemProvider(this);
		}

		return functionsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.functions.Task} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskItemProvider taskItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.functions.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskAdapter() {
		if (taskItemProvider == null) {
			taskItemProvider = new TaskItemProvider(this);
		}

		return taskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.functions.ExternalTaskLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalTaskLinkItemProvider externalTaskLinkItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.functions.ExternalTaskLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalTaskLinkAdapter() {
		if (externalTaskLinkItemProvider == null) {
			externalTaskLinkItemProvider = new ExternalTaskLinkItemProvider(this);
		}

		return externalTaskLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.functions.TaskGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskGroupItemProvider taskGroupItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.functions.TaskGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskGroupAdapter() {
		if (taskGroupItemProvider == null) {
			taskGroupItemProvider = new TaskGroupItemProvider(this);
		}

		return taskGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.functions.TaskSymmetry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskSymmetryItemProvider taskSymmetryItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.functions.TaskSymmetry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskSymmetryAdapter() {
		if (taskSymmetryItemProvider == null) {
			taskSymmetryItemProvider = new TaskSymmetryItemProvider(this);
		}

		return taskSymmetryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.functions.TaskRedundancy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskRedundancyItemProvider taskRedundancyItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.functions.TaskRedundancy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskRedundancyAdapter() {
		if (taskRedundancyItemProvider == null) {
			taskRedundancyItemProvider = new TaskRedundancyItemProvider(this);
		}

		return taskRedundancyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.functions.FailureCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureConditionItemProvider failureConditionItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.functions.FailureCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFailureConditionAdapter() {
		if (failureConditionItemProvider == null) {
			failureConditionItemProvider = new FailureConditionItemProvider(this);
		}

		return failureConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.functions.OutputIntegrityState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputIntegrityStateItemProvider outputIntegrityStateItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.functions.OutputIntegrityState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputIntegrityStateAdapter() {
		if (outputIntegrityStateItemProvider == null) {
			outputIntegrityStateItemProvider = new OutputIntegrityStateItemProvider(this);
		}

		return outputIntegrityStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.functions.Signal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalItemProvider signalItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.functions.Signal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSignalAdapter() {
		if (signalItemProvider == null) {
			signalItemProvider = new SignalItemProvider(this);
		}

		return signalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.functions.SignalGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalGroupItemProvider signalGroupItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.functions.SignalGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSignalGroupAdapter() {
		if (signalGroupItemProvider == null) {
			signalGroupItemProvider = new SignalGroupItemProvider(this);
		}

		return signalGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.functions.Input} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputItemProvider inputItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.functions.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputAdapter() {
		if (inputItemProvider == null) {
			inputItemProvider = new InputItemProvider(this);
		}

		return inputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.functions.Output} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputItemProvider outputItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.functions.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputAdapter() {
		if (outputItemProvider == null) {
			outputItemProvider = new OutputItemProvider(this);
		}

		return outputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.functions.ExternalOutputLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalOutputLinkItemProvider externalOutputLinkItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.functions.ExternalOutputLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalOutputLinkAdapter() {
		if (externalOutputLinkItemProvider == null) {
			externalOutputLinkItemProvider = new ExternalOutputLinkItemProvider(this);
		}

		return externalOutputLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.functions.Subfunctions} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubfunctionsItemProvider subfunctionsItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.functions.Subfunctions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubfunctionsAdapter() {
		if (subfunctionsItemProvider == null) {
			subfunctionsItemProvider = new SubfunctionsItemProvider(this);
		}

		return subfunctionsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.functions.TaskParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskParameterItemProvider taskParameterItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.functions.TaskParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskParameterAdapter() {
		if (taskParameterItemProvider == null) {
			taskParameterItemProvider = new TaskParameterItemProvider(this);
		}

		return taskParameterItemProvider;
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
		if (functionsItemProvider != null) functionsItemProvider.dispose();
		if (taskItemProvider != null) taskItemProvider.dispose();
		if (externalTaskLinkItemProvider != null) externalTaskLinkItemProvider.dispose();
		if (taskGroupItemProvider != null) taskGroupItemProvider.dispose();
		if (taskSymmetryItemProvider != null) taskSymmetryItemProvider.dispose();
		if (taskRedundancyItemProvider != null) taskRedundancyItemProvider.dispose();
		if (failureConditionItemProvider != null) failureConditionItemProvider.dispose();
		if (outputIntegrityStateItemProvider != null) outputIntegrityStateItemProvider.dispose();
		if (signalItemProvider != null) signalItemProvider.dispose();
		if (signalGroupItemProvider != null) signalGroupItemProvider.dispose();
		if (inputItemProvider != null) inputItemProvider.dispose();
		if (outputItemProvider != null) outputItemProvider.dispose();
		if (externalOutputLinkItemProvider != null) externalOutputLinkItemProvider.dispose();
		if (subfunctionsItemProvider != null) subfunctionsItemProvider.dispose();
		if (taskParameterItemProvider != null) taskParameterItemProvider.dispose();
	}

}
