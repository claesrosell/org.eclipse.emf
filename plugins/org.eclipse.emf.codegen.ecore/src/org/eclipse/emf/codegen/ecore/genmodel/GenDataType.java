/**
 * <copyright> 
 *
 * Copyright (c) 2002-2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: GenDataType.java,v 1.5 2004/12/16 21:32:41 emerks Exp $
 */
package org.eclipse.emf.codegen.ecore.genmodel;


import java.util.List;

import org.eclipse.emf.ecore.EDataType;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenDataType#getEcoreDataType <em>Ecore Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage#getGenDataType()
 * @model
 * @generated
 */
public interface GenDataType extends GenClassifier
{
  /**
   * Returns the value of the '<em><b>Ecore Data Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ecore Data Type</em>' reference isn't clear, 
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ecore Data Type</em>' reference.
   * @see #setEcoreDataType(EDataType)
   * @see org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage#getGenDataType_EcoreDataType()
   * @model required="true"
   * @generated
   */
  EDataType getEcoreDataType();

  /**
   * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenDataType#getEcoreDataType <em>Ecore Data Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ecore Data Type</em>' reference.
   * @see #getEcoreDataType()
   * @generated
   */
  void setEcoreDataType(EDataType value);

  String getQualifiedInstanceClassName();
  String getImportedInstanceClassName();
  String getObjectInstanceClassName();

  boolean isObjectType();
  boolean isPrimitiveType();
  boolean isArrayType();
  boolean isSerializable();
  String getPrimitiveValueFunction();
  String getSerializableFlag();
  String getModelInfo();

  GenDataType getBaseType();
  GenDataType getItemType();
  List /*GenDataType*/ getMemberTypes();

  String getMinLiteral();
  boolean isMinInclusive();

  String getMaxLiteral();
  boolean isMaxInclusive();

  String getLengthAccessorFunction();
  int getMinLength();
  int getMaxLength();

  int getTotalDigits();
  int getFractionDigits();

  List getEnumerationLiterals();

  String getWhiteSpace();

  List /*List of String*/ getPatterns();

  boolean isXMLCalendar();
  boolean isXMLDuration();

  String getStaticValue(String literal);

  void initialize(EDataType eDataType);

  boolean reconcile(GenDataType oldGenDataVersion);
}
