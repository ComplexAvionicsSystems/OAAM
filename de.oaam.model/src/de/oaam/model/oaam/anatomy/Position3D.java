/**
 */
package de.oaam.model.oaam.anatomy;

import de.oaam.model.oaam.common.ElementA;
import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position3 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A physical 3D coordinate
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.anatomy.Position3D#getX <em>X</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.Position3D#getY <em>Y</em>}</li>
 *   <li>{@link de.oaam.model.oaam.anatomy.Position3D#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getPosition3D()
 * @model
 * @generated
 */
public interface Position3D extends ElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * x position in [m]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(double)
	 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getPosition3D_X()
	 * @model required="true"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.anatomy.Position3D#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * y position in [m]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(double)
	 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getPosition3D_Y()
	 * @model required="true"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.anatomy.Position3D#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * z position in [m]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Z</em>' attribute.
	 * @see #setZ(double)
	 * @see de.oaam.model.oaam.anatomy.AnatomyPackage#getPosition3D_Z()
	 * @model required="true"
	 * @generated
	 */
	double getZ();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.anatomy.Position3D#getZ <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' attribute.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(double value);

} // Position3D
