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
                }
                if (ctx.print_def() != null) {
                    visitPrint_def(ctx.print_def(cont));
                }
                if (ctx.func_def() != null) {

                }
                if (ctx.class_def() != null) {

                }
                if (ctx.stmt() != null) {

                }
               // System.out.println("No pasa");
            }
       // }catch(Exception e) {
        //}


        return (T)"Aq";
    }


    @Override
    public T visitCexpr(ChocopyGrammarParser.CexprContext ctx) {
        List s = new ArrayList();
        if(ctx.ID()!=null){
           // System.out.println(ctx.ID());
            s.add(ctx.ID());
            s.add("id");
        }else if(ctx.literal()!=null){
            s=(List) visitLiteral(ctx.literal());
        }
        return (T)s;
    }

    @Override
    public T visitExpr(ChocopyGrammarParser.ExprContext ctx) {
        List res;
        if(ctx.tk_cadena()!=null){
           visitTk_cadena(ctx.tk_cadena());
        }else if(ctx.cexpr()!=null){
           res =(List) visitCexpr(ctx.cexpr());
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
        List ans = (List)visitExpr(ctx.expr());

        if(ans.get(1).equals("id")){
            if(tablaSimbolos.containsKey(ans.get(0))){
                System.out.println(tablaSimbolos.get(ans.get(0)));
            }else{
                System.out.println("Simbolo no encontrado");
                System.exit(-1);
            }
        }else{
            System.out.println(ans.get(0));
        }

        cont=cont+1;
        return super.visitPrint_def(ctx);
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
        List<String> fin = new ArrayList<>();
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
            System.out.println("Error semantico 1");
            System.exit(-1);
        }
        cont=cont+1;
        return super.visitVar_def(ctx);
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
    public T visitStmt(ChocopyGrammarParser.StmtContext ctx) {
        String stmt = null;
        int tamaño = ctx.expr().size();
        int tamañoBlocks = ctx.block().size();
        if (ctx.simple_stmt()!=null){
            stmt =(String) visitSimple_stmt(ctx.simple_stmt());
        }else if (ctx.IF()!=null){
            stmt = (String) visitExpr(ctx.expr(0));
            stmt += (String)visitBlock(ctx.block(0));
            if (ctx.ELIF()!=null){
                for (int i = 1; i < tamaño; i++) {
                    stmt += (String) visitExpr(ctx.expr(i));
                    stmt += (String)visitBlock(ctx.block(i));
                }
            }else if (ctx.ELSE()!=null){
                stmt += (String)visitBlock(ctx.block().get(tamañoBlocks));
            }
        }else if (ctx.WHILE()!=null){
            stmt = (String) visitExpr(ctx.expr(0));
            stmt += (String)visitBlock(ctx.block(0));
            if (ctx.block()!=null && tamañoBlocks>1){
                for (int i = 1; i < tamañoBlocks; i++) {
                    stmt += (String)visitBlock(ctx.block(i));
                }
            }else if (ctx.ELSE()!=null){
                stmt += (String)visitBlock(ctx.block().get(tamañoBlocks));
            }
        }else if (ctx.FOR()!=null){
            stmt = (String) visitExpr(ctx.expr(0));
            stmt += (String)visitBlock(ctx.block(0));
            if (ctx.block()!=null && tamañoBlocks>1){
                for (int i = 1; i < tamañoBlocks; i++) {
                    stmt += (String)visitBlock(ctx.block(i));
                }
            }else if (ctx.ELSE()!=null){
                stmt += (String)visitBlock(ctx.block().get(tamañoBlocks));
            }
        }
        return (T)stmt;
    }

    @Override
    public T visitSimple_stmt(ChocopyGrammarParser.Simple_stmtContext ctx) {
        String stmt_simpl = null;
        int tamaño = ctx.target().size();
        if (ctx.PASS()!=null){
            //:'v nariz :'v
        }else if (ctx.expr()!=null){
            visitExpr(ctx.expr());
        }else if (ctx.RETURN()!=null){
            stmt_simpl =(String) visitExpr(ctx.expr());
        }else if (ctx.target()!=null){
            for (int i = 0; i < tamaño; i++) {
                stmt_simpl = (String) visitTarget(ctx.target(i));
                stmt_simpl += (String) visitExpr(ctx.expr());
            }
        }
        return (T)stmt_simpl;
    }

    @Override
    public T visitBlock(ChocopyGrammarParser.BlockContext ctx) {
        String block = null;
        if (ctx.stmt()!=null){
            for (int i = 0; i < ctx.stmt().size(); i++) {
                block += visitStmt(ctx.stmt(i));
            }
        }
        return (T)block;
    }

}

