/*
 Anthony Melnik
 Oliver Pasquesi
 Ben Simmons
 */

package com.gradescope.DoubleQueue.code;

import java.util.ArrayList;

/**ListDoubleQueueContract
 *
 *
 * @invariant: maxListSize > 0
 *
 * @corresponds: max_queue_size = maxListSize
 *
 */
public class ListDoubleQueue implements IDoubleQueue
{
    private ArrayList<Double> LQueue;
    private int maxListSize;

    /**ListDoubleQueueConstructorContact
     *
     * @param maxSize represents the maximum size of the array.
     *
     * @pre maxSize > 0
     *
     * @post maxListSize = maxSize AND self = new Double[maxListSize]
     *
     */
    public ListDoubleQueue(int maxSize)
    {
        this.LQueue = new ArrayList<Double>();
        this.maxListSize = maxSize;
    }

    /**enqueueContact
     *
     * @param val is the double number to be enqueued
     *
     * @pre |self| < maxListSize
     *
     * @post [self = #self with val being added to the end of the list] AND maxListSize = #maxListSize
     *
     */
    @Override
    public void enqueue(Double val)
    {
        if(LQueue.size() == this.maxListSize)
            LQueue.set(this.maxListSize-1, val);
        else
            LQueue.add(val);
    }

    //Note: The below 3 functions intentionally do not have contracts. You do not need to add them.

    @Override
    public Double dequeue()
    {
        return LQueue.remove(0);
    }


    @Override
    public int length()
    {
        return LQueue.size();
    }


    public String toString()
    {
        String ret = "";
        for(Double d : LQueue)
        {
            ret += ("[" + d + "] ");
        }
        return ret;
    }
}
