/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.guioas


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class GuiOasStandaloneSetup extends GuiOasStandaloneSetupGenerated {

	def static void doSetup() {
		new GuiOasStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
