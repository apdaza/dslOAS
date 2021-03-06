/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.guioas.guiOas.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.guioas.guiOas.Campo;
import org.xtext.example.guioas.guiOas.GuiOasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Campo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.guioas.guiOas.impl.CampoImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.guioas.guiOas.impl.CampoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.xtext.example.guioas.guiOas.impl.CampoImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link org.xtext.example.guioas.guiOas.impl.CampoImpl#getLongitud <em>Longitud</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CampoImpl extends MinimalEObjectImpl.Container implements Campo
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipo()
   * @generated
   * @ordered
   */
  protected static final String TIPO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipo()
   * @generated
   * @ordered
   */
  protected String tipo = TIPO_EDEFAULT;

  /**
   * The default value of the '{@link #getLongitud() <em>Longitud</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongitud()
   * @generated
   * @ordered
   */
  protected static final int LONGITUD_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLongitud() <em>Longitud</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongitud()
   * @generated
   * @ordered
   */
  protected int longitud = LONGITUD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CampoImpl()
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
    return GuiOasPackage.Literals.CAMPO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiOasPackage.CAMPO__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GuiOasPackage.CAMPO__NOMBRE, oldNombre, nombre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTipo()
  {
    return tipo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTipo(String newTipo)
  {
    String oldTipo = tipo;
    tipo = newTipo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiOasPackage.CAMPO__TIPO, oldTipo, tipo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLongitud()
  {
    return longitud;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLongitud(int newLongitud)
  {
    int oldLongitud = longitud;
    longitud = newLongitud;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiOasPackage.CAMPO__LONGITUD, oldLongitud, longitud));
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
      case GuiOasPackage.CAMPO__NAME:
        return getName();
      case GuiOasPackage.CAMPO__NOMBRE:
        return getNombre();
      case GuiOasPackage.CAMPO__TIPO:
        return getTipo();
      case GuiOasPackage.CAMPO__LONGITUD:
        return getLongitud();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GuiOasPackage.CAMPO__NAME:
        setName((String)newValue);
        return;
      case GuiOasPackage.CAMPO__NOMBRE:
        setNombre((String)newValue);
        return;
      case GuiOasPackage.CAMPO__TIPO:
        setTipo((String)newValue);
        return;
      case GuiOasPackage.CAMPO__LONGITUD:
        setLongitud((Integer)newValue);
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
      case GuiOasPackage.CAMPO__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GuiOasPackage.CAMPO__NOMBRE:
        setNombre(NOMBRE_EDEFAULT);
        return;
      case GuiOasPackage.CAMPO__TIPO:
        setTipo(TIPO_EDEFAULT);
        return;
      case GuiOasPackage.CAMPO__LONGITUD:
        setLongitud(LONGITUD_EDEFAULT);
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
      case GuiOasPackage.CAMPO__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GuiOasPackage.CAMPO__NOMBRE:
        return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
      case GuiOasPackage.CAMPO__TIPO:
        return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
      case GuiOasPackage.CAMPO__LONGITUD:
        return longitud != LONGITUD_EDEFAULT;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", nombre: ");
    result.append(nombre);
    result.append(", tipo: ");
    result.append(tipo);
    result.append(", longitud: ");
    result.append(longitud);
    result.append(')');
    return result.toString();
  }

} //CampoImpl
