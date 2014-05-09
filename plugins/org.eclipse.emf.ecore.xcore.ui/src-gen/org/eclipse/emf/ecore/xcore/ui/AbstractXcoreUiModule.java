
/*
 * generated by Xtext
 */
package org.eclipse.emf.ecore.xcore.ui;

import org.eclipse.xtext.ui.DefaultUiModule;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * Manual modifications go to {org.eclipse.emf.ecore.xcore.ui.XcoreUiModule}
 */
@SuppressWarnings("all")
public abstract class AbstractXcoreUiModule extends DefaultUiModule {
	
	public AbstractXcoreUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	
	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public com.google.inject.Provider<org.eclipse.xtext.resource.containers.IAllContainersState> provideIAllContainersState() {
		return org.eclipse.xtext.ui.shared.Access.getJavaProjectsState();
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.xtext.ui.editor.XtextEditor> bindXtextEditor() {
		return org.eclipse.xtext.xbase.ui.editor.XbaseEditor.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.xtext.ui.editor.model.XtextDocumentProvider> bindXtextDocumentProvider() {
		return org.eclipse.xtext.xbase.ui.editor.XbaseDocumentProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.contentassist.IProposalConflictHelper> bindIProposalConflictHelper() {
		return org.eclipse.xtext.ui.editor.contentassist.antlr.AntlrProposalConflictHelper.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public void configureHighlightingLexer(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.parser.antlr.Lexer.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.ui.LexerUIBindings.HIGHLIGHTING)).to(org.eclipse.emf.ecore.xcore.parser.antlr.internal.InternalXcoreLexer.class);
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public void configureHighlightingTokenDefProvider(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.parser.antlr.ITokenDefProvider.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.ui.LexerUIBindings.HIGHLIGHTING)).to(org.eclipse.xtext.parser.antlr.AntlrTokenDefProvider.class);
	}

	// contributed by org.eclipse.xtext.ui.generator.labeling.LabelProviderFragment
	public Class<? extends org.eclipse.jface.viewers.ILabelProvider> bindILabelProvider() {
		return org.eclipse.emf.ecore.xcore.ui.labeling.XcoreLabelProvider.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.labeling.LabelProviderFragment
	public void configureResourceUIServiceLabelProvider(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.jface.viewers.ILabelProvider.class).annotatedWith(org.eclipse.xtext.ui.resource.ResourceServiceDescriptionLabelProvider.class).to(org.eclipse.emf.ecore.xcore.ui.labeling.XcoreDescriptionLabelProvider.class);
	}

	// contributed by org.eclipse.xtext.ui.generator.outline.OutlineTreeProviderFragment
	public Class<? extends org.eclipse.xtext.ui.editor.outline.IOutlineTreeProvider> bindIOutlineTreeProvider() {
		return org.eclipse.emf.ecore.xcore.ui.outline.XcoreOutlineTreeProvider.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.outline.OutlineTreeProviderFragment
	public Class<? extends org.eclipse.xtext.ui.editor.outline.impl.IOutlineTreeStructureProvider> bindIOutlineTreeStructureProvider() {
		return org.eclipse.emf.ecore.xcore.ui.outline.XcoreOutlineTreeProvider.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.contentAssist.JavaBasedContentAssistFragment
	public Class<? extends org.eclipse.xtext.ui.editor.contentassist.IContentProposalProvider> bindIContentProposalProvider() {
		return org.eclipse.emf.ecore.xcore.ui.contentassist.XcoreProposalProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrUiGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext.Factory> bindContentAssistContext$Factory() {
		return org.eclipse.xtext.ui.editor.contentassist.antlr.ParserBasedContentAssistContextFactory.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrUiGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.contentassist.antlr.IContentAssistParser> bindIContentAssistParser() {
		return org.eclipse.emf.ecore.xcore.ui.contentassist.antlr.XcoreParser.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrUiGeneratorFragment
	public void configureContentAssistLexerProvider(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.emf.ecore.xcore.ui.contentassist.antlr.internal.InternalXcoreLexer.class).toProvider(org.eclipse.xtext.parser.antlr.LexerProvider.create(org.eclipse.emf.ecore.xcore.ui.contentassist.antlr.internal.InternalXcoreLexer.class));
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrUiGeneratorFragment
	public void configureContentAssistLexer(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.ui.LexerUIBindings.CONTENT_ASSIST)).to(org.eclipse.emf.ecore.xcore.ui.contentassist.antlr.internal.InternalXcoreLexer.class);
	}

	// contributed by org.eclipse.xtext.ui.generator.compare.CompareFragment
	public Class<? extends org.eclipse.compare.IViewerCreator> bindIViewerCreator() {
		return org.eclipse.xtext.ui.compare.DefaultViewerCreator.class;
	}

	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public void configureIResourceDescriptionsBuilderScope(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.resource.IResourceDescriptions.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider.NAMED_BUILDER_SCOPE)).to(org.eclipse.xtext.builder.clustering.CurrentDescriptions.ResourceSetAware.class);
	}

	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public Class<? extends org.eclipse.xtext.ui.editor.IXtextEditorCallback> bindIXtextEditorCallback() {
		return org.eclipse.xtext.builder.nature.NatureAddingEditorCallback.class;
	}

	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public void configureIResourceDescriptionsPersisted(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.resource.IResourceDescriptions.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider.PERSISTED_DESCRIPTIONS)).to(org.eclipse.xtext.builder.builderState.IBuilderState.class);
	}

	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public Class<? extends org.eclipse.xtext.ui.editor.DocumentBasedDirtyResource> bindDocumentBasedDirtyResource() {
		return org.eclipse.xtext.builder.impl.PersistentDataAwareDirtyResource.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.quickfix.QuickfixProviderFragment
	public Class<? extends org.eclipse.xtext.ui.editor.quickfix.IssueResolutionProvider> bindIssueResolutionProvider() {
		return org.eclipse.emf.ecore.xcore.ui.quickfix.XcoreQuickfixProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.generator.GeneratorFragment
	public Class<? extends org.eclipse.xtext.builder.IXtextBuilderParticipant> bindIXtextBuilderParticipant() {
		return org.eclipse.xtext.builder.BuilderParticipant.class;
	}

	// contributed by org.eclipse.xtext.generator.generator.GeneratorFragment
	public org.eclipse.core.resources.IWorkspaceRoot bindIWorkspaceRootToInstance() {
		return org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot();
	}

	// contributed by org.eclipse.xtext.generator.generator.GeneratorFragment
	public void configureBuilderPreferenceStoreInitializer(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreInitializer.class).annotatedWith(com.google.inject.name.Names.named("builderPreferenceInitializer")).to(org.eclipse.xtext.builder.preferences.BuilderPreferenceAccess.Initializer.class);
	}

	// contributed by org.eclipse.xtext.ui.generator.refactoring.RefactorElementNameFragment
	public void configureIPreferenceStoreInitializer(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreInitializer.class).annotatedWith(com.google.inject.name.Names.named("RefactoringPreferences")).to(org.eclipse.xtext.ui.refactoring.ui.RefactoringPreferences.Initializer.class);
	}

	// contributed by org.eclipse.xtext.ui.generator.refactoring.RefactorElementNameFragment
	public Class<? extends org.eclipse.xtext.ui.refactoring.ui.IRenameSupport.Factory> bindIRenameSupport$Factory() {
		return org.eclipse.xtext.common.types.ui.refactoring.JdtRenameSupport.Factory.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.refactoring.RefactorElementNameFragment
	public Class<? extends org.eclipse.xtext.ui.refactoring.IRenameStrategy.Provider> bindIRenameStrategy$Provider() {
		return org.eclipse.xtext.common.types.ui.refactoring.participant.JvmMemberRenameStrategy.Provider.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.refactoring.RefactorElementNameFragment
	public void configureJvmMemberRenameStrategy$Provider$Delegate(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.ui.refactoring.IRenameStrategy.Provider.class).annotatedWith(org.eclipse.xtext.common.types.ui.refactoring.participant.JvmMemberRenameStrategy.Provider.Delegate.class).to(org.eclipse.xtext.ui.refactoring.impl.DefaultRenameStrategyProvider.class);
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public java.lang.ClassLoader bindClassLoaderToInstance() {
		return getClass().getClassLoader();
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public Class<? extends org.eclipse.xtext.common.types.access.IJvmTypeProvider.Factory> bindIJvmTypeProvider$Factory() {
		return org.eclipse.xtext.common.types.access.jdt.JdtTypeProviderFactory.class;
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public Class<? extends org.eclipse.xtext.common.types.xtext.AbstractTypeScopeProvider> bindAbstractTypeScopeProvider() {
		return org.eclipse.xtext.common.types.xtext.ui.JdtBasedSimpleTypeScopeProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public Class<? extends org.eclipse.xtext.common.types.xtext.ui.ITypesProposalProvider> bindITypesProposalProvider() {
		return org.eclipse.xtext.common.types.xtext.ui.JdtTypesProposalProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public Class<? extends org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider> bindIJavaProjectProvider() {
		return org.eclipse.xtext.common.types.xtext.ui.XtextResourceSetBasedProjectProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher> bindPrefixMatcher() {
		return org.eclipse.xtext.ui.editor.contentassist.FQNPrefixMatcher.class;
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.IValidationJobScheduler> bindIValidationJobScheduler() {
		return org.eclipse.xtext.common.types.xtext.ui.JdtValidationJobScheduler.class;
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.resource.JavaProjectResourceSetInitializer> bindJavaProjectResourceSetInitializer() {
		return org.eclipse.xtext.common.types.access.jdt.JvmTypesAwareResourceSetInitializer.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return org.eclipse.xtext.xbase.ui.syntaxcoloring.XbaseTokenToAttributeIdMapper.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.contentassist.AbstractJavaBasedContentProposalProvider.ReferenceProposalCreator> bindAbstractJavaBasedContentProposalProvider$ReferenceProposalCreator() {
		return org.eclipse.xtext.xbase.ui.contentassist.XbaseReferenceProposalCreator.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.jface.text.contentassist.IContentAssistProcessor> bindIContentAssistProcessor() {
		return org.eclipse.xtext.ui.editor.contentassist.RepeatedContentAssistProcessor.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		return org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingCalculator.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingConfiguration.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider> bindIEObjectHoverProvider() {
		return org.eclipse.xtext.xbase.ui.hover.XbaseHoverProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.hover.IEObjectHover> bindIEObjectHover() {
		return org.eclipse.xtext.xbase.ui.hover.XbaseDispatchingEObjectTextHover.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.hover.html.IEObjectHoverDocumentationProvider> bindIEObjectHoverDocumentationProvider() {
		return org.eclipse.xtext.xbase.ui.hover.XbaseHoverDocumentationProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider.CrossRefResolutionConverter> bindDefaultQuickfixProvider$CrossRefResolutionConverter() {
		return org.eclipse.xtext.xbase.ui.quickfix.XbaseCrossRefResolutionConverter.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	@org.eclipse.xtext.service.SingletonBinding(eager=true)	public Class<? extends org.eclipse.xtext.xbase.ui.validation.XbaseUIValidator> bindXbaseUIValidator() {
		return org.eclipse.xtext.xbase.ui.validation.XbaseUIValidator.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkHelper> bindIHyperlinkHelper() {
		return org.eclipse.xtext.xbase.ui.navigation.TypeLiteralAwareHyperlinkHelper.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.xbase.typesystem.internal.IFeatureScopeTracker.Provider> bindIFeatureScopeTracker$Provider() {
		return org.eclipse.xtext.xbase.typesystem.internal.BuilderAwareFeatureScopeTrackerProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.findrefs.FindReferencesHandler> bindFindReferencesHandler() {
		return org.eclipse.xtext.xbase.ui.jvmmodel.findrefs.JvmModelFindReferenceHandler.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.findrefs.ReferenceQueryExecutor> bindReferenceQueryExecutor() {
		return org.eclipse.xtext.xbase.ui.jvmmodel.findrefs.JvmModelReferenceQueryExecutor.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.refactoring.IDependentElementsCalculator> bindIDependentElementsCalculator() {
		return org.eclipse.xtext.xbase.ui.jvmmodel.refactoring.JvmModelDependentElementsCalculator.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.refactoring.IRenameRefactoringProvider> bindIRenameRefactoringProvider() {
		return org.eclipse.xtext.xbase.ui.jvmmodel.refactoring.jdt.CombinedJvmJdtRenameRefactoringProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.refactoring.IReferenceUpdater> bindIReferenceUpdater() {
		return org.eclipse.xtext.xbase.ui.refactoring.XbaseReferenceUpdater.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.refactoring.ui.IRenameContextFactory> bindIRenameContextFactory() {
		return org.eclipse.xtext.xbase.ui.jvmmodel.refactoring.jdt.CombinedJvmJdtRenameContextFactory.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.common.types.ui.refactoring.participant.JdtRenameParticipant.ContextFactory> bindJdtRenameParticipant$ContextFactory() {
		return org.eclipse.xtext.xbase.ui.jvmmodel.refactoring.JvmModelJdtRenameParticipantContext.ContextFactory.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.refactoring.IRenameStrategy> bindIRenameStrategy() {
		return org.eclipse.xtext.xbase.ui.jvmmodel.refactoring.DefaultJvmModelRenameStrategy.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.outline.impl.OutlineNodeElementOpener> bindOutlineNodeElementOpener() {
		return org.eclipse.xtext.xbase.ui.jvmmodel.outline.JvmOutlineNodeElementOpener.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.GlobalURIEditorOpener> bindGlobalURIEditorOpener() {
		return org.eclipse.xtext.common.types.ui.navigation.GlobalDerivedMemberAwareURIEditorOpener.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.editor.occurrences.IOccurrenceComputer> bindIOccurrenceComputer() {
		return org.eclipse.xtext.xbase.ui.jvmmodel.occurrence.JvmModelOccurrenceComputer.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.common.types.ui.query.IJavaSearchParticipation> bindIJavaSearchParticipation() {
		return org.eclipse.xtext.common.types.ui.query.IJavaSearchParticipation.No.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public void configureLanguageSpecificURIEditorOpener(com.google.inject.Binder binder) {
		if (org.eclipse.ui.PlatformUI.isWorkbenchRunning()) { 
			binder.bind(org.eclipse.xtext.ui.editor.IURIEditorOpener.class).annotatedWith(org.eclipse.xtext.ui.LanguageSpecific.class).to(org.eclipse.xtext.xbase.ui.jvmmodel.navigation.DerivedMemberAwareEditorOpener.class); 
			binder.bind(org.eclipse.xtext.common.types.ui.navigation.IDerivedMemberAwareEditorOpener.class).to(org.eclipse.xtext.xbase.ui.jvmmodel.navigation.DerivedMemberAwareEditorOpener.class); 
		};
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.jface.text.hyperlink.IHyperlinkDetector> bindIHyperlinkDetector() {
		return org.eclipse.xtext.xbase.ui.navigation.XbaseHyperlinkDetector.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.xbase.ui.quickfix.JavaTypeQuickfixes> bindJavaTypeQuickfixes() {
		return org.eclipse.xtext.xbase.ui.quickfix.JavaTypeQuickfixesNoImportSection.class;
	}


}
