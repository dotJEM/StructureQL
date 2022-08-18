call antlr\antlr -Dlanguage=CSharp Grammar\StructureQL.g4 -o DotJEM.StructureQL\Parser\Generated -visitor -package DotJEM.StructureQL.Generated.Parser

rem call antlr\antlr -Dlanguage=JavaScript Grammar\StructureQL.g4 -o JsonResponseSelect\Parser\src\js -visitor