package com.wx.demo;
import java.util.Arrays;

public class Text {
	public static void main(String[] s) {
		// final int N = 100;
		Text t = new Text();
		t.Fibonacci(100);
		System.out.println("------------------------");
		t.useArray();
		t.ObjectArray();
		System.out.println("------------------------");
		System.out.println("------------------------");
		ReturnArray r = t.new ReturnArray();
		r.showInfo();
		t.matrix();
		System.out.println("------------------------");
		t.find_Max_Matrix();
		System.out.println(new java.util.Date());

	}

	public void Fibonacci(int n) {
		int[] m = new int[n];
		m[0] = 1;
		m[1] = 1;
		for (int i = 2; i < n; i++) {
			m[i] = m[i - 1] + m[i - 2];
		}

		for (int i : m) {
			if (i < 101 && i > 0) {
				System.out.print(i + " ");
			}

		}
		System.out.println();

		for (int i = m.length - 1; i > -1; i--) {
			if (m[i] < 101 && m[i] > 0) {
				System.out.print(m[i] + " ");
			}

		}
	}

	/**
	 * 将数组a赋值与数组b的时候实际上只是将地址给b他们公用的是一个对象
	 */
	public void useArray() {
		int[] a = { 0, 1, 2, 3, 4 };
		int[] b;
		b = a;
		for (int j = 0; j < b.length - 1; j++) {
			b[j] = b[j] + 1;
			System.out.print("a[" + j + "]=" + a[j] + ",");
			System.out.println("b[" + j + "]=" + b[j]);
		}
	}

	/**
	 * Object数组的使用
	 */

	public void ObjectArray() {
		Object[] a = new Object[4];
		a[0] = new Integer(199901);
		a[1] = new String("王祥");
		a[2] = new Character('M');
		a[3] = new Double(75.86);
		System.out.println("学号          姓名   性别  平均分");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	class ReturnArray {
		double a[] = { 4, 6.5, 7, 9.2, 13 };
		int i;
		double b[] = ave(a);

		public void showInfo() {
			for (double i : b) {
				System.out.println(i);
			}
		}

		public double[] ave(double[] c) {
			double[] s = new double[3];
			double max = c[0], min = c[0], sum = c[0];
			for (int i = 1; i < c.length; i++) {
				if (max < c[i])
					max = c[i];
				sum += c[i];
			}
			s[0] = max;
			s[1] = min;
			s[2] = sum / c.length;
			c[0] = 0;
			return s;
		}

	}

	public void matrix() {
		int array[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int[] i : array) {
			System.out.println(Arrays.toString(i));
		}
		for(int i = 0; i<3; i++ ){
			for(int j =0; j < 3; j++){
				System.out.print(array[i][j]+"  ");
			}
			System.out.println();
		}

	}
	public void find_Max_Matrix(){
		int array[][] = {{4,5,7},{6,8,9},{1,3,2}};
		int max = array[0][0];
		int I = 0;
		int J = 0;
		for(int i = 0; i < 3; i++){
			for(int j =0; j < 3; j++){
				if(max < array[i][j]){
					max = array[i][j];
					I = i;
					J = j;
				}
			}
		}
		System.out.println("最大值为： "+max);
		System.out.println("在数组中的位置为：("+I+","+J+")");
		
		
		
	}

}
