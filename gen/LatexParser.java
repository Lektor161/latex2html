// Generated from C:/mt/newLab2/2/src\Latex.g4 by ANTLR 4.9.2

    import utility.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LatexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, WS=58, STRING=59, SQUARE_ARG=60;
	public static final int
		RULE_document = 0, RULE_body = 1, RULE_preamble = 2, RULE_begin = 3, RULE_end = 4, 
		RULE_usepkg = 5, RULE_content = 6, RULE_primeSection = 7, RULE_mathItems = 8, 
		RULE_mathItem = 9, RULE_section = 10, RULE_subSection = 11, RULE_subSubSection = 12, 
		RULE_command = 13, RULE_underline = 14, RULE_emph = 15, RULE_bold = 16, 
		RULE_greek = 17, RULE_string = 18, RULE_documentclass = 19, RULE_author = 20, 
		RULE_date = 21, RULE_title = 22, RULE_arg = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "body", "preamble", "begin", "end", "usepkg", "content", 
			"primeSection", "mathItems", "mathItem", "section", "subSection", "subSubSection", 
			"command", "underline", "emph", "bold", "greek", "string", "documentclass", 
			"author", "date", "title", "arg"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\begin'", "'\\end'", "'\\usepackage'", "'$'", "'\\frac'", "'{'", 
			"'}'", "'_'", "'\\section'", "'\\subsection'", "'\\subsubsection'", "'\\par'", 
			"'\\newline'", "'\\slash'", "'\\backslash'", "'\\ldots'", "'\\textcelsius'", 
			"'\\texteuro'", "'\\today'", "'\\underline'", "'\\emph'", "'\\bold'", 
			"'\\Gamma'", "'\\Delta'", "'\\Theta'", "'\\Lambda'", "'\\Pi'", "'\\Sigma'", 
			"'\\Phi'", "'\\Psi'", "'\\Omega'", "'\\alpha'", "'\\beta'", "'\\gamma'", 
			"'\\delta'", "'\\epsilon'", "'\\eta'", "'\\theta'", "'\\iota'", "'\\kappa'", 
			"'\\lambda'", "'\\mugreek'", "'\\nu'", "'\\xi'", "'\\pi'", "'\\rho'", 
			"'\\sigma'", "'\\tau'", "'\\upsilon'", "'\\phi'", "'\\chi'", "'\\psi'", 
			"'\\omega'", "'\\documentclass'", "'\\author'", "'\\date'", "'\\title'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "WS", "STRING", 
			"SQUARE_ARG"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Latex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LatexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DocumentContext extends ParserRuleContext {
		public Grammar grammar;
		public PreambleContext preamble;
		public BodyContext body;
		public PreambleContext preamble() {
			return getRuleContext(PreambleContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			((DocumentContext)_localctx).preamble = preamble();
			setState(49);
			((DocumentContext)_localctx).body = body();
			 ((DocumentContext)_localctx).grammar =  new Grammar(((DocumentContext)_localctx).preamble.preamble_, ((DocumentContext)_localctx).body.body_); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public Body body_;
		public ContentContext content;
		public BeginContext begin() {
			return getRuleContext(BeginContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		 List<AbstractSection> list = new ArrayList<>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			begin();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << STRING))) != 0)) {
				{
				{
				setState(53);
				((BodyContext)_localctx).content = content();
				 list.add(((BodyContext)_localctx).content.content_); 
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			end();
			 ((BodyContext)_localctx).body_ =  new Body(list); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreambleContext extends ParserRuleContext {
		public Preamble preamble_;
		public AuthorContext author;
		public DateContext date;
		public TitleContext title;
		public DocumentclassContext documentclass() {
			return getRuleContext(DocumentclassContext.class,0);
		}
		public List<UsepkgContext> usepkg() {
			return getRuleContexts(UsepkgContext.class);
		}
		public UsepkgContext usepkg(int i) {
			return getRuleContext(UsepkgContext.class,i);
		}
		public List<AuthorContext> author() {
			return getRuleContexts(AuthorContext.class);
		}
		public AuthorContext author(int i) {
			return getRuleContext(AuthorContext.class,i);
		}
		public List<DateContext> date() {
			return getRuleContexts(DateContext.class);
		}
		public DateContext date(int i) {
			return getRuleContext(DateContext.class,i);
		}
		public List<TitleContext> title() {
			return getRuleContexts(TitleContext.class);
		}
		public TitleContext title(int i) {
			return getRuleContext(TitleContext.class,i);
		}
		public PreambleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preamble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterPreamble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitPreamble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitPreamble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreambleContext preamble() throws RecognitionException {
		PreambleContext _localctx = new PreambleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_preamble);
		String author_ = null, date_ = null, title_ = null; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			documentclass();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(65);
				usepkg();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__54) | (1L << T__55) | (1L << T__56))) != 0)) {
				{
				setState(80);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__54:
					{
					setState(71);
					((PreambleContext)_localctx).author = author();
					 author_ = ((PreambleContext)_localctx).author.text; 
					}
					break;
				case T__55:
					{
					setState(74);
					((PreambleContext)_localctx).date = date();
					 date_ = ((PreambleContext)_localctx).date.text; 
					}
					break;
				case T__56:
					{
					setState(77);
					((PreambleContext)_localctx).title = title();
					 title_ = ((PreambleContext)_localctx).title.text; 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((PreambleContext)_localctx).preamble_ =  new Preamble(author_, date_, title_); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BeginContext extends ParserRuleContext {
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public BeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitBegin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitBegin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_begin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__0);
			setState(88);
			arg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndContext extends ParserRuleContext {
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__1);
			setState(91);
			arg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsepkgContext extends ParserRuleContext {
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TerminalNode SQUARE_ARG() { return getToken(LatexParser.SQUARE_ARG, 0); }
		public UsepkgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usepkg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterUsepkg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitUsepkg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitUsepkg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsepkgContext usepkg() throws RecognitionException {
		UsepkgContext _localctx = new UsepkgContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_usepkg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__2);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SQUARE_ARG) {
				{
				setState(94);
				match(SQUARE_ARG);
				}
			}

			setState(97);
			arg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContentContext extends ParserRuleContext {
		public AbstractSection content_;
		public SectionContext section;
		public PrimeSectionContext primeSection;
		public SectionContext section() {
			return getRuleContext(SectionContext.class,0);
		}
		public PrimeSectionContext primeSection() {
			return getRuleContext(PrimeSectionContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_content);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				((ContentContext)_localctx).section = section();
				 ((ContentContext)_localctx).content_ =  ((ContentContext)_localctx).section.content_;      
				}
				break;
			case T__3:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				((ContentContext)_localctx).primeSection = primeSection();
				 ((ContentContext)_localctx).content_ =  ((ContentContext)_localctx).primeSection.content_; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimeSectionContext extends ParserRuleContext {
		public PrimeSection content_;
		public StringContext string;
		public CommandContext command;
		public MathItemContext mathItem;
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public List<MathItemContext> mathItem() {
			return getRuleContexts(MathItemContext.class);
		}
		public MathItemContext mathItem(int i) {
			return getRuleContext(MathItemContext.class,i);
		}
		public PrimeSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primeSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterPrimeSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitPrimeSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitPrimeSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimeSectionContext primeSection() throws RecognitionException {
		PrimeSectionContext _localctx = new PrimeSectionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primeSection);
		 List<MathItem> items = new ArrayList<>(); 
		int _la;
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				((PrimeSectionContext)_localctx).string = string();
				 ((PrimeSectionContext)_localctx).content_ =  new PrimeSection((((PrimeSectionContext)_localctx).string!=null?_input.getText(((PrimeSectionContext)_localctx).string.start,((PrimeSectionContext)_localctx).string.stop):null), null, null); 
				}
				break;
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				((PrimeSectionContext)_localctx).command = command();
				 ((PrimeSectionContext)_localctx).content_ =  new PrimeSection(null, (((PrimeSectionContext)_localctx).command!=null?_input.getText(((PrimeSectionContext)_localctx).command.start,((PrimeSectionContext)_localctx).command.stop):null), null); 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(T__3);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << STRING))) != 0)) {
					{
					{
					setState(114);
					((PrimeSectionContext)_localctx).mathItem = mathItem();
					 items.add(((PrimeSectionContext)_localctx).mathItem.item_); 
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(122);
				match(T__3);
				 ((PrimeSectionContext)_localctx).content_ =  new PrimeSection(null, null, new MathFormula(items)); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathItemsContext extends ParserRuleContext {
		public List<MathItem> items_;
		public MathItemContext mathItem;
		public List<MathItemContext> mathItem() {
			return getRuleContexts(MathItemContext.class);
		}
		public MathItemContext mathItem(int i) {
			return getRuleContext(MathItemContext.class,i);
		}
		public MathItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterMathItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitMathItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitMathItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathItemsContext mathItems() throws RecognitionException {
		MathItemsContext _localctx = new MathItemsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mathItems);
		 ((MathItemsContext)_localctx).items_ =  new ArrayList<>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << STRING))) != 0)) {
				{
				{
				setState(126);
				((MathItemsContext)_localctx).mathItem = mathItem();
				 _localctx.items_.add(((MathItemsContext)_localctx).mathItem.item_); 
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathItemContext extends ParserRuleContext {
		public MathItem item_;
		public GreekContext greek;
		public MathItemsContext i1;
		public MathItemsContext i2;
		public MathItemContext mathItem;
		public StringContext string;
		public GreekContext greek() {
			return getRuleContext(GreekContext.class,0);
		}
		public List<MathItemsContext> mathItems() {
			return getRuleContexts(MathItemsContext.class);
		}
		public MathItemsContext mathItems(int i) {
			return getRuleContext(MathItemsContext.class,i);
		}
		public MathItemContext mathItem() {
			return getRuleContext(MathItemContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public MathItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterMathItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitMathItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitMathItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathItemContext mathItem() throws RecognitionException {
		MathItemContext _localctx = new MathItemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mathItem);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				((MathItemContext)_localctx).greek = greek();
				 ((MathItemContext)_localctx).item_ =  new GreekItem((((MathItemContext)_localctx).greek!=null?_input.getText(((MathItemContext)_localctx).greek.start,((MathItemContext)_localctx).greek.stop):null)); 
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(T__4);
				setState(138);
				match(T__5);
				setState(139);
				((MathItemContext)_localctx).i1 = mathItems();
				setState(140);
				match(T__6);
				setState(141);
				match(T__5);
				setState(142);
				((MathItemContext)_localctx).i2 = mathItems();
				setState(143);
				match(T__6);
				 ((MathItemContext)_localctx).item_ =  new FracItem(new MathFormula(((MathItemContext)_localctx).i1.items_), new MathFormula(((MathItemContext)_localctx).i2.items_)); 
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(T__7);
				setState(147);
				((MathItemContext)_localctx).mathItem = mathItem();
				 ((MathItemContext)_localctx).item_ =  new IndexItem(((MathItemContext)_localctx).mathItem.item_); 
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				match(T__5);
				setState(151);
				((MathItemContext)_localctx).mathItem = mathItem();
				setState(152);
				match(T__6);
				 ((MathItemContext)_localctx).item_ =  ((MathItemContext)_localctx).mathItem.item_; 
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				((MathItemContext)_localctx).string = string();
				 ((MathItemContext)_localctx).item_ =  new StringItem((((MathItemContext)_localctx).string!=null?_input.getText(((MathItemContext)_localctx).string.start,((MathItemContext)_localctx).string.stop):null)); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SectionContext extends ParserRuleContext {
		public Section content_;
		public ArgContext arg;
		public SubSectionContext subSection;
		public PrimeSectionContext primeSection;
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public List<SubSectionContext> subSection() {
			return getRuleContexts(SubSectionContext.class);
		}
		public SubSectionContext subSection(int i) {
			return getRuleContext(SubSectionContext.class,i);
		}
		public List<PrimeSectionContext> primeSection() {
			return getRuleContexts(PrimeSectionContext.class);
		}
		public PrimeSectionContext primeSection(int i) {
			return getRuleContext(PrimeSectionContext.class,i);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_section);
		 List<AbstractSection> list = new ArrayList<>(); 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__8);
			setState(161);
			((SectionContext)_localctx).arg = arg();
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(168);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__9:
						{
						setState(162);
						((SectionContext)_localctx).subSection = subSection();
						 list.add(((SectionContext)_localctx).subSection.content_);   
						}
						break;
					case T__3:
					case T__11:
					case T__12:
					case T__13:
					case T__14:
					case T__15:
					case T__16:
					case T__17:
					case T__18:
					case T__19:
					case T__20:
					case T__21:
					case T__22:
					case T__23:
					case T__24:
					case T__25:
					case T__26:
					case T__27:
					case T__28:
					case T__29:
					case T__30:
					case T__31:
					case T__32:
					case T__33:
					case T__34:
					case T__35:
					case T__36:
					case T__37:
					case T__38:
					case T__39:
					case T__40:
					case T__41:
					case T__42:
					case T__43:
					case T__44:
					case T__45:
					case T__46:
					case T__47:
					case T__48:
					case T__49:
					case T__50:
					case T__51:
					case T__52:
					case STRING:
						{
						setState(165);
						((SectionContext)_localctx).primeSection = primeSection();
						 list.add(((SectionContext)_localctx).primeSection.content_); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			 ((SectionContext)_localctx).content_ =  new Section(0, (((SectionContext)_localctx).arg!=null?_input.getText(((SectionContext)_localctx).arg.start,((SectionContext)_localctx).arg.stop):null), list); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubSectionContext extends ParserRuleContext {
		public Section content_;
		public ArgContext arg;
		public SubSubSectionContext subSubSection;
		public PrimeSectionContext primeSection;
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public List<SubSubSectionContext> subSubSection() {
			return getRuleContexts(SubSubSectionContext.class);
		}
		public SubSubSectionContext subSubSection(int i) {
			return getRuleContext(SubSubSectionContext.class,i);
		}
		public List<PrimeSectionContext> primeSection() {
			return getRuleContexts(PrimeSectionContext.class);
		}
		public PrimeSectionContext primeSection(int i) {
			return getRuleContext(PrimeSectionContext.class,i);
		}
		public SubSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterSubSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitSubSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitSubSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubSectionContext subSection() throws RecognitionException {
		SubSectionContext _localctx = new SubSectionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_subSection);
		 List<AbstractSection> list = new ArrayList<>(); 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__9);
			setState(176);
			((SubSectionContext)_localctx).arg = arg();
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(183);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__10:
						{
						setState(177);
						((SubSectionContext)_localctx).subSubSection = subSubSection();
						 list.add(((SubSectionContext)_localctx).subSubSection.content_); 
						}
						break;
					case T__3:
					case T__11:
					case T__12:
					case T__13:
					case T__14:
					case T__15:
					case T__16:
					case T__17:
					case T__18:
					case T__19:
					case T__20:
					case T__21:
					case T__22:
					case T__23:
					case T__24:
					case T__25:
					case T__26:
					case T__27:
					case T__28:
					case T__29:
					case T__30:
					case T__31:
					case T__32:
					case T__33:
					case T__34:
					case T__35:
					case T__36:
					case T__37:
					case T__38:
					case T__39:
					case T__40:
					case T__41:
					case T__42:
					case T__43:
					case T__44:
					case T__45:
					case T__46:
					case T__47:
					case T__48:
					case T__49:
					case T__50:
					case T__51:
					case T__52:
					case STRING:
						{
						setState(180);
						((SubSectionContext)_localctx).primeSection = primeSection();
						 list.add(((SubSectionContext)_localctx).primeSection.content_); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			 ((SubSectionContext)_localctx).content_ =  new Section(1, (((SubSectionContext)_localctx).arg!=null?_input.getText(((SubSectionContext)_localctx).arg.start,((SubSectionContext)_localctx).arg.stop):null), list); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubSubSectionContext extends ParserRuleContext {
		public Section content_;
		public ArgContext arg;
		public PrimeSectionContext primeSection;
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public List<PrimeSectionContext> primeSection() {
			return getRuleContexts(PrimeSectionContext.class);
		}
		public PrimeSectionContext primeSection(int i) {
			return getRuleContext(PrimeSectionContext.class,i);
		}
		public SubSubSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subSubSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterSubSubSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitSubSubSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitSubSubSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubSubSectionContext subSubSection() throws RecognitionException {
		SubSubSectionContext _localctx = new SubSubSectionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_subSubSection);
		 List<AbstractSection> list = new ArrayList<>(); 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__10);
			setState(191);
			((SubSubSectionContext)_localctx).arg = arg();
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(192);
					((SubSubSectionContext)_localctx).primeSection = primeSection();
					 list.add(((SubSubSectionContext)_localctx).primeSection.content_); 
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			 ((SubSubSectionContext)_localctx).content_ =  new Section(2, (((SubSubSectionContext)_localctx).arg!=null?_input.getText(((SubSubSectionContext)_localctx).arg.start,((SubSubSectionContext)_localctx).arg.stop):null), list); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public UnderlineContext underline() {
			return getRuleContext(UnderlineContext.class,0);
		}
		public EmphContext emph() {
			return getRuleContext(EmphContext.class,0);
		}
		public BoldContext bold() {
			return getRuleContext(BoldContext.class,0);
		}
		public GreekContext greek() {
			return getRuleContext(GreekContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_command);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				match(T__15);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(207);
				match(T__16);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 7);
				{
				setState(208);
				match(T__17);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 8);
				{
				setState(209);
				underline();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 9);
				{
				setState(210);
				emph();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 10);
				{
				setState(211);
				bold();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 11);
				{
				setState(212);
				match(T__18);
				}
				break;
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
				enterOuterAlt(_localctx, 12);
				{
				setState(213);
				greek();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnderlineContext extends ParserRuleContext {
		public String text;
		public ArgContext arg;
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public UnderlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_underline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterUnderline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitUnderline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitUnderline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnderlineContext underline() throws RecognitionException {
		UnderlineContext _localctx = new UnderlineContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_underline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__19);
			setState(217);
			((UnderlineContext)_localctx).arg = arg();
			((UnderlineContext)_localctx).text =  (((UnderlineContext)_localctx).arg!=null?_input.getText(((UnderlineContext)_localctx).arg.start,((UnderlineContext)_localctx).arg.stop):null); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmphContext extends ParserRuleContext {
		public String text;
		public ArgContext arg;
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public EmphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterEmph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitEmph(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitEmph(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmphContext emph() throws RecognitionException {
		EmphContext _localctx = new EmphContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_emph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__20);
			setState(221);
			((EmphContext)_localctx).arg = arg();
			((EmphContext)_localctx).text =  (((EmphContext)_localctx).arg!=null?_input.getText(((EmphContext)_localctx).arg.start,((EmphContext)_localctx).arg.stop):null); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoldContext extends ParserRuleContext {
		public String text;
		public ArgContext arg;
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public BoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterBold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitBold(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitBold(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoldContext bold() throws RecognitionException {
		BoldContext _localctx = new BoldContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bold);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__21);
			setState(225);
			((BoldContext)_localctx).arg = arg();
			((BoldContext)_localctx).text =  (((BoldContext)_localctx).arg!=null?_input.getText(((BoldContext)_localctx).arg.start,((BoldContext)_localctx).arg.stop):null); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GreekContext extends ParserRuleContext {
		public GreekContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greek; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterGreek(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitGreek(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitGreek(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreekContext greek() throws RecognitionException {
		GreekContext _localctx = new GreekContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_greek);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(LatexParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DocumentclassContext extends ParserRuleContext {
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public DocumentclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_documentclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterDocumentclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitDocumentclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitDocumentclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentclassContext documentclass() throws RecognitionException {
		DocumentclassContext _localctx = new DocumentclassContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_documentclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__53);
			setState(233);
			arg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AuthorContext extends ParserRuleContext {
		public String text;
		public ArgContext arg;
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public AuthorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_author; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterAuthor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitAuthor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitAuthor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuthorContext author() throws RecognitionException {
		AuthorContext _localctx = new AuthorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_author);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__54);
			setState(236);
			((AuthorContext)_localctx).arg = arg();

			    ((AuthorContext)_localctx).text =  (((AuthorContext)_localctx).arg!=null?_input.getText(((AuthorContext)_localctx).arg.start,((AuthorContext)_localctx).arg.stop):null);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateContext extends ParserRuleContext {
		public String text;
		public ArgContext arg;
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__55);
			setState(240);
			((DateContext)_localctx).arg = arg();

			    ((DateContext)_localctx).text =  (((DateContext)_localctx).arg!=null?_input.getText(((DateContext)_localctx).arg.start,((DateContext)_localctx).arg.stop):null);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TitleContext extends ParserRuleContext {
		public String text;
		public ArgContext arg;
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(T__56);
			setState(244);
			((TitleContext)_localctx).arg = arg();

			    ((TitleContext)_localctx).text =  (((TitleContext)_localctx).arg!=null?_input.getText(((TitleContext)_localctx).arg.start,((TitleContext)_localctx).arg.stop):null);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__5);
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(248);
					matchWildcard();
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(254);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u0103\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\3\3\3\3\3\3"+
		"\4\3\4\7\4E\n\4\f\4\16\4H\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"S\n\4\f\4\16\4V\13\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\5\7b\n\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bl\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\7\tx\n\t\f\t\16\t{\13\t\3\t\3\t\5\t\177\n\t\3\n\3\n\3\n\7"+
		"\n\u0084\n\n\f\n\16\n\u0087\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u00a1\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ab"+
		"\n\f\f\f\16\f\u00ae\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ba"+
		"\n\r\f\r\16\r\u00bd\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\7\16\u00c6\n"+
		"\16\f\16\16\16\u00c9\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00d9\n\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\7\31"+
		"\u00fc\n\31\f\31\16\31\u00ff\13\31\3\31\3\31\3\31\3\u00fd\2\32\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\3\3\2\31\67\2\u010a\2\62"+
		"\3\2\2\2\4\66\3\2\2\2\6B\3\2\2\2\bY\3\2\2\2\n\\\3\2\2\2\f_\3\2\2\2\16"+
		"k\3\2\2\2\20~\3\2\2\2\22\u0085\3\2\2\2\24\u00a0\3\2\2\2\26\u00a2\3\2\2"+
		"\2\30\u00b1\3\2\2\2\32\u00c0\3\2\2\2\34\u00d8\3\2\2\2\36\u00da\3\2\2\2"+
		" \u00de\3\2\2\2\"\u00e2\3\2\2\2$\u00e6\3\2\2\2&\u00e8\3\2\2\2(\u00ea\3"+
		"\2\2\2*\u00ed\3\2\2\2,\u00f1\3\2\2\2.\u00f5\3\2\2\2\60\u00f9\3\2\2\2\62"+
		"\63\5\6\4\2\63\64\5\4\3\2\64\65\b\2\1\2\65\3\3\2\2\2\66<\5\b\5\2\678\5"+
		"\16\b\289\b\3\1\29;\3\2\2\2:\67\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2"+
		"=?\3\2\2\2><\3\2\2\2?@\5\n\6\2@A\b\3\1\2A\5\3\2\2\2BF\5(\25\2CE\5\f\7"+
		"\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GT\3\2\2\2HF\3\2\2\2IJ\5*\26"+
		"\2JK\b\4\1\2KS\3\2\2\2LM\5,\27\2MN\b\4\1\2NS\3\2\2\2OP\5.\30\2PQ\b\4\1"+
		"\2QS\3\2\2\2RI\3\2\2\2RL\3\2\2\2RO\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2"+
		"\2UW\3\2\2\2VT\3\2\2\2WX\b\4\1\2X\7\3\2\2\2YZ\7\3\2\2Z[\5\60\31\2[\t\3"+
		"\2\2\2\\]\7\4\2\2]^\5\60\31\2^\13\3\2\2\2_a\7\5\2\2`b\7>\2\2a`\3\2\2\2"+
		"ab\3\2\2\2bc\3\2\2\2cd\5\60\31\2d\r\3\2\2\2ef\5\26\f\2fg\b\b\1\2gl\3\2"+
		"\2\2hi\5\20\t\2ij\b\b\1\2jl\3\2\2\2ke\3\2\2\2kh\3\2\2\2l\17\3\2\2\2mn"+
		"\5&\24\2no\b\t\1\2o\177\3\2\2\2pq\5\34\17\2qr\b\t\1\2r\177\3\2\2\2sy\7"+
		"\6\2\2tu\5\24\13\2uv\b\t\1\2vx\3\2\2\2wt\3\2\2\2x{\3\2\2\2yw\3\2\2\2y"+
		"z\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7\6\2\2}\177\b\t\1\2~m\3\2\2\2~p\3\2\2"+
		"\2~s\3\2\2\2\177\21\3\2\2\2\u0080\u0081\5\24\13\2\u0081\u0082\b\n\1\2"+
		"\u0082\u0084\3\2\2\2\u0083\u0080\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\23\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u0089\5$\23\2\u0089\u008a\b\13\1\2\u008a\u00a1\3\2\2\2\u008b\u008c\7"+
		"\7\2\2\u008c\u008d\7\b\2\2\u008d\u008e\5\22\n\2\u008e\u008f\7\t\2\2\u008f"+
		"\u0090\7\b\2\2\u0090\u0091\5\22\n\2\u0091\u0092\7\t\2\2\u0092\u0093\b"+
		"\13\1\2\u0093\u00a1\3\2\2\2\u0094\u0095\7\n\2\2\u0095\u0096\5\24\13\2"+
		"\u0096\u0097\b\13\1\2\u0097\u00a1\3\2\2\2\u0098\u0099\7\b\2\2\u0099\u009a"+
		"\5\24\13\2\u009a\u009b\7\t\2\2\u009b\u009c\b\13\1\2\u009c\u00a1\3\2\2"+
		"\2\u009d\u009e\5&\24\2\u009e\u009f\b\13\1\2\u009f\u00a1\3\2\2\2\u00a0"+
		"\u0088\3\2\2\2\u00a0\u008b\3\2\2\2\u00a0\u0094\3\2\2\2\u00a0\u0098\3\2"+
		"\2\2\u00a0\u009d\3\2\2\2\u00a1\25\3\2\2\2\u00a2\u00a3\7\13\2\2\u00a3\u00ac"+
		"\5\60\31\2\u00a4\u00a5\5\30\r\2\u00a5\u00a6\b\f\1\2\u00a6\u00ab\3\2\2"+
		"\2\u00a7\u00a8\5\20\t\2\u00a8\u00a9\b\f\1\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u00a4\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\u00b0\b\f\1\2\u00b0\27\3\2\2\2\u00b1\u00b2\7\f\2\2\u00b2\u00bb\5\60\31"+
		"\2\u00b3\u00b4\5\32\16\2\u00b4\u00b5\b\r\1\2\u00b5\u00ba\3\2\2\2\u00b6"+
		"\u00b7\5\20\t\2\u00b7\u00b8\b\r\1\2\u00b8\u00ba\3\2\2\2\u00b9\u00b3\3"+
		"\2\2\2\u00b9\u00b6\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\b\r"+
		"\1\2\u00bf\31\3\2\2\2\u00c0\u00c1\7\r\2\2\u00c1\u00c7\5\60\31\2\u00c2"+
		"\u00c3\5\20\t\2\u00c3\u00c4\b\16\1\2\u00c4\u00c6\3\2\2\2\u00c5\u00c2\3"+
		"\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\b\16\1\2\u00cb\33\3\2\2"+
		"\2\u00cc\u00d9\7\16\2\2\u00cd\u00d9\7\17\2\2\u00ce\u00d9\7\20\2\2\u00cf"+
		"\u00d9\7\21\2\2\u00d0\u00d9\7\22\2\2\u00d1\u00d9\7\23\2\2\u00d2\u00d9"+
		"\7\24\2\2\u00d3\u00d9\5\36\20\2\u00d4\u00d9\5 \21\2\u00d5\u00d9\5\"\22"+
		"\2\u00d6\u00d9\7\25\2\2\u00d7\u00d9\5$\23\2\u00d8\u00cc\3\2\2\2\u00d8"+
		"\u00cd\3\2\2\2\u00d8\u00ce\3\2\2\2\u00d8\u00cf\3\2\2\2\u00d8\u00d0\3\2"+
		"\2\2\u00d8\u00d1\3\2\2\2\u00d8\u00d2\3\2\2\2\u00d8\u00d3\3\2\2\2\u00d8"+
		"\u00d4\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2"+
		"\2\2\u00d9\35\3\2\2\2\u00da\u00db\7\26\2\2\u00db\u00dc\5\60\31\2\u00dc"+
		"\u00dd\b\20\1\2\u00dd\37\3\2\2\2\u00de\u00df\7\27\2\2\u00df\u00e0\5\60"+
		"\31\2\u00e0\u00e1\b\21\1\2\u00e1!\3\2\2\2\u00e2\u00e3\7\30\2\2\u00e3\u00e4"+
		"\5\60\31\2\u00e4\u00e5\b\22\1\2\u00e5#\3\2\2\2\u00e6\u00e7\t\2\2\2\u00e7"+
		"%\3\2\2\2\u00e8\u00e9\7=\2\2\u00e9\'\3\2\2\2\u00ea\u00eb\78\2\2\u00eb"+
		"\u00ec\5\60\31\2\u00ec)\3\2\2\2\u00ed\u00ee\79\2\2\u00ee\u00ef\5\60\31"+
		"\2\u00ef\u00f0\b\26\1\2\u00f0+\3\2\2\2\u00f1\u00f2\7:\2\2\u00f2\u00f3"+
		"\5\60\31\2\u00f3\u00f4\b\27\1\2\u00f4-\3\2\2\2\u00f5\u00f6\7;\2\2\u00f6"+
		"\u00f7\5\60\31\2\u00f7\u00f8\b\30\1\2\u00f8/\3\2\2\2\u00f9\u00fd\7\b\2"+
		"\2\u00fa\u00fc\13\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u0100\u0101\7\t\2\2\u0101\61\3\2\2\2\23<FRTaky~\u0085\u00a0\u00aa"+
		"\u00ac\u00b9\u00bb\u00c7\u00d8\u00fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}