import java.util.*;

public class MyVisit<T> extends ChocopyGrammarBaseVisitor<T>{

    HashMap<String,Object> tablaSimbolos = new HashMap<>();
    int cont=0;

    @Override
    public T visitInicial(ChocopyGrammarParser.InicialContext ctx) {
        Object c;
        //try {
            while(ctx!=null) {
                if (ctx.var_def() != null) {
                    visitVar_def(ctx.var_def(cont));
                } else if (ctx.print_def() != null) {
                    visitPrint_def(ctx.print_def(cont));
                } else if (ctx.func_def() != null) {

                } else if (ctx.class_def() != null) {

                } else if (ctx.stmt() != null) {

                }
            }
       // }catch(Exception e) {
        //}


        return (T)"Aq";
    }

    @Override
    public T visitCexpr(ChocopyGrammarParser.CexprContext ctx) {
        String s=null;
        if(ctx.ID()!=null){
            s=ctx.ID().getText();
        }else if(ctx.literal()!=null){
            s=(String)visitLiteral(ctx.literal());
        }
        return (T)s;
    }

    @Override
    public T visitExpr(ChocopyGrammarParser.ExprContext ctx) {
        String res=null;
        if(ctx.tk_cadena()!=null){
           visitTk_cadena(ctx.tk_cadena());
        }else if(ctx.cexpr()!=null){
           res =(String)visitCexpr(ctx.cexpr());
           return (T) res;
        }else if(ctx.print_def()!=null){
            //Duda print(inside print)
            res=null;
        }else if(ctx.NOT()!=null){

        }else if(ctx.AND() != null){
            Boolean res1=(Boolean) visitExpr(ctx.expr(0));
            Boolean res2=(Boolean) visitExpr(ctx.expr(1));
            Boolean ans;
            if(res1==Boolean.TRUE && res2==Boolean.TRUE){
                ans=Boolean.TRUE;
                return (T)ans;
            }else{
                ans=Boolean.FALSE;
                return (T)ans;
            }

        }else if(ctx.OR()!=null){
            //Solucionar cuando no sea de ningun tipo
            Boolean res1=(Boolean) visitExpr(ctx.expr(0));
            Boolean res2=(Boolean) visitExpr(ctx.expr(1));
            Boolean ans;
            if(res1==Boolean.TRUE ||  res2==Boolean.TRUE){
                ans=Boolean.TRUE;
                return (T)ans;
            }else{
                ans=Boolean.FALSE;
                return (T)ans;
            }
        }else if(ctx.IF()!=null){
            Boolean part1=(Boolean)visitExpr(ctx.expr(0)); //True or false
            Object part2=visitExpr(ctx.expr(1)); //
            Object part3=visitExpr(ctx.expr(2));
            if(part1==Boolean.TRUE){
                return (T)part2;
            }else{
                return (T)part3;
            }
        }else{
            System.err.printf("<%d:%d> Error semantico, la variable con nombre: \"" + "\" ya fue declarada.\n");
            System.exit(-1);
        }
        return super.visitExpr(ctx);
    }

    @Override
    public T visitPrint_def(ChocopyGrammarParser.Print_defContext ctx) {
        String ans = (String)visitExpr(ctx.expr());
        System.out.println(tablaSimbolos);
        System.out.println(ans);
        cont=cont+1;
        return (T) ans;
    }


    @Override
    public T visitClass_def(ChocopyGrammarParser.Class_defContext ctx) {

        return super.visitClass_def(ctx);
    }

    @Override
    public T visitClass_body(ChocopyGrammarParser.Class_bodyContext ctx) {

        return super.visitClass_body(ctx);
    }

    @Override
    public T visitFunc_def(ChocopyGrammarParser.Func_defContext ctx) {
        Object id_def = null;
        if (ctx.DEF()!=null){
            if (ctx.ID()!=null){
                id_def = ctx.ID().getText();
                if (tablaSimbolos.get(id_def)!=null){
                    int line = ctx.ID().getSymbol().getLine();
                    int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
                    System.err.printf("<%d:%d> Error semantico, el metodo: \""+ id_def + "\" ya fue declarada. \n",line,col);
                }else{
                    if (ctx.PIZQ()!=null){
                        if (ctx.PDER()!=null){
                            //aqui iria typed_var si supiera como :v
                            //tablaSimbolos.put(id_def,visitTyped_var(ctx.typed_var()));
                            if (ctx.FLECHA()!=null){
                                visitType(ctx.type());
                                if (ctx.DOSPUNTOS()!=null){
                                    id_def = (Object) visitFunc_body(ctx.func_body());
                                }else{
                                    System.err.printf("Error, faltan" +ctx.DOSPUNTOS().getSymbol()+ "al final");
                                }
                            }else{
                                System.err.printf("Error semantico, no hay tipo de dato");
                            }
                        }
                    }


                }
            }
        }
        return (T)id_def;
    }

    @Override
    public T visitFunc_body(ChocopyGrammarParser.Func_bodyContext ctx) {

        return super.visitFunc_body(ctx);
    }

    @Override
    public T visitTyped_var(ChocopyGrammarParser.Typed_varContext ctx) {
        String ans="";
        String ans2="";
        List<String> par=new ArrayList<>();
        if (ctx.ID() != null){
            ans=ctx.ID().getText();
            ans2=(String)visitType(ctx.type());
            par.add(ans);
            par.add(ans2);
        }
        return (T) par;
    }

    @Override
    public T visitType(ChocopyGrammarParser.TypeContext ctx) {
        String type = null;
        if (ctx.ID() != null){
            type= ctx.ID().getText();
        }else if (ctx.TIPO_DATO()!=null){
            type= ctx.getText();
        }else if(ctx.AIZQ()!=null){
            if (ctx.ADER()!=null){
                visitType(ctx);
            }else{
                System.err.printf("Error semantico");
            }
        }
        return (T)type;
    }

    @Override
    public T visitGlobal_decl(ChocopyGrammarParser.Global_declContext ctx) {
        String global = null;
        if (ctx.GLOBAL()!=null){
            global = ctx.GLOBAL().getText();
            if(ctx.ID()!=null){
                global +=ctx.ID().getText();
            }
        }
        return (T)global;
    }

    @Override
    public T visitNonlocal_decl(ChocopyGrammarParser.Nonlocal_declContext ctx) {
        String nonlocal = null;
        if (ctx.NONLOCAL()!=null){
            nonlocal = ctx.NONLOCAL().getText();
            if(ctx.ID()!=null){
                nonlocal +=ctx.ID().getText();
            }
        }
        return (T)nonlocal;
    }

    @Override
    public T visitVar_def(ChocopyGrammarParser.Var_defContext ctx) {
        String totalVar = null;
        List<String> fin = null;
        List<String> literal;
        if(ctx.IGUAL()!=null){
            fin = (List<String>) visitTyped_var(ctx.typed_var());
            literal = (List<String>) visitLiteral(ctx.literal());
            fin.add(literal.get(0));
            fin.add(literal.get(1));
        }
        if(fin.get(1).equals(fin.get(3))){
            if(tablaSimbolos.containsKey(fin.get(0))){
                System.out.println("Error semantico");
                System.exit(-1);
            }else{
                tablaSimbolos.put(fin.get(0),fin.get(2));
            }
        }else{
            System.out.println("Error semantico");
            System.exit(-1);
        }
        cont=cont+1;
        return super.visitVar_def(ctx);
    }

    @Override
    public T visitStmt(ChocopyGrammarParser.StmtContext ctx) {
        return super.visitStmt(ctx);
    }

    @Override
    public T visitSimple_stmt(ChocopyGrammarParser.Simple_stmtContext ctx) {
        return super.visitSimple_stmt(ctx);
    }

    @Override
    public T visitBlock(ChocopyGrammarParser.BlockContext ctx) {
        return super.visitBlock(ctx);
    }

    @Override
    public T visitLiteral(ChocopyGrammarParser.LiteralContext ctx) {
        String literal = null;
        String tipo=null;
        List<String> ans=new ArrayList<>();
        if (ctx.NONE()!=null){
            literal = ctx.NONE().getText();
            tipo="None";
        }else if (ctx.TRUE()!=null){
            literal = ctx.TRUE().getText();
            tipo="True";
        }else if (ctx.FALSE()!=null){
            literal = ctx.FALSE().getText();
            tipo="False;";
        }else if (ctx.INTEGER()!=null){
            literal = ctx.INTEGER().getText();
            tipo="int";
        }else if (ctx.STRING()!=null){
            literal = ctx.STRING().getText();
            tipo="str";  //Fixed
        }else if (ctx.tk_cadena()!=null){
            literal = (String)visitTk_cadena(ctx.tk_cadena());
            tipo="str";
        }

        ans.add(literal);
        ans.add(tipo);
        return (T)ans;
    }






    @Override
    public T visitTk_cadena(ChocopyGrammarParser.Tk_cadenaContext ctx) {
        String cadenita= ctx.getText();
        return (T) cadenita;
    }

    @Override
    public T visitMember_expr(ChocopyGrammarParser.Member_exprContext ctx) {
        return super.visitMember_expr(ctx);
    }

    @Override
    public T visitIndex_expr(ChocopyGrammarParser.Index_exprContext ctx) {
        return super.visitIndex_expr(ctx);
    }

    @Override
    public T visitTarget(ChocopyGrammarParser.TargetContext ctx) {
        return super.visitTarget(ctx);
    }

}

