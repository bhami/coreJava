package com.bhami.coreJava.singleton.ATM;

public abstract class Factory {
	 protected abstract StatementType createStatements(String selection);
 }