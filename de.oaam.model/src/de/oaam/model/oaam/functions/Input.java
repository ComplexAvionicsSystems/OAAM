/**
 */
package de.oaam.model.oaam.functions;

import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.hardware.Io;

import de.oaam.model.oaam.library.InputDeclaration;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;
import de.oaam.model.oaam.systems.RequiredInputA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An input of a function is the need for data to be operational
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.functions.Input#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.Input#getImplements <em>Implements</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.Input#getIoBindings <em>Io Bindings</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.Input#getQueueLength <em>Queue Length</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.Input#getOutputLink <em>Output Link</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.functions.FunctionsPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the input declaration of the function type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declaration</em>' reference.
	 * @see #setDeclaration(InputDeclaration)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getInput_Declaration()
	 * @model required="true"
	 * @generated
	 */
	InputDeclaration getDeclaration();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.Input#getDeclaration <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(InputDeclaration value);

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to an input from a systems model which is implemented by this function
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implements</em>' reference.
	 * @see #setImplements(RequiredInputA)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getInput_Implements()
	 * @model
	 * @generated
	 */
	RequiredInputA getImplements();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.Input#getImplements <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' reference.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(RequiredInputA value);

	/**
	 * Returns the value of the '<em><b>Io Bindings</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.hardware.Io}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a device is forced to be bound to a device. Also the inputs of the device should be bound to device IOs  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Io Bindings</em>' reference list.
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getInput_IoBindings()
	 * @model
	 * @generated
	 */
	EList<Io> getIoBindings();

	/**
	 * Returns the value of the '<em><b>Queue Length</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of inputs remembered while the task processes the first arriving input. 0 = drops all inputs till the task is ready. 1 = stores exactly one input. n > 1 = stores n inputs which are executed afterwards.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Queue Length</em>' attribute.
	 * @see #setQueueLength(int)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getInput_QueueLength()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getQueueLength();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.Input#getQueueLength <em>Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Length</em>' attribute.
	 * @see #getQueueLength()
	 * @generated
	 */
	void setQueueLength(int value);

	/**
	 * Returns the value of the '<em><b>Output Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A link to an external (not in this model) output of another task
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Link</em>' containment reference.
	 * @see #setOutputLink(ExternalOutputLink)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getInput_OutputLink()
	 * @model containment="true"
	 * @generated
	 */
	ExternalOutputLink getOutputLink();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.Input#getOutputLink <em>Output Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Link</em>' containment reference.
	 * @see #getOutputLink()
	 * @generated
	 */
	void setOutputLink(ExternalOutputLink value);

} // Input
