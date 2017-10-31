package edu.luc.cs271.linkedstack;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class LinkedStack<E> implements IStack<E> {

  /** The top most node of this stack. The stack gets pushed down from here. */
  private Node<E> top;
  private int size = 0;

  // Done TODO why don't we need an explicit constructor?
  /**
   * Answer: LinkedStack doesn't require an explicit constructor because the appropriate constructor
   * methods are in the Node class, and they are called when needed during the push() function. The
   * interface also gives us the appropriate methods.
   */


  @Override
  public E push(final E obj) {
    // Done TODO
    top = new Node<>(obj, top);
    return obj;
  }

  @Override
  public E peek() {
    // TODO
    if (isEmpty()) {
      throw new NoSuchElementException();
    } else {
      return top.data;
    }
  }

  // Edit

  @Override
  public E pop() {
    // Done TODO
    if (isEmpty()) {
      throw new NoSuchElementException();
    } else {
      E result = top.data;
      top = top.next;
      return result;
    }
  }

  @Override
  public boolean isEmpty() {
    // Done TODO
    if (top == null) {
      return true;
    }
    else {
      return false;
    }
  }

  @Override
  public List<E> asList() {
    final ArrayList<E> result = new ArrayList<>(size);
    populateList(top, result); // DONE TODO replace null with the right reference
    return result;
  }

  private void populateList(final Node<E> curr, final List<E> result) {
    // Done TODO recursively populate the list in the desired order
    if (curr == null){
      return;
    }
    else{
      result.add(curr.data);
    populateList(curr.next, result);
  }
  }

  @Override
  public List<E> asFifoList() {
    final ArrayList<E> result = new ArrayList<>(size);
    populateFifoList(top, result); // DONE TODO replace null with the right reference
    return result;
  }

  private void populateFifoList(final Node<E> curr, final List<E> result) {
    // Done TODO recursively populate the list in the desired order
    if (curr == null) {
      return;
    } else {
      result.add(0, curr.data);
      populateFifoList(curr.next, result);
    }
  }
}
