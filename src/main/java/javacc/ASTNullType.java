/* Generated By:JJTree: Do not edit this line. ASTNullType.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javacc;

public
class ASTNullType extends SimpleNode {
  public ASTNullType(int id) {
    super(id);
  }

  public ASTNullType(AsnParser p, int id) {
    super(p, id);
  }


  public void
	generateClass(String name)
	{
        generateClass( name, "null");
	}

///////////////////////////////////////
	
	
  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=049efd6d5de3969d97fe1d113f09a118 (do not edit this line) */