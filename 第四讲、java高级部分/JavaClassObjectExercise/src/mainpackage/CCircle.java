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
			CCircleException e = new CCircleException("半径不能小于0！");
			throw e;
			 
		}
		System.out.println("面积：" + Math.PI*r*r);
		
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
