package com.gl.springcore.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Text_Editor {
	
	private Spell_Checker spellChecker;
	
	// Constructor with Autowired annotation for dependency injection
	@Autowired
	public Text_Editor(Spell_Checker spellChecker) {
		System.out.println("Inside Text Editor constructor");
		this.spellChecker = spellChecker;
	}
	
	// Getter for Spell_Checker
	public Spell_Checker getSpell_Checker() {
		return spellChecker;
	}
	
	// Method to perform spell check
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
