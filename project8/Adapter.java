package project20;

import java.util.Collection;

class Adapter {
	  public static <T>
	  Addable<T> collectionAdapter(Collection<T> c) {
	    return new AddableCollectionAdapter<T>(c);
	  }
	}