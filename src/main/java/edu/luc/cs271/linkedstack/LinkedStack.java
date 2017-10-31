package edu.luc.cs271.linkedstack;


        import java.util.ArrayList;
        import java.util.List;
        import java.util.NoSuchElementException;

public class LinkedStack<E> implements IStack<E> {

  /** The top most node of this stack. The stack gets pushed down from here. */
  private Node<E> top;

  // TODO why don't we need an explicit constructor?
  /**
   * Answer: LinkedStack doesn't require an explicit constructor because the appropriate constructor
   * methods are in the Node class, and they are called when needed during the push() function. The
   * interface also gives us the appropriate methods.
   */
  @Override
  public E push(final E obj) {
    // TODO
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
    // TODO
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
    // TODO
    if (top == null) {
      return true;
    }
    else {
      return false;
    }
  }

  /*
  @Override
  public List<E> asList() {
    // TODO implement using an ArrayList preallocated with the right size
    // TODO add any instance variable(s) required to support this
    List<E> temp = new ArrayList<E>();
    Node<E> travel = top;
    while (travel != null) {
      temp.add(travel.data);
      travel = travel.next;
    }
    return temp;
  }
  */

    @Override
    public List<E> asList() {
      final ArrayList<E> result = new ArrayList<>(size);
      populateList(null, result); // TODO replace null with the right reference
      return result;
    }
  private void populateList(final Node<E> curr, final List<E> result) {
    // TODO recursively populate the list in the desired order
  }

  @Override
  public List<E> asFifoList() {
    final ArrayList<E> result = new ArrayList<>(size);
    populateFifoList(null, result); // TODO replace null with the right reference
    return result;
  }

  private void populateFifoList(final Node<E> curr, final List<E> result) {
    // TODO recursively populate the list in the desired order
  }

  }

