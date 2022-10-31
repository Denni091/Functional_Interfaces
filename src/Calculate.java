
@FunctionalInterface
public interface Calculate<T, U, R, Q, Y> {

    Y calculateValue(T t, U u, R r, Q q);
}
