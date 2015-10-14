public class ArrayCopier {
	public int[] copy(int[] src, int[] dst) {
		int srcLength = src.length;
		int dstLength = dst.length;
		int[] temp = new int[srcLength];
		
		if (srcLength == dstLength) {
			for (int i = 0; i < srcLength; i++) {
				temp[i] = src[i];
			}
			return temp;
		}
		else {
			return temp;
		}
	}
}