package com.meituan.order;

import java.util.HashSet;
import java.util.Set;

public class HashTest {

	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int hashCode() {
		return i % 10;
	}

	public static void main(String[] args) {
		HashTest a = new HashTest();
		HashTest b = new HashTest();
		a.setI(1);
		b.setI(1);
		Set<HashTest> set = new HashSet<HashTest>();
		set.add(a);
		set.add(b);
		System.out.println(a.hashCode() == b.hashCode());
		System.out.println(a.equals(b));
		System.out.println(set);
	}
}
