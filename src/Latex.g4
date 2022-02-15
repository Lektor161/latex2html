grammar Latex;

@header {
    import utility.*;
}

document returns [Grammar grammar]: preamble body { $grammar = new Grammar($preamble.preamble_, $body.body_); };

body returns [Body body_]
    @init { List<AbstractSection> list = new ArrayList<>(); }
    :begin (content { list.add($content.content_); })* end
    { $body_ = new Body(list); };

preamble returns [Preamble preamble_]
    @init {String author_ = null, date_ = null, title_ = null; }
    :documentclass usepkg*
    (author { author_ = $author.text; } | date { date_ = $date.text; } | title { title_ = $title.text; })*
    {$preamble_ = new Preamble(author_, date_, title_); };

begin    : '\\begin' arg         ;
end      : '\\end'   arg         ;
usepkg   : '\\usepackage' SQUARE_ARG? arg;

content returns [AbstractSection content_] : section      { $content_ = $section.content_;      } |
                                             primeSection { $content_ = $primeSection.content_; };

//formulaSection : variable index? pow?;

//pow      returns [String name] : '^' STRING {$name = $STRING.text; } ;
//index    returns [String name] : '_' STRING {$name = $STRING.text; } ;
//variable returns [String name] :     STRING {$name = $STRING.text; } ;

primeSection   returns [PrimeSection content_]
    :  string              { $content_ = new PrimeSection($string.text, null, null); }  |
       command             { $content_ = new PrimeSection(null, $command.text, null); } |
       '$' mathItems '$'   { $content_ = new PrimeSection(null, null, new MathFormula($mathItems.items_)); };

mathItems returns [List<MathItem> items_]
    @init { $items_ = new ArrayList<>(); }
    : (mathItem { $items_.add($mathItem.item_); } )* ;

mathItem returns [MathItem item_] :
    greek                 { $item_ = new GreekItem($greek.text); }                                             |
    '\\sqrt' '{' mathItems'}'
                          { $item_ = new SqrtItem( new MathFormula($mathItems.items_ )); }                                      |
    '\\frac' '{' i1=mathItems '}' '{' i2=mathItems '}'
                          { $item_ = new FracItem(new MathFormula($i1.items_), new MathFormula($i2.items_)); } |
    '{' mathItem '}'      { $item_ = $mathItem.item_; }                                                        |
    string '_' mathItem   { $item_ = new IndexItem(new StringItem($string.text), $mathItem.item_); }           |
    string                { $item_ = new StringItem($string.text); }                                           ;

section        returns [Section content_]
    @init { List<AbstractSection> list = new ArrayList<>(); }
    :  '\\section'      arg (subSection   { list.add($subSection.content_);   } |
                             primeSection { list.add($primeSection.content_); } )*
    { $content_ = new Section(0, $arg.text, list); } ;

subSection     returns [Section content_]
    @init { List<AbstractSection> list = new ArrayList<>(); }
    : '\\subsection'    arg (subSubSection { list.add($subSubSection.content_); } |
                             primeSection  { list.add($primeSection.content_); } )*
    { $content_ = new Section(1, $arg.text, list); } ;

subSubSection  returns [Section content_]
    @init { List<AbstractSection> list = new ArrayList<>(); }
    : '\\subsubsection' arg (primeSection  { list.add($primeSection.content_); })*
    { $content_ = new Section(2, $arg.text, list); } ;

command : '\\par' | '\\newline' | '\\slash' | '\\backslash' | '\\ldots' | '\\textcelsius'
                          | '\\texteuro' | underline | emph | bold | '\\today' | greek ;

underline returns [String text] : '\\underline' arg {$text = $arg.text; };
emph      returns [String text] : '\\emph'      arg {$text = $arg.text; };
bold      returns [String text] : '\\bold'      arg {$text = $arg.text; };

greek :	'\\Gamma' | '\\Delta'  | '\\Theta'   | '\\Lambda' | '\\Pi'
      | '\\Sigma' | '\\Phi'    | '\\Psi'     | '\\Omega'  | '\\alpha' | '\\beta'
      | '\\gamma' | '\\delta'  | '\\epsilon' | '\\eta'    | '\\theta' | '\\iota'
      | '\\kappa' | '\\lambda' | '\\mugreek' | '\\nu'     | '\\xi'    | '\\pi'  | '\\rho'
      | '\\sigma' | '\\tau'    | '\\upsilon' | '\\phi'    | '\\chi'   | '\\psi' | '\\omega' ;

string   : STRING ;

documentclass : '\\documentclass' arg ;

author returns [String text]: '\\author' arg {
    $text = $arg.text;
};

date returns [String text]: '\\date' arg {
    $text = $arg.text;
};

title returns [String text]: '\\title' arg {
    $text = $arg.text;
};

//arg returns [String text]: ARG {
//    String str = $ARG.text;
//    $text = str.substring(1, str.length() - 1);
//};


arg: '{' .*? '}' ;

WS            : [ \t\r\n]+ -> skip ;
STRING        : ~[ _^\\\t\r\n{}$]+ ;

SQUARE_ARG : '[' .*? ']'      ;
//ARG        : '{' .*? '}'      ;
