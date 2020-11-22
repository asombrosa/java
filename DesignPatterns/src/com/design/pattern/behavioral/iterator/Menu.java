package com.design.pattern.behavioral.iterator;

import java.util.Iterator;

public interface Menu {
	Iterator<MenuItem> createIterator();
}
