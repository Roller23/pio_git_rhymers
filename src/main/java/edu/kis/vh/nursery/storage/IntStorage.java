package edu.kis.vh.nursery.storage;

public interface IntStorage {
  public int pop();
  public void push(int in);
  public int top();
  public int size();
  public boolean isFull();
  public boolean isEmpty();
}