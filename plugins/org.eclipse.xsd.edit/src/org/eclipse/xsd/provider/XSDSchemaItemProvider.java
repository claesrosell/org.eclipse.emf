/**
 * <copyright>
 *
 * Copyright (c) 2002-2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: XSDSchemaItemProvider.java,v 1.6 2006/08/26 13:25:14 emerks Exp $
 */
package org.eclipse.xsd.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.CopyCommand;
import org.eclipse.emf.edit.command.InitializeCopyCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import org.eclipse.xsd.XSDInclude;
import org.eclipse.xsd.XSDRedefine;
import org.eclipse.xsd.XSDSchema;


/**
 * This is the item provider adpater for a {@link org.eclipse.xsd.XSDSchema} object.
 */
public class XSDSchemaItemProvider
  extends XSDComponentItemProvider
{
  /**
   * This constructs an instance from a factory and a notifier.
   */
  public XSDSchemaItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   */
  public List getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);
      createSchemaLocationPropertyDescriptor(object);
      createTargetNamespacePropertyDescriptor(object);
      createFinalDefaultPropertyDescriptor(object);
      createBlockDefaultPropertyDescriptor(object);
      createAttributeFormDefaultPropertyDescriptor(object);
      createElementFormDefaultPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }


  protected void createSchemaLocationPropertyDescriptor(Object object)
  {
    // This is for the schemaLocation feature.
    //
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         XSDEditPlugin.INSTANCE.getString("_UI_SchemaLocation_label"),
         XSDEditPlugin.INSTANCE.getString("_UI_SchemaLocationOfSchema_description"),
         xsdPackage.getXSDSchema_SchemaLocation(),
         false,
         ItemPropertyDescriptor.TEXT_VALUE_IMAGE));
  }

  protected void createTargetNamespacePropertyDescriptor(Object object)
  {
    // This is for the targetNamespace feature.
    //
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         XSDEditPlugin.INSTANCE.getString("_UI_TargetNamespace_label"),
         XSDEditPlugin.INSTANCE.getString("_UI_TargetNamespaceOfSchema_description"),
         xsdPackage.getXSDSchema_TargetNamespace(),
         true,
         ItemPropertyDescriptor.TEXT_VALUE_IMAGE)
       {
         public void setPropertyValue(Object o, Object value)
         {
           if ("".equals(value))
           {
             super.setPropertyValue(o, null);
           }
           else
           {
             super.setPropertyValue(o, value);
           }
         }
       });
  }

  protected void createFinalDefaultPropertyDescriptor(Object object)
  {
    // This is for the finalDefault feature.
    //
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         XSDEditPlugin.INSTANCE.getString("_UI_FinalDefault_label"),
         XSDEditPlugin.INSTANCE.getString("_UI_FinalDefault_description"),
         xsdPackage.getXSDSchema_FinalDefault(),
         true,
         ItemPropertyDescriptor.TEXT_VALUE_IMAGE)
       {
         public Object getPropertyValue(Object o)
         {
           return ((XSDSchema)o).getStringFinalDefault();
         }
         public void setPropertyValue(Object o, Object value)
         {
           ((XSDSchema)o).setStringFinalDefault((String)value);
         }
         public Collection getChoiceOfValues(Object o)
         {
           Collection result = new ArrayList();
           result.add("");
           result.add("#all");
           result.add("extension");
           result.add("restriction");
           result.add("restriction extension");
           return result;
         }
       });
  }

  protected void createBlockDefaultPropertyDescriptor(Object object)
  {
    // This is for the blockDefault feature.
    //
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         XSDEditPlugin.INSTANCE.getString("_UI_BlockDefault_label"),
         XSDEditPlugin.INSTANCE.getString("_UI_BlockDefault_description"),
         xsdPackage.getXSDSchema_BlockDefault(),
         true,
         ItemPropertyDescriptor.TEXT_VALUE_IMAGE)
       {
         public Object getPropertyValue(Object o)
         {
           return ((XSDSchema)o).getStringBlockDefault();
         }
         public void setPropertyValue(Object o, Object value)
         {
           ((XSDSchema)o).setStringBlockDefault((String)value);
         }
         public Collection getChoiceOfValues(Object o)
         {
           Collection result = new ArrayList();
           result.add("");
           result.add("#all");
           result.add("extension");
           result.add("restriction");
           result.add("substitution");
           result.add("extension restriction");
           result.add("extension restriction substitution");
           result.add("extension substitution");
           result.add("restriction substitution");
           return result;
         }
       });
  }

  protected void createElementFormDefaultPropertyDescriptor(Object object)
  {
    // This is for the elementFormDefault feature.
    //
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptorWithDefault
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         XSDEditPlugin.INSTANCE.getString("_UI_ElementFormDefault_label"),
         XSDEditPlugin.INSTANCE.getString("_UI_ElementFormDefault_description"),
         xsdPackage.getXSDSchema_ElementFormDefault(),
         true,
         ItemPropertyDescriptor.TEXT_VALUE_IMAGE));
  }

  protected void createAttributeFormDefaultPropertyDescriptor(Object object)
  {
    // This is for the elementFormDefault feature.
    //
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptorWithDefault
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         XSDEditPlugin.INSTANCE.getString("_UI_AttributeFormDefault_label"),
         XSDEditPlugin.INSTANCE.getString("_UI_AttributeFormDefault_description"),
         xsdPackage.getXSDSchema_AttributeFormDefault(),
         true,
         ItemPropertyDescriptor.TEXT_VALUE_IMAGE));
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   */
  public Collection getChildrenFeatures(Object object)
  {
    if (childrenFeatures == null)
    {
      super.getChildrenFeatures(object);
      childrenFeatures.add(xsdPackage.getXSDSchema_Contents());
    }
    return childrenFeatures;
  }

  /**
   * This returns XSDSchema.gif.
   */
  public Object getImage(Object object)
  {
    return XSDEditPlugin.INSTANCE.getImage("full/obj16/XSDSchema");
  }

  public String getText(Object object)
  {
    XSDSchema xsdSchema = (XSDSchema)object;
    String result = xsdSchema.getSchemaLocation();
    if (result == null)
    {
      return "";
    } 
    else
    {
      return URI.createURI(result).lastSegment();
    }
  }

  /**
   * This handles notification by calling {@link #fireNotifyChanged fireNotifyChanged}.
   */
  public void notifyChanged(Notification msg) 
  {
    if (
         msg.getFeature() == xsdPackage.getXSDSchema_SchemaLocation() || 
         msg.getFeature() == xsdPackage.getXSDSchema_TypeDefinitions() || 
         msg.getFeature() == xsdPackage.getXSDSchema_ElementDeclarations() || 
         msg.getFeature() == xsdPackage.getXSDSchema_AttributeGroupDefinitions() || 
         msg.getFeature() == xsdPackage.getXSDSchema_NotationDeclarations() || 
         msg.getFeature() == xsdPackage.getXSDSchema_Contents() || 
         msg.getFeature() == xsdPackage.getXSDSchema_ModelGroupDefinitions() || 
         msg.getFeature() == xsdPackage.getXSDSchema_AttributeDeclarations() || 
         msg.getFeature() == xsdPackage.getXSDSchema_AttributeFormDefault() || 
         msg.getFeature() == xsdPackage.getXSDSchema_ElementFormDefault() || 
         msg.getFeature() == xsdPackage.getXSDSchema_BlockDefault() || 
         msg.getFeature() == xsdPackage.getXSDSchema_FinalDefault() || 
         msg.getFeature() == xsdPackage.getXSDSchema_Annotations()
       )
    {
      fireNotifyChanged(msg);
      return;
    }
    super.notifyChanged(msg);
  }

  /**
   * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s 
   * describing all of the children that can be created under this object.
   */
  protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);
    XSDSchema xsdSchema = (XSDSchema) object;

    // If the schema isn't a really bad one...
    //
    if (xsdSchema.getSchemaForSchema() != null)
    {
      EReference schemaContents = xsdPackage.getXSDSchema_Contents();
      // annotation
      newChildDescriptors.add(createChildParameter(schemaContents, xsdFactory.createXSDAnnotation()));

      // import
      newChildDescriptors.add(createChildParameter(schemaContents, xsdFactory.createXSDImport()));

      // include
      XSDInclude i = xsdFactory.createXSDInclude();
      i.setSchemaLocation("");
      newChildDescriptors.add(createChildParameter(schemaContents, i));

      // redefine
      XSDRedefine r = xsdFactory.createXSDRedefine();
      r.setSchemaLocation("");
      newChildDescriptors.add(createChildParameter(schemaContents, r));

      // element declaration
      newChildDescriptors.add(createChildParameter(schemaContents, createElementDeclaration(xsdSchema)));

      // attribute declaration
      newChildDescriptors.add(createChildParameter(schemaContents, createAttributeDeclaration(xsdSchema)));

      // model group definition
      newChildDescriptors.add(createChildParameter(schemaContents, createModelGroupDefinition(xsdSchema)));

      // attribute group definition
      newChildDescriptors.add(createChildParameter(schemaContents, createAttributeGroupDefinition(xsdSchema)));

      // atomic, list, and union simple type definitions
      addSimpleTypeDefinitionChildParameters(newChildDescriptors, xsdSchema, schemaContents, true, true, true);

      // complex type definition
      newChildDescriptors.add(createChildParameter(schemaContents, createComplexTypeDefinition(xsdSchema)));

      // notation declaration
      newChildDescriptors.add(createChildParameter(schemaContents, createNotationDeclaration(xsdSchema)));
    }
  }

  /**
   * We need to copy the prefix to namespace map as well as the schema for schema prefix.
   */
  protected Command createInitializeCopyCommand(EditingDomain domain, EObject owner, CopyCommand.Helper helper)
  {
    return 
      new InitializeCopyCommand(domain, owner, helper)
      {
        protected Collection getAttributesToCopy()
        {
          Collection result = new ArrayList(this.owner.eClass().getEAllAttributes());
          result.remove(xsdPackage.getXSDConcreteComponent_Element());
          result.remove(xsdPackage.getXSDSchema_Document());
          return result;
        }
        
        protected void copyAttributes()
        {
          XSDSchema ownerSchema = (XSDSchema)owner;
          XSDSchema copySchema = (XSDSchema)copy;
          copySchema.getQNamePrefixToNamespaceMap().putAll(ownerSchema.getQNamePrefixToNamespaceMap());
          copySchema.setSchemaForSchemaQNamePrefix(ownerSchema.getSchemaForSchemaQNamePrefix());
          super.copyAttributes();
        }
      };
  }
}
