/* Generated By:JJTree: Do not edit this line. ASTBitStringType.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javacc;

public
class ASTBitStringType extends SimpleNode {
  public ASTBitStringType(int id) {
    super(id);
  }

  public ASTBitStringType(AsnParser p, int id) {
    super(p, id);
  }

  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }

    public void generateClass(String name) {
        generateClass( name, "bitstring" );
    }
}
/* JavaCC - OriginalChecksum=baa48daa5457b4f4d6f9c8aa28089d53 (do not edit this line) */