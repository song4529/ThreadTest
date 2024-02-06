package com.example.thread;

public class SingleThreadEx2 implements Runnable{

    private int[] temp;

    public SingleThreadEx2(){
        temp = new int[10];

        for(int start=0;start<temp.length;start++){
            temp[start]=start;
        }
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int start:temp){
            try {
                Thread.sleep(1000);

            } catch (InterruptedException ie) {
                ie.printStackTrace();
                // TODO: handle exception
            }

            System.out.println("Thread Name:"+Thread.currentThread().getName());
            System.out.println("temp value :"+start);
        }
    }

    public static void main(String[] args) {

        SingleThreadEx2 ct = new SingleThreadEx2();
        Thread t = new Thread(ct,"First");

        t.start();
    }
}