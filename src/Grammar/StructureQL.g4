grammar StructureQL;

query
    : match | object
    ;

array
    : '[' (lower=number)? '..' (upper=number)? ']' elementQuery=part
    ;

object
    : '{' match (',' match)* '}' 
    ;

property
    : STRING
    | STRING ':' part
    ;

part
    : recursiveMatchAll | simpleMatchAll | array | object
    ;

match
    : recursiveMatchAll | simpleMatchAll | property
    ;

recursiveMatchAll
    : '**'
    ;

simpleMatchAll
    : '*'
    ;

number
    : INTEGER
    ;

/* ================================================================ *
 * =                     LEXER                                    = *
 * ================================================================ */

// DOUBLE_STAR: '**';
// SINGLE_STAR: '*';

fragment DIGIT        
    : '0' .. '9'
    ;

fragment ESC
    : '\\' .
    ;

fragment CHAR
    : ~( ' ' | '\t' | '\n' | '\r' | '\u3000' | '*' | '{' | '}' | '[' | ']' | ':' | ',' | '.' )
    ;

WS : (' '|'\t'|'\r'|'\n'|'\u3000') -> skip;

INTEGER 
    : DIGIT+
    ;

STRING 
    : CHAR+
    ;