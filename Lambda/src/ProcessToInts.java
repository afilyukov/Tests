@FunctionalInterface
public interface ProcessToInts<T,U> {
    int doSomethingWithInts(T t, U u);
}
