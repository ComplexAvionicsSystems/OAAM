/**
 */
package de.oaam.model.oaam.restrictions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Restriction A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract base class for path restrictions. A path is a sequence of tasks and signals.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.PathRestrictionA#getSegments <em>Segments</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getPathRestrictionA()
 * @model abstract="true"
 * @generated
 */
public interface PathRestrictionA extends EObject {
	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.restrictions.PathSegment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A segment of a path is either a task or a signal. The constraint must hold for the sequence of segments given here
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference list.
	 * @see de.oaam.model.oaam.restrictions.RestrictionsPackage#getPathRestrictionA_Segments()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PathSegment> getSegments();

} // PathRestrictionA
