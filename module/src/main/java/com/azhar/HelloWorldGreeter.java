package com.azhar;

import java.io.PrintStream;
public class HelloWorldGreeter implements Greeter {
 private PrintStream printStream = System.out;
 public void setPrintStream(PrintStream printStream) {
  this.printStream = printStream;
 }
 public void greet() {
  printStream.print("Hello, World!");
 }
}