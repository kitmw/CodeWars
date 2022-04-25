package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Answers {
    public Answers() {
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public int sumOfNats(int number){
        if(number<0){
            return 0;
        }
        int runningSum = 0;
        for(int i = 1; i<number;i++){
            if(i%3==0||i%5==0){
                runningSum += i;
            }
        }
        return runningSum;
    }

    public boolean last2CharsMatch(String str, String ending) {
        if(str.isEmpty()){
            return false;
        } else if(str.endsWith(ending)){
            return true;
        }
        return false;
    }

    public long ipsBetween(String start, String end) {
        String[] startStrArr = start.split("\\.");
        String[] endStrArr = end.split("\\.");
        long startLong = Long.parseLong(startStrArr[0]);
        long endLong = Long.parseLong(endStrArr[0]);
        for(int i=1;i<4;i++){
            startLong<<=8;
            startLong|=Long.parseLong(startStrArr[i]);
            endLong<<=8;
            endLong|=Long.parseLong(endStrArr[i]);
        }
        return endLong-startLong;
    }

    public String orderWeight(String strng) {
        if(strng.equals("")){
            return "";
        }
        String[] inMassArr = strng.split(" ");
        if(inMassArr.length==1){
            return inMassArr[0];
        }
        List<mass> massArr = new ArrayList<>();
        for(int i=0;i<inMassArr.length;i++){
            massArr.add(new mass(inMassArr[i]));
        }
        Collections.sort(massArr);
        return massArr.toString().replaceAll("[\\[\\]\\,]","");
    }

    class mass implements Comparable<mass>{
        private int mass;
        private int weighting;

        public mass(String massStr) {
            this.mass = Integer.parseInt(massStr);
            int thisMassSumDigs = 0;
            for(int j=0;j<massStr.length();j++){
                thisMassSumDigs += Character.getNumericValue(massStr.charAt(j));
            }
            this.weighting = thisMassSumDigs;
        }

        @Override
        public int compareTo(mass o) {
            if (this.weighting > o.weighting) {
                return 1;
            }
            else if (this.weighting < o.weighting) {
                return -1;
            }
            else {
                return Integer.toString(this.mass).compareTo(Integer.toString(o.mass));
            }
        }

        @Override
        public String toString() {
            return "" + mass;
        }
    }
}
