package com.bhami.coreJava.singleton.ATM;

public class DetailedStatement implements StatementType {
    @Override
    public String print() {
        System.out.println("Detailed Statement Created");
        return "detailedStmt";
    }
}