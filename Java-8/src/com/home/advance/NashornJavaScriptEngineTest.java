package com.home.advance;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornJavaScriptEngineTest {

	public static void main(String[] args) throws FileNotFoundException, NoSuchMethodException {
		
		ScriptEngineManager scriptEngineManager=new ScriptEngineManager();
		ScriptEngine engine = scriptEngineManager.getEngineByName("nashorn");
		try {
			engine.eval("print('Hello world!!!')");
			//Use absolute path
			engine.eval(new FileReader("G:\\Java Development\\git\\Java-8\\Java-8\\src\\demo.js"));
			//Use relative path
			engine.eval(new FileReader("src\\demo.js"));
			//Execute javascript method
			engine.eval(new FileReader("src\\demo1.js"));
			Invocable invocable=(Invocable) engine;
			Object result = invocable.invokeFunction("fun1", "Vivek Garg");
			System.out.println(result);
		} catch (ScriptException e) {
			e.printStackTrace();
		}
	}
}
