package co.micol.prj.listTest;

import java.util.HashSet;
import java.util.Set;

import java.util.Iterator;

public class SetTest {
	public void SetTest(){
		
		Set<String> name = new HashSet<String>();
		name.add("ȫ�浿");
		name.add("�ڽ¸�");
		name.add("�̱���");
		name.remove("�̱���");
		
		Iterator<String> iterator = name.iterator();
		while(iterator.hasNext());
		System.out.println(iterator.next()); //set ���� ���
	}

}
