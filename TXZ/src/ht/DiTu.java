package ht;

public class DiTu {
	final int data1[][]={
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,1,4,1,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,1,1,1,3,1,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,4,2,3,5,1,1,1,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,1,1,3,2,3,4,1,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,1,2,1,1,1,1,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,1,4,1,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
	
	};
	final int data2[][]={
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,2,5,4,4,4,1,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,2,2,2,2,2,1,1,0,0,0,0,0,0},
			{0,0,0,0,0,1,1,1,3,2,2,2,2,1,0,0,0,0,0,0},
			{0,0,0,0,0,1,2,2,2,2,2,2,2,1,0,0,0,0,0,0},
			{0,0,0,0,0,1,2,3,2,1,3,1,2,1,0,0,0,0,0,0},
			{0,0,0,0,0,1,2,2,2,1,2,2,2,1,0,0,0,0,0,0},
			{0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
			
	};
	final int data3[][]={
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,1,2,2,5,1,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,1,2,3,3,1,0,1,1,1,0,0,0,0,0,0},
			{0,0,0,0,0,1,2,3,2,1,0,1,4,1,0,0,0,0,0,0},
			{0,0,0,0,0,1,1,1,2,1,1,1,4,1,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,1,2,2,2,2,4,1,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,2,2,2,1,2,2,1,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,2,2,2,1,1,1,1,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
			
	};
	final int data4[][]={
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,1,2,2,2,2,2,1,1,1,0,0,0,0,0,0},
			{0,0,0,0,1,1,3,1,1,1,2,2,2,1,0,0,0,0,0,0},
			{0,0,0,0,1,5,2,2,3,2,2,3,2,1,0,0,0,0,0,0},
			{0,0,0,0,1,2,4,4,1,2,3,2,1,1,0,0,0,0,0,0},
			{0,0,0,0,1,1,4,4,1,2,2,2,1,0,0,0,0,0,0,0},
			{0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
			
	};
	final int data5[][]={
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,1,2,2,1,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,5,3,2,1,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,1,3,2,1,1,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,1,2,3,2,1,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,4,3,2,2,1,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,4,4,9,4,1,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
			
	};
	final int data6[][]={
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,1,2,5,1,1,1,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,1,2,3,2,2,1,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,1,1,2,1,2,1,1,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,4,1,2,1,2,2,1,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,4,3,2,2,1,2,1,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,4,2,2,2,3,2,1,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
	};
	final int data7[][]={
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},			
			{0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0},
			{0,0,0,0,1,1,1,1,2,2,2,2,2,1,0,0,0,0,0,0},
			{0,0,0,0,1,2,2,2,4,1,1,1,2,1,0,0,0,0,0,0},
			{0,0,0,0,1,2,1,2,1,2,2,2,2,1,1,0,0,0,0,0},
			{0,0,0,0,1,2,1,2,3,2,3,1,4,2,1,0,0,0,0,0},
			{0,0,0,0,1,2,1,2,2,9,2,2,1,2,1,0,0,0,0,0},
			{0,0,0,0,1,2,4,1,3,2,3,2,1,2,1,0,0,0,0,0},
			{0,0,0,0,1,1,2,2,2,2,1,2,1,2,1,1,1,0,0,0},
			{0,0,0,0,0,1,2,1,1,1,4,2,2,2,2,5,1,0,0,0},
			{0,0,0,0,0,1,2,2,2,2,2,1,1,2,2,2,1,0,0,0},
			{0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0},			
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
	};
	final int data8[][]={
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},			
			{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0},
			{0,0,0,0,0,0,0,0,1,1,2,2,1,2,5,1,0,0,0,0},
			{0,0,0,0,0,0,0,0,1,2,2,2,1,3,2,1,0,0,0,0},
			{0,0,0,0,0,0,0,0,1,3,2,2,3,2,2,1,0,0,0,0},
			{0,0,0,0,0,0,0,0,1,2,3,1,1,2,2,1,0,0,0,0},
			{0,0,0,0,0,0,1,1,1,2,3,2,1,2,1,1,0,0,0,0},
			{0,0,0,0,0,0,1,4,4,4,4,4,2,2,1,0,0,0,0,0},
			{0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0},			
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
	};
	final int data9[][]={
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0},
			{0,0,0,0,0,0,0,1,1,1,2,2,2,2,1,0,0,0,0,0},
			{0,0,0,0,0,0,1,1,4,2,3,1,1,2,1,1,0,0,0,0},
			{0,0,0,0,0,0,1,4,4,3,2,3,2,2,5,1,0,0,0,0},
			{0,0,0,0,0,0,1,4,4,2,3,2,3,2,1,1,0,0,0,0},
			{0,0,0,0,0,0,1,1,1,1,1,1,2,2,1,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0},			
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
	};
	final int data10[][]={
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0},
			{0,0,0,0,0,0,1,2,2,1,1,2,2,2,1,0,0,0,0,0},
			{0,0,0,0,0,0,1,2,2,2,3,2,2,2,1,0,0,0,0,0},
			{0,0,0,0,0,0,1,3,2,1,1,1,2,3,1,0,0,0,0,0},
			{0,0,0,0,0,0,1,2,1,4,4,4,1,2,1,0,0,0,0,0},
			{0,0,0,0,0,1,1,2,1,4,4,4,1,2,1,1,0,0,0,0},
			{0,0,0,0,0,1,2,3,2,2,3,2,2,3,2,1,0,0,0,0},
			{0,0,0,0,0,1,2,2,2,2,2,1,2,2,5,1,0,0,0,0},
			{0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},			
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
	};
	final int data11[][]={
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,1,1,1,1,0,0,0,0,0,1,1,1,1,0,0,0,0,0},
			{0,0,1,2,2,1,1,1,1,1,1,1,4,4,1,1,1,0,0,0},
			{0,0,1,2,3,2,3,2,3,2,2,1,4,4,4,4,1,0,0,0},
			{0,0,1,2,3,2,2,2,3,3,2,1,9,9,9,4,1,0,0,0},
			{0,0,1,2,3,2,3,2,3,2,2,1,4,4,9,4,1,0,0,0},
			{0,0,1,2,2,3,2,3,2,3,2,1,9,4,9,4,1,0,0,0},
			{0,0,1,1,2,3,2,3,2,3,2,4,9,4,9,4,1,1,0,0},
			{0,0,1,2,2,3,2,3,2,3,2,4,9,4,9,4,5,1,0,0},
			{0,0,1,2,2,3,2,3,2,3,2,1,9,4,9,4,1,1,0,0},
			{0,0,1,2,3,2,3,2,3,2,2,1,4,4,9,4,1,0,0,0},
			{0,0,1,2,3,2,2,2,3,3,2,1,9,9,9,4,1,0,0,0},
			{0,0,1,2,3,2,3,2,3,2,2,1,4,4,4,4,1,0,0,0},
			{0,0,1,2,2,1,1,1,1,1,1,1,4,4,1,1,1,0,0,0},
			{0,0,1,1,1,1,0,0,0,0,0,1,1,1,1,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
	};
	
	//��ȡ��ͼ�ķ���
	public static int[][] getMap(int level){  //level:��ʾ�ڼ���
		DiTu ditu = new DiTu();
		if(level==1){
			return ditu.data1;
		}
		else if(level==2){
			return ditu.data2;
		}
		else if(level==3){
			return ditu.data3;
		}
		else if(level==4){
			return ditu.data4;
		}
		else if(level==5){
			return ditu.data5;
		}
		else if(level==6){
			return ditu.data6;
		}
		else if(level==7){
			return ditu.data7;
		}
		else if(level==8){
			return ditu.data8;
		}
		else if(level==9){
			return ditu.data9;
		}
		else if(level==10){
			return ditu.data10;
		}
		else if(level==11){
			return ditu.data11;
		}
		return ditu.data1;
	}
}