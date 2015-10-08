package org.thebes;

import org.thebes.client.SignLink;
import org.thebes.client.client;

import java.net.URL;
import java.net.InetAddress;
import java.util.HashMap;

/**
 *
 * @author smokey
 */
public class ClientStub extends client {

	public ClientStub() {
		super();
		try {
			SignLink.startpriv(InetAddress.getLocalHost());
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	} 
	
	public URL getCodeBase() {
		try {
			return new URL("http://0.0.0.0:" + 43594); 
		} catch (Exception ex) {
			ex.printStackTrace();
			return super.getCodeBase();
		}
	}
	
	public URL getDocumentBase() {
		return this.getCodeBase();
	}
	
	public String getParameter(String key) { 
		return parameters.get(key);
	}
	
	private HashMap<Integer, String> parameters = new HashMap<Integer, String>();
}
