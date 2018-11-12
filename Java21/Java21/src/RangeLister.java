package com.java21days;

class RangeLister{
    int[] makeRange(int lower, int upper){
        int[]range = new int[(upper-lower)+1];

        for (int i=0; i<range.length;i++){
            range[i] = lower++;
        }
        return range;
    }

    public static void main(String[] args) {
        int[]range;
        RangeLister lister = new RangeLister();
        range=lister.makeRange(4,13);
        System.out.println("Tablica:[");
        for (int i=0; i<range.length;i++){
            System.out.print(range[i] + " ");
        }
        System.out.println("]");
    }
}