package com.modificial.blockchain.cli;

public class Main {

    public static void main(String[] args) {
        CLI cli = new CLI(args);
        cli.parse();
    }
}
