package edu.towson.cis.cosc603.project2.monopoly;

public interface IOwnable {

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	String getName();

	/**
	 * Gets the theOwner.
	 *
	 * @return the theOwner
	 */
	Player getTheOwner();

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	int getPrice();

	/**
	 * Checks if is available.
	 *
	 * @return true, if is available
	 */
	boolean isAvailable();

	/**
	 * Play action.
	 */
	void playAction();

	/**
	 * Sets the available.
	 *
	 * @param available the new available
	 */
	void setAvailable(boolean available);

	/**
	 * Sets the theOwner.
	 *
	 * @param theOwner the new theOwner
	 */
	void setTheOwner(Player owner);

}