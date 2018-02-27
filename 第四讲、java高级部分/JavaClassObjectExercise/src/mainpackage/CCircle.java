package mainpackage;

public class CCircle {
	private int r;

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	public void area() throws CCircleException{
		if(getR()<0){
			CCircleException e = new CCircleException("�뾶����С��0��");
			throw e;
			 
		}
		System.out.println("�����" + Math.PI*r*r);
		
	}
	
	public static void main(String[] args) {
		CCircle c = new CCircle();
		c.setR(-1);
		try{
			c.area();
		}catch(CCircleException e){
			System.out.println(e.getMessage());
		}finally{
			
		}
		
	}
}
