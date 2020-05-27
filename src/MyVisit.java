import java.util.HashMap;

public class MyVisit<T> extends ChocopyGrammarBaseVisitor<T>{

    HashMap<String,Object> tablaSimbolos = new HashMap<>();

    @Override
    public T visitInicial(ChocopyGrammarParser.InicialContext ctx) {
        if (ctx.print_def()!=null){
        }else if(ctx.var_def() != null) {

        }else if(ctx.func_def() != null) {

        }else if(ctx.class_def() != null) {

        }else if(ctx.stmt() != null) {

        }

        return super.visitInicial(ctx);
    }

    @Override
    public T visitPrint_def(ChocopyGrammarParser.Print_defContext ctx) {
        String ans = (String)visitExpr(ctx.expr());
        System.out.println(ans);
        return null;
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
        String totalTyped = null;
        if (ctx.ID() != null){
            String id = ctx.ID().getText();
            String dosPuntos = ctx.DOSPUNTOS().getText();
            if (tablaSimbolos.get(id)!=null){
                int line = ctx.ID().getSymbol().getLine();
                int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
                System.err.printf("<%d:%d> Error semantico, la variable: \""+ id + "\" ya fue declarada. \n",line,col);
            }else{
                tablaSimbolos.put(id,visitType(ctx.type()));
            }
            if (ctx.DOSPUNTOS()!=null){
                String typer_var = id + dosPuntos;
                String typito = (String)visitType(ctx.type());
                totalTyped = typer_var + typito;
            }
        }
        return (T) totalTyped;
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
        if(ctx.IGUAL()!=null){
            String var_def = (String)visitTyped_var(ctx.typed_var());
            String var_def2 = (String)visitLiteral(ctx.literal());
            totalVar = var_def+var_def2;
        }

        return (T) totalVar;
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
        if (ctx.NONE()!=null){
            literal = ctx.NONE().getText();
        }else if (ctx.TRUE()!=null){
            literal = ctx.TRUE().getText();
        }else if (ctx.FALSE()!=null){
            literal = ctx.FALSE().getText();
        }else if (ctx.INTEGER()!=null){
            literal = ctx.INTEGER().getText();
        }else if (ctx.STRING()!=null){
            literal = ctx.STRING().getText();
        }else if (ctx.tk_cadena()!=null){
            literal = (String)visitTk_cadena(ctx.tk_cadena());
        }
        return (T)literal;
    }

    @Override
    public T visitExpr(ChocopyGrammarParser.ExprContext ctx) {
        String res=null;
        if(ctx.tk_cadena()!=null){
            res= (String) visitTk_cadena(ctx.tk_cadena());
        }else if(ctx.cexpr()!=null){
            res=(String) visitCexpr(ctx.cexpr());
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
        return (T)res;
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

