/**
 */
package de.oaam.model.oaam.functions;

import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A signal group can be used to organize signals in groups with some relationship, e.g. the same constraint
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.functions.SignalGroup#getSignals <em>Signals</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.functions.FunctionsPackage#getSignalGroup()
 * @model
 * @generated
 */
public interface SignalGroup extends OaamBaseElementA, ModeDependentElementA, VariantDependentElementA {
	/**
	 * Returns the value of the '<em><b>Signals</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.functions.Signal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reference to all signals in this group
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signals</em>' reference list.
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getSignalGroup_Signals()
	 * @model required="true"
	 * @generated
	 */
	EList<Signal> getSignals();

} // SignalGroup
