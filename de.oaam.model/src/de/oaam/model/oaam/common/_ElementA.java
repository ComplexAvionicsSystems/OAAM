/**
 */
package de.oaam.model.oaam.common;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the base class for every instantiable element in the model. Most important it defines that every model element has a name and an id
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.common._ElementA#getId <em>Id</em>}</li>
 *   <li>{@link de.oaam.model.oaam.common._ElementA#getName <em>Name</em>}</li>
 *   <li>{@link de.oaam.model.oaam.common._ElementA#getStyle <em>Style</em>}</li>
 *   <li>{@link de.oaam.model.oaam.common._ElementA#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.common._ElementA#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link de.oaam.model.oaam.common._ElementA#getModified <em>Modified</em>}</li>
 *   <li>{@link de.oaam.model.oaam.common._ElementA#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.oaam.model.oaam.common._ElementA#getTraceLink <em>Trace Link</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.common.CommonPackage#get_ElementA()
 * @model abstract="true"
 * @generated
 */
public interface _ElementA extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A global unique identifier string for every model element. This id is used as a reference between model elements
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.oaam.model.oaam.common.CommonPackage#get_ElementA_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.common._ElementA#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string for the name of the element as shown in textual or graphical representations of the model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.oaam.model.oaam.common.CommonPackage#get_ElementA_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.common._ElementA#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Style string for appearance in editors. CSS syntax shall be used. Additional attributes are: shape=rect, circle, triangle;
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see de.oaam.model.oaam.common.CommonPackage#get_ElementA_Style()
	 * @model
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.common._ElementA#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.common.AttributeA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This can be used to append arbitrary additional attributes to every element. The form of additional attributes is always name and value whereas the value type is different for different attribute types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see de.oaam.model.oaam.common.CommonPackage#get_ElementA_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeA> getAttributes();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A textual documentation of this model element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see de.oaam.model.oaam.common.CommonPackage#get_ElementA_Documentation()
	 * @model default=""
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.common._ElementA#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date of the last modification. This should be set automatically.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modified</em>' attribute.
	 * @see #setModified(Date)
	 * @see de.oaam.model.oaam.common.CommonPackage#get_ElementA_Modified()
	 * @model
	 * @generated
	 */
	Date getModified();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.common._ElementA#getModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' attribute.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(Date value);

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the user who last modified the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modifier</em>' attribute.
	 * @see #setModifier(String)
	 * @see de.oaam.model.oaam.common.CommonPackage#get_ElementA_Modifier()
	 * @model
	 * @generated
	 */
	String getModifier();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.common._ElementA#getModifier <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' attribute.
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(String value);

	/**
	 * Returns the value of the '<em><b>Trace Link</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A textual traceable link. For instance the requirement id.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trace Link</em>' attribute.
	 * @see #setTraceLink(String)
	 * @see de.oaam.model.oaam.common.CommonPackage#get_ElementA_TraceLink()
	 * @model default=""
	 * @generated
	 */
	String getTraceLink();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.common._ElementA#getTraceLink <em>Trace Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Link</em>' attribute.
	 * @see #getTraceLink()
	 * @generated
	 */
	void setTraceLink(String value);

} // _ElementA
