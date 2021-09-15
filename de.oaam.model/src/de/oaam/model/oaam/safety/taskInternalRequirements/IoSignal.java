/**
 */
package de.oaam.model.oaam.safety.taskInternalRequirements;

import de.oaam.model.oaam.library.InputDeclaration;
import de.oaam.model.oaam.library.OutputDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Io Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Inputs and Outputs of the task that provide values. Either an input or an output can be referenced.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.safety.taskInternalRequirements.IoSignal#getDeclaredInput <em>Declared Input</em>}</li>
 *   <li>{@link de.oaam.model.oaam.safety.taskInternalRequirements.IoSignal#getDeclaredOutput <em>Declared Output</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage#getIoSignal()
 * @model
 * @generated
 */
public interface IoSignal extends SourceA {
	/**
	 * Returns the value of the '<em><b>Declared Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The referenced input declaration. The declaredInput must not be referenced if a declaredOutput is referenced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declared Input</em>' reference.
	 * @see #setDeclaredInput(InputDeclaration)
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage#getIoSignal_DeclaredInput()
	 * @model
	 * @generated
	 */
	InputDeclaration getDeclaredInput();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.IoSignal#getDeclaredInput <em>Declared Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared Input</em>' reference.
	 * @see #getDeclaredInput()
	 * @generated
	 */
	void setDeclaredInput(InputDeclaration value);

	/**
	 * Returns the value of the '<em><b>Declared Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The referenced output declaration. The declaredOutput must not be referenced if a declaredInput is referenced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declared Output</em>' reference.
	 * @see #setDeclaredOutput(OutputDeclaration)
	 * @see de.oaam.model.oaam.safety.taskInternalRequirements.TaskInternalRequirementsPackage#getIoSignal_DeclaredOutput()
	 * @model
	 * @generated
	 */
	OutputDeclaration getDeclaredOutput();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.safety.taskInternalRequirements.IoSignal#getDeclaredOutput <em>Declared Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared Output</em>' reference.
	 * @see #getDeclaredOutput()
	 * @generated
	 */
	void setDeclaredOutput(OutputDeclaration value);

} // IoSignal
