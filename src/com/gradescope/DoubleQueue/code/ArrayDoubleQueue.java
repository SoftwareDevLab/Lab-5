/*
 Anthony Melnik
 Oliver Pasquesi
 Ben Simmons
 */

package com.gradescope.DoubleQueue.code;

/**ArrayDoubleQueueContract
 * Array implementation for the Double queue.
 *
 * @invariant: queueMaxSize > 0
 *
 * @corresponds: max_queue_size = queueMaxSize
 *
 */
public class ArrayDoubleQueue implements IDoubleQueue
{
    private Double[] queue;
    private int queueMaxSize;

    /**ArrayDoubleQueueConstructorContact
     * Constructor for the arrayListDouble queue.
     *
     * @param maxSize max size of the array
     *
     * @pre maxSize > 0
     *
     * @post queueMaxSize = maxSize AND self = new Double[queueMaxSize].
     *
     */
    public ArrayDoubleQueue(int maxSize)
    {
        this.queueMaxSize = maxSize;
        this.queue = new Double[queueMaxSize];
    }

    /**enqueueContact
     * Enqueue adds an item to the queue.
     *
     * @param val the Double to be added
     *
     * @pre |self| < queueMaxSize
     *
     * @post [self = #self with val added to left-most unoccupied index] AND queueMaxSize = #queueMaxSize
     *
     */
    @Override
    public void enqueue(Double val)
    {
        // 1. Loop until the left-most unoccupied (null) index is found.
        for (int i = 0; i < queueMaxSize; i++) {

            // 2. Once the unoccupied index is found, add the value to it, then leave function.
            if (queue[i] == null) {
                queue[i] = val;
                break;
            }
        }
    }

    //Note: The below 3 functions intentionally do not have contracts. You do not need to add them.

    @Override
    public Double dequeue()
    {
        // 1. Assign the element to remove to its own variable.
        Double removedElement = queue[0];

        // 2. For the length of the queue, overwrite the current element with the next indexes element.
        for (int i = 0; i < length(); i++) {
            queue[i] = queue[i + 1];
        }

        // 3. Return the removed (overwritten) element's value.
        return removedElement;
    }

    @Override
    public int length()
    {
        // 1. Initialize length (i) to 0;
        int i = 0;

        // 2. Loop and increment counter until a null element is hit.
        while (queue[i] != null) {i++;}

        // 3. Return the index, which is the length of the queue.
        return i;
    }

    public String toString()
    {
        // Same method from ListDoubleQueue
        String ret = "";
        for(Double d : queue)
        {
            ret += ("[" + d + "] ");
        }
        return ret;
    }

    //-----------------Ignore the functions below this line-----------------------
    public int getQueueMaxSize() { return this.queueMaxSize; }

    public Double[] getQueue() { return this.queue; }
}
