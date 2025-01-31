package io.wallfly.lockdapp.lockutils;

/**
 * Created by JoshuaWilliams on 5/9/15.
 *
 * Creation of a hold lock.
 *
 * @version 1.1
 */
public class HoldLock extends Lock {

    private float lowerBuffer;
    private float upperBuffer;

    public HoldLock(float seconds, float[] point, int sequenceNumber){
        setType("H");
        setHoldSeconds(Math.round(seconds));
        setLowerBuffer(seconds);
        setUpperBuffer(seconds + 1000); //Buffer for holdlock. Hold must be released between buffers.
        setPoint(point);
        setSequenceNumber(sequenceNumber);
    }
    public HoldLock(){
       setType("H");
    }

    public void setLowerBuffer(float lowerBuffer){
        this.lowerBuffer = lowerBuffer;
    }

    public float getLowerBuffer(){
        return lowerBuffer;
    }

    public void setUpperBuffer(float lowerBuffer){
        this.upperBuffer = lowerBuffer;
    }

    public float getUpperBuffer(){
        return upperBuffer;
    }
}
