grammar Pmm;	

program: 
       ;
fragment
DIGIT: [0-9];
fragment
CARACTER: [a-zA-Z];
fragment
MANTISA: 'E' [+-]? [1-9] DIGIT*;

INT_CONSTANT: '0' | [1-9] DIGIT+;
ID: (CARACTER | '_') ('_' | CARACTER | DIGIT)*;
CHAR_CONSTANT: '\'\''[\n\t(\CARACTERCARACTERCARACTER).]'\'\'';
COMMENTARIO: '#' .*? ('\r')?('\n'|EOF) -> skip;
COMENTARIO_MULTILINEA: '"';

TRASH: [ \n\r\t] -> skip;