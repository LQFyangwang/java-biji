package SaleCar;
/**
 * 国际车行
 */
public class GuoJiCheHang {
	public static final int ALL_CAR =15;
	public static final int ALL_SUV =10;
	public static final int ALL_SELL=5; 
	
	private Car[] cars;
	private int totalcar;
	private SUV[] suvs;
	private int totalsuv;
	private Sell[] sells;
	private int totalsell;
	private Account account;
	
	public GuoJiCheHang(){
		cars=new Car[ALL_CAR];
		suvs=new SUV[ALL_SUV];
		sells=new Sell[ALL_SELL];
	}
	public Car[] getCars() {
		return cars;
	}
	public void setCars(Car[] cars) {
		this.cars = cars;
	}
	public int getTotalcar() {
		return totalcar;
	}
	public void setTotalcar(int totalcar) {
		this.totalcar = totalcar;
	}
	public SUV[] getSuvs() {
		return suvs;
	}
	public void setSuvs(SUV[] suvs) {
		this.suvs = suvs;
	}
	public int getTotalsuv() {
		return totalsuv;
	}
	public void setTotalsuv(int totalsuv) {
		this.totalsuv = totalsuv;
	}
	public Sell[] getSells() {
		return sells;
	}
	public void setSells(Sell[] sells) {
		this.sells = sells;
	}
	public int getTotalsell() {
		return totalsell;
	}
	public void setTotalsell(int totalsell) {
		this.totalsell = totalsell;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public void hireCar(Car car){
		if(totalcar<ALL_CAR){
			cars[totalcar++]=car;
			System.out.println("您进口了一辆车。");
		}
	}
	public void hireSUV(SUV suv){
		if(totalsuv<ALL_SUV){
			suvs[totalsuv++]=suv;
			System.out.println("您进口了一辆越野车。");
		}
	}
	public void inSell(Sell sell){
		if(totalsell<ALL_SELL){
			sells[totalsell++]=sell;
			System.out.println("您招来了一个员工。");
		}		
	}
	public void inAccount(Account account){
		this.account=account;
		System.out.println("您招来了一个会计,名字叫："+account.getName());
	}

}
