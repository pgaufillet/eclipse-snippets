package org.lpdql.automaton.sirius.editor;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.lpdql.automaton.NamedElement;

public class ExternalJavaAction implements IExternalJavaAction {

	public ExternalJavaAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		for(EObject object: selections)
		{
			if (object instanceof NamedElement) {
				NamedElement n = (NamedElement) object;
				n.setName("new " + n.getName());
			}
		}
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
