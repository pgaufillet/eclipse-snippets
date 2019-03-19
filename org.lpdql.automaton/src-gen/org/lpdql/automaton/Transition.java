/**
 */
package org.lpdql.automaton;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.lpdql.automaton.Transition#getEvent <em>Event</em>}</li>
 *   <li>{@link org.lpdql.automaton.Transition#getActions <em>Actions</em>}</li>
 *   <li>{@link org.lpdql.automaton.Transition#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.lpdql.automaton.Transition#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see org.lpdql.automaton.AutomatonPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Input)
	 * @see org.lpdql.automaton.AutomatonPackage#getTransition_Event()
	 * @model
	 * @generated
	 */
	Input getEvent();

	/**
	 * Sets the value of the '{@link org.lpdql.automaton.Transition#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Input value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' reference list.
	 * The list contents are of type {@link org.lpdql.automaton.Output}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' reference list.
	 * @see org.lpdql.automaton.AutomatonPackage#getTransition_Actions()
	 * @model
	 * @generated
	 */
	EList<Output> getActions();

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(State)
	 * @see org.lpdql.automaton.AutomatonPackage#getTransition_Origin()
	 * @model
	 * @generated
	 */
	State getOrigin();

	/**
	 * Sets the value of the '{@link org.lpdql.automaton.Transition#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(State value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(State)
	 * @see org.lpdql.automaton.AutomatonPackage#getTransition_Destination()
	 * @model
	 * @generated
	 */
	State getDestination();

	/**
	 * Sets the value of the '{@link org.lpdql.automaton.Transition#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(State value);

} // Transition
