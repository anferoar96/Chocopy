grammar ChocopyGrammar;

//A
inicial: (print_def|var_def|func_def|class_def)* stmt*;
        
print_def: PRINT PIZQ expr PDER;

class_def : CLASS ID PIZQ ID PDER DOSPUNTOS class_body;

class_body : PASS 
           | (var_def| func_def)+
           ;

func_def : DEF ID PIZQ (typed_var(COMA typed_var)*)? PDER (FLECHA type)? DOSPUNTOS func_body;

func_body : (global_decl | nonlocal_decl | var_def| func_def)* stmt+;

typed_var : ID DOSPUNTOS type;
//ab
type : ID
	 | TIPO_DATO
	 | tk_cadena
     | AIZQ type ADER
     ;

global_decl : GLOBAL ID;

nonlocal_decl :NONLOCAL ID;

var_def : typed_var IGUAL literal;


stmt : simple_stmt
     | IF expr DOSPUNTOS block (ELIF expr DOSPUNTOS block)* (ELSE DOSPUNTOS block)?
     | WHILE expr DOSPUNTOS block
     | FOR ID IN expr DOSPUNTOS block
     ;


simple_stmt : PASS
            | expr
            | RETURN (expr)?
            | (target IGUAL)+ expr
            ;

block :   stmt+;

literal : NONE
        | TRUE
        | FALSE
        | INTEGER
        | STRING
        | tk_cadena
        ;

expr: tk_cadena
	| cexpr
	| print_def
    | NOT expr
    | expr (AND|OR) expr
    | expr IF expr ELSE expr
    ;

cexpr : ID
      | literal
      | AIZQ (expr (COMA expr)*)? ADER
      | PIZQ expr PDER
      | cexpr PUNTO ID  //MEMBER_EXPR
      | cexpr AIZQ expr ADER //INDEX_EXPR
      | cexpr PUNTO ID PIZQ (expr(COMA expr)*)? PDER
      | ID PIZQ (expr(COMA expr)*)? PDER
      | cexpr BIN_OP cexpr
      | BIN_OP expr  //Macheteo de numeros negativos, se puede mejorar
      ;
 

tk_cadena:'"' .*? '"';
member_expr : cexpr PUNTO ID;
index_expr  : cexpr AIZQ expr ADER;

target : ID
       | member_expr
       | index_expr
       ;


//DOUBLE	: [0-9]+( | [.][0-9]+);
GLOBAL : ('global');
//LEN: ('len');
CLASS: ('class');
NONLOCAL : ('nonlocal');
IF : ('if');
ELIF : ('elif');
ELSE : ('else');
PRINT : ('print');
FOR : ('for');
WHILE : ('while');
DEF : ('def');
PASS : ('pass');
RETURN : ('return');
AND: ('and');
NONE : ('None');
TRUE : ('True');
FALSE : ('False');
OR : ('or');
IN :('in');
NOT : ('not');
ID 		: [a-zA-Z][a-zA-Z0-9_]* ;
STRING : [a-zA-Z];
INTEGER : [0-9]+;
PIZQ	: '(' ;
PDER	: ')' ;
AIZQ	: '[' ;
ADER	: ']' ;
PUNTO : ('.');
COMA : (',');
DOSPUNTOS : (':');
IGUAL : ('=');
FLECHA	: ('->') ;
BIN_OP	: ( '+' | '-' | '*' | '//' | '%' | '==' | '!=' | '<=' | '>=' | '<' | '>' | 'is' ) ;
TIPO_DATO : ( 'object' | 'str' | 'bool' | 'list' | 'int' ) ;
//JUMP: [\n]+;
COMMENT 		: '/*' .*? '*/' -> skip ;
LINE_COMMENT 	: '#' ~[\r\n]* -> skip ;
WS 		: [ \t\r\n]+ -> channel(HIDDEN) ;

