public class ArrayCopier {
	public int[] copy(int[] src, int[] dst) {
		int srcLength = src.length;
		int dstLength = dst.length;
		int[] temp = new int[dstLength];
		/* for (int i = 0; i < dstLength; i++) {
				temp[i] = src[i];
			}
			return temp; */
		
		
		if (srcLength <= dstLength) {
			for (int i = 0; i < srcLength; i++) {
				temp[i] = src[i];
			}
			for (int i = srcLength; i < dstLength; i++) {
				temp[i] = 0;				
			}
			return temp;
		}
		else {
			for (int i = 0; i < dstLength; i++) {
				temp[i] = src[i];
			}
			
			return temp;
		} 
	}
}