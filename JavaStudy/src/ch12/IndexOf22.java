package ch12;

class IndexOf22 {
	
	public static void main(String args[]) {
		String str = "Java ������ �缺�� ���� ����������!!";
		int sidx = 0; // start
		int eidx = 0; // end
			
		while (true) {
			eidx = str.indexOf(" ", sidx + 1);
				
			if (eidx == -1) {
				break;
			}
			System.out.println(sidx + ","  +eidx);
			sidx = eidx;
		}
	}
}