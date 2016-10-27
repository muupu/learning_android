
// http://blog.csdn.net/mazhimazh/article/details/19212829

import java.util.Arrays;

public class ArraycopyTest {  
  
    public static void main(String[] args) {  
        
		testSystemArraycopy();
		testArraysCopyOf();
    }
	
	private static void testSystemArraycopy() {
		System.out.println("---testSystemArraycopy---");  
		String[] strArray = new String[] { "ab", "xy", "mn" };  
        String[] copyArray = new String[4]; // �������С��ԭ����С,���׳�java.lang.ArrayIndexOutOfBoundsException�쳣��
        for (int i = 0; i < strArray.length; i++) {  
            System.arraycopy(strArray, 0, copyArray, 0, strArray.length); // ����ϵͳ�����������  
        }  
        printArray(copyArray);  
        System.out.println(strArray == copyArray ? "ǳ����" : "���");  // ab  xy  mn  null  ���
	}
	
	// Arrays.copyof�ڲ������System.arraycopy
	// System.arraycopy(original, 0, copy, 0, Math.min(original.length, newLength)); //��ԭ�������ݿ�������������,������ȡ��С�����鳤�� 
	private static void testArraysCopyOf() {
		System.out.println("---testArraysCopyOf---");  
		String[] strArray = new String[] { "ab", "xy", "mn" };  
        String[] copyArray = new String[4];    
        for(int i=0;i<strArray.length;i++){    
            copyArray=Arrays.copyOf(strArray, strArray.length);    
        }    
        printArray(copyArray);    
        System.out.println(strArray==copyArray?"ǳ����":"���");    // ab  xy  mn  ���
	}
	
    public static void printArray(String[] array) {  
        for (int i = 0; i < array.length; i++) {  
            System.out.print(array[i] + "  ");  
        }  
    }  
  
}  