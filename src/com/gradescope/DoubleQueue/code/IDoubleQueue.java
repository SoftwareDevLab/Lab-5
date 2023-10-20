/*
 Anthony Melnik
 Oliver Pasquesi
 Ben Simmons
 */

package com.gradescope.DoubleQueue.code;

/**
 * IDoubleQueue represents a queue of Double values.
 * Indexing starts at 0.
 *
 *@initialization Ensures:  Queue is empty and able to insert Double values.
 *
 *@defines: max_queue_size: Z
 *
 *@constraints: 0 <= length() <= max_queue_size
 */
public interface IDoubleQueue
{

    //This function's contracts are in the individual classes
    public void enqueue(Double val);

    /**dequeueContract
     *
     * Removes and returns the value from the front of the queue.
     *
     *@return The value at the front of queue.
     *
     *@pre Queue is not empty.
     *
     *@post The removed element is no longer in queue AND length of queue is decremented by 1.
     *
     */
    public Double dequeue();

    /**lengthContract
     *
     * Gives the number of elements currently in queue.
     *
     *@return The number of elements in the queue.
     *
     *@pre None.
     *
     *@post The returned value == size of the queue.
     *
     */
    public int length();

    /**toStringContract
 *
 * Converts the state of the queue into a character string.
 *
 *@return A string representation of the queue.
 *
 *@pre None.
 *
 *@post The returned string is an accurate representation of the queue.
 *
 */
public String toString();
}
