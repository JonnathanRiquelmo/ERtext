/**
 * generated by Xtext 2.25.0
 */
package org.xtext.unipampa.erdsl.erDsl.impl;

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

import org.xtext.unipampa.erdsl.erDsl.Domain;
import org.xtext.unipampa.erdsl.erDsl.ERModel;
import org.xtext.unipampa.erdsl.erDsl.Entity;
import org.xtext.unipampa.erdsl.erDsl.ErDslPackage;
import org.xtext.unipampa.erdsl.erDsl.Relation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ER Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.unipampa.erdsl.erDsl.impl.ERModelImpl#getTargetGenerator <em>Target Generator</em>}</li>
 *   <li>{@link org.xtext.unipampa.erdsl.erDsl.impl.ERModelImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.xtext.unipampa.erdsl.erDsl.impl.ERModelImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link org.xtext.unipampa.erdsl.erDsl.impl.ERModelImpl#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ERModelImpl extends MinimalEObjectImpl.Container implements ERModel
{
  /**
   * The default value of the '{@link #getTargetGenerator() <em>Target Generator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetGenerator()
   * @generated
   * @ordered
   */
  protected static final String TARGET_GENERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTargetGenerator() <em>Target Generator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetGenerator()
   * @generated
   * @ordered
   */
  protected String targetGenerator = TARGET_GENERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomain()
   * @generated
   * @ordered
   */
  protected Domain domain;

  /**
   * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntities()
   * @generated
   * @ordered
   */
  protected EList<Entity> entities;

  /**
   * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelations()
   * @generated
   * @ordered
   */
  protected EList<Relation> relations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ERModelImpl()
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
    return ErDslPackage.Literals.ER_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTargetGenerator()
  {
    return targetGenerator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTargetGenerator(String newTargetGenerator)
  {
    String oldTargetGenerator = targetGenerator;
    targetGenerator = newTargetGenerator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ErDslPackage.ER_MODEL__TARGET_GENERATOR, oldTargetGenerator, targetGenerator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Domain getDomain()
  {
    return domain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDomain(Domain newDomain, NotificationChain msgs)
  {
    Domain oldDomain = domain;
    domain = newDomain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErDslPackage.ER_MODEL__DOMAIN, oldDomain, newDomain);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDomain(Domain newDomain)
  {
    if (newDomain != domain)
    {
      NotificationChain msgs = null;
      if (domain != null)
        msgs = ((InternalEObject)domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErDslPackage.ER_MODEL__DOMAIN, null, msgs);
      if (newDomain != null)
        msgs = ((InternalEObject)newDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErDslPackage.ER_MODEL__DOMAIN, null, msgs);
      msgs = basicSetDomain(newDomain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ErDslPackage.ER_MODEL__DOMAIN, newDomain, newDomain));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Entity> getEntities()
  {
    if (entities == null)
    {
      entities = new EObjectContainmentEList<Entity>(Entity.class, this, ErDslPackage.ER_MODEL__ENTITIES);
    }
    return entities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Relation> getRelations()
  {
    if (relations == null)
    {
      relations = new EObjectContainmentEList<Relation>(Relation.class, this, ErDslPackage.ER_MODEL__RELATIONS);
    }
    return relations;
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
      case ErDslPackage.ER_MODEL__DOMAIN:
        return basicSetDomain(null, msgs);
      case ErDslPackage.ER_MODEL__ENTITIES:
        return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
      case ErDslPackage.ER_MODEL__RELATIONS:
        return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
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
      case ErDslPackage.ER_MODEL__TARGET_GENERATOR:
        return getTargetGenerator();
      case ErDslPackage.ER_MODEL__DOMAIN:
        return getDomain();
      case ErDslPackage.ER_MODEL__ENTITIES:
        return getEntities();
      case ErDslPackage.ER_MODEL__RELATIONS:
        return getRelations();
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
      case ErDslPackage.ER_MODEL__TARGET_GENERATOR:
        setTargetGenerator((String)newValue);
        return;
      case ErDslPackage.ER_MODEL__DOMAIN:
        setDomain((Domain)newValue);
        return;
      case ErDslPackage.ER_MODEL__ENTITIES:
        getEntities().clear();
        getEntities().addAll((Collection<? extends Entity>)newValue);
        return;
      case ErDslPackage.ER_MODEL__RELATIONS:
        getRelations().clear();
        getRelations().addAll((Collection<? extends Relation>)newValue);
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
      case ErDslPackage.ER_MODEL__TARGET_GENERATOR:
        setTargetGenerator(TARGET_GENERATOR_EDEFAULT);
        return;
      case ErDslPackage.ER_MODEL__DOMAIN:
        setDomain((Domain)null);
        return;
      case ErDslPackage.ER_MODEL__ENTITIES:
        getEntities().clear();
        return;
      case ErDslPackage.ER_MODEL__RELATIONS:
        getRelations().clear();
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
      case ErDslPackage.ER_MODEL__TARGET_GENERATOR:
        return TARGET_GENERATOR_EDEFAULT == null ? targetGenerator != null : !TARGET_GENERATOR_EDEFAULT.equals(targetGenerator);
      case ErDslPackage.ER_MODEL__DOMAIN:
        return domain != null;
      case ErDslPackage.ER_MODEL__ENTITIES:
        return entities != null && !entities.isEmpty();
      case ErDslPackage.ER_MODEL__RELATIONS:
        return relations != null && !relations.isEmpty();
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (targetGenerator: ");
    result.append(targetGenerator);
    result.append(')');
    return result.toString();
  }

} //ERModelImpl
