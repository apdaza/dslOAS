package org.xtext.example.guioas.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;

public class GeneradorControlador {
	private Resource resource;
	  
	private IFileSystemAccess fsa;
  
	public GeneradorControlador(final Resource resource, final IFileSystemAccess fsa) {
		this.resource = resource;
		this.fsa = fsa;
	}
	
	public void compilar(){
		
	}

}
