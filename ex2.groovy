int[] first = new int[6];
first[0] = 1;
first[1] = 2;
first[2] = 3;
first[3] = 4;
first[4] = 5;
first[5] = 6;

int[] second = new int[6];

ArrayCopier ac1 = new ArrayCopier();

second = ac1.copy(first, second);

for (int i = 0; i < second.length; i++) {
	System.out.println(second[i]);	
}