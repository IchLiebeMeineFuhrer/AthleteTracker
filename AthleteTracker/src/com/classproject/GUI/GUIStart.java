package com.classproject.GUI;

import javax.swing.JApplet;

import com.classproject.GUI.components.StartComponent;

public class GUIStart extends JApplet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 17431885152713844L;
	
	public GUIStart()
	{
		super(); //Runs the extended JApplet constructor. This makes a window
		this.setLayout(null);		
		this.setVisible(true);
		this.setSize(GUIConstants.SCREENWIDTH, GUIConstants.SCREENHEIGHT);
		this.addComponentsOnStart();
	}
	
	/**
	 * instantiates and adds the components to the window on startup
	 */
	public void addComponentsOnStart()
	{
		this.add(new StartComponent());
	}
	
}
