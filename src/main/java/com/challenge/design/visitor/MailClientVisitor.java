package com.challenge.design.visitor;

public interface MailClientVisitor {
    void visit(OperaMailClient mailClient);

    void visit(SquirrelMailClient mailClient);

    void visit(ZimbraMailClient mailClient);
}
