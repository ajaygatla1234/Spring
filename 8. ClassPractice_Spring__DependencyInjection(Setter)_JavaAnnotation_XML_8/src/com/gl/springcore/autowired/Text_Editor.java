package com.gl.springcore.autowired;

import org.springframework.beans.factory.annotation.Autowired;

// Text_Editor class representing a text editor component
public class Text_Editor {
	
	// Private field to hold the Spell_Checker dependency
	private Spell_Checker spellChecker;
	
	// Getter method for Spell_Checker
	public Spell_Checker getSpell_Checker() {
		return spellChecker;
	}
	
	// Setter method for Spell_Checker, annotated with @Autowired for automatic injection
	@Autowired
	public void setSpellChecker(Spell_Checker spellChecker) {
		this.spellChecker = spellChecker;
	}

	// Method to perform spell check using the injected Spell_Checker
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
