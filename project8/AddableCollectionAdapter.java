package project20;

import java.util.Collection;

class AddableCollectionAdapter<T> implements Addable<T> {
	  private Collection<T> c;
	  public AddableCollectionAdapter(Collection<T> c) {
	    this.c = c;
	  }
	  public void add(T item) { c.add(item); }
	}
		