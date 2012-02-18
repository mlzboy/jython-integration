package com.jd.cis;
import org.python.core.PyException;
import org.python.core.PyInteger;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;



import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JythonEngine {

	/**
	 * @see http://wiki.python.org/jython/UserGuide#embedding-jython
	 * @param args
	 * @throws ScriptException 
	 */
	public static void main(String[] args) throws ScriptException {
		// TODO Auto-generated method stub
//        PythonInterpreter interp = new PythonInterpreter();
//        interp.exec("import sys");
//        interp.exec("print sys");
//        interp.set("a", new PyInteger(42));
//        interp.exec("print a");
//        interp.exec("x = 2+2");
//        PyObject x = interp.get("x");
//        System.out.println("x: " + x);
        
        int y=0;
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("python");
        engine.eval("import sys");
        engine.eval("print sys");
        engine.put("a", 42);
        engine.eval("print a");
        engine.eval("x = 2 + 2");
        Object x = engine.get("x");
        System.out.println("x: " + x);
        System.out.println("x: " + y);

	}

}
