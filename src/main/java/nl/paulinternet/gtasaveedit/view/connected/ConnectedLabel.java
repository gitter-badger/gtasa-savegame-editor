package nl.paulinternet.gtasaveedit.view.connected;

import javax.swing.JLabel;

import nl.paulinternet.gtasaveedit.model.variables.VariableInteger;

public class ConnectedLabel extends JLabel
{
	private VariableInteger var;
	
	public ConnectedLabel (VariableInteger var) {
		this.var = var;
		var.onChange().addHandler(this, "update");
		update();
	}
	
	public void update () {
		setText(String.valueOf(var.getIntValue()));
	}
}
