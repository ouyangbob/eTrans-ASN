/* Generated By:JJTree: Do not edit this line. ASTNumberForm.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javacc;

public
class ASTNumberForm extends SimpleNode {
  public ASTNumberForm(int id) {
    super(id);
  }

  public ASTNumberForm(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=c7edbf2635ec49829420c43903b9f98d (do not edit this line) */