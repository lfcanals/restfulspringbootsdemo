package com.github.lfcanals.restfulwebservices;


// The Bean
public class HelloWorldBean {
	
	private final String helloMsg;
  
  public String getMessage() { return this.helloMsg; }

  public HelloWorldBean(final String msg) {
    this.helloMsg = msg;
  }
}
