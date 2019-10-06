package com.example.demo.dto;

import java.sql.Time;


/**
 * Created by Meeta on 05/10/19.
 */
public class ViewDataDTO {

        private int[] inputArray;
        private int[] outArray;
        private long timeToSort;
        private int noOfComparisons;

    public int[] getInputArray() { return inputArray; }

    public ViewDataDTO() {

    }

    public ViewDataDTO(int[] inputArray) { this.inputArray=inputArray; }

    public void setInputArray(int[] inputArray) {
        this.inputArray = inputArray;
    }

    public int getNoOfComparisons() {
        return noOfComparisons;
    }

    public void setNoOfComparisons(int noOfComparisons) {
        this.noOfComparisons = noOfComparisons;
    }

    public int[] getOutArray() {
        return outArray;
    }

    public void setOutArray(int[] outArray) {
        this.outArray = outArray;
    }

    public void setTimeToSort(long timeToSort) {
        this.timeToSort = timeToSort;
    }

    public long getTimeToSort() {
        return timeToSort;
    }

}
