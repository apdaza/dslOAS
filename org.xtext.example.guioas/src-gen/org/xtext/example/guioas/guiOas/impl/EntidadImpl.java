/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.guioas.guiOas.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.guioas.guiOas.Campo;
import org.xtext.example.guioas.guiOas.Entidad;
import org.xtext.example.guioas.guiOas.GuiOasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entidad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.guioas.guiOas.impl.EntidadImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.xtext.example.guioas.guiOas.impl.EntidadImpl#getCampos <em>Campos</em>}</li>
 *   <li>{@link org.xtext.example.guioas.guiOas.impl.EntidadImpl#getEntidades <em>Entidades</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntidadImpl extends MinimalEObjectImpl.Container implements Entidad
{
  /**
   * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombre()
   * @generated
   * @ordered
   */
  protected static final String NOMBRE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombre()
   * @generated
   * @ordered
   */
  protected String nombre = NOMBRE_EDEFAULT;

  /**
   * The cached value of the '{@link #getCampos() <em>Campos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCampos()
   * @generated
   * @ordered
   */
  protected EList<Campo> campos;

  /**
   * The cached value of the '{@link #getEntidades() <em>Entidades</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntidades()
   * @generated
   * @ordered
   */
  protected EList<Entidad> entidades;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntidadImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GuiOasPackage.Literals.ENTIDAD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNombre()
  {
    return nombre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNombre(String newNombre)
  {
    String oldNombre = nombre;
    nombre = newNombre;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiOasPackage.ENTIDAD__NOMBRE, oldNombre, nombre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Campo> getCampos()
  {
    if (campos == null)
    {
      campos = new EObjectContainmentEList<Campo>(Campo.class, this, GuiOasPackage.ENTIDAD__CAMPOS);
    }
    return campos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Entidad> getEntidades()
  {
    if (entidades == null)
    {
      entidades = new EObjectContainmentEList<Entidad>(Entidad.class, this, GuiOasPackage.ENTIDAD__ENTIDADES);
    }
    return entidades;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GuiOasPackage.ENTIDAD__CAMPOS:
        return ((InternalEList<?>)getCampos()).basicRemove(otherEnd, msgs);
      case GuiOasPackage.ENTIDAD__ENTIDADES:
        return ((InternalEList<?>)getEntidades()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GuiOasPackage.ENTIDAD__NOMBRE:
        return getNombre();
      case GuiOasPackage.ENTIDAD__CAMPOS:
        return getCampos();
      case GuiOasPackage.ENTIDAD__ENTIDADES:
        return getEntidades();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GuiOasPackage.ENTIDAD__NOMBRE:
        setNombre((String)newValue);
        return;
      case GuiOasPackage.ENTIDAD__CAMPOS:
        getCampos().clear();
        getCampos().addAll((Collection<? extends Campo>)newValue);
        return;
      case GuiOasPackage.ENTIDAD__ENTIDADES:
        getEntidades().clear();
        getEntidades().addAll((Collection<? extends Entidad>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GuiOasPackage.ENTIDAD__NOMBRE:
        setNombre(NOMBRE_EDEFAULT);
        return;
      case GuiOasPackage.ENTIDAD__CAMPOS:
        getCampos().clear();
        return;
      case GuiOasPackage.ENTIDAD__ENTIDADES:
        getEntidades().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GuiOasPackage.ENTIDAD__NOMBRE:
        return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
      case GuiOasPackage.ENTIDAD__CAMPOS:
        return campos != null && !campos.isEmpty();
      case GuiOasPackage.ENTIDAD__ENTIDADES:
        return entidades != null && !entidades.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (nombre: ");
    result.append(nombre);
    result.append(')');
    return result.toString();
  }

} //EntidadImpl
