package com.gl.springcore.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Text_Editor {

    // Autowiring Spell_Checker dependency
    @Autowired
    private Spell_Checker spellChecker;

    // Constructor of the Text_Editor class
    public Text_Editor() {
        System.out.println("Inside Text Editor constructor");
    }

    // Getter method for Spell_Checker
    public Spell_Checker getSpell_Checker() {
        return spellChecker;
    }

    // Method to perform spell check using Spell_Checker
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
