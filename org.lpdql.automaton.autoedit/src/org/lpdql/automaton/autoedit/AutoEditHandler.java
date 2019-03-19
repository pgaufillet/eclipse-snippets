package org.lpdql.automaton.autoedit;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.lpdql.automaton.Automaton;
import org.lpdql.automaton.AutomatonFactory;
import org.lpdql.automaton.State;
import org.lpdql.automaton.Transition;

public class AutoEditHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection selection=(IStructuredSelection)HandlerUtil.getActiveWorkbenchWindowChecked(event).getSelectionService().getSelection();
		for(Object o: selection.toArray())
		{
			if (o instanceof IFile) {
				IFile file = (IFile) o;
				ResourceSet rs = new ResourceSetImpl();
				URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
				Resource r = rs.getResource(uri, true);
				
				// Now edit the model
				Automaton automaton = (Automaton) r.getContents().get(0);
				
				// Add 2 States
				State origin = AutomatonFactory.eINSTANCE.createState();
				State destination = AutomatonFactory.eINSTANCE.createState();
				
				origin.setName("Origin");
				destination.setName("Destination");
				
				// Add a transition
				Transition t = AutomatonFactory.eINSTANCE.createTransition();
				t.setOrigin(origin);
				t.setDestination(destination);
				t.setName("t");
				
				// Store states and transition in the automaton
				automaton.getStates().add(origin);
				automaton.getStates().add(destination);
				automaton.getTransitions().add(t);
				
				try {
					r.save(null);
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				
			}
		}
		return null;
	}

}
