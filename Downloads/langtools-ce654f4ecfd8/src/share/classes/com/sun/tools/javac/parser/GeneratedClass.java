package com.sun.tools.javac.parser;

import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.code.Flags;
import com.sun.tools.javac.tree.TreeMaker;
import com.sun.tools.javac.tree.JCTree.JCAnnotation;
import com.sun.tools.javac.tree.JCTree.JCClassDecl;
import com.sun.tools.javac.tree.JCTree.JCCompilationUnit;
import com.sun.tools.javac.tree.JCTree.JCExpression;
import com.sun.tools.javac.tree.JCTree.JCModifiers;
import com.sun.tools.javac.tree.JCTree.JCTypeParameter;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Names;

/* This class programmatically produces the superclass "GeneratedClass"
  with signature public class GeneratedClass{} */ 
 
public class GeneratedClass {

    TreeMaker maker;
    Names names;

    public GeneratedClass(ParserFactory fac) {
        maker = fac. F;
        names = fac.names;
    }

    public JCCompilationUnit getTree() {
        ListBuffer<JCTree> defs = new ListBuffer<JCTree>();
        defs.append(makeClassDecl());
        return maker.TopLevel(List.<JCAnnotation>nil(), null, defs.toList());
    }

    /* This is a class decalaration node for public class GeneratedClass{}*/
      
     
    protected JCClassDecl makeClassDecl() {
        JCModifiers mods = maker.Modifiers(Flags.PUBLIC);
        Name name = names.fromString("GeneratedClass");        
        
        return maker.ClassDef(mods, name, List.<JCTypeParameter>nil(), null, List.<JCExpression>nil(), List.<JCTree>nil());

    }      

}