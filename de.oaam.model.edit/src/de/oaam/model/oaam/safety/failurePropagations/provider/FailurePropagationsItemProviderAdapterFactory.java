/**
 */
package de.oaam.model.oaam.safety.failurePropagations.provider;

import de.oaam.model.oaam.safety.failurePropagations.util.FailurePropagationsAdapterFactory;

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
public class FailurePropagationsItemProviderAdapterFactory extends FailurePropagationsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public FailurePropagationsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.safety.failurePropagations.FailurePropagation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailurePropagationItemProvider failurePropagationItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.safety.failurePropagations.FailurePropagation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFailurePropagationAdapter() {
		if (failurePropagationItemProvider == null) {
			failurePropagationItemProvider = new FailurePropagationItemProvider(this);
		}

		return failurePropagationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.safety.failurePropagations.BooleanAnd} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanAndItemProvider booleanAndItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.safety.failurePropagations.BooleanAnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanAndAdapter() {
		if (booleanAndItemProvider == null) {
			booleanAndItemProvider = new BooleanAndItemProvider(this);
		}

		return booleanAndItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.safety.failurePropagations.BooleanOr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanOrItemProvider booleanOrItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.safety.failurePropagations.BooleanOr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanOrAdapter() {
		if (booleanOrItemProvider == null) {
			booleanOrItemProvider = new BooleanOrItemProvider(this);
		}

		return booleanOrItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.safety.failurePropagations.BooleanXor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanXorItemProvider booleanXorItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.safety.failurePropagations.BooleanXor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanXorAdapter() {
		if (booleanXorItemProvider == null) {
			booleanXorItemProvider = new BooleanXorItemProvider(this);
		}

		return booleanXorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.safety.failurePropagations.BooleanNot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanNotItemProvider booleanNotItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.safety.failurePropagations.BooleanNot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanNotAdapter() {
		if (booleanNotItemProvider == null) {
			booleanNotItemProvider = new BooleanNotItemProvider(this);
		}

		return booleanNotItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStateBooleanConversion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegrityStateBooleanConversionItemProvider integrityStateBooleanConversionItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStateBooleanConversion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegrityStateBooleanConversionAdapter() {
		if (integrityStateBooleanConversionItemProvider == null) {
			integrityStateBooleanConversionItemProvider = new IntegrityStateBooleanConversionItemProvider(this);
		}

		return integrityStateBooleanConversionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.safety.failurePropagations.FailureModeBooleanConversion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureModeBooleanConversionItemProvider failureModeBooleanConversionItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.safety.failurePropagations.FailureModeBooleanConversion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFailureModeBooleanConversionAdapter() {
		if (failureModeBooleanConversionItemProvider == null) {
			failureModeBooleanConversionItemProvider = new FailureModeBooleanConversionItemProvider(this);
		}

		return failureModeBooleanConversionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.safety.failurePropagations.BooleanFailureModeConversion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanFailureModeConversionItemProvider booleanFailureModeConversionItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.safety.failurePropagations.BooleanFailureModeConversion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanFailureModeConversionAdapter() {
		if (booleanFailureModeConversionItemProvider == null) {
			booleanFailureModeConversionItemProvider = new BooleanFailureModeConversionItemProvider(this);
		}

		return booleanFailureModeConversionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStateFailureModeConversion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegrityStateFailureModeConversionItemProvider integrityStateFailureModeConversionItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.safety.failurePropagations.IntegrityStateFailureModeConversion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegrityStateFailureModeConversionAdapter() {
		if (integrityStateFailureModeConversionItemProvider == null) {
			integrityStateFailureModeConversionItemProvider = new IntegrityStateFailureModeConversionItemProvider(this);
		}

		return integrityStateFailureModeConversionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.safety.failurePropagations.FailureModeIntegrityStateConversion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureModeIntegrityStateConversionItemProvider failureModeIntegrityStateConversionItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.safety.failurePropagations.FailureModeIntegrityStateConversion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFailureModeIntegrityStateConversionAdapter() {
		if (failureModeIntegrityStateConversionItemProvider == null) {
			failureModeIntegrityStateConversionItemProvider = new FailureModeIntegrityStateConversionItemProvider(this);
		}

		return failureModeIntegrityStateConversionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.safety.failurePropagations.BooleanIntegrityStateConversion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanIntegrityStateConversionItemProvider booleanIntegrityStateConversionItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.safety.failurePropagations.BooleanIntegrityStateConversion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanIntegrityStateConversionAdapter() {
		if (booleanIntegrityStateConversionItemProvider == null) {
			booleanIntegrityStateConversionItemProvider = new BooleanIntegrityStateConversionItemProvider(this);
		}

		return booleanIntegrityStateConversionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.safety.failurePropagations.PropagationInput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagationInputItemProvider propagationInputItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.safety.failurePropagations.PropagationInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropagationInputAdapter() {
		if (propagationInputItemProvider == null) {
			propagationInputItemProvider = new PropagationInputItemProvider(this);
		}

		return propagationInputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.safety.failurePropagations.PropagationOutput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagationOutputItemProvider propagationOutputItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.safety.failurePropagations.PropagationOutput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropagationOutputAdapter() {
		if (propagationOutputItemProvider == null) {
			propagationOutputItemProvider = new PropagationOutputItemProvider(this);
		}

		return propagationOutputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.safety.failurePropagations.PropagationSource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagationSourceItemProvider propagationSourceItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.safety.failurePropagations.PropagationSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropagationSourceAdapter() {
		if (propagationSourceItemProvider == null) {
			propagationSourceItemProvider = new PropagationSourceItemProvider(this);
		}

		return propagationSourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.safety.failurePropagations.PropagationSink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagationSinkItemProvider propagationSinkItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.safety.failurePropagations.PropagationSink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropagationSinkAdapter() {
		if (propagationSinkItemProvider == null) {
			propagationSinkItemProvider = new PropagationSinkItemProvider(this);
		}

		return propagationSinkItemProvider;
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
		if (failurePropagationItemProvider != null) failurePropagationItemProvider.dispose();
		if (booleanAndItemProvider != null) booleanAndItemProvider.dispose();
		if (booleanOrItemProvider != null) booleanOrItemProvider.dispose();
		if (booleanXorItemProvider != null) booleanXorItemProvider.dispose();
		if (booleanNotItemProvider != null) booleanNotItemProvider.dispose();
		if (integrityStateBooleanConversionItemProvider != null) integrityStateBooleanConversionItemProvider.dispose();
		if (failureModeBooleanConversionItemProvider != null) failureModeBooleanConversionItemProvider.dispose();
		if (booleanFailureModeConversionItemProvider != null) booleanFailureModeConversionItemProvider.dispose();
		if (integrityStateFailureModeConversionItemProvider != null) integrityStateFailureModeConversionItemProvider.dispose();
		if (failureModeIntegrityStateConversionItemProvider != null) failureModeIntegrityStateConversionItemProvider.dispose();
		if (booleanIntegrityStateConversionItemProvider != null) booleanIntegrityStateConversionItemProvider.dispose();
		if (propagationInputItemProvider != null) propagationInputItemProvider.dispose();
		if (propagationOutputItemProvider != null) propagationOutputItemProvider.dispose();
		if (propagationSourceItemProvider != null) propagationSourceItemProvider.dispose();
		if (propagationSinkItemProvider != null) propagationSinkItemProvider.dispose();
	}

}
