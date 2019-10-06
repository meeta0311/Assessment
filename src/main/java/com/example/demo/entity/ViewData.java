package com.example.demo.entity;

import java.io.Serializable;
import java.sql.Time;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * Created by Meeta on 05/10/19.
 */
    @Entity
    public class ViewData implements Serializable {

        private static final long serialVersionUID = 0x62A6DA99AABDA8A9L;
        @Column
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Id
        private Integer viewId;
        @Column
        private int[] inputArray;
        @Column
        private int[] outArray;
        @Column
        private long timeToSort;
        @Column
        private int noOfComparisons;

    public int[] getInputArray() {
        System.out.println("getInputArray "+inputArray.length);
        return inputArray;
    }

    public ViewData() {

    }

    public ViewData(int[] inputArray) {
        this.inputArray=inputArray;
    }

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
