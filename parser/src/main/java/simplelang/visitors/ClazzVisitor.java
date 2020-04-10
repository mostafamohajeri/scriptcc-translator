package simplelang.visitors;

import grammar.SimpleLangBaseVisitor;
import grammar.SimpleLangParser;
import simplelang.ob.Clazz;
import simplelang.ob.Method;

import java.util.List;
import java.util.stream.Collectors;

public class ClazzVisitor extends SimpleLangBaseVisitor<Clazz> {


    @Override
    public Clazz visitClassDeclaration(SimpleLangParser.ClassDeclarationContext ctx) {
        String className = ctx.className().getText();
        MethodVisitor methodVisitor = new MethodVisitor();
        List<Method> methods = ctx.method()
                .stream().map(methodContext -> methodContext.accept(methodVisitor)).collect(Collectors.toList());

        return new Clazz(className, methods);
    }
}