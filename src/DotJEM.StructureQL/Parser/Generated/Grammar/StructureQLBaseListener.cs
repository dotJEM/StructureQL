//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.10.1
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from Grammar\StructureQL.g4 by ANTLR 4.10.1

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

namespace DotJEM.StructureQL.Generated.Parser {

using Antlr4.Runtime.Misc;
using IErrorNode = Antlr4.Runtime.Tree.IErrorNode;
using ITerminalNode = Antlr4.Runtime.Tree.ITerminalNode;
using IToken = Antlr4.Runtime.IToken;
using ParserRuleContext = Antlr4.Runtime.ParserRuleContext;

/// <summary>
/// This class provides an empty implementation of <see cref="IStructureQLListener"/>,
/// which can be extended to create a listener which only needs to handle a subset
/// of the available methods.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.10.1")]
[System.Diagnostics.DebuggerNonUserCode]
[System.CLSCompliant(false)]
public partial class StructureQLBaseListener : IStructureQLListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="StructureQLParser.query"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterQuery([NotNull] StructureQLParser.QueryContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="StructureQLParser.query"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitQuery([NotNull] StructureQLParser.QueryContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="StructureQLParser.object"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterObject([NotNull] StructureQLParser.ObjectContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="StructureQLParser.object"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitObject([NotNull] StructureQLParser.ObjectContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="StructureQLParser.property"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterProperty([NotNull] StructureQLParser.PropertyContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="StructureQLParser.property"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitProperty([NotNull] StructureQLParser.PropertyContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="StructureQLParser.match"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterMatch([NotNull] StructureQLParser.MatchContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="StructureQLParser.match"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitMatch([NotNull] StructureQLParser.MatchContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="StructureQLParser.recursiveMatchAll"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterRecursiveMatchAll([NotNull] StructureQLParser.RecursiveMatchAllContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="StructureQLParser.recursiveMatchAll"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitRecursiveMatchAll([NotNull] StructureQLParser.RecursiveMatchAllContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="StructureQLParser.simpleMatchAll"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterSimpleMatchAll([NotNull] StructureQLParser.SimpleMatchAllContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="StructureQLParser.simpleMatchAll"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitSimpleMatchAll([NotNull] StructureQLParser.SimpleMatchAllContext context) { }

	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void EnterEveryRule([NotNull] ParserRuleContext context) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void ExitEveryRule([NotNull] ParserRuleContext context) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void VisitTerminal([NotNull] ITerminalNode node) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void VisitErrorNode([NotNull] IErrorNode node) { }
}
} // namespace DotJEM.StructureQL.Generated.Parser
