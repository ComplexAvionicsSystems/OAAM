/**
 */
package de.oaam.model.oaam.functions;

import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.hardware.Io;

import de.oaam.model.oaam.library.OutputDeclaration;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;
import de.oaam.model.oaam.systems.ProvidedOutputA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An output is data produced by a function and available to other function for input
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.functions.Output#getImplements <em>Implements</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.Output#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.Output#getIoBindings <em>Io Bindings</em>}</li>
 *   <li>{@link de.oaam.model.oaam.functions.Output#getFixedRate <em>Fixed Rate</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.functions.FunctionsPackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to an output from the signals model, which is implemented by this output
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implements</em>' reference.
	 * @see #setImplements(ProvidedOutputA)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getOutput_Implements()
	 * @model
	 * @generated
	 */
	ProvidedOutputA getImplements();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.Output#getImplements <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' reference.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(ProvidedOutputA value);

	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the output declaration of the function type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declaration</em>' reference.
	 * @see #setDeclaration(OutputDeclaration)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getOutput_Declaration()
	 * @model required="true"
	 * @generated
	 */
	OutputDeclaration getDeclaration();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.Output#getDeclaration <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(OutputDeclaration value);

	/**
	 * Returns the value of the '<em><b>Io Bindings</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.hardware.Io}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a function is forced to be bound to a device. Also the Outputs of the device should be bound to device IOs  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Io Bindings</em>' reference list.
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getOutput_IoBindings()
	 * @model
	 * @generated
	 */
	EList<Io> getIoBindings();

	/**
	 * Returns the value of the '<em><b>Fixed Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fixed rate, in which the output shall be calculated, given in Hz. If this is set to other that 0.0, it overrides the rate of the taskType declaration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Rate</em>' attribute.
	 * @see #setFixedRate(double)
	 * @see de.oaam.model.oaam.functions.FunctionsPackage#getOutput_FixedRate()
	 * @model required="true"
	 * @generated
	 */
	double getFixedRate();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.functions.Output#getFixedRate <em>Fixed Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Rate</em>' attribute.
	 * @see #getFixedRate()
	 * @generated
	 */
	void setFixedRate(double value);

} // Output
