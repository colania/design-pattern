package org.example.iterator.lang;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/27
 */
public interface Collection<E, L> extends Iterable<E> {
    @Override
    Iterator<E> iterator();

    boolean add(E e);

    boolean remove(E e);

    boolean addLink(String key, L l);

    boolean removeLink(String key);
}
