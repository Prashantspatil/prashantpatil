package com.xworkz.exceptions.events;

import java.awt.AWTError;
import java.awt.AWTException;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.print.PrinterException;
import java.io.IOError;
import java.lang.annotation.AnnotationFormatError;
import java.lang.instrument.UnmodifiableClassException;
import java.lang.invoke.WrongMethodTypeException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.net.URISyntaxException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.channels.AlreadyBoundException;
import java.nio.charset.CoderMalfunctionError;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.ProviderNotFoundException;
import java.rmi.activation.ActivationException;
import java.rmi.server.ServerNotActiveException;
import java.security.ProviderException;
import java.security.acl.AclNotFoundException;
import java.sql.SQLException;
import java.text.RuleBasedCollator;
import java.util.ConcurrentModificationException;
import java.util.IllformedLocaleException;
import java.util.TooManyListenersException;
import java.util.concurrent.CompletionException;
import java.util.prefs.BackingStoreException;

import javax.management.BadAttributeValueExpException;
import javax.management.RuntimeErrorException;

import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.RemarshalException;

import com.sun.corba.se.impl.orbutil.threadpool.TimeoutException;
import com.sun.org.apache.bcel.internal.classfile.RuntimeVisibleParameterAnnotations;
import com.sun.org.apache.xerces.internal.impl.xpath.XPathException;
import com.sun.org.apache.xerces.internal.xni.parser.XMLParseException;
import com.sun.org.apache.xml.internal.security.signature.XMLSignatureException;
import com.sun.xml.internal.ws.model.RuntimeModelerException;
import com.sun.xml.internal.ws.policy.privateutil.ServiceConfigurationError;
import com.sun.xml.internal.ws.util.RuntimeVersion;

import jdk.internal.org.xml.sax.SAXException;
import jdk.nashorn.internal.ir.RuntimeNode;

import javax.management.RuntimeMBeanException;
import javax.management.RuntimeOperationsException;
import javax.print.PrintException;
import javax.script.ScriptException;
import javax.swing.text.BadLocationException;
import javax.swing.undo.CannotRedoException;
import javax.transaction.xa.XAException;
import javax.xml.crypto.NoSuchMechanismException;
import javax.xml.crypto.URIReferenceException;
import javax.xml.crypto.dsig.TransformException;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.soap.SOAPException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.validation.SchemaFactoryConfigurationError;
import javax.xml.ws.WebServiceException;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.security.auth.RefreshFailedException;
import javax.security.auth.callback.Callback;

public class CreateEvents {
	
	private static final String String = null;
	private static final InputStream InputStream = null;
	
	public void created() {
		System.out.println("running the created method");
		throw new RuntimeErrorException(null);
	}
	
	public void runtimeMethod1() {
		System.out.println("running the runtime method1");
		throw new RuntimeErrorException(null, null);
	}
	
	public void runtimeMethod2() {
		System.out.println("running the runtime method2");
		throw new RuntimeException();
	}
	
	public void runtimeMethod3() {
		System.out.println("running method 3");
		throw new RuntimeException(null,null);
	}
	
	public void runtimeMethod4() {
		System.out.println("running method4");
		throw new RuntimeException("");
	}
	
	public void runtimeMethod5() {
		System.out.println("running method5");
		throw new RuntimeException("");
	}
	
	public void runtimeMethod6() {
		System.out.println("running method6");
		throw new RuntimeMBeanException(null);
	}
	
	public void runtimeMethod7() {
		System.out.println("running method7");
		throw new RuntimeModelerException("");
	}
	
	public void runtimeMethod8() {
		System.out.println("running method8");
		throw new RuntimeModelerException("");
	}
	
	public void runtimeMethod9() {
		System.out.println("running method9");
		throw new RuntimeModelerException("","");
	}
	
	public void runtimeMethod10() {
		System.out.println("running method10");
		throw new RuntimeOperationsException(null);
	}
	
	public void runtimeMethod11() {
		System.out.println("running method11");
		throw new RuntimeOperationsException(null,null);
	}
	
	public void runtimeMethod12() {
		System.out.println("running method12");
		throw new RuntimeVisibleParameterAnnotations(0, 0, null, null);
	}
	
	public void runtimeMethod13() {
		System.out.println("running method13");
		throw new RuntimeNode(0,0,null,null);
	}
	
	public void runtimeMethod14() {
		System.out.println("running method14");
		throw new RuntimeVersion();
	}
	
	public void runtimeMethod15() {
		System.out.println("running method15");
		throw new RuleBasedCollator("psp");
	}
	
	public void runtimeMethod16() {
		System.out.println("running method16");
		throw new RuntimePermission(" "," ");
	}
	
	public void runtimeMethod17() {
		System.out.println("running method17");
		throw new ArithmeticException();
	}
	
	public void runtimeMethod18() {
		System.out.println("running method18");
		throw new ArrayStoreException();
	}
	
	public void runtimeMethod19() {
		System.out.println("running method19");
		throw new BufferOverflowException();
	}
	
	public void runtimeMethod20() {
		System.out.println("running method20");
		throw new BufferUnderflowException();
	}
	
	public void runtimeMethod21() {
		System.out.println("running method21");
		throw new CannotRedoException();
	}
	
	public void runtimeMethod22() {
		System.out.println("running method22");
		throw new ClassCastException();
	}
	
	public void runtimeMethod23() {
		System.out.println("running method23");
		throw new ConcurrentModificationException();
	}
	
	public void runtimeMethod24() {
		System.out.println("running method24");
		throw new WrongMethodTypeException();
	}
	
	public void runtimeMethod25() {
		System.out.println("running method25");
		throw new IllformedLocaleException();
	}
	
	public void runtimeMethod26() {
		System.out.println("running method26");
		throw new FileSystemNotFoundException();
	}
	
	public void runtimeMethod27() {
		System.out.println("running method27");
		throw new IndexOutOfBoundException();
	}
	
	public void runtimeMethod28() {
		System.out.println("running method28");
		throw new ProviderException();
	}
	
	public void runtimeMethod29() {
		System.out.println("running method29");
		throw new NullPointerException();
	}
	
	public void runtimeMethod30() {
		System.out.println("running method30");
		throw new ProviderNotFoundException();
	}
	
	public void runtimeMethod31() {
		System.out.println("running method31");
		throw new SecurityException();
	}
	
	public void runtimeMethod32() {
		System.out.println("running method32");
		throw new MalformedParameterizedTypeException();
	}
	
	public void runtimeMethod33() {
		System.out.println("running method33");
		throw new WebServiceException();
	}
	
	public void runtimeMethod34() {
		System.out.println("running method34");
		throw new NoSuchMechanismException();
	}
	
	public void exceptionMethod1() throws AclNotFoundException{
		System.out.println("exceptional methods");
		System.out.println("running exceptionmethod1");
		throw new AclNotFoundException();
	}
	
	public void exceptionMethod2() throws ActivationException{
		System.out.println("running exceptionmethod2");
		throw new ActivationException();
	}
	
	public void exceptionMethod3(){
		System.out.println("running exceptionmethod3");
		throw new AlreadyBoundException();
	}
	
	public void exceptionMethod4() throws AWTException{
		System.out.println("running exceptionmethod4");
		throw new AWTException();
	}
	
	public void exceptionMethod5(){
		System.out.println("running exceptionmethod5");
		throw new AlreadyBoundException();
	}
	
	public void exceptionMethod6() throws BackingStoreException{
		System.out.println("running exceptionmethod6");
		throw new BackingStoreException(String);
	}
	
	public void exceptionMethod7(Object Object) throws BadAttributeValueExpException{
		System.out.println("running exceptionmethod7");
		throw new BadAttributeValueExpException(Object);
	}
	
	public void exceptionMethod8(int offs) throws BadLocationException{
		System.out.println("running exceptionmethod8");
		throw new BadLocationException(String, offs);
	}
	
	public void exceptionMethod9(int offs) throws BadLocationException{
		System.out.println("running exceptionmethod9");
		throw new BadLocationException(String, offs);
	}
	
	public void exceptionMethod10() throws XPathException{
		System.out.println("running exceptionmethod10");
		throw new XPathException(String);
	}
	
	public void exceptionMethod11() throws XMLStreamException{
		System.out.println("running exceptionmethod11");
		throw new XMLStreamException();
	}
	
	public void exceptionMethod12() throws XMLSignatureException{
		System.out.println("running exceptionmethod12");
		throw new XMLSignatureException();
	}
	
	public void exceptionMethod13() {
		System.out.println("running exceptionmethod13");
		throw new XMLParseException(null, null);
	}
	
	public void exceptionMehtod14() throws XAException{
		System.out.println("running exceptionmethod14");
		throw new XAException();
	}
	
	public void exceptionMethod15() throws URISyntaxException{
		System.out.println("running exceptionmethod15");
		throw new URISyntaxException(String, String);
	}
	
	public void exceptionMethod16() throws AclNotFoundException{
		System.out.println("running exceptionmethod16");
		throw new AclNotFoundException();
	}
	
	public void exceptionMethod17() throws URIReferenceException{
		System.out.println("running exceptionmethod17");
		throw new URIReferenceException();
	}
	
	public void exceptionMethod18(DataFlavor DataFlavor) throws UnsupportedFlavorException{
		System.out.println("running exceptionmethod18");
		throw new UnsupportedFlavorException(DataFlavor);
	}
	
	public void exceptionMethod19(CallBack CallBack) throws UnsupportedCallBackException{
		System.out.println("running exceptionmethod19");
		throw new UnsupportedCallBackException(CallBack);
	}
	
	public void exceptionMethod20() throws UnsupportedAudioFileException{
		System.out.println("running exceptionmethod20");
		throw new UnsupportedAudioFileException();
	}
	
	public void exceptionMethod21() throws UnmodifiableClassException{
		System.out.println("running exceptionmethod21");
		throw new UnmodifiableClassException();
	}
	
	public void exceptionMethod22() throws TransformException{
		System.out.println("running exceptionmethod22");
		throw new TransformException();
	}
	
	public void exceptionMethod23() throws TransformerException{
		System.out.println("running exceptionmethod23");
		throw new TransformerException();
	}
	
	public void exceptionMethod24() throws TooManyListenersException{
		System.out.println("running exceptionmethod24");
		throw new TooManyListenersException();
	}
	
	public void exceptionMethod25() throws TimeoutException{
		System.out.println("running exceptionmethod25");
		throw new TimeoutException();
	}
	
	public void exceptionMethod26() throws SQLException{
		System.out.println("running exceptionmethod26");
		throw new SQLException();
	}
	
	public void exceptionMethod27() throws SOAPException{
		System.out.println("running exceptionmethod27");
		throw new SOAPException();
	}
	
	public void exceptionMethod28() throws ServerNotActiveException{
		System.out.println("running exceptionmethod28");
		throw new ServerNotActiveException();
	}
	
	public void exceptionMethod29(Object Exception) throws ScriptException{
		System.out.println("running exceptionmethod29");
		throw new ScriptException((java.lang.String) Exception);
	}
	
	public void exceptionMethod30() throws SAXException{
		System.out.println("running exceptionmethod30");
		throw new SAXException();
	}
	
	public void exceptionMethod31() throws RemarshalException{
		System.out.println("running exceptionmethod31");
		throw new RemarshalException();
	}
	
	public void exceptionMethod32() throws RefreshFailedException{
		System.out.println("running exceptionmethod32");
		throw new RefreshFailedException();
	}
	
	public void exceptionMethod33() throws ReflectiveOperationException{
		System.out.println("running exceptionmethod33");
		throw new ReflectiveOperationException();
	}
	
	public void exceptionMethod34() throws PrintException{
		System.out.println("running exceptionmethod34");
		throw new PrintException();
	}
	
	public void exceptionMethod35() throws PrinterException{
		System.out.println("running exceptionmethod35");
		throw new PrinterException();
	}
	
	public void errorMethod1() {
		System.out.println("running errormethod1");
		throw new AnnotationFormatError(String);
	}
	

	public void errorMethod2() {
		System.out.println("running errormethod2");
		throw new AssertionError();
	}
	

	public void errorMethod3() {
		System.out.println("running errormethod3");
		throw new AWTError(String);
	}

	public void errorMethod4(Exception Exception) {
		System.out.println("running errormethod4");
		throw new CoderMalfunctionError(Exception);
	}

	public void errorMethod5() {
		System.out.println("running errormethod5");
		throw new FactoryConfigurationError();
	}

	public void errorMethod6(Throwable Throwable) {
		System.out.println("running errormethod6");
		throw new IOError(Throwable);
	}

	public void errorMethod7() {
		System.out.println("running errormethod7");
		throw new LinkageError();
	}

	public void errorMethod8() {
		System.out.println("running errormethod8");
		throw new SchemaFactoryConfigurationError();
	}

	public void errorMethod9() {
		System.out.println("running errormethod9");
		throw new ServiceConfigurationError(String);
	}

	public void errorMethod10() {
		System.out.println("running errormethod10");
		throw new ThreadDeath();
	}

	public void errorMethod11() {
		System.out.println("running errormethod11");
		throw new TransformerFactoryConfigurationError();
	}

	public void errorMethod12() {
		System.out.println("running errormethod12");
		throw new LinkageError();
	}
	
}
