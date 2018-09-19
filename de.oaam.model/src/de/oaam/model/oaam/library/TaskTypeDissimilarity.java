/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.OaamBaseElementA;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Type Dissimilarity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Declare a set of function types to be dissimilar up to a certain level. Dissimilar functions are those who are developed by an independent team using indipendent methods and tools.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.TaskTypeDissimilarity#getTasks <em>Tasks</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.TaskTypeDissimilarity#getPercentageOfCommonCode <em>Percentage Of Common Code</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskTypeDissimilarity()
 * @model
 * @generated
 */
public interface TaskTypeDissimilarity extends OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.TaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the dissimilar functions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskTypeDissimilarity_Tasks()
	 * @model
	 * @generated
	 */
	EList<TaskType> getTasks();

	/**
	 * Returns the value of the '<em><b>Percentage Of Common Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gives the percentage of common code of dissimilar functions. In general the percentage should be 0 for 100% dissimilar functions. A measure could for instance be the number of lines of dissimilar code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Percentage Of Common Code</em>' attribute.
	 * @see #setPercentageOfCommonCode(double)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getTaskTypeDissimilarity_PercentageOfCommonCode()
	 * @model required="true"
	 * @generated
	 */
	double getPercentageOfCommonCode();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.TaskTypeDissimilarity#getPercentageOfCommonCode <em>Percentage Of Common Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Of Common Code</em>' attribute.
	 * @see #getPercentageOfCommonCode()
	 * @generated
	 */
	void setPercentageOfCommonCode(double value);

} // TaskTypeDissimilarity
