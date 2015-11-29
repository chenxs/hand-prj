package prv.chenxs.handprj.util;

import java.lang.reflect.Array;

import org.apache.commons.lang.ArrayUtils;

public class ArrayUtil extends ArrayUtils {
	@SuppressWarnings("unchecked")
	public static <T> T[] invertArr(T[] src) {
		if (isNotEmpty(src)) {
			int argLenth = src.length;
			T[] newArr = (T[]) Array.newInstance(src[0].getClass(), argLenth);
			for (int i = argLenth - 1, j = 0; i >= 0; i--, j++) {
				newArr[j] = src[i];
			}
			return newArr;
		}
		return src;
	}
	
	public static char[] invertArr(char[] src){
		if (isNotEmpty(src)) {
			int argLenth = src.length;
			char[] newArr = new char[argLenth];
			for (int i = argLenth - 1, j = 0; i >= 0; i--, j++) {
				newArr[j] = src[i];
			}
			return newArr;
		}
		return src;
	}
	
	public static short[] invertArr(short[] src){
		if (isNotEmpty(src)) {
			int argLenth = src.length;
			short[] newArr = new short[argLenth];
			for (int i = argLenth - 1, j = 0; i >= 0; i--, j++) {
				newArr[j] = src[i];
			}
			return newArr;
		}
		return src;
	}
	
	public static int[] invertArr(int[] src){
		if (isNotEmpty(src)) {
			int argLenth = src.length;
			int[] newArr = new int[argLenth];
			for (int i = argLenth - 1, j = 0; i >= 0; i--, j++) {
				newArr[j] = src[i];
			}
			return newArr;
		}
		return src;
	}
	
	public static long[] invertArr(long[] src){
		if (isNotEmpty(src)) {
			int argLenth = src.length;
			long[] newArr = new long[argLenth];
			for (int i = argLenth - 1, j = 0; i >= 0; i--, j++) {
				newArr[j] = src[i];
			}
			return newArr;
		}
		return src;
	}
	
	public static float[] invertArr(float[] src){
		if (isNotEmpty(src)) {
			int argLenth = src.length;
			float[] newArr = new float[argLenth];
			for (int i = argLenth - 1, j = 0; i >= 0; i--, j++) {
				newArr[j] = src[i];
			}
			return newArr;
		}
		return src;
	}
	
	public static double[] invertArr(double[] src){
		if (isNotEmpty(src)) {
			int argLenth = src.length;
			double[] newArr = new double[argLenth];
			for (int i = argLenth - 1, j = 0; i >= 0; i--, j++) {
				newArr[j] = src[i];
			}
			return newArr;
		}
		return src;
	}
	
	
	public static boolean[] invertArr(boolean[] src){
		if (isNotEmpty(src)) {
			int argLenth = src.length;
			boolean[] newArr = new boolean[argLenth];
			for (int i = argLenth - 1, j = 0; i >= 0; i--, j++) {
				newArr[j] = src[i];
			}
			return newArr;
		}
		return src;
	}
}
