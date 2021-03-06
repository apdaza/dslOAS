/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.guioas.guiOas.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.guioas.guiOas.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GuiOasFactoryImpl extends EFactoryImpl implements GuiOasFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GuiOasFactory init()
  {
    try
    {
      GuiOasFactory theGuiOasFactory = (GuiOasFactory)EPackage.Registry.INSTANCE.getEFactory(GuiOasPackage.eNS_URI);
      if (theGuiOasFactory != null)
      {
        return theGuiOasFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GuiOasFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuiOasFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GuiOasPackage.ENTIDAD: return createEntidad();
      case GuiOasPackage.CAMPO: return createCampo();
      case GuiOasPackage.VALIDADOR: return createValidador();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entidad createEntidad()
  {
    EntidadImpl entidad = new EntidadImpl();
    return entidad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Campo createCampo()
  {
    CampoImpl campo = new CampoImpl();
    return campo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Validador createValidador()
  {
    ValidadorImpl validador = new ValidadorImpl();
    return validador;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuiOasPackage getGuiOasPackage()
  {
    return (GuiOasPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GuiOasPackage getPackage()
  {
    return GuiOasPackage.eINSTANCE;
  }

} //GuiOasFactoryImpl
