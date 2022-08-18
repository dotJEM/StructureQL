grammar StructureQL;

//

query: match | object
    ;

object: 
    '{' match (',' match)* '}' 
    ;

property: STRING
    | STRING ':' ( recursiveMatchAll | simpleMatchAll | object )
    ;

match:
    recursiveMatchAll | simpleMatchAll | property
    ;

recursiveMatchAll: '**';
simpleMatchAll: '*';

/* ================================================================ *
 * =                     LEXER                                    = *
 * ================================================================ */

// DOUBLE_STAR: '**';
// SINGLE_STAR: '*';

STRING
   : CHAR+
   ;

fragment ESC:  '\\' .;

fragment CHAR: 
    ~( ' ' | '\t' | '\n' | '\r' | '\u3000' | '*' | '{' | '}' | ':' | ',' )
    ;

fragment UNICODE
   : 'u' HEX HEX HEX HEX
   ;

fragment HEX
   : [0-9a-fA-F]
   ;

fragment SAFECODEPOINT
   : ~ ["\\\u0000-\u001F]
   ;

WS : (' '|'\t'|'\r'|'\n'|'\u3000') -> skip;
