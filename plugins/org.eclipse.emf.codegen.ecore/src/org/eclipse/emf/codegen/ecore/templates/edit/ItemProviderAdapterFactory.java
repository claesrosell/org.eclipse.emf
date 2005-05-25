package org.eclipse.emf.codegen.ecore.templates.edit;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;

public class ItemProviderAdapterFactory
{
  protected static String nl;
  public static synchronized ItemProviderAdapterFactory create(String lineSeparator)
  {
    nl = lineSeparator;
    ItemProviderAdapterFactory result = new ItemProviderAdapterFactory();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "/**" + NL + " * <copyright>" + NL + " * </copyright>" + NL + " *" + NL + " * ";
  protected final String TEXT_3 = "Id";
  protected final String TEXT_4 = NL + " */" + NL + "package ";
  protected final String TEXT_5 = ";" + NL;
  protected final String TEXT_6 = NL + NL + "/**" + NL + " * This is the factory that is used to provide the interfaces needed to support Viewers." + NL + " * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}." + NL + " * The adapters also support Eclipse property sheets." + NL + " * Note that most of the adapters are shared among multiple instances." + NL + " * <!-- begin-user-doc -->" + NL + " * <!-- end-user-doc -->" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_7 = " extends ";
  protected final String TEXT_8 = " implements ComposeableAdapterFactory, IChangeNotifier";
  protected final String TEXT_9 = ", ";
  protected final String TEXT_10 = NL + "{";
  protected final String TEXT_11 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_12 = " copyright = \"";
  protected final String TEXT_13 = "\";";
  protected final String TEXT_14 = NL;
  protected final String TEXT_15 = NL + "\t/**" + NL + "\t * This keeps track of the root adapter factory that delegates to this adapter factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ComposedAdapterFactory parentAdapterFactory;" + NL + "" + NL + "\t/**" + NL + "\t * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected IChangeNotifier changeNotifier = new ChangeNotifier();" + NL;
  protected final String TEXT_16 = NL + "\t/**" + NL + "\t * This keeps track of all the item providers created, so that they can be {@link #dispose disposed}." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_17 = " disposable = new Disposable();" + NL;
  protected final String TEXT_18 = NL + "\t/**" + NL + "\t * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected Collection supportedTypes = new ArrayList();" + NL + "" + NL + "\t/**" + NL + "\t * This constructs an instance." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_19 = "()" + NL + "\t{";
  protected final String TEXT_20 = NL + "\t\tsupportedTypes.add(";
  protected final String TEXT_21 = ".class);";
  protected final String TEXT_22 = "\t\t" + NL + "\t}" + NL;
  protected final String TEXT_23 = NL + "\t/**" + NL + "\t * This keeps track of the factory to which to delegate adapter creation for objects from that package." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_24 = " ";
  protected final String TEXT_25 = " = null;" + NL + "" + NL + "\t/**" + NL + "\t * This determines the delegate factory for the package." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_26 = " get";
  protected final String TEXT_27 = "()" + NL + "\t{" + NL + "\t\tif (";
  protected final String TEXT_28 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_29 = " rootAdapterFactory = getRootAdapterFactory();" + NL + "\t\t\tif (rootAdapterFactory instanceof ComposedAdapterFactory)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_30 = " delegateAdapterFactory =" + NL + "\t\t\t\t\t((ComposedAdapterFactory)rootAdapterFactory).getFactoryForType(";
  protected final String TEXT_31 = ".getPackage());" + NL + "\t\t\t\tif (delegateAdapterFactory instanceof ";
  protected final String TEXT_32 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_33 = " = (";
  protected final String TEXT_34 = ")delegateAdapterFactory;" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_35 = ";" + NL + "\t}" + NL;
  protected final String TEXT_36 = NL + "\t/**" + NL + "\t * This keeps track of the one adapter used for all {@link ";
  protected final String TEXT_37 = "} instances." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_38 = " ";
  protected final String TEXT_39 = "ItemProvider;" + NL + "" + NL + "\t/**" + NL + "\t * This creates an adapter for a {@link ";
  protected final String TEXT_40 = "}." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Adapter create";
  protected final String TEXT_41 = "Adapter()" + NL + "\t{" + NL + "\t\tif (";
  protected final String TEXT_42 = "ItemProvider == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_43 = "ItemProvider = new ";
  protected final String TEXT_44 = "(this);" + NL + "\t\t}" + NL + "" + NL + "\t\treturn ";
  protected final String TEXT_45 = "ItemProvider;" + NL + "\t}" + NL;
  protected final String TEXT_46 = NL + "\t/**" + NL + "\t * This creates an adapter for a {@link ";
  protected final String TEXT_47 = "}." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Adapter create";
  protected final String TEXT_48 = "Adapter()" + NL + "\t{" + NL + "\t\treturn new ";
  protected final String TEXT_49 = "(this);" + NL + "\t}" + NL;
  protected final String TEXT_50 = NL + "\t/**" + NL + "\t * ";
  protected final String TEXT_51 = " of ";
  protected final String TEXT_52 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Adapter create";
  protected final String TEXT_53 = "Adapter()" + NL + "\t{" + NL + "\t\treturn" + NL + "\t\t\tget";
  protected final String TEXT_54 = " == null ?" + NL + "\t\t\t\tnull :" + NL + "\t\t\t\tget";
  protected final String TEXT_55 = "().create";
  protected final String TEXT_56 = "Adapter();" + NL + "\t}" + NL;
  protected final String TEXT_57 = NL + "\t/**" + NL + "\t * This returns the root adapter factory that contains this factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ComposeableAdapterFactory getRootAdapterFactory()" + NL + "\t{" + NL + "\t\treturn parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This sets the composed adapter factory that contains this factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)" + NL + "\t{" + NL + "\t\tthis.parentAdapterFactory = parentAdapterFactory;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isFactoryForType(Object type)" + NL + "\t{" + NL + "\t\treturn supportedTypes.contains(type) || super.isFactoryForType(type);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This implementation substitutes the factory itself as the key for the adapter." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Adapter adapt(Notifier notifier, Object type)" + NL + "\t{" + NL + "\t\treturn super.adapt(notifier, this);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object adapt(Object object, Object type)" + NL + "\t{" + NL + "\t\tif (isFactoryForType(type))" + NL + "\t\t{" + NL + "\t\t\tObject adapter = super.adapt(object, type);" + NL + "\t\t\tif (!(type instanceof Class) || (((Class)type).isInstance(adapter)))" + NL + "\t\t\t{" + NL + "\t\t\t\treturn adapter;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_58 = NL + "\t/**" + NL + "\t * Associates an adapter with a notifier via the base implementation, then records it to ensure it will be disposed." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void associate(Adapter adapter, Notifier target)" + NL + "\t{" + NL + "\t\tsuper.associate(adapter, target);" + NL + "\t\tif (adapter != null)" + NL + "\t\t{" + NL + "\t\t\tdisposable.add(adapter);" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_59 = NL + "\t/**" + NL + "\t * This adds a listener." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void addListener(INotifyChangedListener notifyChangedListener)" + NL + "\t{" + NL + "\t\tchangeNotifier.addListener(notifyChangedListener);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This removes a listener." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void removeListener(INotifyChangedListener notifyChangedListener)" + NL + "\t{" + NL + "\t\tchangeNotifier.removeListener(notifyChangedListener);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void fireNotifyChanged(Notification notification)" + NL + "\t{" + NL + "\t\tchangeNotifier.fireNotifyChanged(notification);" + NL + "" + NL + "\t\tif (parentAdapterFactory != null)" + NL + "\t\t{" + NL + "\t\t\tparentAdapterFactory.fireNotifyChanged(notification);" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_60 = NL + "\t/**" + NL + "\t * This disposes all of the item providers created by this factory. " + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void dispose()" + NL + "\t{";
  protected final String TEXT_61 = NL + "\t\tdisposable.dispose();";
  protected final String TEXT_62 = NL + "\t\tif (";
  protected final String TEXT_63 = "ItemProvider != null) ";
  protected final String TEXT_64 = "ItemProvider.dispose();";
  protected final String TEXT_65 = NL + "\t}" + NL;
  protected final String TEXT_66 = NL + "}";
  protected final String TEXT_67 = NL;

  public String generate(Object argument)
  {
    StringBuffer stringBuffer = new StringBuffer();
    
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
 */

    GenPackage genPackage = (GenPackage)argument; GenModel genModel=genPackage.getGenModel();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_3);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_4);
    stringBuffer.append(genPackage.getProviderPackageName());
    stringBuffer.append(TEXT_5);
    genModel.addImport("org.eclipse.emf.common.notify.Adapter");
    genModel.addImport("org.eclipse.emf.common.notify.Notification");
    genModel.addImport("org.eclipse.emf.common.notify.Notifier");
    genModel.addImport("org.eclipse.emf.edit.provider.ChangeNotifier");
    genModel.addImport("org.eclipse.emf.edit.provider.ComposeableAdapterFactory");
    genModel.addImport("org.eclipse.emf.edit.provider.ComposedAdapterFactory");
    genModel.addImport("org.eclipse.emf.edit.provider.IChangeNotifier");
    genModel.addImport("org.eclipse.emf.edit.provider.IEditingDomainItemProvider");
    genModel.addImport("org.eclipse.emf.edit.provider.IItemLabelProvider");
    genModel.addImport("org.eclipse.emf.edit.provider.IItemPropertySource");
    genModel.addImport("org.eclipse.emf.edit.provider.INotifyChangedListener");
    genModel.addImport("org.eclipse.emf.edit.provider.IStructuredItemContentProvider");
    genModel.addImport("org.eclipse.emf.edit.provider.ITreeItemContentProvider");
    genModel.addImport("java.util.ArrayList");
    genModel.addImport("java.util.Collection");
    genModel.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genPackage.getItemProviderAdapterFactoryClassName());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(genPackage.getImportedAdapterFactoryClassName());
    stringBuffer.append(TEXT_8);
    if (genPackage.isDisposableProviderFactory()) {
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.edit.provider.IDisposable"));
    }
    stringBuffer.append(TEXT_10);
    if (genModel.getCopyrightText() != null) {
    stringBuffer.append(TEXT_11);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genModel.getCopyrightText());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_14);
    }
    stringBuffer.append(TEXT_15);
    if (genPackage.isDisposableProviderFactory() && genPackage.hasStatefulProvider()) {
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.edit.provider.Disposable"));
    stringBuffer.append(TEXT_17);
    }
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genPackage.getItemProviderAdapterFactoryClassName());
    stringBuffer.append(TEXT_19);
    for (Iterator i = genPackage.getProviderSupportedTypes().iterator(); i.hasNext(); ) {
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genModel.getImportedName((String)i.next()));
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_22);
    for (Iterator i=genPackage.getAdapterDelegatePackages().iterator(); i.hasNext();) { GenPackage genDelegate = (GenPackage)i.next();
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genDelegate.getImportedAdapterFactoryClassName());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(genPackage.getUncapAdapterFactoryDelegateName(genDelegate));
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genDelegate.getImportedAdapterFactoryClassName());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(genPackage.getAdapterFactoryDelegateName(genDelegate));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genPackage.getUncapAdapterFactoryDelegateName(genDelegate));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.AdapterFactory"));
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.AdapterFactory"));
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genDelegate.getImportedAdapterFactoryClassName());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genDelegate.getImportedAdapterFactoryClassName());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genPackage.getUncapAdapterFactoryDelegateName(genDelegate));
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genDelegate.getImportedAdapterFactoryClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genPackage.getUncapAdapterFactoryDelegateName(genDelegate));
    stringBuffer.append(TEXT_35);
    }
    for (Iterator i=genPackage.getGenClasses().iterator(); i.hasNext();) { GenClass genClass = (GenClass)i.next();
    if (!genClass.isAbstract() && genClass.getProvider() != GenProviderKind.NONE_LITERAL) {
    if (genClass.isProviderSingleton()) {
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genClass.getProviderClassName());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genClass.getUncapName());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genClass.getUncapName());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genClass.getUncapName());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genClass.getProviderClassName());
    stringBuffer.append(TEXT_44);
    stringBuffer.append(genClass.getUncapName());
    stringBuffer.append(TEXT_45);
    } else {
    stringBuffer.append(TEXT_46);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genClass.getProviderClassName());
    stringBuffer.append(TEXT_49);
    }
    }
    }
    for (Iterator i=genPackage.getAdapterDelegateSuperClasses().iterator(); i.hasNext();) { GenClass genClass = (GenClass)i.next();
    stringBuffer.append(TEXT_50);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genClass.getItemProviderAdapterFactoryClassName());
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genClass.getItemProviderAdapterFactoryClassName());
    stringBuffer.append(TEXT_54);
    stringBuffer.append(genClass.getItemProviderAdapterFactoryClassName());
    stringBuffer.append(TEXT_55);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_56);
    }
    stringBuffer.append(TEXT_57);
    if (genPackage.isDisposableProviderFactory() && genPackage.hasStatefulProvider()) {
    stringBuffer.append(TEXT_58);
    }
    stringBuffer.append(TEXT_59);
    if (genPackage.isDisposableProviderFactory()) {
    stringBuffer.append(TEXT_60);
    if (genPackage.hasStatefulProvider()) {
    stringBuffer.append(TEXT_61);
    } else {
    for (Iterator i=genPackage.getGenClasses().iterator(); i.hasNext();) { GenClass genClass = (GenClass)i.next();
    if (!genClass.isAbstract() && genClass.isProviderSingleton()) {
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genClass.getUncapName());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genClass.getUncapName());
    stringBuffer.append(TEXT_64);
    }
    }
    }
    stringBuffer.append(TEXT_65);
    }
    stringBuffer.append(TEXT_66);
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_67);
    return stringBuffer.toString();
  }
}
