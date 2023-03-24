package project20;

public class Fill2 {
	 public static <T> void fill(Addable<T> addable,
			  Class<? extends T> classToken, int size) {
			    for(int i = 0; i < size; i++)
			      try {
			        addable.add(classToken.newInstance());
			      } catch(Exception e) {
			        throw new RuntimeException(e);
			      }
			  }
			  // Generator version:
			  public static <T> void fill(Addable<T> addable,
			  Generator<T> generator, int size) {
			    for(int i = 0; i < size; i++)
			      addable.add(generator.next());
			  }
}
