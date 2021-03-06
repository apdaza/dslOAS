/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.guioas.guiOas;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entidad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.guioas.guiOas.Entidad#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.xtext.example.guioas.guiOas.Entidad#getCampos <em>Campos</em>}</li>
 *   <li>{@link org.xtext.example.guioas.guiOas.Entidad#getEntidades <em>Entidades</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.guioas.guiOas.GuiOasPackage#getEntidad()
 * @model
 * @generated
 */
public interface Entidad extends EObject
{
  /**
   * Returns the value of the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nombre</em>' attribute.
   * @see #setNombre(String)
   * @see org.xtext.example.guioas.guiOas.GuiOasPackage#getEntidad_Nombre()
   * @model
   * @generated
   */
  String getNombre();

  /**
   * Sets the value of the '{@link org.xtext.example.guioas.guiOas.Entidad#getNombre <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre</em>' attribute.
   * @see #getNombre()
   * @generated
   */
  void setNombre(String value);

  /**
   * Returns the value of the '<em><b>Campos</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.guioas.guiOas.Campo}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Campos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Campos</em>' containment reference list.
   * @see org.xtext.example.guioas.guiOas.GuiOasPackage#getEntidad_Campos()
   * @model containment="true"
   * @generated
   */
  EList<Campo> getCampos();

  /**
   * Returns the value of the '<em><b>Entidades</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.guioas.guiOas.Entidad}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entidades</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entidades</em>' containment reference list.
   * @see org.xtext.example.guioas.guiOas.GuiOasPackage#getEntidad_Entidades()
   * @model containment="true"
   * @generated
   */
  EList<Entidad> getEntidades();

} // Entidad
