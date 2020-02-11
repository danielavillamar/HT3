/** 
* DANIELA VILLAMAR 19086
* 8 DE FEBRERO DEL 2020
*/


public class Index implements Comparable<Index> {

	private int num;
	
	/**
	 * retorna num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * set num
	 */
	public void setNum(int num) {
		this.num = num;
	}

	/**
	 * numero index
	 */
	public Index(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
	}



	@Override
	public int compareTo(Index o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.num, ((Index)o).getNum());
	}

}
