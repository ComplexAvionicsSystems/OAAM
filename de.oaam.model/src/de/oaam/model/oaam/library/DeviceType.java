/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common._ElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A definition of a device type. This holds the properties and resources that are identical for each device of this type
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.DeviceType#getIos <em>Ios</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.DeviceType#isIsSubdevice <em>Is Subdevice</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.DeviceType#isCanHaveSubdevices <em>Can Have Subdevices</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.DeviceType#getMtbf <em>Mtbf</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.DeviceType#getWeight <em>Weight</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.DeviceType#getCost <em>Cost</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.DeviceType#getIoGroups <em>Io Groups</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.DeviceType#isIsSelfManaging <em>Is Self Managing</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getDeviceType()
 * @model
 * @generated
 */
public interface DeviceType extends ResourceConsumerA, ResourceProviderA, _ElementA {
	/**
	 * Returns the value of the '<em><b>Ios</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.IoDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A device can declare certain resources to be I/Os. I/Os of a device can be used to connect physical connections
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ios</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getDeviceType_Ios()
	 * @model containment="true"
	 * @generated
	 */
	EList<IoDeclaration> getIos();

	/**
	 * Returns the value of the '<em><b>Is Subdevice</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines if this device type can be used as a subdevice in any other device. A subdevice is e.g. a blade in a cabinet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Subdevice</em>' attribute.
	 * @see #setIsSubdevice(boolean)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getDeviceType_IsSubdevice()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsSubdevice();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.DeviceType#isIsSubdevice <em>Is Subdevice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Subdevice</em>' attribute.
	 * @see #isIsSubdevice()
	 * @generated
	 */
	void setIsSubdevice(boolean value);

	/**
	 * Returns the value of the '<em><b>Can Have Subdevices</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies if this device type is allowed to have subdevices e. g. a cabinet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Can Have Subdevices</em>' attribute.
	 * @see #setCanHaveSubdevices(boolean)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getDeviceType_CanHaveSubdevices()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isCanHaveSubdevices();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.DeviceType#isCanHaveSubdevices <em>Can Have Subdevices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Have Subdevices</em>' attribute.
	 * @see #isCanHaveSubdevices()
	 * @generated
	 */
	void setCanHaveSubdevices(boolean value);

	/**
	 * Returns the value of the '<em><b>Mtbf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mean time between failure in [h]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mtbf</em>' attribute.
	 * @see #setMtbf(double)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getDeviceType_Mtbf()
	 * @model required="true"
	 * @generated
	 */
	double getMtbf();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.DeviceType#getMtbf <em>Mtbf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mtbf</em>' attribute.
	 * @see #getMtbf()
	 * @generated
	 */
	void setMtbf(double value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Device type weight in [kg]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getDeviceType_Weight()
	 * @model required="true"
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.DeviceType#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Device type cost in [$]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getDeviceType_Cost()
	 * @model required="true"
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.DeviceType#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * Returns the value of the '<em><b>Io Groups</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.library.IoGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * I/O groups that exist on this device
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Io Groups</em>' containment reference list.
	 * @see de.oaam.model.oaam.library.LibraryPackage#getDeviceType_IoGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<IoGroup> getIoGroups();

	/**
	 * Returns the value of the '<em><b>Is Self Managing</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines for a self-managing avionics platform, if the device type is capable of managing itself, i.e. can assign itself tasks and a shedule
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Self Managing</em>' attribute.
	 * @see #setIsSelfManaging(boolean)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getDeviceType_IsSelfManaging()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsSelfManaging();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.DeviceType#isIsSelfManaging <em>Is Self Managing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Self Managing</em>' attribute.
	 * @see #isIsSelfManaging()
	 * @generated
	 */
	void setIsSelfManaging(boolean value);

} // DeviceType
